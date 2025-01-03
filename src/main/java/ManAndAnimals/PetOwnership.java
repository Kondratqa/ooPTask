package ManAndAnimals;
/*Класс PetOwnership:
• Поля:

• владелец (Person)
• питомец (Animal)

• Методы:
• Конструктор для инициализации всех полей.
• Метод displayPetInfo(), который выводит информацию о питомце владельца. */
public class PetOwnership {

    private Person owner;
    private Animal pet;
    
    public PetOwnership(Person owner, Animal pet) {
        this.owner = owner;
        this.pet = pet;
    }
    public Person getOwner() {
        return owner;
    }
    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public Animal getPet() {
        return pet;
    }
    public void setPet(Animal pet) {
        this.pet = pet;
    }
    //Метод displayPetInfo(), который выводит информацию о питомце владельца.
    public void displayPetInfo(){
        System.out.println(owner + " " + pet);
       
    }

    
}
