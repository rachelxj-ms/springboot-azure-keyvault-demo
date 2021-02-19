package com.contoso.keyvault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class TestController {
    @RequestMapping(method= RequestMethod.GET, path = "get")
    public String get() {
        return connectionString;
    }
    @Value("${connectionString}")
    private String connectionString = "defaultValue\n";

    public void run(String... varl) throws Exception {
        System.out.println(String.format("\nConnection String stored in Azure Key Vault:\n%s\n",connectionString));
    }
}
