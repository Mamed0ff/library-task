package Entities;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ArrowKeyMenuSwing extends JFrame {
    private static final String[] menuItems = {"1", "2", "3","4","5.Exit"};
    private int selectedIndex = 0;

    private JTextArea textArea;

    public ArrowKeyMenuSwing() {
        setTitle("Arrow Key Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
        updateMenu();

        add(textArea);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Not used in this example
            }

            @Override
            public void keyPressed(KeyEvent e) {
                handleArrowKeys(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Not used in this example
            }
        });

        setFocusable(true);
    }

    private void handleArrowKeys(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_UP:
                moveUp();
                break;
            case KeyEvent.VK_DOWN:
                moveDown();
                break;
            case KeyEvent.VK_ENTER:
                performAction();
                break;
        }
        updateMenu();
    }

    private void moveUp() {
        selectedIndex = Math.max(0, selectedIndex - 1);
    }

    private void moveDown() {
        selectedIndex = Math.min(menuItems.length - 1, selectedIndex + 1);
    }

    public String performAction() {
        if (selectedIndex == menuItems.length - 1) {
            //System.out.println("Exiting program.");
            return "5";
            //System.exit(0);
        } else if(selectedIndex == 0){
            //System.out.println(1);
            return "1";
        }
        else if(selectedIndex == 1){
            //System.out.println(2);
            return "2";
        }
        else if(selectedIndex == 2){
            //System.out.println(3);
            return "3";
        }
        else{
            //ystem.out.println(4);
            return "4";
        }

    }

    private void updateMenu() {
        StringBuilder menuText = new StringBuilder();

        for (int i = 0; i < menuItems.length; i++) {
            if (i == selectedIndex) {
                menuText.append("-> ").append(menuItems[i]).append("\n");
            } else {
                menuText.append("   ").append(menuItems[i]).append("\n");
            }
        }

        textArea.setText(menuText.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ArrowKeyMenuSwing menu = new ArrowKeyMenuSwing();
            menu.setVisible(true);
        });
    }
}