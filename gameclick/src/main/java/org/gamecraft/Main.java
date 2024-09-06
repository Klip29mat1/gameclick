package org.gamecraft;
import javax.swing.*;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.AWTException;
public class Main {
    public static void main(String[] args) throws AWTException, InterruptedException {
        JFrame hIZwxokEJY = new JFrame();
        hIZwxokEJY.setVisible(true);
        hIZwxokEJY.setTitle("autoclick,me fermer ou alt + f4 = stop");
        hIZwxokEJY.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hIZwxokEJY.setSize(400, 100);
        hIZwxokEJY.setResizable(false);
        Thread.sleep(50);
        Robot DAePx = new Robot();
        while (true) {
            DAePx.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            DAePx.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(50);
            System.out.print("cf");
        } } }
// cree par Klip29mat1
// mande by Klip29mat1
// tout droit autorisé sauf la vente
// you can all exepted the sell