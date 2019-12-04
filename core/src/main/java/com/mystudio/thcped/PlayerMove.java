package com.mystudio.thcped;

public class PlayerMove{
    private Player player;
    private float playerSpeed;
    //private PlayerBullet pBullet;
    
    private boolean up, down, left, right, shoot;

      /**set how player moving with keys */

    public PlayerMove(Player player,float playerSpeed)
    {
        this.player = player;
        this.playerSpeed = playerSpeed;
        //this.pBullet = bullet;
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
            this.player.pBullet.add(new PlayerBullet(this.player.playerCC.getX(), this.player.playerCC.getY(), 7f));
            
        }
  }

  public void moveLeft(float delta){
        if(player.playerCC.getX() >= 0)
        this.player.playerCC.set(this.player.playerCC.getX() - (this.playerSpeed * delta * 100), this.player.playerCC.getY());
  }

  public void moveRight(float delta){
        this.player.playerCC.set(this.player.playerCC.getX() + (this.playerSpeed * delta * 100), this.player.playerCC.getY());
  }

  public void moveUp(float delta){
      if(player.playerCC.getY() >= 0)
        this.player.playerCC.set(this.player.playerCC.getX(), this.player.playerCC.getY() - (this.playerSpeed * delta * 100));
  }

  public void moveDown(float delta){
        this.player.playerCC.set(this.player.playerCC.getX(), this.player.playerCC.getY() + (this.playerSpeed * delta * 100));
  }

  /*public void playerShoot(float delta){
        player.createBullet(this.player.playerCC.getX(), this.player.playerCC.getY());
  }*/

}