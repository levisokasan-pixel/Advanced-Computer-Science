public class RobotTester {
    public static void main(String[] args) {
        int[] hall = {1, 1, 2, 2};
        int[] hall1 = {1, 2, 2, 2};
        Robot robby = new Robot(hall, 1);
        robby.setPosition(0);
        robby.setHallway(hall1);
        robby.setFacingRight(false);
        System.out.println("Getting the position: " + robby.getPosition());
        System.out.println("Getting the hallway: " + robby.getHallway());
        System.out.println("Getting the facingRight: " + robby.isFacingRight());
        System.out.println("Is robot blocked by a wall (should be true): " + robby.isRobotBlockedByWall());


        int moveCount = robby.clearHall();
        System.out.println("\nThe total number of moves to clear this hall: " + moveCount);
        System.out.println("Did the robot complete the hall with exactly 9 moves? " 
            + (moveCount == 9 ? "Yes." : "No."));
    }
}