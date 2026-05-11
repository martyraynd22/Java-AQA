package Classes_and_objects;

public class BankAccount {
    String owner;
    int balance;



    public BankAccount(String newOwner,int newBalance) {
        this.owner = newOwner;
        this.balance = newBalance;
    }
    public void setOwner(String newOwner){

        this.owner = newOwner;
        }

        String getOwner(){
        return this.owner;
        }

        int getBalance(){
        return this.balance;
        }


        public void deposit(int amount){
        this.balance += amount;
        }

        public void withdraw(int amount){
        this.balance -= amount;
        }

     void printBalance(){
         System.out.println("Ваш баланс " + this.balance);
        }



}
