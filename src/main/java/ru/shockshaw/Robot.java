package ru.shockshaw;

public class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot() {
        this.x = 0;
        this.y = 0;
        this.direction = Direction.UP;
    }

    public void setDirection(Direction toSet) {direction = toSet;}
    public Direction getDirection() {return direction;}
    public void move() {
        switch (direction) {
            case UP:
                y += 1;
                break;
            case DOWN:
                y -= 1;
                break;
            case RIGHT:
                x += 1;
                break;
            case LEFT:
                x -= 1;
                break;
        }
    }
    public int getX() {return x;}
    public int getY() {return y;}
}
