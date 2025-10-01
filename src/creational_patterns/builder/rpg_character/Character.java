package creational_patterns.builder.rpg_character;

public class Character {

    private String name;
    private String characterClass;
    private String weapon;

    // Apenas o creational_patterns.builder pode criar instâncias
    public Character(CharacterBuilder builder) {
        this.name = builder.name;
        this.characterClass = builder.characterClass;
        this.weapon = builder.weapon;
    }

    public static class CharacterBuilder {
        private String name;
        private String characterClass;
        private String weapon;

        public CharacterBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CharacterBuilder characterClass(String characterClass) {
            this.characterClass = characterClass;
            return this;
        }

        public CharacterBuilder weapon(String weapon) {
            this.weapon = weapon;
            return this;
        }

        public Character build() {
            return new Character(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", characterClass='" + characterClass + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
