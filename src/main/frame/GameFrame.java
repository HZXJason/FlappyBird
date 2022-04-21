package frame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import util.Constant;
public class GameFrame extends Frame {
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
    }

}
