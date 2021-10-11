package MerveKarabulut;

public class ExistingCustomer extends Customer{
    private Subscription subscription;

    public ExistingCustomer(String citizenshipNr){
        super(citizenshipNr);
    }

    public ExistingCustomer(String citizenshipNr,Subscription subscription) {
        super(citizenshipNr);
        this.subscription= subscription;
    }


    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }
    public void showInfos(){
        System.out.println();
        System.out.println("Customer citizenshipnumber: "+getCitizenshipNr());
        System.out.println("Customer name: "+getName());
        System.out.println("Service Provider: "+subscription.getSubscriptionPlan().getServiceProvider().getName());
        System.out.println("Subscribtipn plan name: "+subscription.getSubscriptionPlan().getName());
        System.out.println("Subscribtion startting date: "+subscription.getSubscriptionStartDate());

    }

}
