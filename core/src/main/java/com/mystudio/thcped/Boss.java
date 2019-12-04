package com.mystudio.thcped;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import org.mini2Dx.core.engine.geom.CollisionBox;
import org.mini2Dx.core.graphics.Sprite;
import org.mini2Dx.core.graphics.Graphics;

//public class Boss extends Enemy{
    public class Boss{
    public CollisionBox BossCB;
    public Sprite BossSprite;
    private int hp;
    private boolean isDead;
    private EnemyMove enemyMove;

    public Boss(float x,float y,int hp)
    {
        //super(x,y,hp);
        setSprite();
        this.BossCB = new CollisionBox(x, y, 200,200);
        this.enemyMove = new EnemyMove(this,4f);
        //this.playerMove = new PlayerMove(playerCC, 3f);

        this.hp = hp;
        this.isDead = false;
    }

    public void setSprite()
    {
        this.BossSprite = new Sprite(new Texture(Gdx.files.internal("Boss1.png")));
    }

    public void update(float delta){
        BossCB.preUpdate();
        this.enemyMove.update(delta);
        
    }

    public void interpolate(float alpha){
        this.BossCB.interpolate(null, alpha);
  }

    public void render(Graphics g) {
    g.drawSprite(this.BossSprite, this.BossCB.getRenderX(), this.BossCB.getRenderY());
    }

    public boolean isDead()
    {
        if(hp==0)
        this.isDead = true;
        else this.isDead = false;
        return this.isDead;
    }

    public int getHP(){return this.hp;}
    public void setHP(int hp){this.hp = hp;}
    public CollisionBox getbossCB(){return this.BossCB;}

}