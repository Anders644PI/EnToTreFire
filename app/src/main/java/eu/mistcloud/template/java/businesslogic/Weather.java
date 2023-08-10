package eu.mistcloud.template.java.businesslogic;

import eu.mistcloud.template.java.airlocks.rapids.Rapids;

public class Weather {

    public static void handleWeatherGreeting(String recipient) {
        Rapids.postIntermediateEvent(new Message("Cloudy", recipient));
    }
}
