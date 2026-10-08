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
        int a = 1; int b = 2; int c = 3; int d = 4; int e = 5;
        int f = 6; int g = 7; int h = 8; int i = 9; int j = 10;
        System.out.println("Logic 1: " + (a + b + c + d + e + f + g + h + i + j));
    }

    public void extraLogicTwo() {
        int k = 11; int l = 12; int m = 13; int n = 14; int o = 15;
        int p = 16; int q = 17; int r = 18; int s = 19; int t = 20;
        System.out.println("Logic 2: " + (k + l + m + n + o + p + q + r + s + t));
    }

    public void extraLogicThree() {
        int u = 21; int v = 22; int w = 23; int x = 24; int y = 25;
        int z = 26; int a1 = 27; int b1 = 28; int c1 = 29; int d1 = 30;
        System.out.println("Logic 3: " + (u + v + w + x + y + z + a1 + b1 + c1 + d1));
    }
}
