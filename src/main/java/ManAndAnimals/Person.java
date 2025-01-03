package ManAndAnimals;
/*Класс Person:

• Поля:
• имя (String)
• фамилия (String)
• возраст (int)
• адрес (String)
• номер телефона (String)

• Методы:
• Конструктор для инициализации всех полей.
• Геттеры и сеттеры для всех полей.
• Метод getFullName(), который возвращает полное имя человека. */
public class Person {
    private String name;
    private String surname;
    private int age;
    private String addres;
    private String numberPhone;
    
    public Person(String name, String surname, int age, String addres, String numberPhone) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.addres = addres;
        this.numberPhone = numberPhone;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddres() {
        return addres;
    }
    public void setAddres(String addres) {
        this.addres = addres;
    }
    public String getNumberPhone() {
        return numberPhone;
    }
    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
    //Метод getFullName(), который возвращает полное имя человека.
    public void getFullName(){
        System.out.println(name + " " + surname);        
    }
}