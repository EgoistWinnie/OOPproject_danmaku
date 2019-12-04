package com.mystudio.thcped;

public class EnemyMove{

    /**set how the boss will move automatically */
    private Boss boss;
    private float speed;

    private boolean up, down, left, right, shoot;

    public EnemyMove(Boss boss,float speed){
        this.boss = boss;
        this.speed = speed;
    }
    
    /*public void set(boolean isMove,char whatKey){
        boolean moving = isMove;
    }*/

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
        if(boss.BossCB.getX() >= 0)
        this.boss.BossCB.set(this.boss.BossCB.getX() - (this.speed * delta * 100), this.boss.BossCB.getY());
  }

  public void moveRight(float delta){
        this.boss.BossCB.set(this.boss.BossCB.getX() + (this.speed * delta * 100), this.boss.BossCB.getY());
  }

  public void moveUp(float delta){
      if(boss.BossCB.getY() >= 0)
        this.boss.BossCB.set(this.boss.BossCB.getX(), this.boss.BossCB.getY() - (this.speed * delta * 100));
  }

  public void moveDown(float delta){
        this.boss.BossCB.set(this.boss.BossCB.getX(), this.boss.BossCB.getY() + (this.speed * delta * 100));
  }

}