package edu.bethlehem.runners.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.hsqldb.store.ObjectCacheHashMap;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.bethlehem.domain.Address;
import edu.bethlehem.domain.Person;

public class ArrayOfObjectsToJson {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(10, "Andy"));
		persons.add(new Person(20, "Marwan", new Address("street1", "2b", "Bethlehem")));
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("src/main/resources/jsonOutputArray.txt"), persons);

	}

}
