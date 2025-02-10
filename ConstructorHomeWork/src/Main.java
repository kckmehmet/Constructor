import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("---------------"+"\n");
            System.out.println("1. Adding a New Customer");
            System.out.println("2. Show customers list");
            System.out.println("3. Close the program");
            System.out.print("\n" + "Your Choice: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                addList(customers);
            } else if (choice == 2) {
                getList(customers);
            }else if (choice==3){
                break;
            }
            else {
                System.out.println("ERROR: You have logged in incorrectly!!!");
            }
        }
    }

    private static void addList(ArrayList<Customer> customers) {
        Customer newcustomer = newCustomer();
        customers.add(newcustomer);

    }

    private static void getList(ArrayList<Customer> customers) {
        if (customers.size() == 0) {
            System.out.println("No customer records found");
            return;
        }
        for (int i = 0; i < customers.size(); i++) {
            System.out.println("--------------------");
            System.out.println("Customer ID: " + customers.get(i).getId());
            System.out.println("Customer Full Name: " + customers.get(i).getName() + " " + customers.get(i).getSurName());
            System.out.println("Customer Email: " + customers.get(i).getEmail());
            System.out.println("Customer Balance: " + customers.get(i).getBalance());
        }

    }


    private static Customer newCustomer() {
        short id;
        String name;
        String surName;
        String email;
        double balance;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" + "Enter customer ID: ");
        id = scanner.nextShort();
        System.out.print("\n" + "Enter customer Name: ");
        name = scanner.next();
        System.out.print("\n" + "Enter customer SurName: ");
        surName = scanner.next();
        System.out.print("\n" + "Enter customer Email: ");
        email = scanner.next();
        System.out.print("\n" + "Enter customer Balance: ");
        balance = scanner.nextDouble();
        Customer customer = new Customer(id, name, surName, email, balance);
        System.out.println("---------------" + "\n" + "New Customer added");
        return customer;
    }


}