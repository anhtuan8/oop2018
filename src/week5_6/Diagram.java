package week5_6;

import java.util.ArrayList;

public class Diagram {
    ArrayList<Layer> layers = new ArrayList<>();

    public void deleteCircle(){
        for(Layer layer:layers){
            for(Shape shape: layer.shapes){
                if(shape instanceof Circle){
                    layer.shapes.remove(shape);
                }
            }
        }
    }

    public void init(){
        Layer layer = new Layer();
        layer.init();
        layers.add(layer);
    }

}
