package com.demo.community.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
class FruitPropertyTest {

    @Autowired
    FruitProperty fruitProperty;

    @Test
    public void test(){

        System.out.println(fruitProperty);

        List<Map> fruitData = fruitProperty.getList();

        assertThat(fruitData.get(0).get("name"), is("banana"));
    }

}