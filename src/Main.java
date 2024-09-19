import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int nbcages;
        String zooName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the zoo ");
        zooName = sc.nextLine();
        System.out.println("Please enter the name of  cages");
        nbcages = sc.nextInt();
        System.out.println(zooName+" has "+nbcages+" cages");
        System.out.println(MyZoo.toString());
    }

    public class Animal {
        Animal lion = new Animal("lion", "sauvage", 10, true);
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
public class Zoo {
    Zoo myZoo = new Zoo("frigya", "sousse", 20);
    String nameZ;
    String City;
    int nbrCages;

    public  Zoo(String nameZ, String City, int nbrCages) {
        Animal[] animals = new Animal[nbrCages];
        this.nameZ = nameZ;
        this.City = City;
        this.nbrCages = nbrCages;


    }
    public void MyZoo() {
        System.out.println("Myzoo "+nameZ+ "in"+City+"have"+nbrCages+" cages");

    }
}

    }
}