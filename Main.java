public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022);
        System.out.println(myCar.getBrand()); // Output: Toyota

        Car defaultCar = new Car();
        System.out.println(defaultCar.getModel()); // Output: Unknown

        BankAccount firstAccount = new BankAccount();
        firstAccount.setAccountHolder("Deborah Granger");
        firstAccount.setAccountNumber("000001");
        firstAccount.setBalance(1500000);

        BankAccount secondAccount = new BankAccount();
        secondAccount.setAccountHolder("Lucios Wayne");
        secondAccount.setAccountNumber("000002");
        secondAccount.setBalance(200000);

        System.out.println("Name: " + firstAccount.getAccountHolder() +
                ", account number: " + firstAccount.getAccountNumber() +
                ", balance: " + firstAccount.getBalance() + " HUF");

        System.out.println("Name: " + secondAccount.getAccountHolder() +
                ", account number: " + secondAccount.getAccountNumber() +
                ", balance: " + secondAccount.getBalance() + " HUF");
    }
}
