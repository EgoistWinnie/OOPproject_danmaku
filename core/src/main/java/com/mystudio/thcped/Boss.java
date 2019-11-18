package com.mystudio.thcped;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import org.mini2Dx.core.engine.geom.CollisionBox;
import org.mini2Dx.core.graphics.Sprite;
import org.mini2Dx.core.graphics.Graphics;

//public class Boss extends Enemy{
    public class Boss{
    public CollisionBox BossCC;
    public Sprite BossSprite;
    private int hp;
    private boolean isDead;

    public Boss(float x,float y,int hp)
    {
        //super(x,y,hp);
        setSprite();
        this.BossCC = new CollisionBox(x, y, 200,200);
        
        //this.playerMove = new PlayerMove(playerCC, 3f);

        this.hp = hp;
        this.isDead = false;
    }

    public void setSprite()
    {
        this.BossSprite = new Sprite(new Texture(Gdx.files.internal("imyourjoy3.png")));
    }

    /*public void update(float delta){
        playerCC.preUpdate();
        this.playerMove.update(delta);

    }

    public void interpolate(float alpha){
        this.playerCC.interpolate(null, alpha);
  }*/

    public void render(Graphics g) {
    g.drawSprite(this.BossSprite, this.BossCC.getRenderX(), this.BossCC.getRenderY());
    }



}