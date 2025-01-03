package transportMeans;

public class Main {
    public static void main(String[] args) {
        CarBrand myCarBrand = new CarBrand("Kia", "Carnival", 2011, 70000, 220);
        System.out.println("Я купил машину " + myCarBrand.getCarBrand() + " " + myCarBrand.getCarModel() + ", год выпуска " + myCarBrand.getYearOfManufacture() + " года, по цене $" + myCarBrand.getPrice() + ", максимальная скорость авто " + myCarBrand.getMaximumSpeed() + " км/ч");
        myCarBrand.calculateAge();
        
        Car myCar = new Car("Minivan", 5, "Red");        
        System.out.println("Тип кузова " + myCar.getBodyType() + ", количество дверей " + myCar.getNumberOfDoors() + ", цвет " + myCar.getColor());
        myCar.isSportCar(myCarBrand.getMaximumSpeed());
 
        Trip myTrip = new Trip(myCar, 700, 10);
        System.out.println("Расстояние до места назначения " + myTrip.getDistanceToTheDestination() + " км " + " время в пути " + myTrip.getTravelTime() + " часов ");
        myTrip.calculateFuelConsumption(myTrip.getDistanceToTheDestination());
    }        
}

