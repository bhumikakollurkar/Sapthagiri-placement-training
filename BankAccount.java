
package bankaccount;
  class BankAccount {
    private int acc;
 private double bal;
 BankAccount(int a,double b){ acc=a; bal=b;
 }
 public void deposit(double amt){ bal+=amt; }
 public void withdraw(double amt){
 if(amt<=bal) bal-=amt;
 }
 void display(){
 System.out.println(acc+" "+bal);
 }
 public static void main(String[] args){
 BankAccount b=new BankAccount(101,5000);
 b.deposit(1000);
 b.withdraw(2000);
 b.display();
 }
}