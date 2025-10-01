package builder.rpg_character;

public class App {
    public static void main(String[] args) {
        Character warrior = new Character.CharacterBuilder()
                .name("maria")
                .characterClass("warrior")
                .weapon("sword")
                .build();

        Character mage = new Character.CharacterBuilder()
                .name("ana")
                .characterClass("mage")
                .weapon("staff")
                .build();

        System.out.println(warrior);
        System.out.println(mage);
    }
}
