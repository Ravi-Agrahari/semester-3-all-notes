package YouTube;

public class Subscription {
    private int subscriptionId;
    private int subscriberId; // Foreign key to User (the person who subscribes)
    private int channelId; // Foreign key to User (the person being subscribed to)
    private String subscriptionDate;

    // Default Constructor
    public Subscription() {}

    // Parameterized Constructor
    public Subscription(int subscriptionId, int subscriberId, int channelId, String subscriptionDate) {
        this.subscriptionId = subscriptionId;
        this.subscriberId = subscriberId;
        this.channelId = channelId;
        this.subscriptionDate = subscriptionDate;
    }

    // Getters and Setters
    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public int getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(int subscriberId) {
        this.subscriberId = subscriberId;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public String getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(String subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }
}
