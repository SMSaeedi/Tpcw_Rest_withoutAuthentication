package com.example.demo.service;


import com.example.demo.model.AdminUpdateInParams;
import com.example.demo.model.AdminUpdateOutParams;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

public interface AdminUpdate {

    void adminUpdate_Vx0( AdminUpdateInParams input);


    AdminUpdateOutParams adminUpdate_Vx0111(@WebParam(name = "input") AdminUpdateInParams input);

}