package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class ErrorImage implements IImage{

    /**
     * Отображает изображение image в  GraphicsContext gr
     * @param image
     *
     */
    @Override
    public void draw(GraphicsContext gr) {
        Image image = new Image(getClass().getResourceAsStream("/resources/ошибка.png"));
//        imagess.setFitHeight(500); //726
//        imagess.setFitWidth(300); //500
//        imagess.setImage(image);
        gr.drawImage( image,25,25,250,150 );



       // gr.strokeText( "Ошибка",100,166 );
    }



}
