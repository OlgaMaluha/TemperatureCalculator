import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CelsiusTest {

    @Test
    public void celsiusObjectIsCreated() {
        Celsius temp = new Celsius(-31.0);
        assertNotNull(temp);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void celsiusObjectThrowsExceptionWhenValueIsTooLow(){

        new Celsius(-3000.0);
    }

    @Test
    public void testAddingTemp() {
        Celsius temp = new Celsius(37.0);
        Celsius newTemp = temp.add(10.0);
        assertEquals(newTemp.getValue(), 47.0);
    }

    @Test
    public void testMinusTemp() {
        Celsius temp = new Celsius(55.0);
        Celsius newTemp = temp.minus(35.0);
        Assert.assertEquals(newTemp.getValue(), 20);
    }

    @Test
    public void toFahrenheitTest(){
        Celsius temp = new Celsius(37);
        double fahrenheit = temp.toFahrenheit();
        Assert.assertEquals(fahrenheit, 98.6,0.00001);
    }

    @Test
    public void toKelvinTest(){
        Celsius temp = new Celsius(37);
        double kelvin = temp.toKelvin();
        Assert.assertEquals(kelvin, 310.15, 0.000001);
    }

    @Test
    public void celsiusSignTest(){
        Celsius temp = new Celsius(37);
        Assert.assertEquals(temp.toString(), "37.0 C");
    }

    @Test
    public void testComparingEqualTemps() {
        Celsius temp1 = new Celsius(10.0);
        Celsius temp2 = new Celsius(10.0);
        Assert.assertEquals(temp1, temp2);
    }
    @Test
    public void testComparingNotEqualTemps() {
        Celsius temp1 = new Celsius(10.0);
        Celsius temp2 = new Celsius(20.0);
        Assert.assertNotEquals(temp1, temp2);
    }

    @Test
    public void multiplyTest(){
        Celsius temp = new Celsius(37);
        Assert.assertEquals(temp.multiply(2).getValue(), 74.0);
    }

    @Test
    public void divisionTest(){
        Celsius temp = new Celsius(37);
        Assert.assertEquals(temp.divide(2).getValue(), 18.5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void divisionByZeroTest(){
        Celsius temp = new Celsius(37);
        temp.divide(0);
    }
}