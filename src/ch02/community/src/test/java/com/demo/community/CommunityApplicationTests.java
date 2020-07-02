package com.demo.community;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


@SpringBootTest
class CommunityApplicationTests {

	@Value("${property.test.name}")
	private String propertyTestName;

	@Value("${propertyTest}")
	private String propertyTest;

	@Value("${noKey:default value}")
	private String defaultValue;

	@Value("${propertyTestList}")
	private String[] propertyTestArray;

	@Value("#{'${propertyTestList}'.split(',')}")
	private List<String> propertyTestList;

	@Test
	public void testValue(){
		assertThat(propertyTestName, is("property depth test"));
		assertThat(propertyTest, is("test"));
		assertThat(defaultValue, is("default value"));
		assertThat(propertyTestArray[0], is("a"));
	}

	@Test
	@DisplayName("aaa")
	public void getPlaces_NullpointerException_발생() {
		System.out.println("test");
	}


}
