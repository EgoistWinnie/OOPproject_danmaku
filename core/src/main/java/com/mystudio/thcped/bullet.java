package com.mystudio.thcped;

public class Bullet{

    private float x;
    private float y;
    private float speed;
    private float accelerate;
    private float maxspeed;

    public Bullet(float x,float y,float speed,float a){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.accelerate = a;
    }

    public Bullet(float x,float y,float speed){
        this(x,y,speed,0f);
    }

    public double getX() {return this.x;}
    public double gety() {return this.y;}
    public double getSpeed() {return this.speed;}
    public double getA() {return this.accelerate;}
    public double getMaxSpeed() {return this.maxspeed;}



    
}