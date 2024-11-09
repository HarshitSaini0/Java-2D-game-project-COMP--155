package object;

import main.GamePannel;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SuperObject {
    public BufferedImage image;
    public String name;
    public boolean collision = false;
    public int worldX;
    public int worldY;

    public Rectangle solidArea = new Rectangle(0,0,48,48);
    public int solidAreaDefaultX = 0;
    public int solidAreaDefaultY = 0;

    public void draw(Graphics2D g2, GamePannel gamePannel){
        int screenX = worldX - gamePannel.player.worldX + gamePannel.player.screenX;
        int screenY = worldY - gamePannel.player.worldY + gamePannel.player.screenY;




        if(
                worldX + gamePannel.tileSize > gamePannel.player.worldX - gamePannel.player.screenX &&
                        worldX - gamePannel.tileSize < gamePannel.player.worldX + gamePannel.player.screenX &&
                        worldY + gamePannel.tileSize > gamePannel.player.worldY - gamePannel.player.screenY &&
                        worldY - gamePannel.tileSize < gamePannel.player.worldY + gamePannel.player.screenY
        ){
            g2.drawImage(image,screenX,screenY,gamePannel.tileSize,gamePannel.tileSize,null);
        }
    }
}
