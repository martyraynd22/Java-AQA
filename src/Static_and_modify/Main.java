package Static_and_modify;

public class Main {

    public static void main(String[] args) {
        Company sber = new Company(6,"Vasya");
        Company nobugs = new Company(7,"Alex");

       Company.companyName = "OTP Bank";

        System.out.println(sber.getCompanyName());
        System.out.println(nobugs.getCompanyName());

        // статический метод - может использовать только статические поля
        // статический метод - не работает с нестатическим полем
        // нестатический метод - работает со статическим полем
        // нестатический метод - работает с нестатическим полем

        System.out.println(MathConstants.calculateCircleArea(5));
        System.out.println(MathConstants.calculateCircleArea(12));

        University danya = new University("gfds");
        University andrei = new University("fgfgd");
        University bogat = new University("fgg");
        University vanya  = new University("Fg");

        University.changeUniversityName("Oksford");

        danya.printStudentInfo();
        andrei.printStudentInfo();
        bogat.printStudentInfo();
        vanya.printStudentInfo();

        Person andreiseniorjava = new Person("ffffff","gggggg","123");
        Person danilabname = new Person("kkkkkkk","oooooo","54334242");

        andreiseniorjava.setFirstName("РЖАВЫЙ СЕНИЬОР ФУЛЛ ПРО МАКС ДЖАВА");

        andreiseniorjava.printPersonInfo();
        danilabname.printPersonInfo();

        GameSettings igra1 = new GameSettings(1,"Iris Online");
        GameSettings igra2 = new GameSettings(3,"WOW");

        GameSettings.maxPlayers = 3;

        igra1.addPlayer();
        igra2.addPlayer();

        igra1.printGameStatus();
        igra2.printGameStatus();
















    }
}