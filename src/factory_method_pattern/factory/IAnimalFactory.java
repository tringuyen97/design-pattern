package factory_method_pattern.factory;

import factory_method_pattern.object.Animal;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 12/27/2022
 * Time: 11:19 AM
 */
public interface IAnimalFactory {

    Animal getCreatedAnimal();
}
