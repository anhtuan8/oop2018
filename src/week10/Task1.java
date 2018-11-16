package week10;

import javafx.css.Match;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static String content ="";
    public static List<String> functions = new ArrayList<>();
    public static List<String> names = new ArrayList<>();

    public static void readfile(String path){

        try (FileInputStream fin = new FileInputStream(path);
             InputStreamReader in = new InputStreamReader(fin, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(in) ){
            String s;
            while (( s= br.readLine() )!=null){
                if (!s.trim().startsWith("//"))
                    content = content.concat(s+"\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<String> getAllFuntions(String path){
        List<String> functions = new ArrayList<>();
        readfile(path);
        try{
            String staticPattern = "(\\s*|^|}|\\{)((?<modifier>public|private|protected|\\s)\\s+)static\\s+(?<returnType>(\\w|\\.)+)\\s+(?<methodName>\\w+\\s*)\\((?<para>[^(]*)\\)\\s*\\{";
            Pattern pattern = Pattern.compile(staticPattern);
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()){
                //handle parameters type
                String tmp = matcher.group("para").trim();
                String[] paras = tmp.split(",");
                String paraTypes = "(";
                for(int i =0;i<paras.length;i++){
                    paras[i] = paras[i].trim();
                    paras[i] = paras[i].substring(0,paras[i].indexOf(" "));
                    if(i==paras.length-1){
                        paraTypes = paraTypes.concat(paras[i] + ")");
                    }
                    else
                        paraTypes = paraTypes.concat(paras[i]+",");
                }

                StringBuilder s = new StringBuilder(matcher.group("modifier") + " static " + matcher.group("returnType") + " " + matcher.group("methodName") + "(" + matcher.group("para") + ")");

                //adding method name to List<String> names
                String name = matcher.group("methodName") + paraTypes;
                names.add(name);

                //get text function
                int openBrackets = 0,closeBrackets=0;
                for(int i = matcher.end()-1 ; ;i++){
                    s.append(content.charAt(i));
                    if(content.charAt(i)=='{'){
                        openBrackets++;
                    }
                    if(content.charAt(i) == '}'){
                        closeBrackets++;
                        if(openBrackets == closeBrackets){
                            break;
                        }
                    }

                }

                functions.add(s.toString());
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return functions;
    }

    public static String findFunctionByName(String name){
        for(int i = 0 ; i < names.size();i++){
            if(names.get(i).equals(name)){
                return functions.get(i);
            }
        }
        return "Not found.";
    }

    public static void main(String[] args){
        String path = ".\\src\\week9\\Utils.java";
        functions = getAllFuntions(path);
//        System.out.println(functions.get(4));
        System.out.println(findFunctionByName(names.get(4)));
    }

}
