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

        List<Fruit> fruitData = fruitProperty.getList();

        assertThat(fruitData.get(0).getName(), is("banana"));
        assertThat(fruitData.get(0).getColor(), is("yellow"));

        assertThat(fruitData.get(1).getName(), is("apple"));
        assertThat(fruitData.get(1).getColor(), is("red"));

        assertThat(fruitData.get(2).getName(), is("water melon"));
        assertThat(fruitData.get(2).getColor(), is("green"));

//        assertThat(fruitData.get(0).get("name"), is("banana"));
//        assertThat(fruitData.get(0).get("color"), is("yellow"));
//
//        assertThat(fruitData.get(1).get("name"), is("apple"));
//        assertThat(fruitData.get(1).get("color"), is("red"));
//
//        assertThat(fruitData.get(2).get("name"), is("water melon"));
//        assertThat(fruitData.get(2).get("color"), is("green"));
    }

}