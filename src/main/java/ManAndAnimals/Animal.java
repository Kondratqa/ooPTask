package ManAndAnimals;
/*Класс Animal:
• Поля:

• имя животного (String)
• вид (String)
• возраст (int)
• вес (double)
• цвет (String)

• Методы:
• Конструктор для инициализации всех полей.
• Геттеры и сеттеры для всех полей.
• Метод calculateAgeInHumanYears(), который вычисляет возраст животного в "человеческих годах" по общепринятой формуле. */
public class Animal {
    private String animalName;
    private String breed;
    private int age;
    private double weight;
    private String color;
    
    public Animal(String animalName, String breed, int age, double weight, String color) {
        this.animalName = animalName;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public String getAnimalName() {
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //Метод calculateAgeInHumanYears(), который вычисляет возраст животного в "человеческих годах" по общепринятой формуле
    public void calculateAgeInHumanYears(){
        int animalAgeInHumanYears = 15 + 9 + 5 + 5;
        System.out.println("Возраст моей собаки в человечиских годах " + animalAgeInHumanYears + " года");
    }
    
}

