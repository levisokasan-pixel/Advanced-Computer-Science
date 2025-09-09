public class SquidTester {
    public static void main(String[] args) {
        Squid larry = new Squid(); 

        System.out.println(larry.getTentacleCount());
        System.out.println(larry.toString());

        String s1 = "hello";
        String s2 = "h";
        String s3 = s2 + "ello";
        System.out.println(s1.equals(s3));

        // == compares the "id", or the "reference address"
        // == does not compare content; use equals() to compare content

        System.out.println(Math.sqrt(9));
        System.out.println(Math.min(5, 9));
        System.out.println(Math.max(5, 9));
        System.out.println(Math.abs(-9.3));

        // Math.sin, Math.cos, Math.tan, Math.pi
        Math.toRadians(180); // degrees to radians
    }

}
