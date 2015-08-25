package org.paradrops.scene;

import javafx.scene.Parent;
import javafx.scene.Scene;

public class MainScene extends Scene {
    public MainScene(Parent root) {
        this(root, 300, 275);
    }

    public MainScene(Parent root, double width, double height) {
        super(root, width, height);
    }
}
