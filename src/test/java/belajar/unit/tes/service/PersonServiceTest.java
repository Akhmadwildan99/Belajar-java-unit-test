package belajar.unit.tes.service;

import belajar.unit.tes.data.Person;
import belajar.unit.tes.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {
    @Mock
    private PersonRepository personRepository;

    private PersonService personService;
    @BeforeEach
    void setUp() {
        personService = new PersonService(personRepository);
    }

    @Test
    void testGetPersonNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
           personService.get("not Found");
        });
    }

    @Test
    void testGetPersonSuccess() {
        Mockito.when(personRepository.selectById("eko"))
                .thenReturn(new Person("Eko", "eko"));
        var person = personService.get("eko");
        Assertions.assertNotNull(person);
        Assertions.assertEquals("eko", person.getId());
        Assertions.assertEquals("Eko", person.getName());
    }

    @Test
    void testRegisterSuccess() {
        var person = personService.register("Wildan");
        Assertions.assertNotNull(person);
        Assertions.assertNotNull(person.getId());
        Assertions.assertEquals("Wildan", person.getName());

        Mockito.verify(personRepository, Mockito.times(1))
                .insert(new Person(person.getName(), person.getId()));
    }
}
