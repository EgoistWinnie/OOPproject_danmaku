package com.mystudio.thcped;

import java.util.*;

import com.badlogic.gdx.Gdx;
import org.mini2Dx.core.engine.geom.CollisionBox;
import org.mini2Dx.core.graphics.Graphics;
import org.mini2Dx.core.graphics.Sprite;
import com.badlogic.gdx.graphics.Texture;


public class EnemyBullet extends Bullet{
    
    Sprite z = new Sprite(new Texture(Gdx.files.internal("F1.png")));

    public EnemyBullet(float x,float y,float speed){
        super(x,y,speed);
        super.setBulletsprite(z);
    }


}