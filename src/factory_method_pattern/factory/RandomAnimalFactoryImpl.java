package factory_method_pattern.factory;

import factory_method_pattern.object.Animal;
import factory_method_pattern.object.Cat;
import factory_method_pattern.object.Dog;
import factory_method_pattern.object.Duck;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 12/27/2022
 * Time: 11:22 AM
 */
public class RandomAnimalFactoryImpl implements IAnimalFactory {
    @Override
    public Animal getCreatedAnimal() {
        int random = ThreadLocalRandom.current().nextInt(0, 3);
        switch (random) {
            case 0: return new Cat();
            case 1: return new Dog();
            case 2: return new Duck();
        }
        return null;
    }
}
