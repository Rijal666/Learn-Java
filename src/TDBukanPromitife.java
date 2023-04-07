public class TDBukanPromitife {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000L;
        Byte iniByte = null;
        System.out.println(iniByte);
        iniByte = 100;
        System.out.println(iniByte);

        // konvesri tipe data primitife ke bukan primitife, sebaliknya
        int iniInt = 100;
        Integer iniInteger2 = iniInt;

        short iniShort = iniInteger2.shortValue();
        long iniLong2 = iniInteger2.longValue();
        float iniFloat = iniInteger2.floatValue();
        
    }
}
