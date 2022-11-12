public class FizzBuzz{
    int fizz;
    int buzz;
    //constructor
    FizzBuzz(){
        fizz = 3;
        buzz = 5;
    }
    FizzBuzz(int f, int b){
        fizz = f;
        buzz = b;
    }
    //fizz
    public void setFizz(int f) {
        fizz = f;
    }
    public int getFizz() {
        return fizz;
    }
    //buzz
    public void setBuzz(int b) {
        buzz = b;
    }
    public int getBuzz() {
        return buzz;
    }
    //fizzbuzz
    public int getFizzBuzz() {
        return fizz + buzz;
    }
    public int size() {
        return 0;
    }
}