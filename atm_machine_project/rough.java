import java.util.Scanner;

public class rough {
    int table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rough obj = new rough();
        System.out.println("enter any number");
        int number = sc.nextInt();
       obj.table(number);
    }
    
}
