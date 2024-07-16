package creational.abstract_factory;

public class AdamPortraitFactory implements PortraitFactory{
    @Override
    public Ears createEars() {
        System.out.println("Big ears created");
        return new EarsBig();
    }

    @Override
    public Eyes createEyes() {
        System.out.println("Blue eyes created");
        return new EyesBlue();
    }

    @Override
    public FaceShape createFaceShape() {
        System.out.println("Square face created");
        return new FaceShapeSquare();
    }

    @Override
    public Hair createHair() {
        System.out.println("Bald hair created");
        return new HairBald();
    }

    @Override
    public Mouth createMouth() {
        System.out.println("Fat mouth created");
        return new MouthFat();
    }

    @Override
    public Nose createNose() {
        System.out.println("Crooked nose created");
        return new NoseCrooked();
    }
}
