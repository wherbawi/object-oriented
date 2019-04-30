package edu.bethlehem.runners.json;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.hsqldb.store.ObjectCacheHashMap;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.bethlehem.domain.Person;

public class Json2ObjectArray {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<Person> p = mapper.readValue(new File("src/main/resources/jsonOutputArray.txt"), new TypeReference<List<Person>>(){});
		System.out.println(p);

	}

}
