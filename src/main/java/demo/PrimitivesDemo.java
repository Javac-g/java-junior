package demo;

public class PrimitivesDemo {
    int iii;
    static int iiii;

    public static void main(String[] args) {
        //region целочисленные
        byte b = 0b10;
        short s = 0;
        int i = 10_000_000;
        long l = 9999999999999999L;
        //endregion

        //region дроби
        float f = 0.F;
        double d = -2e-7;
        //endregion

        //region символьный
        char c = '\uABCD';
        //endregion

        //region логический
        boolean bb = true; // false
        //endregion

        //region Инициализация локальных переменных!!!!111
        int ii = 0;
        System.out.println(ii);
        //endregion

        var variable = 0;
        var var1 = 'c';
    }
}
