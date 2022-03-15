public class konversi {
    public static void main(String[] args) {
        //konversi otomatis
        byte testByte = 100;
        short testShort = testByte;
        int testInt = testShort;
        long testLong = testInt;

        //konversi manual
        int testDuaInt = 1000;
        byte testDuaByte = (byte) testDuaInt; //harus pakai (byte) karena dipaksa dan max 127
        short testDuaShort = (short) testDuaInt; //harus pakai (byte) karena dipaksa dan max 127

        System.out.println(testDuaByte);
        System.out.println(testDuaShort);

    }
}
