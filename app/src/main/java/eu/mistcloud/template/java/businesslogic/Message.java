package eu.mistcloud.template.java.businesslogic;

public class Message {
    private String greeting;
    private String recipient;

    public Message(String greeting, String recipient) {
        this.greeting = greeting;
        this.recipient = recipient;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getRecipient() {
        return recipient;
    }

    public String toJSONString() {
        return "{" +
                "\"greeting\": \"" + this.getGreeting() + "\"," +
                "\"recipient\": \"" + this.getRecipient() + "\"" +
                "}";
    }
}
