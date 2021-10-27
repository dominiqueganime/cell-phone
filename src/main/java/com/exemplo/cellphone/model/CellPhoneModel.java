package com.exemplo.cellphone.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellPhone", propOrder = {
        "User",
        "Id",
        "Model"
})
public class CellPhoneModel {

    @XmlElement(required = true)
    protected String user;
    protected int id;
    protected String model;
}
