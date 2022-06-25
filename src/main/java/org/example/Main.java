package org.example;

public class Main {

    public static void main(String[] args) {

        BodyMassIndexService bodyMassIndexService = new BodyMassIndexService();

        float bodyMassIndex = bodyMassIndexService.calculate(76, 177);

        System.out.printf("Индекс массы тела: %.2f\n", bodyMassIndex);
    }
}