package eu.mistcloud.template.java.businesslogic;

import eu.mistcloud.template.java.airlocks.rapids.Rapids;

public class Spanish {

    public static void handleSpanishGreeting(String recipient) {
        Rapids.postIntermediateEvent(new Message("Hola", recipient));
    }
}
