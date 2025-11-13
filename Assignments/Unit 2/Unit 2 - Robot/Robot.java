public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right


    public int[] getHallway() {
        return hallway;
    }

    public void setHallway(int[] hallway) {
        this.hallway = hallway;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    public Robot(int[] hallwayToClean, int startingPosition) {
        isFacingRight = true;
        this.hallway = hallwayToClean;
        this.position = startingPosition;
    }

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        if (isFacingRight) {
            return ((position == (hallway.length - 1)) || (hallway[hallway.length - 1] == 0));
        } else if (!isFacingRight) {
            return ((position == 0) || (hallway[0] == 0));
        } else {
            return false;
        }
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        if (hallway[position] > 0) {
            hallway[position] -= 1;
        } else if (hallway[position] == 0) {
            if (isFacingRight) {
                if (position < hallway.length - 1) {
                    position += 1;
                }
            } else {
                if (position > 0) {
                    position -= 1;
                }
            }
        }
        if (isRobotBlockedByWall()) {
            if (isFacingRight) {
                setFacingRight(false);
            } else {
                setFacingRight(true);
            }
        }
    }


    /**
     * This method displays the current state of the robot and the hallway. It then calls the move()
     * method and counts the number of moves it takes to clear the hallway. The method should
     * display the current state of the robot after each move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = -1;
        displayState();
        while (!hallIsClear()) {
            move();
            count += 1;
        }

        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        int h = 0;
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] == 0) {
                h += 0;
            } else {
                h += 1;
            }
        }
        if (h > 0) {
            return false;
        } else {
            return true;
        }
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        for (int i = 0; i < hallway.length; i++) {
            System.out.print(hallway[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < position; i++) {
            System.out.print("  ");
        }   
    }
}
