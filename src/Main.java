public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        System.out.println("     ENTER WORKER INFORMATION ");
        worker.input();
        System.out.println("\n     DISPLAY INFORMATION ");
        worker.outputInfo();
    }
}
