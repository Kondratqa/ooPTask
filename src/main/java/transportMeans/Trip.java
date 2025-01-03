package transportMeans;

/*Класс Trip:
• Поля:

• автомобиль (Car)
• расстояние до пункта назначения (double)
• время в пути (double)

• Методы:
• Конструктор для инициализации всех полей.
• Метод calculateFuelConsumption(double fuelEfficiency), который вычисляет расход топлива на основе расстояния и эффективности топлива. */
public class Trip {

    private Car car;
    private double distanceToTheDestination;
    private double travelTime;
    
    public Trip(Car car, double distanceToTheDestination, double travelTime) {
        this.car = car;
        this.distanceToTheDestination = distanceToTheDestination;
        this.travelTime = travelTime;
    }
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public double getDistanceToTheDestination() {
        return distanceToTheDestination;
    }
    public void setDistanceToTheDestination(double distanceToTheDestination) {
        this.distanceToTheDestination = distanceToTheDestination;
    }
    public double getTravelTime() {
        return travelTime;
    }
    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }
    //Метод calculateFuelConsumption(double fuelEfficiency), который вычисляет расход топлива на основе расстояния и эффективности топлива. 
    public void calculateFuelConsumption(double fuelEfficiency100kh){
        fuelEfficiency100kh = 8;
        System.out.println("Расход топлива до места назначения " + distanceToTheDestination / fuelEfficiency100kh + " литров");
    }   
}
