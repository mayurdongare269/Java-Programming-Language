public class BinToDec {

    public static void BintoDecimal(int binNum) {
        int myNum = binNum;
        int pow = 0, decNum = 0;

        while (binNum > 0) {
            int lastDig = binNum % 10;
            decNum = decNum + (lastDig * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of : "+ myNum + " = " +decNum);
    }

    public static void DectoBin(int n) {
        int myNum = n;
        int pow = 0, binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum =binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println("binary of : "+ myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        // int binNum = 0;
        // BintoDecimal(101);
        DectoBin(10);
    }
}