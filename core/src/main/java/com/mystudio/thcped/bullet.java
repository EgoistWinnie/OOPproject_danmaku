package com.mystudio.thcped;

import com.badlogic.gdx.Gdx;
import org.mini2Dx.core.engine.geom.CollisionBox;
import org.mini2Dx.core.graphics.Graphics;
import org.mini2Dx.core.graphics.Sprite;

public class Bullet{

    private float x;
    private float y;
    private float speed;
    private float accelerate;
    private float maxspeed;
    public CollisionBox bulletCB;
    private Sprite bulletSprite;

    /*public Bullet(float x,float y,float speed,float a){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.accelerate = a;
        this.bulletCC = new CollisionBox(x,y,28,26);
    }

    public Bullet(float x,float y,float speed){
        this(x,y,speed,0f);
    }*/

    public Bullet(float x,float y,float speed){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.bulletCB = new CollisionBox(x,y,28,26);
    }

    public void setBulletsprite(Sprite p)
    {
        this.bulletSprite = p;
    }

    /*public void update(float delta){
        bulletCB.preUpdate();
    }

    public void interpolate(float alpha){
        this.bulletCB.interpolate(null, alpha);
  }

    public void render(Graphics g) {
    g.drawSprite(this.getSprite(), this.bulletCB.getRenderX(), this.bulletCB.getRenderY());
    }*/

    public float getX() {return this.x;}
    public float gety() {return this.y;}
    public float getSpeed() {return this.speed;}
    public float getA() {return this.accelerate;}
    public float getMaxSpeed() {return this.maxspeed;}
    public CollisionBox getBulletCB() {return this.bulletCB;}
    public Sprite getSprite(){return this.bulletSprite;}
    
}