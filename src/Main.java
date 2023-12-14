import java.time.*;
import java.time.format.*;

//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni
public class Main {
    public static void main(String[] args) {
        ZonedDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Greenwich"));

        String dataStringFull = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        String dataStringMedium = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        String dataStringShort = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));


        System.out.println(dataStringFull);
        System.out.println(dataStringMedium);
        System.out.println(dataStringShort);
    }
}