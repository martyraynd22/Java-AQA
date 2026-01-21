package First_program;

public class MathOperations {
        public static void main(String[] args){
            int x = 25, y = 100;
            System.out.println ("Проверка тестовых значений: \nx = " + x + "\ny = " + y);

            MathOperations m = new MathOperations();
            double c = 50 , f = 120;

            int add = MathOperations.add(x, y), sub = MathOperations.subtract(x, y), mul = MathOperations.multiply(x,y);
            double div = MathOperations. divide(x,y);
            System.out.println("Сумма чисел = " + add + "\nВычитание чисел = " + sub + "\nУмножение чисел = " + mul + "\nДеление чисел = " + div);
            System.out.println("Максимальное из двух чисел " + MathOperations.findMax(x,y)) ;
            System.out.println("Разница между двумя числами " + MathOperations.difference(x,y));
            System.out.println("Площадь квадрата где сторона равна " + x + " = " + MathOperations.squareArea(x) + "\nПериметр квадрата где сторона равна " + y + " = " + MathOperations.squarePerimeter(y));
            System.out.println(x + " секунд это " + m.convertSecondsToMinutes(x) + " минут\n" + y + " секунд это " + m. convertSecondsToMinutes(y) + " минут");
            double dis1 = 100, dis2 = 500, time1 = 32.5, time2 = 51.8;
            double avg1 = m.averageSpeed (dis1, time1), avg2 = m.averageSpeed(dis2, time2);
            System.out.println("Первая средняя скорость = " + avg1 + " м/с\nВторая средняя скрость = " + avg2 + " м/с");
            double a1= 6.0, b1= 6, a2 = 17, b2 = 22;System.out.println("Гипотенуза первого треугольника = " + MathOperations.findHypotenuse(a1,b1) + "\nГипотенза второго треугольника = " + MathOperations.findHypotenuse(a2,b2));
            System.out.println("Длина окружности равна "+ MathOperations.circleCircumference(19));
            System.out.println("Одно число от другого в процентном соотношении будет составлять " + MathOperations.calculatePercentage((double) y, (double) x ) + " процентов");
            System.out.println("В Фарингейтах переведенных из Цельсий температура равна " + MathOperations.celsiusToFahrenheit(c));
            System.out.println("В Цельсиях переведенных из Фарингейтов температура равна " + MathOperations.fahrenheitToCelsius(f));
        }

    private static int findMax(int x, int y){
            return Math.max(x,y);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * ((double) 5 / 9);
        }
        public static double celsiusToFahrenheit (double celsius) {
            return celsius * ((double) 9 / 5) + 32;
        }
        public static double calculatePercentage(double total, double
                part) {

            return part / total * 100;
        }
        public static double circleCircumference (double radius) {
            return 2 * Math.PI * radius;
        }
        public static double findHypotenuse(double a, double b) {
            return Math.sqrt(a * a + b * b);
        }
        public double averageSpeed(double distance, double time) {
            return distance / time;
        }
        public double convertSecondsToMinutes(int seconds) {
            return (double) seconds / 60;
        }
        public static int squarePerimeter (int side) {
            return side * 4;
        }
        public static int squareArea(int side) {
            return side * side;
        }
        public static int
        difference(int x, int y) {
            return Math.abs(x - y);
        }
        public static int FindMax(int x, int y) {
            return Math.max(x, y);
        }
        public static int add (int x, int y) {
            return x + y;
        }
        public static int subtract(int x, int y) {
            return x - y;

        }
        public static int multiply(int x, int y){
            return x * y;
        }
        public static double divide(int x, int y){
            return (double) x / y;
        }
    }

