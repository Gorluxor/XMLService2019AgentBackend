package com.megatravel.dtos;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
        extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (DateConverter.parseDate(value));
    }

    public String marshal(Date value) {
        return (DateConverter.printDate(value));
    }

}
