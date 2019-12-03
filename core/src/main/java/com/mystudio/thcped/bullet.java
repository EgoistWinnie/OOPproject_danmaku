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
    private CollisionBox bulletCC;
    private Sprite bulletSprite;

    public Bullet(float x,float y,float speed,float a){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.accelerate = a;
        this.bulletCC = new CollisionBox(x,y,28,26);
    }

    public Bullet(float x,float y,float speed){
        this(x,y,speed,0f);
    }

    public void setBulletsprite(Sprite p)
    {
        this.bulletSprite = p;
    }

    /*public void update(float delta){
        bulletCC.preUpdate();
        
    }

    public void interpolate(float alpha){
        this.bulletCC.interpolate(null, alpha);
  }

    public void render(Graphics g) {
    g.drawSprite(this.getSprite(), this.bulletCC.getRenderX(), this.bulletCC.getRenderY());
    }*/

    public double getX() {return this.x;}
    public double gety() {return this.y;}
    public double getSpeed() {return this.speed;}
    public double getA() {return this.accelerate;}
    public double getMaxSpeed() {return this.maxspeed;}
    public CollisionBox getBulletCC() {return this.bulletCC;}
    public Sprite getSprite(){return this.bulletSprite;}
    
}