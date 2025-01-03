package transportMeans;

/*Класс Car:
• Поля:

• тип кузова (String)
• количество дверей (int)
• цвет (String)

• Методы:
• Конструктор для инициализации всех полей, включая поля родительского класса.
• Геттеры и сеттеры для всех полей.
• Метод isSportCar(), который определяет, является ли машина спортивной, если ее максимальная скорость выше 200 км/ч.
 */
public class Car {

    private String bodyType;
    private int numberOfDoors;
    private String color;
    
    public Car(String bodyType, int numberOfDoors, String color) {
        this.bodyType = bodyType;
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }
    public String getBodyType() {
        return bodyType;
    }
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //Метод isSportCar(), который определяет, является ли машина спортивной, если ее максимальная скорость выше 200 км/ч.
    public void isSportCar(double maximumSpeed){
        if (maximumSpeed > 200) {
            System.out.println("Машина является спoртивной");
            
        }

    }
    
}

