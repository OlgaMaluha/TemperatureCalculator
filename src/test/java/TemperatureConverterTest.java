import org.testng.Assert;
import org.testng.annotations.Test;

public class TemperatureConverterTest {
    private static final double DELTA = 0.0001;
    private static final double CELSIUS_DEGREE = 37d;
    private static final double FAHRENHEIT_DEGREE = 98.6d;
    private static final double KELVIN_DEGREE = 310.15d;

    @Test
    public void celsiusToFahrenheitTest() {
        TemperatureConverter converter = new TemperatureConverter();
        Assert.assertEquals(converter.celsiusToFahrenheit(CELSIUS_DEGREE), FAHRENHEIT_DEGREE, DELTA);
    }

    @Test
    public void fahrenheitToCelsiusTest() {
        TemperatureConverter converter = new TemperatureConverter();
        Assert.assertEquals(converter.fahrenheitToCelsius(FAHRENHEIT_DEGREE), CELSIUS_DEGREE, DELTA);
    }

    @Test
    public void celsiusToKelvinTest() {
        TemperatureConverter converter = new TemperatureConverter();
        Assert.assertEquals(converter.celsiusToKelvin(CELSIUS_DEGREE), 310.15, DELTA);
    }

    @Test
    public void kelvinToCelsiusTest() {
        TemperatureConverter converter = new TemperatureConverter();
        Assert.assertEquals(converter.kelvinToCelsius(KELVIN_DEGREE), 37, DELTA);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeKelvinDegreeShowsError(){
        TemperatureConverter converter = new TemperatureConverter();
        converter.kelvinToCelsius(-1d);
    }
}