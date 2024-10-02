import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocaleDateConversion {

    public static void main(String[] args) {
        //Defined  US, French, and Japanese locales
        Locale usLocale = Locale.US;
        Locale franceLocale = Locale.FRANCE;
        Locale japanLocale = Locale.JAPAN;
        //Obtained current date
        LocalDate now = LocalDate.now();

        printFormattedDate(usLocale, now);
        printFormattedDate(franceLocale, now);
        printFormattedDate(japanLocale, now);
        //printFormattedDate method for each locale (US, France, Japan), passing the locale and current date
    }

    private static void printFormattedDate(Locale locale, LocalDate date) {
        //Print of the language and country of the locale
        String language = locale.getLanguage();
        String country = locale.getCountry();
        System.out.println("Language: " + language + " country: " + country);
        //Formated and printed the date in LONG format
        DateTimeFormatter longLocaleFormater = DateTimeFormatter.ofPattern("MMMM d yyyy", locale);
        String longFormatedLocale = date.format(longLocaleFormater);
        System.out.println(longFormatedLocale);
        //Formated and printed the date in FULL format
        DateTimeFormatter fullLocaleFormater = DateTimeFormatter.ofPattern("EEEE MMMM d yyyy", locale);
        String fullFormatedLocale = date.format(fullLocaleFormater);
        System.out.println(fullFormatedLocale);
        //an empty line to separate the output for each locale
        System.out.println();
    }
}