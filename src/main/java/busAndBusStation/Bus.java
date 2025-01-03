package busAndBusStation;
/*Класс Bus:
• Поля:
• номер автобуса (String)
• модель (String)
• вместимость (int)
• текущая загрузка (int)
• расход топлива на 100 км (double)

• Методы:
• Конструктор для инициализации всех полей.
• Геттеры и сеттеры для всех полей.
• Метод calculateFuelNeeded(double distance), который вычисляет необходимое количество топлива для заданного расстояния. */
public class Bus {

    private String busNumber;
    private String model;
    private int capacity;
    private int currentLoad;
    private double fuelConsumptionPer100Km;

    public Bus(String busNumber, String model, int capacity, int currentLoad, double fuelConsumptionPer100Km){
        this.busNumber = busNumber;
        this.model = model;
        this.capacity = capacity;
        this.currentLoad = currentLoad;
        this.fuelConsumptionPer100Km = fuelConsumptionPer100Km;
    }
    public String getBusNumber(){
        return busNumber;
    }
    public void setBusNumber(String busNumber){
        this.busNumber = busNumber;
    
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacityr(int capacity){
        this.capacity = capacity;
    
    }
    public int getCrrentLoad(){
        return currentLoad;
    }
    public void setCurrentLoad(int currentLoad){
        this.currentLoad = currentLoad;
    
    }
    public double getFuelConsumptionPer100Km(){
        return fuelConsumptionPer100Km;
    }
    public void setFuelConsumptionPer100Km(double fuelConsumptionPer100Km){
        this.fuelConsumptionPer100Km = fuelConsumptionPer100Km;
    
    }

    public void calculateFuelNeeded(double distanceToDestination){
        double fuelFor100Km = (fuelConsumptionPer100Km / 100) * distanceToDestination;
        System.out.println("Необходимое количество топлива для заданного расстояния 600км: " + fuelFor100Km + " литров");
    }
}
