package com.company;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Myframe {
    public static void main (String[]args) throws AWTException {
        //创建一个机器人
        Robot robot = new Robot();
        //创建发送的内容
        String str = "xxs";
        //将内容放入到系统剪切板对象，ctrl+c
        Clipboard s = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection text = new StringSelection(str);
        s.setContents(text,null);//将容器中内容放到剪切板
        for(int i = 0;i<1; i++ ) {
            //控制机器人去发送消息
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }


    }
}
