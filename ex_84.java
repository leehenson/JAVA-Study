public class ex_84 {
    public static void main(String[] args) {
        System.out.println(java.lang.Math.ceil(10.0));      // 10.0
        System.out.println(java.lang.Math.ceil(10.1));      // 11.0
        System.out.println(java.lang.Math.ceil(10.000001)); // 11.0

        System.out.println(java.lang.Math.floor(10.0));     // 10.0
        System.out.println(java.lang.Math.floor(10.9));      // 10.0

        System.out.println(java.lang.Math.round(10.0));     // 10
        System.out.println(java.lang.Math.round(10.4));     // 10
        System.out.println(java.lang.Math.round(10.5));     // 11
    }
}
