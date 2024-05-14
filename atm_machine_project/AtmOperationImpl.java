package atm_machine_project;


import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationinterf{
    ATM atm = new ATM();
    Map<Double,String> ministmt = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available balance is : "+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
            if(withdrawAmount<=atm.getBalance()){
                ministmt.put(withdrawAmount," Amount withdrawn");
                System.out.println(" collect the cash "+ withdrawAmount);
                atm.setBalance(atm.getBalance()-withdrawAmount);
                viewBalance();
            }
            else{
                System.out.println(" insufficient balance !!");
            }
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount," Amount deposited");
        System.out.println(depositAmount+" deposited successfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double,String>m:ministmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
