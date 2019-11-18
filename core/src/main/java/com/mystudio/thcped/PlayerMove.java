package com.mystudio.thcped;

import org.mini2Dx.core.engine.geom.CollisionCircle;

public class PlayerMove{
    public CollisionCircle playerCC;
    public float playerSpeed;
    private boolean up, down, left, right, shoot;

    public PlayerMove(CollisionCircle playerCC,float playerSpeed)
    {
        this.playerCC = playerCC;
        this.playerSpeed = playerSpeed;
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
  }

  public void moveLeft(float delta){
        this.playerCC.set(this.playerCC.getX() - (this.playerSpeed * delta * 100), this.playerCC.getY());
  }

  public void moveRight(float delta){
        this.playerCC.set(this.playerCC.getX() + (this.playerSpeed * delta * 100), this.playerCC.getY());
  }

  public void moveUp(float delta){
        this.playerCC.set(this.playerCC.getX(), this.playerCC.getY() - (this.playerSpeed * delta * 100));
  }

  public void moveDown(float delta){
        this.playerCC.set(this.playerCC.getX(), this.playerCC.getY() + (this.playerSpeed * delta * 100));
  }

}