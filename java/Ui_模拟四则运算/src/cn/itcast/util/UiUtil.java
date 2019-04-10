
package cn.itcast.util;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 * 专门做界面效果的类
 * @author admin
 */
public class UiUtil {
    private UiUtil(){}
    
    //修改窗体的图标
    public static void setFrameImage(JFrame jf){
        //获取工具类对象
        Toolkit tk = Toolkit.getDefaultToolkit();
        //根据路径猎取图片
       Image i= tk.getImage("src\\cn\\itcast\\resource\\h.png");
      jf.setIconImage(i);
       
    }
    //设置窗体居中
    public static void setFrameCenter(JFrame jf){
        //获取工具对象
        Toolkit tk =Toolkit.getDefaultToolkit();
        //获取屏幕的宽和高
        Dimension d= tk.getScreenSize();
        double screenWidth=d.getWidth();
        double screenHeight=d.getHeight();
        
        //获取窗体的宽和高
        int frameWidth = jf.getWidth();
        int frameHeight= jf.getHeight();
        
        int width =(int)(screenWidth-frameWidth)/2;
         int height =(int)(screenHeight-frameHeight)/2;
        //设置窗体坐标
        jf.setLocation(width, height);
        
    }
}
