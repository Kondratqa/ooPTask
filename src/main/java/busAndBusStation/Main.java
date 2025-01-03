package busAndBusStation;

public class Main {
    public static void main(String[] args) {
        Bus myBus = new Bus("14", "Man", 50, 12, 16);
        System.out.println("Автобус №_" + myBus.getBusNumber() + " марки " + myBus.getModel() + " вместимость " + myBus.getCapacity() + " человек, текущая загрузка автобуса пассажирами " + myBus.getCrrentLoad() + " человек");
        
        BusStation myBusStation = new BusStation("Москва", "Пионерская 2", 20, 25, "6:00 - 24:00");
        myBusStation.isFull();
        System.out.println("На станции " + myBusStation.getStationName() + " по адресу: -" + myBusStation.getAddres() + "- находится " + myBusStation.getNumberOfBuses() + " автобусов, " + " при максимальной загрузке автобусами на станции " + myBusStation.getMaximumBusCapacity() + "машин. Часы работы станции: " + myBusStation.getOperatingHours());
        
        Route myRoute = new Route(myBus, 600, 480);
        myRoute.calculateAverageSpeed(myRoute.getDistanceToDestination());
        myBus.calculateFuelNeeded(myRoute.getDistanceToDestination());
    }
}
