package com.soap.soap.Controllers;

import com.soap.client.generated.GetScoreRequest;
import com.soap.client.generated.GetScoreResponse;
import com.soap.soap.Service.SoapClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ScoreController {

    @Autowired
    private SoapClient soapClient;

    @PostMapping("/score")
    public GetScoreResponse getScore(@RequestBody GetScoreRequest request){
        log.info("in getScore controller method=========");
        return soapClient.getScore(request);
    }
}
