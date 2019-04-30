package edu.bethlehem.runners.json;

import java.io.IOException;

import org.hsqldb.store.ObjectCacheHashMap;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.bethlehem.domain.Person;

public class ObjectToJson {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Person p = new Person(10, "Andy");
		ObjectMapper mapper = new ObjectMapper();
		String jsonValue = mapper.writeValueAsString(p);
		System.out.println(jsonValue);
		
	}

}
