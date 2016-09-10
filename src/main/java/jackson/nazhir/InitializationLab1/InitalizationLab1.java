package jackson.nazhir.InitializationLab1;

/**
 * Created by nazhirjackson on 9/10/16.
 */
public class InitalizationLab1 {

    public static void main(String[] args) {
        ColorfulThing redThing = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing blueThing = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing greenThing = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing purpleThing = new ColorfulThing(ColorfulThing.Color.PURPLE);
        ColorfulThing orangeThing = new ColorfulThing(ColorfulThing.Color.ORANGE);
        redThing.printColor();
        blueThing.printColor();
        greenThing.printColor();
        purpleThing.printColor();
        orangeThing.printColor();
        System.out.println(redThing.getColor());


        /*BoringThing boringThing1 = new BoringThing();
        BoringThing boringThing2 = new BoringThing();
        BoringThing boringThing3 = new BoringThing();
        BoringThing boringThing4 = new BoringThing();
        BoringThing boringThing5 = new BoringThing();
        */
    }
}
