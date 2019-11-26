package com.mystudio.thcped;

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

    public Player(float x,float y,int hp)
    {
        //super(x,y,hp);   
        setSprite();
        this.playerCC = new CollisionCircle(x, y, 50);
        
        this.playerMove = new PlayerMove(playerCC, 3f);

        //might get these out later
        this.hp = hp;
        this.isDead = false;
    }

    public void setSprite()
    {
        this.playerSprite = new Sprite(new Texture(Gdx.files.internal("testplayer_red2.png")));
    }


    public void update(float delta){
        playerCC.preUpdate();
        this.playerMove.update(delta);

    }

    public void interpolate(float alpha){
        this.playerCC.interpolate(null, alpha);
  }

    public void render(Graphics g) {
    g.drawSprite(this.getSprite(), this.playerCC.getRenderX(), this.playerCC.getRenderY());
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

}