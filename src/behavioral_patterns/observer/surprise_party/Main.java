package behavioral_patterns.observer.surprise_party;

public class Main {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();

        Guest joao = new Friend("joao");
        Guest maria = new Friend("maria");

        doorman.addGuest(joao);
        doorman.addGuest(maria);

        doorman.arrival("aniversariante");
    }
}
