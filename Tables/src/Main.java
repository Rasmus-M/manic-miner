public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 256; i++) {
            int val = (((i & 0xc0) | ((i & 0x38 ) >> 3) | ((i & 0x07) << 3)) - 1) & 0xff;
            System.out.print(i % 16 == 0 ? "       byte " : "");
            System.out.print(hexByte(val));
            System.out.print(i % 16 == 15 ? "\n" : ",");
        }
    }

    private static String hexByte(int b) {
        String hex = Integer.toHexString(b);
        return ">" + (hex.length() < 2 ? "0" : "") + hex;
    }
}
