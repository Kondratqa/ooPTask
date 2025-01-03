package ManAndAnimals;

public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person("Витя", "Собачкин", 20, "Королева 5", "+7(999)999-99-99");
        System.out.println(); 
        myPerson.getFullName();

        Animal myAnimal = new Animal("Dina", "Овчарка", 4, 15, "Черный");
        myAnimal.calculateAgeInHumanYears();

        PetOwnership myPetOwnership = new PetOwnership(myPerson, myAnimal);
        
        myPetOwnership.displayPetInfo();
        
    }    

}

