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
        LOGGER.info("System Log Sequence Line Number 21");
        LOGGER.info("System Log Sequence Line Number 22");
        LOGGER.info("System Log Sequence Line Number 23");
        LOGGER.info("System Log Sequence Line Number 24");
        LOGGER.info("System Log Sequence Line Number 25");
        LOGGER.info("System Log Sequence Line Number 26");
        LOGGER.info("System Log Sequence Line Number 27");
        LOGGER.info("System Log Sequence Line Number 28");
        LOGGER.info("System Log Sequence Line Number 29");
        LOGGER.info("System Log Sequence Line Number 30");
        LOGGER.info("System Log Sequence Line Number 31");
        LOGGER.info("System Log Sequence Line Number 32");
        LOGGER.info("System Log Sequence Line Number 33");
        LOGGER.info("System Log Sequence Line Number 34");
        LOGGER.info("System Log Sequence Line Number 35");
        LOGGER.info("System Log Sequence Line Number 36");
        LOGGER.info("System Log Sequence Line Number 37");
        LOGGER.info("System Log Sequence Line Number 38");
        LOGGER.info("System Log Sequence Line Number 39");
        LOGGER.info("System Log Sequence Line Number 40");
        LOGGER.info("System Log Sequence Line Number 41");
        LOGGER.info("System Log Sequence Line Number 42");
        LOGGER.info("System Log Sequence Line Number 43");
        LOGGER.info("System Log Sequence Line Number 44");
        LOGGER.info("System Log Sequence Line Number 45");
        LOGGER.info("System Log Sequence Line Number 46");
        LOGGER.info("System Log Sequence Line Number 47");
        LOGGER.info("System Log Sequence Line Number 48");
        LOGGER.info("System Log Sequence Line Number 49");
        LOGGER.info("System Log Sequence Line Number 50");
    }
}
