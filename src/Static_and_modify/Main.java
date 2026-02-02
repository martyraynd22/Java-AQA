package Static_and_modify;

public class Main {
public static void main(String[] args){
 Company sber = new Company(5,"Petya");
 Company vtb = new Company(6,"Petya");

 Company.companyName = "Alfa Bank";

 Company.printCompanyName();
 System.out.println(sber.getCompanyName());
 System.out.println(vtb.getCompanyName());

 System.out.println(MathConstants.calculateCircleArea(9.4));
 System.out.println(MathConstants.calculateCircumference(8.2));

University danila = new University("danila");
University andrei = new University("andrei");
University kolya = new University("kolya");

University.changeUniversityName("Oksford");
danila.printStudentInfo();
andrei.printStudentInfo();
kolya.printStudentInfo();

GameSettings igra1 = new GameSettings("WOW",10);
GameSettings igta2 = new GameSettings("WOT",5);

GameSettings.maxPlayers = 10;

igra1.addPlayer();
igta2.addPlayer();


igra1.printGameStatus();
igta2.printGameStatus();

Person danilajava = new Person("Danila","Martynchev","122-41-4116");
Person sashajava = new Person("Sasha","Zubkov","123-45-6789");

danilajava.setFirstName("Pasha");
danilajava.printPersonInfo();
sashajava.printPersonInfo();


}
}
