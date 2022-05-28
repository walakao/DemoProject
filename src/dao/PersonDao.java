package dao;

import pojo.Person;

/**
 * @Auther: LX Chen
 * @Date: 2022/5/28 - 05 - 28 - 16:30
 * @version: 1.0
 */
public interface PersonDao {

    Person[] findAll(String name);
    Person[] findAll(int id);

    Person findPersonByName(String name);

}
