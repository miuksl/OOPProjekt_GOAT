public interface random_num {
    static void main() {
        int number = (int) (Math.random() * 5) + 1;
        System.out.println(number);
    }
}
