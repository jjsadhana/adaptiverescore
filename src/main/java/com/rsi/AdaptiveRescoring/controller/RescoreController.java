package com.rsi.AdaptiveRescoring.controller;

import learnositysdk.request.Init;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author jayachandranj on 2020-02-06
 */
@RestController
@RequestMapping("/rescore")
public class RescoreController {

    private String baseUrl;
    private String consumerKey;
    private String consumerSecret;
    @RequestMapping(value = "/sessionId", method= RequestMethod.POST)
    public Object rescoreAdaptivePerSession(
            @Valid @RequestBody String sessionId
            ) throws Exception {
         String consumerKey = "yis0TYCu7U9V4o7M";
         String consumerSecret = "74c5fd430cf1242a527f6223aebd42d30464be22";
         //String expectedSignature = "c9ae25df8be352182dc9223f7d7705a42d37745e167215724ea377133dd4032d";
         JSONObject securityObj;
         JSONObject request;
        JSONObject signedRequest;
        securityObj = new JSONObject();
        securityObj.put("consumer_key", consumerKey);
        securityObj.put("user_id", "$ANONYMIZED_USER_ID");
        securityObj.put("timestamp", "20140612-0438");

        Init.disableTelemetry();

        request = new JSONObject ();
        Init init = new Init("questions", securityObj, consumerSecret);

        String generate = init.generate();
        String generatedSign = init.generateSignature();
        return generatedSign;
    }


}
