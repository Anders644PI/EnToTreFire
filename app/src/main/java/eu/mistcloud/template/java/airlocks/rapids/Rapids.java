package eu.mistcloud.template.java.airlocks.rapids;

import eu.mistcloud.template.java.businesslogic.Message;
import eu.mistcloud.tools.java.MimeType;
import eu.mistcloud.tools.java.Mist;

public class Rapids {
    
    public static void postIntermediateEvent(Message body) {
        Mist.postToRapids(
                "intermediate",
                body.toJSONString(),
                MimeType.json);
    }

    public static void postReplyEvent(String body) {
        Mist.replyToOrigin(body, MimeType.txt);
    }
}
