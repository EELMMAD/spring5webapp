package guru.springframework.spring5webapp;

public class Dollar extends Money {
    private String currency;
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }
}
