package com.mystudio.thcped;

import java.util.*;

import com.badlogic.gdx.Gdx;
import org.mini2Dx.core.engine.geom.CollisionBox;
import org.mini2Dx.core.graphics.Graphics;
import org.mini2Dx.core.graphics.Sprite;
import com.badlogic.gdx.graphics.Texture;


public class PlayerBullet{

    public Set<Bullet> pBullet = new HashSet<>();
    
    public PlayerBullet(float x,float y,float speed){
        setPlayerbullet();
    }

    public void setPlayerbullet(){
        super.setBulletsprite(new Sprite(new Texture(Gdx.files.internal("bullettest.png"))));
    }

    public void createBullet(float x , float y)
    {
        //this.pBullet.add(new Bullet(this.playerCC.getRenderX(),this.playerCC.getRenderY(),5f));
        this.pBullet.add(new PlayerBullet(x,y,5f));
    }

    /*public void removeBullet(float x , float y)
    {
        itb.next();
        itb.remove();
    }*/
    


}