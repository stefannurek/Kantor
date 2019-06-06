package Kantor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class CurrencyConverter {

    private static String VIEW = "ultra";
    private static String KEY = "cd8b88536350a5db7a5e";

    public static double convert(Currency from, Currency to) {
        try {
            URL url = new URL("http://free.currencyconverterapi.com/api/v6/convert"
                    + "?q=" + from.getName()
                    + "_" + to.getName()
                    + "&compact="
                    + VIEW
                    + "&apiKey="
                    + KEY);

            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = reader.readLine();
            reader.close();
            if (line.length() > 0) {
                int startIndex = line.indexOf(":") + 1;
                int endIndex = line.indexOf("}");
                String value = line.substring(startIndex, endIndex);
                return Double.parseDouble(value);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
