public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.processUserData();
        demo.processUserDataDuplicate();
        demo.extraLogicOne();
        demo.extraLogicTwo();
        demo.extraLogicThree();
    }

    public void processUserData() {
        int firstValue = 10;
        int secondValue = 20;
        int sum = firstValue + secondValue;
        int diff = secondValue - firstValue;
        int prod = firstValue * secondValue;
        int div = secondValue / firstValue;
        int mod = secondValue % firstValue;
        System.out.println("Sum: " + sum);
        System.out.println("Diff: " + diff);
        System.out.println("Prod: " + prod);
        System.out.println("Div: " + div);
        System.out.println("Mod: " + mod);
    }

    public void processUserDataDuplicate() {
        int firstValue = 10;
        int secondValue = 20;
        int sum = firstValue + secondValue;
        int diff = secondValue - firstValue;
        int prod = firstValue * secondValue;
        int div = secondValue / firstValue;
        int mod = secondValue % firstValue;
        System.out.println("Sum: " + sum);
        System.out.println("Diff: " + diff);
        System.out.println("Prod: " + prod);
        System.out.println("Div: " + div);
        System.out.println("Mod: " + mod);
    }

    public void extraLogicOne() {
        int alphaValue = 1; 
        int betaValue = 2; 
        int gammaValue = 3; 
        int deltaValue = 4; 
        int epsilonValue = 5;
        System.out.println("Logic 1: " + (alphaValue + betaValue + gammaValue + deltaValue + epsilonValue));
    }

    public void extraLogicTwo() {
        int kappaValue = 11; 
        int lambdaValue = 12; 
        int muValue = 13; 
        int nuValue = 14; 
        int xiValue = 15;
        System.out.println("Logic 2: " + (kappaValue + lambdaValue + muValue + nuValue + xiValue));
    }

    public void extraLogicThree() {
        int sigmaValue = 21; 
        int tauValue = 22; 
        int phiValue = 23; 
        int chiValue = 24; 
        int psiValue = 25;
        System.out.println("Logic 3: " + (sigmaValue + tauValue + phiValue + chiValue + psiValue));
    }
}

