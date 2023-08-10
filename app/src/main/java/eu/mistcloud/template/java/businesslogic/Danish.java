package eu.mistcloud.template.java.businesslogic;

import eu.mistcloud.template.java.airlocks.rapids.Rapids;

public class Danish {

    public static void handleDanishGreeting(String recipient) {
        Rapids.postIntermediateEvent(new Message("Hej med dig", recipient));
    }
}
