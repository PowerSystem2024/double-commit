public class OperadoresAsignacion {
    public static void main(String[] args) {
        int varNum1 = 1, varNum2 = 4;
        int varNum3 = varNum1 + 6 - varNum2;
        System.out.println("varNum3 = " + varNum3);

        varNum1 += 1;
        System.out.println("varNum1 = " + varNum1);

        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);

        varNum1 *= 5;
        System.out.println("varNum2 = " + varNum1);

        varNum3 /= 4;
        System.out.println("varNum2 = " + varNum3);

        varNum1 %= 6;
        System.out.println("varNum3 " + varNum1);
    }

}
