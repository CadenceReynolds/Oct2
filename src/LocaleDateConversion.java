import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocaleDateConversion {

    public static void main(String[] args) {
        // TODO: Define the US, French, and Japanese locales using the appropriate Locale constants or constructor
        Locale usLocale = null; // Define Locale for US
        Locale franceLocale = null; // Define Locale for France
        Locale japanLocale = null; // Define Locale for Japan

        // TODO: Obtain the current date using LocalDate.now()
        LocalDate now = null; // Initialize the current date

        // TODO: Call printFormattedDate method for each locale (US, France, Japan), passing the locale and current date
    }

    private static void printFormattedDate(Locale locale, LocalDate date) {
        // TODO: Print the language and country of the locale using locale.getLanguage() and locale.getCountry()

        // TODO: Format and print the date in LONG format using DateTimeFormatter and the provided locale

        // TODO: Format and print the date in FULL format using DateTimeFormatter and the provided locale

        // TODO: Print an empty line to separate the output for each locale
    }
}