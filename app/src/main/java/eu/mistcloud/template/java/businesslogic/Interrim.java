package eu.mistcloud.template.java.businesslogic;

import eu.mistcloud.template.java.airlocks.rapids.Rapids;

public class Interrim {
    public static void handleIntermediate(String greeting, String recipient) {
        Rapids.postReplyEvent(greeting + ", " + recipient + "!");
    }

}
