package MerveKarabulut;

public class CableProvider implements ServiceProvider {
    private String name;
    private SubscriptionPlan[] subscriptionPlans;

    public CableProvider(String name) {
        this.name = name;
        this.subscriptionPlans = new SubscriptionPlan[20];
    }

    public CableProvider() {
        this.subscriptionPlans = new SubscriptionPlan[20];
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
