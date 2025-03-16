public class Set_ith_Bit {
    public static void main(String[] args) {
     int n = 0b11001111;
     System.out.println(set(n,3));
    }

    public static int set (int num, int i) {
        return (num | (1 << (i-1))) != 0 ? 1 : 0;
    }
}
