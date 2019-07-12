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
    @Test
    public void shoud_return_Whizz_when_number_is_7(){
        //Given
        int number = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result =fizzBuzz.convert(number);

        //Then
        Assertions.assertEquals("Whizz",result);
    }
    @Test
    public void shoud_return_Whizz_when_number_is_14(){
        //Given
        int number = 14;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result =fizzBuzz.convert(number);

        //Then
        Assertions.assertEquals("Whizz",result);
    }
    @Test
    public void shoud_return_FizzBuzz_when_number_is_15(){
        //Given
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result =fizzBuzz.convert(number);

        //Then
        Assertions.assertEquals("FizzBuzz",result);
    }
    @Test
    public void shoud_return_FizzWhizz_when_number_is_21(){
        //Given
        int number = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result =fizzBuzz.convert(number);

        //Then
        Assertions.assertEquals("FizzWhizz",result);
    }
    @Test
    public void shoud_return_BuzzWhizz_when_number_is_35(){
        //Given
        int number = 35;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result =fizzBuzz.convert(number);

        //Then
        Assertions.assertEquals("BuzzWhizz",result);
    }

}
