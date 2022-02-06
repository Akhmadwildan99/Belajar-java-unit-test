package belajar.unit.tes.repository;

import belajar.unit.tes.data.Person;

public interface PersonRepository {
    Person selectById(String id);
    void insert(Person person);
}
