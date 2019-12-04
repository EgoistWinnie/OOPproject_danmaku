package com.mystudio.thcped;

import java.util.*;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
//import org.mini2Dx.core.engine.geom.CollisionBox;
import org.mini2Dx.core.engine.geom.CollisionCircle;
import org.mini2Dx.core.graphics.Graphics;
import org.mini2Dx.core.graphics.Sprite;

//public class Player extends Entity {
public class Player{

    public CollisionCircle playerCC;
    public Sprite playerSprite;
    private PlayerMove playerMove;
    private int hp;
    private boolean isDead;
    private CollisionHandler collisionHandler;

    //public Set<Bullet> pBullet = new HashSet<>();
    //public Iterator<Bullet> itb = pBullet.iterator();
    

    public Set<Bullet> pBullet;

    public Player(float x,float y,int hp)
    {

        
        //super(x,y,hp);   
        setSprite();
        this.playerCC = new CollisionCircle(x, y, 50);
        this.playerMove = new PlayerMove(this, 4f);
        pBullet = new HashSet<>();

        this.hp = hp;
        this.isDead = false;
        
    }

    public void setSprite()
    {
        this.playerSprite = new Sprite(new Texture(Gdx.files.internal("player1.png")));
    }
    
    public void createBullet(float x,float y)
    {
        pBullet.add(new PlayerBullet(x, y, 2f));
    }

    public void update(float delta){
        playerCC.preUpdate();
        this.playerMove.update(delta);
        Iterator<Bullet> itb = pBullet.iterator();
        while(itb.hasNext()){
            Bullet nb = itb.next();
            nb.bulletCB.preUpdate();
            nb.bulletCB.set(nb.bulletCB.getX(), nb.bulletCB.getY() - (nb.getSpeed() * delta * 100));

            /**If the bullet hit the boss, decrease its hps */
            CPEdanmaku.ch.BulletHitBoss(nb.bulletCB);
        }
    }

    public void interpolate(float alpha){
        this.playerCC.interpolate(null, alpha);
        Iterator<Bullet> itb = pBullet.iterator();
        while(itb.hasNext()){
            itb.next().bulletCB.interpolate(null,alpha);
        }
    }

    public void render(Graphics g) {
        g.drawSprite(this.getSprite(), this.playerCC.getRenderX(), this.playerCC.getRenderY());
        Iterator<Bullet> itb = pBullet.iterator();
        while(itb.hasNext()){
            //itb.next().bulletCB.render(g);
            Bullet nb = itb.next();
            g.drawSprite(nb.getSprite(), nb.bulletCB.getRenderX(), nb.bulletCB.getRenderY());
        }
    }

    public float getX(){
        return this.playerCC.getRenderX();
    }

    public float getY(){
        return this.playerCC.getRenderY();
    }

    public Sprite getSprite(){
        return this.playerSprite;
    }

    public PlayerMove playerMove()
    {
        return this.playerMove;
    }

    public int getHP(){return this.hp;}
    public void setHP(int hp){this.hp = hp;}


}