package houseAndSeller;
/*Класс House:
• Поля:
• адрес (String)
• площадь (double)
• количество комнат (int)
• цена (double)
• год постройки (int)

• Методы:
• Конструктор для инициализации всех полей.
• Геттеры и сеттеры для всех полей.
• Метод calculatePricePerSquareMeter(), который возвращает цену за квадратный метр. */
public class House {

    private String addres;
    private double square;
    private int numberOfRooms;
    private double price;
    private int yearBuilt;

    public House(String addres, double square, int numberOfRooms, double price, int yearBuilt){
        this.addres = addres;
        this.square = square;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
        this.yearBuilt = yearBuilt;
    }

    public String getAddres(){
        return addres;
    }
    public void setAddres( String addres){
        this.addres = addres;
    }
    public double getSquare(){
        return square;
    }
    public void setSquare( double square){
        this.square = square;
    }
    public int getNumberOfRooms(){
        return numberOfRooms;
    }
    public void setNumberOfRooms( int numberOfRooms){
        this.numberOfRooms = numberOfRooms;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getYearBuilt(){
        return yearBuilt;
    }
    public void setYearBuilt(int yearBuilt){
        this.yearBuilt = yearBuilt;
    }
    //Метод calculatePricePerSquareMeter(), который возвращает цену за квадратный метр
    public void calculatePricePerSquareMeter(){
        double pricePerSquareMeter = price / square;
        System.out.println("Цена за квадратный метр " + pricePerSquareMeter + " рублей");        
    }
}
