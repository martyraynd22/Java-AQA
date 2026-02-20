package OopJava;

import OopJava.Aquarium.Aquarium;
import OopJava.Aquarium.SeaAnimal;
import OopJava.Aquarium.Shark;
import OopJava.Aquarium.Star;
import OopJava.Farm.Cow;
import OopJava.Farm.Farm;
import OopJava.Farm.FarmAnimal;
import OopJava.Garden.Cactus;
import OopJava.Garden.Garden;
import OopJava.Garden.Plant;
import OopJava.HomePet.Cat;
import OopJava.HomePet.Dog;
import OopJava.HomePet.HomePet;
import OopJava.HomePet.PetManager;
import OopJava.Museun.Exhibit;
import OopJava.Museun.Manuscript;
import OopJava.Museun.Museum;
import OopJava.Museun.Sculpture;
import OopJava.Park.Attraction;
import OopJava.Park.Park;
import OopJava.Park.Rollercoaster;
import OopJava.Restaurant.Dish;
import OopJava.Restaurant.Drink;
import OopJava.Restaurant.Hotdish;
import OopJava.Restaurant.Menu;
import OopJava.Zoo.Animal;
import OopJava.Zoo.Bird;
import OopJava.Zoo.Elephant;
import OopJava.Zoo.Zoo;

public class Main {
    static void main(String[] args) {

        // 1. Зоопарк

        Animal elephant = new Elephant("Бимбо");
        Animal bird = new Bird("Синица");
        Zoo zoo = new Zoo();
        zoo.addAnimal(elephant);
        zoo.showanimalbehavior();

        // 2. Домашнее животное

        HomePet cat = new Cat("Буся");
        HomePet dog = new Dog("Босс");
        PetManager hozain = new PetManager();
        hozain.addHomePet(cat);
        hozain.care();

        // 3. Ресторан

        Dish hotdish = new Hotdish("Борщ");
        Dish drink = new Drink("Мохито");
        Menu menu = new Menu();
        menu.watschdish();

     // 4. Аквариум

        SeaAnimal shark = new Shark("Молот");
        SeaAnimal star = new Star("Пятиконечная");
        Aquarium aquarium = new Aquarium();
        aquarium.addSeaAnimal(shark);
        aquarium.showAction();

        // 5. Ферма

        FarmAnimal cow = new Cow("Зорька");
        Farm farm = new Farm();
        farm.addFarmAnimal(cow);
        farm.manageAnimal();


        // 6. Сад

        Plant cactus = new Cactus("Жора");
        Garden garden = new Garden();
        garden.addPlant(cactus);
        garden.supportPlant();

        // 7.Парк аттракционов

        Attraction roller = new Rollercoaster("Американские горки");
        Park park = new Park();

        park.addAttraction(roller);
        park.opperateAttraction();

        // 8. Музей

        Exhibit sculpture = new Sculpture("Древнегреческая");
        Museum museum = new Museum();

        museum.setExhibit(sculpture);
        museum.showExibit();





    }
}
