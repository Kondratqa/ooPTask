package houseAndSeller;
/*Класс Seller:
• Поля:
• имя (String)
• фамилия (String)
• номер телефона (String)
• опыт работы (int) в годах
• рейтинг (double)

• Методы:
• Конструктор для инициализации всех полей.
• Геттеры и сеттеры для всех полей.
• Метод isExperienced(), который определяет, является ли продавец опытным, если его опыт работы больше 5 лет.*/
public class Seller {
    private String name;
    private String surname;
    private String phoneNumber;
    private int yearsOfExperience;
    private double rating;

    public Seller(String name, String surname, String phoneNumber, int yearsOfExperience, double rating){
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.yearsOfExperience = yearsOfExperience;
        this.rating = rating;
    }

    public String getName(){
        return name;
    }
    public void setName( String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname( String surname){
        this.surname = surname;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getYearsOfExperience(){
        return yearsOfExperience;
    }
    public void setYearsOfExperience( int yearsOfExperience){ this.yearsOfExperience = yearsOfExperience;
    }
    public double getRating(){
        if (rating < 4.5) {
            System.out.println("Продавец не имеет доверия");            
        }else{
            System.out.println("У продавца положительный рейтинг");
        }
        return rating;
    }
    public void setRating( double rating){
        this.rating = rating;
    }

    // Метод isExperienced(), который определяет, является ли продавец опытным, если его опыт работы больше 5 лет
    public void isExperienced(){
        if (yearsOfExperience >= 8) {
            System.out.println("Продавец является опытным");            
        }else{
            System.out.println("У прадовца мало опыта");
        }
    }
}
