package eu.mistcloud.template.java;

import org.json.JSONObject;

import eu.mistcloud.tools.java.Mist;
import eu.mistcloud.template.java.businesslogic.Danish;
import eu.mistcloud.template.java.businesslogic.Weather;

public class App {

    static void handleDanishAction(byte[] payloadBytes, JSONObject envelope) {
        Danish.handleDanishGreeting(new String(payloadBytes));
    }

    static void handleWeatherAction(byte[] payloadBytes, JSONObject envelope) {
        // We can access the event body by converting it to a string
        Weather.handleWeatherGreeting(new String(payloadBytes));
    }

    public static void main(String[] args) {
        Mist.service(args)
                .handle("weatherAction", App::handleWeatherAction)
                .handle("danishAction", App::handleDanishAction)
                .handle("weatherAction", App::handleWeatherAction)
                .init(() -> System.out.println("Init!"));
    }
}
