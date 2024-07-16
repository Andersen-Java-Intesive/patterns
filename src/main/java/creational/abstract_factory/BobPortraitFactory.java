package creational.abstract_factory;

public class BobPortraitFactory implements PortraitFactory{
    @Override
    public Ears createEars() {
        System.out.println("Small ears created");
        return new EarsSmall();
    }

    @Override
    public Eyes createEyes() {
        System.out.println("Grey eyes created");
        return new EyesGrey();
    }

    @Override
    public FaceShape createFaceShape() {
        System.out.println("Round face created");
        return new FaceShapeRound();
    }

    @Override
    public Hair createHair() {
        System.out.println("Bobcut hair created");
        return new HairBobcut();
    }

    @Override
    public Mouth createMouth() {
        System.out.println("Tight mouth created");
        return new MouthTight();
    }

    @Override
    public Nose createNose() {
        System.out.println("Wide nose created");
        return new NoseWide();
    }
}
