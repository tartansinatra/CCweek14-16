import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 
 * @author 0501979
 *
 * class to represent an auction client, which provides command-line interface for interacting with server
 * to register new auction items, view items currently listed for auction, and make a bid for an auction item
 */
public class AuctionClient extends UnicastRemoteObject implements AuctionClientInterface, Runnable {

  public AuctionClient() throws RemoteException {
    super();
  }
  
  public void callback(String s) throws RemoteException {
    System.out.println(s);
  }

  public static void main(String[] args) throws Exception {
    
    String host = "localhost";
    if (args.length > 0)
      host = args[0];
    new Thread(new AuctionClient()).start();
  }
  
  @Override
  public void run() {
    try { // connect to auction server
      AuctionServerInterface asi = (AuctionServerInterface) Naming.lookup("rmi://localhost:1099/AuctionServer");
      
      // provide user with list of options
      System.out.println("\nWELCOME TO THE ONLINE AUCTION SYSTEM\n");
      String prompt = ">> You now have four options:\n" +
          "n : list new item\n" +
          "v : view items listed for auction\n" +
          "b : make bid for a listed item\n" +
          "q : quit";
      System.out.println(prompt);
      String response = "";
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      System.out.print(">> ");
      response = in.readLine();
      while (!response.equals("q")) {
        String[] chars = response.split(" ");
        char option = chars[0].charAt(0);
        switch(option) {
        case 'n':
          // register item
          prompt = "Enter name of item being listed for auction:\n";
          System.out.println(prompt);
          System.out.print(">> ");
          String item = in.readLine();
          System.err.println("You have entered: "+item);
          prompt = "Enter minimum bid value for this item:\n";
          System.out.println(prompt);
          System.out.print(">> \u00A3");
          double minVal = Double.parseDouble(in.readLine());
          prompt = "Enter length of time for item to be on auction in the form hh:mm:ss\n";
          System.out.println(prompt);
          System.out.print(">> ");
          String hours = in.readLine();
          String[] time = hours.split(":");
          int hour = Integer.parseInt(time[0]);
          int minute = Integer.parseInt(time[1]);
          int second = Integer.parseInt(time[2]);
          long startTime = System.currentTimeMillis();
          long endTime = startTime + second*1000 + minute*60*1000 + hour*60*60*1000;          
          prompt = "Enter your email address so that we can contact you with the result of the auction:\n";
          System.out.println(prompt);
          System.out.print(">> ");
          String email = in.readLine();
          // register new auction item with the auction server
          asi.registerItem(this, item, minVal, endTime, email);
          break;
        case 'v':
          // list current bid items
          asi.listItems(this);
          break;
        case 'b':
          // make bid for item
          prompt = "Enter id of item you would like to bid for:\n";
          System.out.println(prompt);
          System.out.print(">> ");
          int bidItemID = Integer.parseInt(in.readLine());
          prompt = "Enter your bid value for this item:\n";
          System.out.println(prompt);
          System.out.print(">> \u00A3");
          double bidVal = Double.parseDouble(in.readLine());
          prompt = "Enter your email address so that we can contact you with the result of the auction:\n";
          System.out.println(prompt);
          System.out.print(">> ");
          String bidEmail = in.readLine();
          // send bid request to auction server
          asi.acceptBid(this, bidItemID, bidVal, bidEmail);
          break;
        }
        prompt = ">> You now have four options:\n" +
        "n : list new item\n" +
        "v : view items listed for auction\n" +
        "b : make bid for a listed item\n" +
        "q : quit";
        System.out.println(prompt);
        System.out.print(">> ");
        response = in.readLine();
      }
      in.close();
      System.exit(0);
      
    } catch (RemoteException ex) {
      System.err.println("Exception in AuctionClient: " + ex.getMessage());
    } catch (NotBoundException ex) {
      System.err.println("AuctionClient unable to bind to AuctionServer: " + ex.getMessage());
    } catch (MalformedURLException ex) {
      System.err.println("Malformed URL for server: " + ex.getMessage());
    } catch (IOException ex) {
      System.err.println("Invalid input entered");
    }
    
  }
}
Status API Training Shop Blog About
© 2016 GitHub, Inc. Terms Privacy Security Contact Help