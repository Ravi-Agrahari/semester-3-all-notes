package interfaceexample;

//import BufferReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class InterfaceExampleMain {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noOfAccounts = Integer.parseInt(br.readLine());

        String name ; 
        int balance ;
        int choice ; 

        Banking b  ; 

        Banking[] accounts = new Banking[noOfAccounts] ;

        for(int i=0; i<noOfAccounts ; i++){
            System.out.println("1) ICICI 2) HDFC");
            System.out.println("Enter your choice : ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:

                    System.out.println("Enter the name : ");
                    name = br.readLine();
                    System.out.println("Enter the balance : ");
                    balance = Integer.parseInt(br.readLine());
                    b = new ICICI();
                    b.setName(name);
                    b.deposite(balance);
                    accounts[i] = b ;

                    break;


                case 2:
                    System.out.println("Enter the name : ");
                    name = br.readLine();
                    System.out.println("Enter the balance : ");
                    balance = Integer.parseInt(br.readLine());
                    b = new HDFC();
                    b.setName(name);
                    b.deposite(balance);
                    accounts[i] = b ;
                    break;
            }
        }
        do{
            System.out.println("1) Deposite 2) Withdraw 3) Check Balance 4) Exit");
            System.out.println("Enter your choice : ");
            choice = Integer.parseInt(br.readLine());


            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to deposite : ");
                    int amount = Integer.parseInt(br.readLine());
                    for(Banking account : accounts){
                        account.deposite(amount);
                    }
                    break;
            
                case 2 :
                    System.out.println("Enter the amount to withdraw : ");
                    amount = Integer.parseInt(br.readLine());
                    for(Banking account : accounts){
                        account.withdraw(amount);
                    }
                    break;

                case 3:
                    for(Banking account : accounts){
                        System.out.println("Balance : "+account.checkBalance());
                    }
                    break;
            }

        }while(choice != 4);


            


        
    }
    
}
