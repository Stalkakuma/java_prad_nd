import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;

public class Drug extends Product {
    private double taxRate;
    private DecimalFormat decimalFormat;


    public Drug(String name, double price) {
        super(name, price);
        taxRate = 9;
        decimalFormat = new DecimalFormat("0.00");
    }

    public double getFrankPrice() {
        double currencyRate = 0;
        String responseData = null;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://psd2.api.swedbank.com:443/partner/sandbox/v1/fx/indicative-rate/rate?currencyPair=EURCHF&app-id=" + System.getenv("API_KEY")))
                    .header("x-request-id", "1144555")
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            responseData = response.body();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (responseData == null) {
            currencyRate = 0.95;
        } else {
            JSONObject jsonObject = new JSONObject(responseData);
            currencyRate = jsonObject.getDouble("bidRate");
        }
        return currencyRate * this.getPrice();
    }

    public double calculatePrice(Double price) {
        double tax = (taxRate / 100) * price;
        return price + tax;
    }

    public String finalPrice() {
        String formattedEurPrice = decimalFormat.format(calculatePrice(this.getPrice()));
        String formattedChfPrice = decimalFormat.format(calculatePrice(getFrankPrice()));
        return formattedEurPrice + " EUR or " + formattedChfPrice + " CHF";
    }
}
