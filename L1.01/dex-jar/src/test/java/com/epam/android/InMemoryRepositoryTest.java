package com.epam.android;

import com.epam.android.person.Person;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/** 
* InMemoryRepository Tester. 
* 
* @author <Authors name> 
* @since <pre>Dec 24, 2014</pre> 
* @version 1.0 
*/
public class InMemoryRepositoryTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testAddEntry() throws Exception {
        InMemoryRepository<Person> inMemoryRepository = new InMemoryRepository<Person>();

        inMemoryRepository.addEntry(new Person("Józsi",12));
        inMemoryRepository.addEntry(new Person("Béla",22));
        inMemoryRepository.addEntry(new Person("Zoli",34));

        inMemoryRepository.printEntries();
        assertEquals(3, inMemoryRepository.count());
    }
    @Test
    public void testPrintEntries() throws Exception {
        //fail("Unimplemented");
    }
    @Test
    public void testCount() throws Exception {
        //fail("Unimplemented");
    }

} 
