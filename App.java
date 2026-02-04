import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name ");
        String name = input.nextLine();
        System.out.println("ENTER YOUR ID ;");
        int id = input.nextInt();
        System.out.println("Enter your balance");
        double balance = input.nextDouble();
        Account c1 = new Account(name, balance, id);
        Thread.sleep(500);
        System.out.println("NAME" + ";  " + c1.getName());
        System.out.println("BALANCE NOW " + ";  " + c1.getBalance());
        System.out.println("your id is" + " ;   " + c1.getId());
        Thread.sleep(350);
        System.out.println("if you want to add monay press A" + " " +
                "&& If you want withdraw Monay press w");
        char p = input.next().charAt(0);

        switch (p) {
            case 'a':
                System.out.println("put the number ");
                double aa = input.nextDouble();
                Thread.sleep(450);
                c1.Deposit(aa);

                break;
            case 'w':
                System.out.println("put the number ");
                double ww = input.nextDouble();
                Thread.sleep(450);
                c1.withdraw(ww);

                break;
            default:
                System.out.println("invaild char  ;");
                break;
        }

        Thread.sleep(700);
        c1.printData();
    }
}
