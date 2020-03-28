package ie.gmit.open;

public abstract class Subscriber {
    protected Long subscriberID;
    protected String address;
    protected Long phoneNumber;


    public Long getSubscriberID() {
        return subscriberID;
    }

    public void setSubscriberID(Long subscriberID) {
        this.subscriberID = subscriberID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract double calculateBill();
}
