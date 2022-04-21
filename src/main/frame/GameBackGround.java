package frame;

import util.Constant;
import util.GameUtil;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GameBackGround {
    private BufferedImage bkground;//背景需要的图片

    //构造器初始化
    public GameBackGround()
    {
        BufferedImage image= GameUtil.loadBufferedImage(Constant.BK_IMG_PATH);
    }
    public void draw(Graphics g)
    {
        //得到图片的高和宽
        int height = bkground.getHeight();
        int weight = bkground.getWidth();
        int count = Constant.FARM_WIDTH/weight+1;
        for(int i=0;i<count;i++)
        {
            g.drawImage(bkground,weight*i,Constant.FARM_HEIGHT-height,null);
        }
    }
}
