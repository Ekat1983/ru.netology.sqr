import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int result = service.calculateTheSquare(200, 300);

        System.out.println(result);
    }

}