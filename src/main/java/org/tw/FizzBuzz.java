package org.tw;

public class FizzBuzz {
    int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String fizz() {
        if(number%3==0){
              return "Fizz";
        }
        return null;
    }

    public String buzz() {
        if(number%5==0){
            return "Buzz";
        }
        return null;
    }
    public String modifiedFizz(){
        String string=String.valueOf(number);
        if(number%3==0 || string.contains("3")){
            return "Fizz";
        }
        return null;
    }
    public String modifiedBuzz(){
        String string=String.valueOf(number);
        if(number%5==0 || string.contains("5")){
            return "Fizz";
        }
        return null;
    }
    public String fizzBuzz(){
        if(number%5==0 && number%3==0){
            return "FizzBuzz";
        }
        return null;
    }

}