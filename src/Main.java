

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        Customer customer1 = new Customer("Smith", "Ikeja");
        Customer customer2 = new Customer("John", "Ogba");

        store.register(customer1);
        store.register(customer2);

        store.inviteSale();

    }
}