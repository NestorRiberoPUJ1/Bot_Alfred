import java.text.SimpleDateFormat;
import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Cómo estás?";
    }

    public String guestGreeting(String name) {
        // TU CÓDIGO AQUÍ
        return "Hola, " + name + ". Encantado de verte.";
    }

    public String guestGreeting(String name, String time) {
        // TU CÓDIGO AQUÍ
        return String.format("Buen %s %s. Es un gusto verte", time, name);
    }

    public String guestGreeting() {
        // TU CÓDIGO AQUÍ
        SimpleDateFormat format = new SimpleDateFormat("a");
        String dateString = format.format(new Date());
        if (dateString.contains("am")) {
            return "Buenos dias";
        } else {
            return "Buenas tardes";
        }

    }

    public String dateAnnouncement() {
        Date hoy = new Date();
        return "Actualemte es " + hoy.toString();
    }

    public String respondBeforeAlexis(String conversation) {

        if (conversation.indexOf("Alexis") != -1) {
            return "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso";
        } else if (conversation.indexOf("Alfred") != -1) {
            return "A su servicio. Como desee, naturalmente";
        }

        else {
            return "Bien. Y con eso, me retiraré";
        }

    }

    // BONUS NINJA
    // Ver las especificaciones para sobrecargar el método guessGreeting
    // BONUS SENSEI
    // ¡Escribe tu propio método AlfredQuotes usando cualquiera de los métodos
    // String que has aprendido!
}
