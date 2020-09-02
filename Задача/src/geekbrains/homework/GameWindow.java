package geekbrains.homework;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private static final int WIN_WIDTH =507;
    private static final int WIN_HEIGHT =507;
    private static final int WIN_POSX = 600;
    private static final int WIN_POSY = 300;

    Map map;
    SettingsWindow settings;
    GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(WIN_POSX, WIN_POSY);
        setTitle("TicTacToe");
        setResizable(false);
        JButton btnStart = new JButton("Start new game");
        JButton btnExit = new JButton("Exit");
        JPanel panelButton = new JPanel(new GridLayout(1, 2));
        panelButton.add(btnExit);
        panelButton.add(btnStart);
        add(panelButton, BorderLayout.SOUTH);
        map= new Map();
        add (map, BorderLayout.CENTER);
settings = new SettingsWindow(this);
        setVisible(true);
    }
}
