package transportMeans;

/* Класс Vehicle:
• Поля:

• марка (String)
• модель (String)
• год выпуска (int)
• цена (double)
• максимальная скорость (double)

• Методы:
 • Конструктор для инициализации всех полей.
 • Геттеры и сеттеры для всех полей.
 • Метод calculateAge(), который вычисляет возраст транспортного средства на основе текущего года.*/
public class CarBrand {
    
    private String carBrand;
    private String carModel;
    private int yearOfManufacture;
    private double price;
    private double maximumSpeed;

    public CarBrand(String carBrand, String carModel, int yearOfManufacture, double price, double maximumSpeed){
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.maximumSpeed = maximumSpeed;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    
    //Метод calculateAge(), который вычисляет возраст транспортного средства на основе текущего года.
    public void calculateAge(){

        double currentYear = 2024;
        System.out.println("Возраст машины " + (currentYear - getYearOfManufacture()));       
    }
        
}

