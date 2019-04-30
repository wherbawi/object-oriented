package edu.bethlehem.runners.json;

import java.io.File;
import java.io.IOException;

import org.hsqldb.store.ObjectCacheHashMap;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.bethlehem.domain.Address;
import edu.bethlehem.domain.Person;

public class ObjectToJson2File {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Person p = new Person(10, "Andy", new Address("street1", "2b", "Bethlehem"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("src/main/resources/jsonOutput.txt"), p);

	}

}
