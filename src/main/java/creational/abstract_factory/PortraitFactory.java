package creational.abstract_factory;

public interface PortraitFactory {
    Ears createEars();
    Eyes createEyes();
    FaceShape createFaceShape();
    Hair createHair();
    Mouth createMouth();
    Nose createNose();
}
