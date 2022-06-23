package org.example;

public class Main {

    public static void main(String[] args) {

        BodyMassIndexService bodyMassIndexService = new BodyMassIndexService();

        bodyMassIndexService.setHeight(177);
        bodyMassIndexService.setWeight(76);
        bodyMassIndexService.calculate();
        bodyMassIndexService.printIndex();
    }
}