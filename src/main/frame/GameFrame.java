package frame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import util.Constant;
public class GameFrame extends Frame {
    //实例化gamebackground类
    private GameBackGround gameBackGround;


    //构造方法
    public GameFrame()
    {
        setVisible(true);//是否可见
        setSize(Constant.FARM_WIDTH,Constant.FARM_HEIGHT);//窗口大小
        setTitle(Constant.FARM_TITLE);//标题
        setLocation(Constant.FARM_X,Constant.FARM_Y);//初始位置
        setResizable(false);//大小不可改变
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0); //结束程序
            }
        });
        initGame();
        new run().start();
    }
    public void initGame()
    {
        gameBackGround =new GameBackGround();
    }
    class run extends  Thread
    {
        @Override
        public void run()
        {
            repaint();
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void update(Graphics g)
    {
        gameBackGround.draw(g);
    }

}
