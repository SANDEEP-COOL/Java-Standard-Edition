
class Bank{
    private long curBalance = 0;
    long bankId;
    String name;

    public long getBalance(long id){
        // Checking whether the user is
        // authorised or unauthorised 
        // Comparing bank_id of user and the given Id
        // then only it will get access
        if(this.bankId == id){
            return this.curBalance;
        }

        // unothoraized user 
        return -1;
    }

    public void setBalance(long balance , int id){
        // Comparing bank_id of user and the given Id
        // then only it will get access
        if(this.bankId == id){
            this.curBalance = this.curBalance + balance;
        }
        else{
            System.out.println("unothoraized employee!");
        }
    }

}

// working as an Employee class 
public class DataHiding {
    public static void main(String[] args) {
        
        // object - Bank 
        Bank bankEmp = new Bank();
        bankEmp.bankId = 1234;
        bankEmp.name = "roshan";

        // set balance 
        bankEmp.setBalance(120000, 1234567);
        bankEmp.setBalance(120000, 1234);
        
        // getBalance 
        System.out.println(bankEmp.getBalance(123455));
        System.out.println(bankEmp.getBalance(1234));


    }
}
