package MerveKarabulut;

public interface ServiceProvider {
    public String getName();
    public void setName(String name);
    public void addSubscriptionPlan(SubscriptionPlan sp);
    public SubscriptionPlan findSubscriptionPlan(String Planname);



}
