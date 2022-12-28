package factory_method_pattern.factory;

import factory_method_pattern.object.Animal;
import factory_method_pattern.object.Cat;
import factory_method_pattern.object.Dog;
import factory_method_pattern.object.Duck;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 12/27/2022
 * Time: 11:29 AM
 */
public class BasicAnimalFactoryImpl implements IAnimalFactory {

    private int i = 0;

    @Override
    public Animal getCreatedAnimal() {
        switch (i) {
            case 0:
                i++;
                return new Cat();
            case 1:
                i++;
                return new Dog();
            case 2:
                i = 0;
                return new Duck();
        }
        return null;
    }
}
