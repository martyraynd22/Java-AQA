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

        public void deposit(int newBalance){
        this.balance += 500;
    }
        public void withdraw(int newBalance){
        this.balance -= 250;
        }

        void printBalance(){
            System.out.println("Ваш баланс " + this.balance );
        }



}
