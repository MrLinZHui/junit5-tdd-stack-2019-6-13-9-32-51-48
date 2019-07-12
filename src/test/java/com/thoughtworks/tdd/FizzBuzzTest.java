package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void shoud_return_1_when_number_is_1(){
        //Given
        int number = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result =fizzBuzz.convert(number);

        //Then
        Assertions.assertEquals("1",result);
    }
    @Test
    public void shoud_return_1_when_number_is_2(){
        //Given
        int number = 2;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result =fizzBuzz.convert(number);

        //Then
        Assertions.assertEquals("2",result);
    }
    @Test
    public void shoud_return_Fizz_when_number_is_3(){
        //Given
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result =fizzBuzz.convert(number);

        //Then
        Assertions.assertEquals("Fizz",result);
    }

    @Test
    public void shoud_return_Fizz_when_number_is_6(){
        //Given
        int number = 6;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result =fizzBuzz.convert(number);

        //Then
        Assertions.assertEquals("Fizz",result);
    }
    @Test
    public void shoud_return_Buzz_when_number_is_5(){
        //Given
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result =fizzBuzz.convert(number);

        //Then
        Assertions.assertEquals("Buzz",result);
    }
    @Test
    public void shoud_return_Buzz_when_number_is_10(){
        //Given
        int number = 10;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result =fizzBuzz.convert(number);

        //Then
        Assertions.assertEquals("Buzz",result);
    }
}
