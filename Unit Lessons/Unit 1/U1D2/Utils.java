public class Utils {
    public static int generateRandomInt(int low, int high) {
        return (int) (Math.random() * (high - low) + low);
    }
    
    public static double generateRandomDouble(double low, double high) {
        return (double) (Math.random() * (high - low) + low);
    }
}
