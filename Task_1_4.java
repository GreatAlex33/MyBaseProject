package HomeWork;

public class Task_1_4 {
    // Задание 1.
    // public class student_calculator {   1. Ошибка. Наименование класса должно быть с большой буквы 2.Ошибка Без подчеркиваний и каждое новое слово должно быть с заглавной буквы

    // public static final double pi = 3.14; 3. Ошибка. Наименование константы большими буквами UPPER_SNAKE_CASE

//     public static double CalculateCircleArea(double R) { // 4. Ошибка. Наименование метода с маленькой буквы, последующие слова с большой camelCase + R должна быть осмысленной
//            double S = pi * R * R; 5. Ошибка. Переменные S и R с маленькой + должны быть осмысленными
//            boolean result = true; 6. Ошибка. Булева должна звучать как вопрос и не нужна так как нигде не используется
//            return S;


    //       public static void main(String[] args) {
//            double MyRadius = 5; // 7. Ошибка. Имя переменной должно начинаться со строчной буквы
//            System.out.println(CalculateCircleArea(MyRadius));
//        }
//    }
    // Задание 2.
    public static class TemperatureConverter {

        public static void celsiusToFahrenheit(double celsius) {
            System.out.println(celsius * 2);

        }

        public static void fahrenheitToCelsius(double fahrenheit) {
            System.out.println(fahrenheit / 2);
        }

        double ABSOLUTE_ZERO_CELSIUS = -273.15;
        double BOILING_POINT_CELSIUS = 100.0;
        boolean isAboveBoiling = true;
    }
}
// Задание 3.
/*
1. Классы каждое слово с большой буквы PascalCase
2. Методы первое слово с маленькой остальные с большой camelCase
3. Переменные маленькими буквами lowercase
4. Константы большими буквами UPPER_CASE
5. Пустые строки выделяют логические блоки
 */

