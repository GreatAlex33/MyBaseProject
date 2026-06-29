package HomeWork;

    public class Task_1_4 {
        public Task_1_4() {
        }

        public class TemperatureConverter {
            public static final double ABSOLUTE_ZERO_CELSIUS = -273.15;
            public static final double BOILING_POINT_CELSIUS = (double)100.0F;

            public TemperatureConverter() {
            }

            public static double celsiusToFahrenheit(double celsius) {
                return celsius * (double)9.0F / (double)5.0F + (double)32.0F;
            }

            public static double fahrenheitToCelsius(double fahrenheit) {
                return (fahrenheit - (double)32.0F) * (double)5.0F / (double)9.0F;
            }

            public static void main(String[] args) {
                double celsius = (double)120.0F;
                double fahrenheit = celsiusToFahrenheit(celsius);
                boolean isAboveBoiling = celsius > (double)100.0F;
                System.out.println("Celsius: " + celsius + ", Fahrenheit: " + fahrenheit);
                System.out.println("Is above boiling point? " + isAboveBoiling);
            }
        }
    }


