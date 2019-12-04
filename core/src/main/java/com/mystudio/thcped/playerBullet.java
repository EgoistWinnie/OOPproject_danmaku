package com.mystudio.thcped;

import java.util.*;

import com.badlogic.gdx.Gdx;
import org.mini2Dx.core.engine.geom.CollisionBox;
import org.mini2Dx.core.graphics.Graphics;
import org.mini2Dx.core.graphics.Sprite;
import com.badlogic.gdx.graphics.Texture;


public class PlayerBullet extends Bullet{
    
    Sprite z = new Sprite(new Texture(Gdx.files.internal("Shuriken2.png")));

    public PlayerBullet(float x,float y,float speed){
        super(x,y,speed);
        super.setBulletsprite(z);
    }

    /*public void createBullet(float x , float y)
    {
        Bullet newb = new Bullet(x,y,5f);
        newb.setBulletsprite(new Sprite(new Texture(Gdx.files.internal("bullettest.png"))));
        this.pBullet.add(newb);
    }*/

    /*public void removeBullet(float x , float y)
    {
        
    }*/
    
}















