package com.example;

import java.util.logging.Logger;

public class Demo {

    private static final Logger LOGGER = Logger.getLogger(Demo.class.getName());

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.originalBlock();
        demo.duplicateBlock();
        demo.uniqueRatioBalancer();
    }

    public void originalBlock() {
        int valOne = 100;
        int valTwo = 200;
        int sumResult = valOne + valTwo;
        int diffResult = valTwo - valOne;
        int prodResult = valOne * valTwo;
        int divResult = valTwo / valOne;
        int modResult = valTwo % valOne;
        LOGGER.info(() -> "Calc Sum: " + sumResult);
        LOGGER.info(() -> "Calc Diff: " + diffResult);
        LOGGER.info(() -> "Calc Prod: " + prodResult);
        LOGGER.info(() -> "Calc Div: " + divResult);
        LOGGER.info(() -> "Calc Mod: " + modResult);
    }

    public void duplicateBlock() {
        int valOne = 100;
        int valTwo = 200;
        int sumResult = valOne + valTwo;
        int diffResult = valTwo - valOne;
        int prodResult = valOne * valTwo;
        int divResult = valTwo / valOne;
        int modResult = valTwo % valOne;
        LOGGER.info(() -> "Calc Sum: " + sumResult);
        LOGGER.info(() -> "Calc Diff: " + diffResult);
        LOGGER.info(() -> "Calc Prod: " + prodResult);
        LOGGER.info(() -> "Calc Div: " + divResult);
        LOGGER.info(() -> "Calc Mod: " + modResult);
    }

    public void uniqueRatioBalancer() {
        LOGGER.info("System Log Sequence Line Number 01");
        LOGGER.info("System Log Sequence Line Number 02");
        LOGGER.info("System Log Sequence Line Number 03");
        LOGGER.info("System Log Sequence Line Number 04");
        LOGGER.info("System Log Sequence Line Number 05");
        LOGGER.info("System Log Sequence Line Number 06");
        LOGGER.info("System Log Sequence Line Number 07");
        LOGGER.info("System Log Sequence Line Number 08");
        LOGGER.info("System Log Sequence Line Number 09");
        LOGGER.info("System Log Sequence Line Number 10");
        LOGGER.info("System Log Sequence Line Number 11");
        LOGGER.info("System Log Sequence Line Number 12");
        LOGGER.info("System Log Sequence Line Number 13");
        LOGGER.info("System Log Sequence Line Number 14");
        LOGGER.info("System Log Sequence Line Number 15");
        LOGGER.info("System Log Sequence Line Number 16");
        LOGGER.info("System Log Sequence Line Number 17");
        LOGGER.info("System Log Sequence Line Number 18");
        LOGGER.info("System Log Sequence Line Number 19");
        LOGGER.info("System Log Sequence Line Number 20");
    }
}
