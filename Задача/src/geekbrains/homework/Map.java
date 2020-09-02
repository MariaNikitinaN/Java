package geekbrains.homework;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    public static final int MODE_HVH = 0;
    public static final int MODE_HVA = 1;
    Map() {
        setBackground(Color.pink);
    }

    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.printf("mode:%d, size:%d, length:%d\n", gameMode, fieldSizeX, winLength);
    }
}
