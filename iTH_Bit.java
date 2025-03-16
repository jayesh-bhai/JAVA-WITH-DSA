public class iTH_Bit {
    public static void main(String[] args) {
        int num = 0b1101011;  // Binary representation of 107 in decimal
        System.out.println(bit(num, 4)); 
    }

    public static int bit(int num, int i) {
        return (num & (1 << (i - 1))) != 0 ? 1 : 0;
    }
}
