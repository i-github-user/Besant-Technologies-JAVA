public class FullCalculator extends Calculator implements FullCalc {

    @Override
    public int add(int a, int b) {
        return a+b;
    }
    @Override
    public int sub(int a, int b) {
        return a-b;
    }
    public int mod(int a, int b){
        return a%b;
    }
}
