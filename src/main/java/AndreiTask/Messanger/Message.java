package AndreiTask.Messanger;

public class Message {
    private String disription;
    private User sender;
    private User poluchatel;

    public Message(String disription) {
        this.disription = disription;
    }

    public String getDisription() {
        return disription;
    }

    public void setDisription(String disription) {
        this.disription = disription;
    }
}
