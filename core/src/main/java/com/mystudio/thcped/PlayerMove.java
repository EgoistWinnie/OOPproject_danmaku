package com.mystudio.thcped;

import org.mini2Dx.core.engine.geom.CollisionCircle;

public class PlayerMove{
    public CollisionCircle playerCC;
    public float playerSpeed;
    public PlayerBullet pbullet;
    
    private boolean up, down, left, right, shoot;

    public PlayerMove(CollisionCircle playerCC,float playerSpeed,PlayerBullet bullet)
    {
        this.playerCC = playerCC;
        this.playerSpeed = playerSpeed;
        this.pbullet = bullet;
    }

    public void set(boolean isMove,char whatKey){
        boolean moving = isMove;
        switch(whatKey){
              case 'u' :
                    this.up = moving;
                    break;
              case 'd' :
                    this.down = moving;
                    break;
              case 'l' :
                    this.left = moving;
                    break;
              case 'r' :
                    this.right = moving;
                    break;
              case 'z' :
                    this.shoot = moving;
                    break;    
        }
  }

    public void update(float delta){
        if(up){
              this.moveUp(delta);
        }
        if(down){
              this.moveDown(delta);
        }
        if(left){
              this.moveLeft(delta);
        }
        if(right){
              this.moveRight(delta);
        }
        if(shoot){
              this.playerShoot(delta);
        }
  }

  public void moveLeft(float delta){
        if(playerCC.getX() >= 0)
        this.playerCC.set(this.playerCC.getX() - (this.playerSpeed * delta * 100), this.playerCC.getY());
  }

  public void moveRight(float delta){
        this.playerCC.set(this.playerCC.getX() + (this.playerSpeed * delta * 100), this.playerCC.getY());
  }

  public void moveUp(float delta){
      if(playerCC.getY() >= 0)
        this.playerCC.set(this.playerCC.getX(), this.playerCC.getY() - (this.playerSpeed * delta * 100));
  }

  public void moveDown(float delta){
        this.playerCC.set(this.playerCC.getX(), this.playerCC.getY() + (this.playerSpeed * delta * 100));
  }

  public void playerShoot(float delta){
        this.pbullet.createBullet(this.playerCC.getX(), this.playerCC.getY());
  }

}