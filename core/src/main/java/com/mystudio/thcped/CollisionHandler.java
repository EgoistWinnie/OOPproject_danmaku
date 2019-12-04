package com.mystudio.thcped;

import java.util.*;

import com.mystudio.thcped.Bullet;
import com.badlogic.gdx.Gdx;
import org.mini2Dx.core.engine.geom.CollisionCircle;
import org.mini2Dx.core.engine.geom.CollisionBox;

public class CollisionHandler{

    private CollisionCircle playerCC;
    private CollisionBox BossCB;

    private Player player;
    private Boss boss;

    public CollisionHandler(Player player,Boss boss){
        this.player = player;
        this.boss = boss;
    }

    public void BulletHitPlayer(CollisionBox bulletCB)
    {
        if(player.playerCC.intersects(bulletCB)){
            player.setHP(boss.getHP()-1);
        }
    }

    public void BulletHitBoss(CollisionBox bulletCB)
    {
        if(boss.BossCB.intersects(bulletCB)){
            boss.setHP(boss.getHP()-1);
        }
    }

    


}