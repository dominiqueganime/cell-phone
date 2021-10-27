package com.exemplo.cellphone.controller;

import com.exemplo.cellphone.model.IdRequest;
import com.exemplo.cellphone.model.IdResponse;
import com.exemplo.cellphone.service.CellPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CellPhoneController {

    @Autowired
    private CellPhoneService userService;

    @PayloadRoot(namespace = "http://bootcamp.com/",
            localPart = "CellPhoneRequest")
    @ResponsePayload
    public CellPhoneResponse CellPhoneRequest(@RequestPayload GetUserRequest request) {
        CellPhoneResponse response = new CellPhoneResponse();
        response.setCellPhone(cellphoneService.getCellPhone(request.getId()));
        return response;
    }
}
