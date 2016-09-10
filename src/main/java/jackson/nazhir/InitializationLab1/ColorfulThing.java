package jackson.nazhir.InitializationLab1;

/**
 * Created by nazhirjackson on 9/10/16.
 */
public class ColorfulThing {
    private Color color;

    public ColorfulThing(Color color){
        this.color = color;
    }

    public Color getColor(){

        return color;
    }
    public void printColor(){
        System.out.println(color);
    }
    public enum Color{
        BLUE,
        RED,
        ORANGE,
        PURPLE,
        GREEN
    }

}
