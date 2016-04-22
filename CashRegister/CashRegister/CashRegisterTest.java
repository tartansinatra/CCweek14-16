/**
   A class to test the CashRegister class.
*/
public class CashRegisterTest
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister();
      register.recordPurchase(1.00);
      register.recordPurchase(2.157);
      register.enterPayment(5);
      double change = register.calculateChange();
      System.out.println(change);
      register.giveChange();
   }
}
