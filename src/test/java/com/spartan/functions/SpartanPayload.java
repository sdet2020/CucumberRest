package com.spartan.functions;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SpartanPayload {

    public Map<String, Object> spartanPayload() {
        Faker faker = new Faker();
        String name = faker.name().firstName();
        String gender = faker.demographic().sex();
        long phone = faker.number().numberBetween(1111111111l, 9999999999l);

        Map<String, Object> oneSpartan = new LinkedHashMap<>();
        oneSpartan.put("name", name);
        oneSpartan.put("gender", gender);
        oneSpartan.put("phone", phone);

        return oneSpartan;
    }
}
