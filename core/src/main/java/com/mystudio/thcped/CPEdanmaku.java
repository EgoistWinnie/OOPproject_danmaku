package com.mystudio.thcped;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import org.mini2Dx.core.game.BasicGame;
import org.mini2Dx.core.graphics.Graphics;

public class CPEdanmaku extends BasicGame {
	public static final String GAME_IDENTIFIER = "com.mystudio.thcped";

  private Texture texture;
  private int screenWidth, screenHeight;
  Player player;
  KeyInput keyinput;
	
	@Override
    public void initialise() {
      texture = new Texture("mini2Dx.png");
      player = new Player(40,40,2);
    }
    
    @Override
    public void update(float delta) {
      
    }
    
    @Override
    public void interpolate(float alpha) {
    
    }
    
    @Override
    public void render(Graphics g) {
    g.drawTexture(texture, 0f, 0f);
    player.render(g);
    }
}
