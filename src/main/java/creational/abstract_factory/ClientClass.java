package creational.abstract_factory;

import java.util.ArrayList;
import java.util.List;

public class ClientClass {
    public static void main(String[] args) {
        List<PortraitFactory> portraitFactoryList = new ArrayList<>();
        portraitFactoryList.add(new AdamPortraitFactory());
        portraitFactoryList.add(new BobPortraitFactory());
        portraitFactoryList.forEach(portraitFactory -> {
            portraitFactory.createEars();
            portraitFactory.createEyes();
            portraitFactory.createFaceShape();
            portraitFactory.createHair();
            portraitFactory.createMouth();
            portraitFactory.createNose();
            System.out.println(portraitFactory.getClass() + " has finished creating portrait!");
            System.out.println();
        });
    }
}
