package factory_method_pattern;

import factory_method_pattern.factory.BasicAnimalFactoryImpl;
import factory_method_pattern.factory.IAnimalFactory;
import factory_method_pattern.factory.RandomAnimalFactoryImpl;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 12/27/2022
 * Time: 11:39 AM
 */
public class Test {

    public static void main(String[] args) {
        IAnimalFactory randomAnimalFactory = new RandomAnimalFactoryImpl();
        for (int i = 0; i < 6 ; i++) {
            System.out.println(randomAnimalFactory.getCreatedAnimal().getAnimalName());
        }
        System.out.println("----------------------------------------------------");
        IAnimalFactory basicAnimalFactory = new BasicAnimalFactoryImpl();
        for (int i = 0; i < 6 ; i++) {
            System.out.println(basicAnimalFactory.getCreatedAnimal().getAnimalName());
        }

    }
}
