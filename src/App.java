import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }
        public void settings(){
            size(400,400);
        }
        public void setup(){
            background(200);

            fill(64,224,208);
            ellipse(200,120,100,100);

            fill(255,127,80);
            triangle(150,250,200,337,250,250);

            stroke(0);
            strokeWeight(3);
            line(200,120,200,294);

        }
        public void draw(){

        }
    

}
