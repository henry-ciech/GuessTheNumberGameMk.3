public class RandomNumber {
    int num;
    RandomNumber(int min, int max) {
        this.num = (int) (((Math.random() * (max - min)) + min));
    }
    public int getRandomNumber() {
        return num;
    }
}