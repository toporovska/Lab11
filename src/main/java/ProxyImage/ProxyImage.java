package ProxyImage;

public class ProxyImage implements MyImage {

    private final String file;
    private RealImage realimage;

    ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (realimage == null) {
            realimage = new RealImage(file);
        }
        realimage.display();
    }
}
