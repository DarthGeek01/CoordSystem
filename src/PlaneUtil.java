public class PlaneUtil {
    public static double getDistance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getY() - b.getY(), 2) + Math.pow(a.getX() - b.getX(), 2));
    }

    public static double getAngle(Point a, Point b) {
        double base = b.getX() - a.getX();
        double height = b.getY() - a.getY();

        if (base == 0)
            return 0;
        if (height == 0)
            return (base > 0) ? 90 : -90;

        double temp =  Math.toDegrees(Math.atan2(height, base));
        return (base < 0) ? temp - 180 : temp;
    }
}
