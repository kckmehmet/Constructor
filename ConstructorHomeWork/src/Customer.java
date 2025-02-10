public class Customer {

    private short id;
    private String name;
    private String surName;
    private double balance;
    private String email;

    public Customer(short id,String name,String surName,String email,double balance){
        this.id=id;
        this.name=name;
        this.surName=surName;
        this.email=email;
        this.balance=balance;
    }

    public short getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurName(){
        return surName;
    }
    public String getEmail(){
        return email;
    }
    public double getBalance(){
        return balance;
    }
}
