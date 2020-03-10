public class TemperatureConverter {
    private static final Double MINIMUM_CELSIUS_DEGREE = -273.15d;


    public TemperatureConverter(){}

    public Double celsiusToFahrenheit(double c) {
        Celsius temp = new Celsius(c);
        return temp.toFahrenheit();
    }

    public Double fahrenheitToCelsius(Double f){
        if (f < celsiusToFahrenheit(MINIMUM_CELSIUS_DEGREE) ) errorMessage();
        return ((f - 32)*5)/9;
    }

    public Double celsiusToKelvin(Double c){
        Celsius temp = new Celsius(c);
        return temp.toKelvin();
    }

    public Double kelvinToCelsius(Double k){
        if (k < 0)errorMessage();
        return k - 273.15;
    }

    private void errorMessage(){
        throw new IllegalArgumentException("Temperature have to be more then absolute zero");
    }
}
