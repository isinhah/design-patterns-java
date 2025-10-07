package behavioral_patterns.observer.surprise_party;

import java.util.ArrayList;
import java.util.List;

// Subject: objeto que está sendo observado, notificando quando o estado muda
public class Doorman {
    private List<Guest> guests = new ArrayList<>();

    public void addGuest(Guest guest){
        guests.add(guest);
    }

    public void notifyGuests(String message) {
        for (Guest guest : guests) {
            guest.update(message);
        }
    }

    public void arrival(String person) {
        // Aniversariante chegou
        System.out.println(person + " chegou!");

        // Notifica os assinantes do evento
        notifyGuests(person + " chegou!");
    }
}