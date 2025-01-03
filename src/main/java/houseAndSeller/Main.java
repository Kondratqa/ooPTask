package houseAndSeller;

public class Main {
    public static void main(String[] args) {
        House myHouse = new House("Королёва 5", 300, 7, 500000, 2024);
        myHouse.calculatePricePerSquareMeter();
        System.out.println("Площадь дома " + myHouse.getSquare() + " кв метров," + " в доме " + myHouse.getNumberOfRooms() + " комнат," + " стоимость дома " + myHouse.getPrice() + " рублей, год постройки дома " + myHouse.getYearBuilt() + " года");
                
        Seller mySeller = new Seller("Глеб", "Козлов", "+7(987-234-55-66)", 8, 4.5);
        mySeller.isExperienced();
        System.out.println("Продавец по имени " + mySeller.getName() + " " + mySeller.getSurname() + ", телефон продавца " + mySeller.getPhoneNumber() + " стаж продавца продавца " + mySeller.getYearsOfExperience() + " лет, " + " рейтинг продавца " + mySeller.getRating());
        
        Sale mySale = new Sale(myHouse, mySeller , 600000, "24 мая");
        mySale.isSaleSuccessful(myHouse.getPrice());
        System.out.println("Cумма сделки " + mySale.getTransactionAmount() + " рублей, дата сделки " + mySale.getTransactionDate());

    }

}

