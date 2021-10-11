package MerveKarabulut;

//importing classes for date and Scanner objects
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InformationSystem {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);


        //######### EXAMPLE 1 (Cable Provider Customer)############
        ServiceProvider cableprovider1 = new CableProvider("Turkcell"); //creating cable pro

        SubscriptionPlan cableplan1 = new SubscriptionPlan("16GB ",cableprovider1); //creating plans
        SubscriptionPlan cableplan2 = new SubscriptionPlan("56GB",cableprovider1);
        SubscriptionPlan cableplan3 = new SubscriptionPlan("64GB",cableprovider1);

        cableprovider1.addSubscriptionPlan(cableplan1); //adding plans
        cableprovider1.addSubscriptionPlan(cableplan2);
        cableprovider1.addSubscriptionPlan(cableplan3);

        ExistingCustomer excustomer1 = new ExistingCustomer("12345566789"); //creating customer
        excustomer1.setName("Mehmet Siddik Aktas"); //set name because there is no name attribute in constructor method

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse("04/05/2020"); //making date obj for customer
        Subscription subscription1 = new Subscription(date1,cableplan1); // starting subscription
        excustomer1.setSubscription(subscription1);
        excustomer1.showInfos(); // printing method from ExistingCustomer Class

        //######## EXAMPLE 2 (GSM Provider Customer) ############
        ServiceProvider gsmprovider1 = new GSMProvider("Vodafone");

        SubscriptionPlan gsmplan1 = new SubscriptionPlan("10GB",gsmprovider1);
        SubscriptionPlan gsmplan2 = new SubscriptionPlan("100GB",gsmprovider1);
        SubscriptionPlan gsmplan3 = new SubscriptionPlan("5GB",gsmprovider1);

        gsmprovider1.addSubscriptionPlan(gsmplan1);
        gsmprovider1.addSubscriptionPlan(gsmplan2);
        gsmprovider1.addSubscriptionPlan(gsmplan3);

        ExistingCustomer excustomer2 = new ExistingCustomer("42986723283");
        excustomer2.setName("Merve Karabulut");
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse("02/02/2021");
        Subscription subscription2 = new Subscription(date2,gsmplan3);
        excustomer2.setSubscription(subscription2);
        excustomer2.showInfos();


        //####### CONSOLE INPUT EXAMPLE ########
        
        System.out.println("\nNOT: Ilk denemede son iki soru art arda cikabilir bir kez daha run edilirse duzelir.. ");
        System.out.println("\nGSM SERVICE PROVIDER ? ");
        String providername= scan.nextLine();
        ServiceProvider gsm1 = new GSMProvider(providername);

        System.out.println("NUMBER OF SUBSCRIPTION PLANS ?");
        int n = scan.nextInt();


        for( int k=0;k < n; k++ ){

            System.out.println("NAME OF THE Plan ?");
            String plansname = scan.next();
            SubscriptionPlan plans = new SubscriptionPlan(plansname,gsm1);
            gsm1.addSubscriptionPlan(plans);

        }


        System.out.println("CUSTOMER CITIZENSHIP NUMBER");
        String ctnr1 = scan.next();
        ExistingCustomer ct1 = new ExistingCustomer(ctnr1);

        System.out.println("CUSTOMER NAME");
        String ctname = scan.next();
        ct1.setName(ctname);

        System.out.println("NAME OF THE PLAN TO BE SUBSCRIBED ? ");
        String planadi = scan.next();
        gsm1.findSubscriptionPlan(planadi);

        System.out.println("START DATE FOR SUBSCRIPTION (dd/MM/YYYY)? ");
        String startdate = scan.next();
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(startdate);

        Subscription ctsub = new Subscription(date,gsm1.findSubscriptionPlan(planadi));
        ct1 .setSubscription(ctsub);
        ct1.showInfos();

    }
}
