package com.soap.soap.Service;

import com.soap.client.generated.GetScoreRequest;
import com.soap.client.generated.GetScoreResponse;
import com.soap.client.generated.Score;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Service
public class SoapClient extends WebServiceGatewaySupport {

    public GetScoreResponse getScore(GetScoreRequest requestBody){
        GetScoreRequest request = new GetScoreRequest();
        request.setUser(requestBody.getUser());
        logger.info(request.getUser());
        GetScoreResponse response = (GetScoreResponse) getWebServiceTemplate().marshalSendAndReceive("http://localhost:5000/ws", request);
        return response;
    }
}
