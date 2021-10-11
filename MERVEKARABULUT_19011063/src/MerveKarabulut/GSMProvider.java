package MerveKarabulut;

public class GSMProvider implements ServiceProvider{
    private String name;
    private static SubscriptionPlan[] subscriptionPlans;

    public GSMProvider() {
        subscriptionPlans = new SubscriptionPlan[20];
    }

    public GSMProvider(String name) {
        this.name = name;
        subscriptionPlans = new SubscriptionPlan[20];
    }

    @Override
    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSubscriptionPlan(SubscriptionPlan sp){
        int i = 0;

        while(i < subscriptionPlans.length && subscriptionPlans[i] != null)
            i++;

        if (i != subscriptionPlans.length)
            subscriptionPlans[i] = sp;

    }

    public SubscriptionPlan[] getSubscriptionPlans(){
        return subscriptionPlans;
    }

    public SubscriptionPlan findSubscriptionPlan(String PlanName){

        for(SubscriptionPlan sp : getSubscriptionPlans()){
            if(sp != null && sp.getName().equals(PlanName)){

                return sp;
            }
        }

        return null;
    }
}
