public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "tatang";
        stringArray[1] = "soebarjo";
        stringArray[2] = "asep";

        System.out.println(stringArray[0]);

        String[] nama = {
            "ngatno", "purnomo", "tisna", "mandra"
        };

        int[] arrayInt = new int[]{
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        Long[] arrayLongs = {
            10L, 20L, 30L
        };

        System.out.println(arrayLongs.length);

        String[][] members = {
            {"eko", "tatang"},
            {"remon", "maman"},
            {"joko", "ngatno"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[2][0]);
    }
}
