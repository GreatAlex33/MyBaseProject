package HomeWork;
import java.math.BigDecimal;
public class Task_2_1 {

    // Задание 1.
    public static class StudentProfile {

        public static void main(String[] args) {

            byte score = 58;
            short studentId = 15133;
            int bornYear = 1998;
            long phoneNumber = 89996548822L;
            float avgScore = 78.99f;
            double finishScore = 89.23;
            boolean is_transaction = true;
            char firstLetter = 'A';
            System.out.println("Оценка " + score);
            System.out.println("Номер студенческого " + studentId);
            System.out.println("Год рождения " + bornYear);
            System.out.println("Номер телефона " + phoneNumber);
            System.out.println("Средний балл за прошлый семестр " + avgScore);
            System.out.println("Итоговая оценка " + finishScore);
            System.out.println("Факт оплаты " + is_transaction);
            System.out.println("Первая буква имени " + firstLetter);
        }
    }
// Задание 2.
        public static class Overflow {
            public static void main(String[] args) {
                int max = Integer.MAX_VALUE;
                System.out.println(max + 1); // число обернулось, вычисление правильное, но с противоположным знаком (молчаливый баг)
                int seconds = 24 * 60 * 60 * 365 * 100;
                System.out.println(seconds); // шибка из за переполнения стека
                long seconds2 = 24 * 60 * 60 * 365 * 100L;
                System.out.println(seconds2); // Верный результат
            }
        }
        // Задание 3.
        public static class Finance {
           public static void main(String[] args) {
               double x = 0.1;
               double y = 0.2;
               System.out.println(x + y);
               BigDecimal a = new BigDecimal("0.1");
               BigDecimal b = new BigDecimal("0.2");
               System.out.println(a.add(b));

           }
        }

        //Задание 4.

        public static class TempConverter {
            public static void main(String[] args) {
                double cels1 = 100;
                System.out.println("Farenheit " + cels1 * 9 / 5 + 32);
                System.out.println("Calvin " + cels1 + 232.15);
                double cels2 = 0;
                System.out.println("Farenheit " + cels2 * 9 / 5 + 32);
                System.out.println("Calvin " + cels2 + 232.15);
                double cels3 = 37;
                System.out.println("Farenheit " + cels3 * 9 / 5 + 32);
                System.out.println("Calvin " + cels3 + 232.15);
                double cels4 = -40;
                System.out.println("Farenheit " + cels4 * 9 / 5 + 32);
                System.out.println("Calvin " + cels4 + 232.15);


            }
        }
}
