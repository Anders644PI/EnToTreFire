package eu.mistcloud.template.java;

import org.json.JSONObject;

import eu.mistcloud.tools.java.Mist;
import eu.mistcloud.template.java.businesslogic.Weather;

public class App {

    static void handleWeatherAction(byte[] payloadBytes, JSONObject envelope) {

        // Optionally, we can use the envelope to access event metadata
        String messageId = envelope.getString("messageId");
        String traceId = envelope.getString("traceId");

        // We can access the event body by converting it to a string
        Weather.handleWeatherGreeting(new String(payloadBytes));

    }

    public static void main(String[] args) {
        Mist.service(args)
                .handle("weatherAction", App::handleWeatherAction)
                .init(() -> System.out.println("Init!"));
    }
}
