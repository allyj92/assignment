//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        customer customer = new customer("Tim",1000,"kljj8604@naver.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());


        customer secondCustomer = new customer();
        System.out.println(secondCustomer .getName());
        System.out.println(secondCustomer .getCreditLimit());
        System.out.println(secondCustomer .getEmailAddress());

        customer thirdCustomer = new customer("Joe","joe@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmailAddress());
}}