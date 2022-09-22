public class overloadmetho {
    static double tambah(double var1, double var2) {
        return var1 + var2;
    }
    static int tambah(int var1, int var2) {
        return var1 + var2;
    }
    public static void main(String[] args){
        int x = 5;
        double y = 5.6;
        System.out.println("1. " + tambah(x,y));
        System.out.println("2. " + tambah(y,x));
        System.out.println("3. " + tambah(x,x));
        System.out.println("4. " + tambah(y,y));
    }
}
