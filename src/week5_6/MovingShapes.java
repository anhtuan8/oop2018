package week5_6;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class MovingShapes extends Application {
    Diagram diagram = new Diagram();
    Pane root = new Pane();
    Circle circle;
    Rectangle rectangle,square;
    Polygon triangle;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Moving shapes");
        primaryStage.setWidth(600);
        primaryStage.setHeight(600);
        primaryStage.show();

        HBox hBox = new HBox();

        Button deleteTri = new Button();
        deleteTri.setText("Say no to triangles");
        deleteTri.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                root.getChildren().remove(triangle);
            }
        });
        hBox.getChildren().add(deleteTri);

        Button deleteCir = new Button();
        deleteCir.setText("Say no to circles");
        deleteCir.setTranslateX(20.0);
        deleteCir.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                root.getChildren().remove(circle);
            }
        });
        hBox.getChildren().add(deleteCir);

        root.getChildren().add(hBox);

    }

    @Override
    public void init(){
        diagram.init();
        for(Shape shape: diagram.layers.get(0).shapes){
            if(shape instanceof week5_6.Circle){
                circle = new Circle(((week5_6.Circle) shape).center.x,((week5_6.Circle) shape).center.y,((week5_6.Circle) shape).radius);
                circle.setFill(Color.RED);

                Circle round = new Circle(200,200,100);
                PathTransition transition = new PathTransition();

                transition.setDuration(Duration.seconds(2));
                transition.setPath(round);
                transition.setCycleCount(Animation.INDEFINITE);
                transition.setNode(circle);

                transition.play();

                root.getChildren().add(circle);
            }
            if(shape instanceof week5_6.Rectangle){
                rectangle = new Rectangle(((week5_6.Rectangle) shape).upper_left.getX(), ((week5_6.Rectangle) shape).upper_left.getY(),
                                                        ((week5_6.Rectangle) shape).width,((week5_6.Rectangle) shape).length);
                rectangle.setFill(Color.BROWN);

                Polygon path = new Polygon();
                path.getPoints().addAll(400.0,500.0,
                        200.0,300.0,
                        400.0,300.0);

                PathTransition transition = new PathTransition();

                transition.setNode(rectangle);
                transition.setPath(path);
                transition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
                transition.setDuration(Duration.seconds(3));
                transition.setCycleCount(Animation.INDEFINITE);

                transition.play();

                root.getChildren().add(rectangle);
            }
            if(shape instanceof  week5_6.Triangle){
                triangle = new Polygon();
                triangle.getPoints().addAll(((Triangle) shape).getA().x,((Triangle) shape).getA().y,
                        ((Triangle) shape).getB().x,((Triangle) shape).getB().y,
                        ((Triangle) shape).getC().x,((Triangle) shape).getC().y);
                triangle.setFill(Color.BLUE);

                Rectangle path = new Rectangle(((Triangle) shape).getA().getX(),((Triangle) shape).getA().getY(),
                                                    200,100);
                PathTransition transition = new PathTransition();

                transition.setNode(triangle);
                transition.setPath(path);
                transition.setDuration(Duration.seconds(1));
                transition.setCycleCount(Animation.INDEFINITE);

                transition.play();

                root.getChildren().add(triangle);
            }
            if(shape instanceof  week5_6.Square){
                square = new Rectangle(((Square) shape).upper_left.getX(),((Square) shape).upper_left.getY(),
                                                        ((Square) shape).getSide(),((Square) shape).getSide());
                square.setFill(Color.YELLOWGREEN);

                Line path = new Line(10,10,500,500);

                PathTransition transition = new PathTransition();

                transition.setNode(square);
                transition.setPath(path);
                transition.setDuration(Duration.seconds(3.5));
                transition.setCycleCount(Animation.INDEFINITE);
                transition.play();

                root.getChildren().add(square);
            }
        }


    }



}
