public class MovementManager {
    private Point currentLoc;
    private int currentRotation;

    public MovementManager(Point initPt) {
        currentLoc = initPt;
    }

    public MovementManager(double initX, double initY) {
        currentLoc = new Point(initX, initY);
    }

    public MovementManager() {
        this(0, 0);
    }

    public void setPosition(Point location) {
        this.currentLoc = location;
    }

    public boolean moveToPoint(Point toMove, boolean shouldFixRotate) {
        double degrees = PlaneUtil.getAngle(currentLoc, toMove);
        double dist = PlaneUtil.getDistance(currentLoc, toMove);

        rotate((int) Math.round(degrees));
        Placeholder.moveForward((int) Math.round(dist));

        if (shouldFixRotate)
            rotate((int) Math.round(-1 * degrees));

        currentLoc = toMove;

        return true;
    }

    public boolean moveToPoint(Point toMove) {
        return moveToPoint(toMove, true);
    }

    public Point getCurrentLoc() {
        return currentLoc;
    }

    private void rotate(int degrees) {
        System.out.println("numDeg: " + Integer.toString(degrees));
        this.currentRotation += degrees;
        Placeholder.rotate(degrees);
    }
}
