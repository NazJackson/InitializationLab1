package jackson.nazhir.InitializationLab1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nazhirjackson on 9/10/16.
 */
public class ColorfulThingTest{


    @Test
    public void getColorTest(){
        ColorfulThing colors = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing.Color expected = ColorfulThing.Color.BLUE;
        ColorfulThing.Color actual = colors.getColor();
        Assert.assertEquals("The Color should be Blue", expected, actual);

    }



}
