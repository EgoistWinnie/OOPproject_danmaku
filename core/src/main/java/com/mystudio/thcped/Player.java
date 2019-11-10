package com.mystudio.thcped;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import org.mini2Dx.core.engine.geom.CollisionCircle;
import org.mini2Dx.core.graphics.Graphics;
import org.mini2Dx.core.graphics.Sprite;

public class Player extends Entity {

    public CollisionCircle playeCollisionCircle;
    public Sprite playerSprite;

    public Player(double x,double y,int hp)
    {
        super(x,y,hp);   
        setSprite();
    }


    public void setSprite()
    {
        this.playerSprite = new Sprite(new Texture(Gdx.files.internal("testplayer_red2.png")));
    }

    public void render(Graphics g) {
    g.drawSprite(playerSprite);
    }
    
    


}