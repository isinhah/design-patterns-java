package behavioral_patterns.iterator.email_entry_box;

public class Main {
    public static void main(String[] args) {
        Email[] emails = { new Email("Noticia 1"), new Email("Promoção 1"), new Email("Aviso 1") };
        Inbox inbox = new Inbox(emails);

        Iterator<Email> iterator = inbox.createIterator();
        while (iterator.hasNext()) {
            Email email = iterator.next();
            System.out.println("Email: " + email.getSubject());
        }
    }
}
