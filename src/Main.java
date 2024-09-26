import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

      /*  int nbcages;
        String zooName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the zoo ");
        zooName = sc.nextLine();
        System.out.println("Please enter the name of  cages");
        nbcages = sc.nextInt();
        System.out.println(zooName+" has "+nbcages+" cages");*/
        Animal lion = new Animal("lion", "sauvage", 10, true);
        Zoo myZoo = new Zoo("frigya", "sousse", 20);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(lion);
    }
}
    class Animal {
        //Animal lion = new Animal("lion", "sauvage", 10, true);
        String name;
        String family;
        int age;
        boolean isMammal;

        public Animal(String name, String family, int age, boolean isMammal) {
            this.name = name;
            this.family = family;
            this.age = age;
            this.isMammal = isMammal;

        }
        public String toString() {
            return "Animal Name: " + name + ", Family: " + family + ", Age: " + age + ", Is Mammal: " + isMammal;
        }
    }
 class Zoo {
    //Zoo myZoo = new Zoo("frigya", "sousse", 20);
    Animal[] animals = new Animal[25];
     private int compteurAnimaux = 0;
     String nameZ;
    String City;
    int nbrCages;

    public  Zoo(String nameZ, String City, int nbrCages) {
        this.nameZ = nameZ;
        this.City = City;
        this.nbrCages = nbrCages;


    }
    public void displayZoo() {
        System.out.println("Zoo Name: " + nameZ);
        System.out.println("City: " + City);
        System.out.println("Number of Cages: " + nbrCages);

    }

     boolean addAnimal(Animal animal) {
         if (compteurAnimaux < animals.length) {
             for (int i = 0; i < animals.length; i++) {
                 animals[compteurAnimaux] = animal;
                 compteurAnimaux++;
                 System.out.println(animals[i]);
             }
             return true;
         } else {
             System.out.println("Impossible d'ajouter l'animal. Le zoo est plein.");
             return false;
         }
     }

 }



