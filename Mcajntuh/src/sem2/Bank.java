package sem2;

import java.util.Scanner;

class InsufficientFundsExcept extends Exception{
}


public class Bank {
    private double balance;
    String name;
    private int AcNo;
    Bank(String name,int number){
        this.name=name;
        this.AcNo=number;
    }

    void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        double amount=sc.nextDouble();
        balance+=amount;
    }

    void withdraw()throws InsufficientFundsExcept{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdrawal amount: ");
        double amount=sc.nextDouble();
        if(balance<amount){
            throw new InsufficientFundsExcept();
        }else{
            balance-=amount;
        }

    }

    double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        Bank Ac1 = new Bank("Jay", 001);
        Scanner sc= new Scanner(System.in);
        int choice;
        do{
            System.out.println("Enter the operarion to be performed \n\t 1 Check balance \n\t 2 WithDraw \n\t 3 Deposit\n\t 4 exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                        System.out.println("Balance in your account : "+Ac1.getBalance()); 
                        System.out.println("-------------------------------------");
                        break;
                case 2:
                        try{
                            Ac1.withdraw();
                        }
                        catch(InsufficientFundsExcept I){
                            System.out.println("The funds are insufficient");
                            I.printStackTrace();
                        }finally{
                            System.out.println("Current balance : "+ Ac1.getBalance());
                            System.out.println("--------------------------------");
                        }
                        break;
                case 3: 
                        Ac1.deposit();
                        System.out.println("Balance after depositing: "+Ac1.getBalance());
                        break;
                case 4:
                        sc.close();
                        System.exit(0);
            }
            
        }while(true);
        
    }
}
