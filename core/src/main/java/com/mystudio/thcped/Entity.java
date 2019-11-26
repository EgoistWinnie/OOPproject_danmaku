package com.mystudio.thcped;

import org.mini2Dx.core.engine.geom.CollisionCircle;
import org.mini2Dx.core.graphics.Sprite;

public class Entity{
    public Sprite sprite;
    public CollisionCircle collisionCircle;

    public double x;
    public double y;
    public int hp;
    public boolean isDead;

    public Entity(double x,double y,int hp,boolean isDead)
    {
        this.x = x;
        this.y = y;
        this.hp = hp;
        this.isDead = false;
    }

    public double getX() {return this.x;}
    public double getY() {return this.y;}

    /*public void moveUp()
    {
        this.y += 2;
    }

    public void moveDown()
    {
        this.y -= 2;
    }

    public void moveLeft()
    {
        this.x -= 2;
    }

    public void moveRight()
    {
        this.x += 2;
    }*/

}