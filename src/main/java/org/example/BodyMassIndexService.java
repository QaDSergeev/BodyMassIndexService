package org.example;

public class BodyMassIndexService {

    private float index;
    private float weight;
    private float height;

    public BodyMassIndexService(){

    }

    public void setWeight(float weight){

        this.weight = weight;
    }

    public void setHeight(float height){

        this.height = height;
    }

    public void calculate(){

        index = weight / ((height * height) / 10000);
    }

    public void printIndex(){

        System.out.printf("Индекс массы тела: %.2f\n", index);
    }
}

