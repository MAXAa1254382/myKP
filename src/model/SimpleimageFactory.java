package model;

public class SimpleimageFactory {

    /**
     * �������
     * ���������� type
     * @param type
     * @return type
     */
    public IImage createIImage ( int type) {
        if (type == 1) {
            return new OKImage();
        } else if (type == 2) {
            return new ErrorImage();
        } else {
            return null;

        }
    }}