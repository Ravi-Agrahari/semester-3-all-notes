
package interfaceexample ;


// ICICI class that implement from the interface Banking

public class ICICI implements Banking  {

    private int balance ;
    private String name ;

    @Override
    public void deposite(int amount){
        this.balance += amount ; 
        System.out.println("Amount Deposited Successfully");
    }

    @Override 
    public int checkBalance(){
        return this.balance ; 
    }


    @Override
    public boolean withdraw(int amount){
        if(this.balance >= amount){
            System.out.println("Collect your Cash");
            this.balance -= amount ; 
            return true ;
        }
        else{
            System.out.println("Insufficient Balance");
            return false ; 
        }
    }

    @Override
    public void setName(String name){
        this.name = name ;
    }


}

