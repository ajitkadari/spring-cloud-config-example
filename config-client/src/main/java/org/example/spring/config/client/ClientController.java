package org.example.spring.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Value("${red.message}")
    private String redMessage;

    @Value("${green.message}")
    private String greenMessage;

    @Value("${blue.message}")
    private String blueMessage;

    @RequestMapping(value="/red", method = RequestMethod.GET)
    @ResponseBody
    public String getRed() {
        return String.format("%s", redMessage);
    }

    @RequestMapping(value="/green", method = RequestMethod.GET)
    @ResponseBody
    public String getGreen() {
        return String.format("%s", greenMessage);
    }

    @RequestMapping(value="/blue", method = RequestMethod.GET)
    @ResponseBody
    public String getBlue() {
        return blueMessage;
    }
}
