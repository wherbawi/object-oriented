package edu.bethlehem.runners.json;

import java.io.File;
import java.io.IOException;

import org.hsqldb.store.ObjectCacheHashMap;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.bethlehem.domain.Person;

public class Json2Object {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Person p = mapper.readValue(new File("src/main/resources/jsonOutput.txt"), Person.class);
		System.out.println(p);

	}

}
