import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data =OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data1 =OffsetDateTime.parse("2024-03-01T13:00:00Z");

        //Verificare che la prima data è precedente alla seconda
        if(data.isBefore(data1)){
            System.out.println("La prima data è precedente alla seconda.");
        }else{
            System.out.println("La prima data non è precedente alla seconda.");
        }

        //Verificare che la seconda data è successiva alla prima
        if(data1.isAfter(data)){
            System.out.println("La seconda data è successiva alla prima.");
        }else{
            System.out.println("La seconda data non è successiva alla prima.");
}
        //Verificare che le due date sono uguali ad ora
        if ((data.getHour() == data1.getHour()) &&
                (data.getMinute() == data1.getMinute()) &&
                (data.getSecond() == data1.getSecond()) &&
                (data.getNano() / 1_000_000 == data1.getNano() / 1_000_000)) {

            System.out.println("Le due date hanno la stessa ora.");
        } else {
            System.out.println("Le due date non hanno la stessa ora..");
        }
    }
}


//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//Verificare che la prima data è precedente alla seconda
//Verificare che la seconda data è successiva alla prima
//Verificare che le due date sono uguali ad ora
//Stampa il risultato