package org.example;

public class BodyMassIndexService {

    public BodyMassIndexService(){
    }

    public float calculate(float weight, float height){

        return weight / ((height * height) / 10000);
    }
}

