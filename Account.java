public class Account {
    private String name;
    private double balance;
    private int id;

    // Construct full arg...
    public Account(String name, double balance, int id) {
        this.name = name;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
        this.id = id;

    }

    public void Deposit(double am) {
        if (am > 0) {
            balance += am;
            System.out.println("you add " + am);
        } else {
            System.out.println("invaild number (should be positive)!");

        }

    }

    // withdraw monay--;
    public void withdraw(double ww) {
        if (ww > 50 && balance >= ww) {
            balance -= ww;
            System.out.println("withdraw " + ww);
        } else {
        }
        System.out.println(" ( reject ) yor balance is not enogh");

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int Id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    // print method--
    public void printData() {
        System.out.println("Name ;" + name);
        System.out.println("Id ;" + id);
        System.out.println("Balance ;" + balance);
    }

}