package houseAndSeller;
/*Класс Sale:
• Поля:
• дом (House)
• продавец (Seller)
• сумма сделки (double)
• дата сделки (String)
• Методы:

• Конструктор для инициализации всех полей.
• Метод isSaleSuccessful(), который определяет, успешна ли сделка, если сумма сделки больше цены дома.*/
public class Sale {
    private House house;
    private Seller seller;
    private double transactionAmount;
    private String transactionDate;

    

    public Sale(House house, Seller seller, double transactionAmount, String transactionDate){
        this.house = house;
        this.seller = seller;
        this.transactionAmount = transactionAmount;
        this.transactionDate = transactionDate;
    }

    public House getHouse(){
        return house;
    }
    public void setHouse(House house){
        this.house = house;
    }
    public Seller getSeller(){
        return seller;
    }
    public void setSeller(Seller seller){
        this.seller = seller;
    }
    public double getTransactionAmount(){
        return transactionAmount;
    }
    public void setTransactionAmount(double transactionAmount){
        this.transactionAmount = transactionAmount;
    }
    public String getTransactionDate(){
        return transactionDate;
    }
    public void setTransactionDate(String transactionDate){
        this.transactionDate = transactionDate;
    }

    //Метод isSaleSuccessful(), который определяет, успешна ли сделка, если сумма сделки больше цены дома
    public void isSaleSuccessful(double price){
        if (transactionAmount > price ) {
            System.out.println("Сделка не успешна - сумма сделки не может привышать стоимость дома");
        }
    }
}
