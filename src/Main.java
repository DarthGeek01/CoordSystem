public class Main {
    private static MovementManager movementManager = new MovementManager();

    public static void main(String[] args) {
        int start = 2;
        Placeholder.setUp();

        switch (start) {
            case 1:
                doCenter();
                break;
            case 2:
                doLeft();
                break;
            case 3:
                doRight();
                break;
        }

        Placeholder.setDown();
    }

    private static void doCenter() {
        Placeholder.moveForward(24);
        System.out.println("in doCenter");
        System.out.println(movementManager.getCurrentLoc());
        movementManager.setPosition(FieldMap.START_CENTER);
        System.out.println(movementManager.getCurrentLoc());
        movementManager.moveToPoint(FieldMap.FIRST_CENTER);
        System.out.println(movementManager.getCurrentLoc());
        movementManager.moveToPoint(FieldMap.SECOND_CENTER);
    }

    private static void doLeft() {
        System.out.println("in doLeft");
        movementManager.setPosition(FieldMap.START_LEFT);
        movementManager.moveToPoint(FieldMap.FIRST_LEFT);
        movementManager.moveToPoint(FieldMap.SECOND_LEFT, false);
    }

    private static void doRight() {
        System.out.println("in doRight");
        movementManager.setPosition(FieldMap.START_RIGHT);
        movementManager.moveToPoint(FieldMap.FIRST_RIGHT);
        movementManager.moveToPoint(FieldMap.SECOND_RIGHT, false);
    }
}
