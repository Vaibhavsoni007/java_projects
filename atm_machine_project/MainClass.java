package atm_machine_project;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        AtmOperationinterf op = new AtmOperationImpl();
        int atmnumber = 12345;
        int atmpin = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to atm machine!!!");
        System.out.print("Enter atm number :");
        int atmNumber = sc.nextInt();
        System.out.print("Enter atm pin :");
        int pin = sc.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==pin)){
           while(true){
               System.out.println("1. view available balance\n2. withdraw amount\n3. deposite amount\n4. view ministatement\n5. exit.");
               System.out.println("enter choice: ");
               int ch = sc.nextInt();
               if(ch==1){
                    op.viewBalance();
               }
               else if (ch==2) {
                   System.out.println("enter amount to be withdraw");
                   double withdrawAmount = sc.nextDouble();
                   op.withdrawAmount(withdrawAmount);
               }
               else if (ch==3) {
                   System.out.println("enter amount to deposite :");
                   double depositeAtmount = sc.nextDouble();
                   op.depositAmount(depositeAtmount);
               }
               else if (ch==4) {
                        op.viewMiniStatement();
               }
               else if (ch==5) {
                   System.out.println("collect your atm card\n Thank you for using ATM machine");
                   System.exit(0);
               }
               else {
                   System.out.println("please enter correct choice");
               }
           }
        }
        else{
            System.out.println("incorrect atm number or pin");
            System.exit(0);
        }



    }

}
