public class Celsius {
    private static final double MINIMUM_CELSIUS_DEGREE = -273.15;
    private double value;

    public Celsius(double value) {
        validateValue(value);
        this.value = value;
    }

    public Celsius add(double delta) {
        Celsius newTemp = new Celsius(this.value + delta);
        return newTemp;
    }

    public double getValue() {
        return this.value;
    }

    public Celsius minus(double delta) {
        Celsius newTemp = new Celsius(this.value - delta);
        return newTemp;
    }

    private void validateValue(double value) {
        if (value < MINIMUM_CELSIUS_DEGREE) {
            throw new IllegalArgumentException("Temperature cannot be lower then zero");
        }
    }
    public double toFahrenheit(){
        return value * 1.8+32;
    }

    public double toKelvin(){
        return value + 273.15;
    }

    public String toString(){
        return value + " C";
    }

    public boolean equals(Object object) {
        if (object instanceof Celsius) {
            return this.value == ((Celsius) object).value;
        }
        return false;
    }

    public Celsius multiply(double multiplier){
        return new Celsius(this.value * multiplier);
    }

    public Celsius divide(double divisor){
        if (divisor == 0){
            throw new IllegalArgumentException("Cannot be divided by 0");
        }
        return new Celsius(this.value / divisor);
    }

}
