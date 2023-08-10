package eu.mistcloud.template.java;

import org.json.JSONObject;

import eu.mistcloud.tools.java.Mist;
import eu.mistcloud.template.java.businesslogic.English;
import eu.mistcloud.template.java.businesslogic.Interrim;
import eu.mistcloud.template.java.businesslogic.Spanish;

public class App {

    static void handleEnglishAction(byte[] payloadBytes, JSONObject envelope) {

        // Optionally, we can use the envelope to access event metadata
        String messageId = envelope.getString("messageId");
        String traceId = envelope.getString("traceId");

        // We can access the event body by converting it to a string
        English.handleEnglishGreeting(new String(payloadBytes));

    }

    static void handleSpanishAction(byte[] payloadBytes, JSONObject envelope) {
        Spanish.handleSpanishGreeting(new String(payloadBytes));
    }

    static void handleIntermediateAction(byte[] payloadBytes, JSONObject envelope) {
        JSONObject payload = new JSONObject(new String(payloadBytes));

        String greeting = payload.getString("greeting");
        String recipient = payload.getString("recipient");

        Interrim.handleIntermediate(greeting, recipient);
    }

    public static void main(String[] args) {
        Mist.service(args)
                .handle("englishAction", App::handleEnglishAction)
                .handle("spanishAction", App::handleSpanishAction)
                .handle("intermediateAction", App::handleIntermediateAction)
                .init(() -> System.out.println("Init!"));
    }
}
