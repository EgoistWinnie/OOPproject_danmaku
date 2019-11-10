package com.mystudio.thcped;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Input.Keys;

public class KeyInput implements InputProcessor{

    public boolean keyDown = false;

    @Override
      public boolean keyDown (int keycode){
          
            this.keyDown = true;
            switch(keycode){
                  case Keys.UP :
                        
                        break;
                  case Keys.DOWN :
                        
                        break;
                  case Keys.LEFT :
                        
                        break;
                  case Keys.RIGHT :
                        
                        break;
                  case Keys.Z :

            }
            return false;
      }

      @Override
      public boolean keyUp (int keycode){
            this.keyDown = false;
            switch(keycode){
                  case Keys.UP :
                        
                        break;
                  case Keys.DOWN :
                        
                        break;
                  case Keys.LEFT :
                        
                        break;
                  case Keys.RIGHT :
                        
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