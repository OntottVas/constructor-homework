public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022);
        System.out.println(myCar.getBrand()); // Output: Toyota

        Car defaultCar = new Car();
        System.out.println(defaultCar.getModel()); // Output: Unknown

        BankAccount firstAccount = new BankAccount("000001");
        firstAccount.setAccountHolder("Deborah Granger");
        firstAccount.setBalance(1500000);

        BankAccount secondAccount = new BankAccount("000002");
        secondAccount.setAccountHolder("Lucius Wayne");
        secondAccount.setBalance(200000);

        System.out.println("Name: " + firstAccount.getAccountHolder() +
                ", account number: " + firstAccount.getAccountNumber() +
                ", balance: " + firstAccount.getBalance() + " HUF");

        System.out.println("Name: " + secondAccount.getAccountHolder() +
                ", account number: " + secondAccount.getAccountNumber() +
                ", balance: " + secondAccount.getBalance() + " HUF");

        BankAccount thirdAccount = new BankAccount();
        System.out.println("Name: " + thirdAccount.getAccountHolder() +
                ", account number: " + thirdAccount.getAccountNumber() +
                ", balance: " + thirdAccount.getBalance() + " HUF");
    }
}
