package busAndBusStation;
/*Класс Route:
• Поля:
• автобус (Bus)
• расстояние до пункта назначения (double)
• время в пути (double)

• Методы:
• Конструктор для инициализации всех полей.
• Метод calculateAverageSpeed(), который вычисляет среднюю скорость, используя расстояние и время в пути. */
public class Route {

    private Bus bus;
    private double distanceToDestination;
    private double travelTime;
    


    public Route(Bus bus, double distanceToDestination, double travelTime){
        this.bus = bus;
        this.distanceToDestination = distanceToDestination;
        this.travelTime = travelTime;
    }

    public Bus getBus(){
        return bus;
    }
    public void setBus(Bus bus){
        this.bus = bus;
    }
    public double getDistanceToDestination(){
        return distanceToDestination;
    }
    public void setDistanceToDestination(double distanceToDestination){
        this.distanceToDestination = distanceToDestination;
    }
    public double getTravelTime(){
        return travelTime;
    }
    public void setTravelTime(double travelTime){
        this.travelTime = travelTime;
    }

    public double calculateAverageSpeed(double distanceToDestination){
       
        double travelTimeInHours = travelTime / 60;
        System.out.println("Средняя скорость автобус " + distanceToDestination / travelTimeInHours + " км/ч");
        return travelTimeInHours;
    }
}
