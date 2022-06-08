package model;

import javafx.scene.canvas.GraphicsContext;

public interface IImage {

    /**
     * Интерфейс для  отображения изображения image в  GraphicsContext gr
     * @param gr
     *
     */
    void draw (GraphicsContext gr);
}
