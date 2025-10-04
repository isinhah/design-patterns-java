package structural_patterns.composite.file_system;

public class App {
    public static void main(String[] args) {
        File file1 = new File("document.txt");
        File file2 = new File("picture.png");

        Directory folder = new Directory("Documents");
        folder.addComponent(file1);

        Directory folder2 = new Directory("Pictures");
        folder2.addComponent(file2);

        Directory root = new Directory("Disco C");
        root.addComponent(folder);
        root.addComponent(folder2);

        root.showDetails();
    }
}