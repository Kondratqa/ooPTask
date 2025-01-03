package busAndBusStation;
/*Класс BusStation:
• Поля:
• название станции (String)
• адрес (String)
• количество автобусов (int)
• максимальная вместимость автобусов (int)
• часы работы (String)

• Методы:
• Конструктор для инициализации всех полей.
• Геттеры и сеттеры для всех полей.
• Метод isFull(), который определяет, заполнена ли станция, если количество автобусов равно максимальной вместимости. */
public class BusStation {

    private String stationName;
    private String addres;
    private int numberOfBuses;
    private int maximumBusCapacity;
    private String operatingHours;

    public BusStation(String stationName, String addres, int numberOfBuses, int maximumBusCapacity, String operatingHours){
        this.stationName = stationName;
        this.addres = addres;
        this.numberOfBuses = numberOfBuses;
        this.maximumBusCapacity = maximumBusCapacity;
        this.operatingHours = operatingHours;
    }
    public String getStationName(){
        return stationName;
    }
    public void setStationName(String stationName){
        this.stationName = stationName;
    }
    public String getAddres(){
        return addres;
    }
    public void setAddres(String addres){
        this.addres = addres;
    }
    public int getNumberOfBuses(){
        return numberOfBuses;
    }
    public void setnNmberOfBuses(int numberOfBuses){
        this.numberOfBuses = numberOfBuses;
    }
    public int getMaximumBusCapacity(){
        return maximumBusCapacity;
    }
    public void setMaximumBusCapacity(int maximumBusCapacity){
        this.maximumBusCapacity = maximumBusCapacity;
    }
    public String getOperatingHours(){
        return operatingHours;
    }
    public void setOperatingHours(String operatingHours){
        this.operatingHours = operatingHours;
    }

    public void isFull(){
        if (numberOfBuses == maximumBusCapacity) {
            System.out.println("Для автобусов больше нет места на станции");            
        }
    }
}
