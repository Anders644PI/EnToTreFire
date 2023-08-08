package eu.mistcloud.template.java.businesslogic;

import eu.mistcloud.template.java.airlocks.rapids.Rapids;

public class English {

    public static void handleEnglishGreeting(String recipient) {
        Rapids.postIntermediateEvent(new Message("Hello", recipient));
    }
}
