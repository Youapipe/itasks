package ru.shockshaw;

import javax.print.attribute.standard.DialogOwner;

public class Robot {
    private int x;
    private int y;
    Direction direction;

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
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
