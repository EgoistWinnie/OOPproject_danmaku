package com.mystudio.thcped;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Input.Keys;

import com.mystudio.thcped.Player;

public class KeyInput implements InputProcessor{

    public boolean keyDown = false;

    private Player player;
    public boolean isMove;

    public KeyInput(Player player)
    {
      this.player = player;
    }

    /* no need to use this function anymore
    public void playerAction(boolean isMove,char whatKey)
    {
      this.player.playerAction(isMove,whatKey);
    }*/

    @Override
      public boolean keyDown (int keycode){
          
            this.keyDown = true;
            switch(keycode){
                  case Keys.UP :
                        this.player.playerMove().set(this.keyDown,'u');
                        //playerAction(this.keyDown,'u');
                        break;
                  case Keys.DOWN :
                        this.player.playerMove().set(this.keyDown,'d');  
                        break;
                  case Keys.LEFT :
                        this.player.playerMove().set(this.keyDown,'l');      
                        break;
                  case Keys.RIGHT :
                        this.player.playerMove().set(this.keyDown,'r');      
                        break;
                  case Keys.Z :
                        this.player.playerMove().set(this.keyDown,'z');
                        break;

            }
            return false;
      }

      @Override
      public boolean keyUp (int keycode){
            this.keyDown = false;
            switch(keycode){
                  case Keys.UP :
                        this.player.playerMove().set(this.keyDown,'u');
                        break;
                  case Keys.DOWN :
                        this.player.playerMove().set(this.keyDown,'d');  
                        break;
                  case Keys.LEFT :
                        this.player.playerMove().set(this.keyDown,'l');      
                        break;
                  case Keys.RIGHT :
                        this.player.playerMove().set(this.keyDown,'r');      
                        break;
                  case Keys.Z :
                        this.player.playerMove().set(this.keyDown,'z');
                        break;
            }
            return false;
      }

      @Override
      public boolean keyTyped (char character){
            return false;
      }

      @Override
      public boolean mouseMoved (int x, int y){
            return false;
      }

      @Override
      public boolean touchDown (int x, int y, int pointer, int button){
            return false;
      }

      @Override
      public boolean touchUp (int x, int y, int pointer, int button){
            return false;
      }

      @Override
      public boolean touchDragged (int x, int y, int pointer){
            return false;
      }

      @Override
      public boolean scrolled (int amount){
            return false;
      }




}