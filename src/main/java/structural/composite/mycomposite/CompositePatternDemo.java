package structural.composite.mycomposite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        // Создаем файлы
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        // Создаем директории и добавляем файлы к ним
        Directory dir1 = new Directory("dir1");
        dir1.addComponent(file1);

        Directory dir2 = new Directory("dir2");
        dir2.addComponent(file2);
        dir2.addComponent(file3);

        // Создаем корневую директорию и добавляем к ней поддиректории
        Directory root = new Directory("root");
        root.addComponent(dir1);
        root.addComponent(dir2);

        // Отображаем структуру файловой системы
        root.showDetails();
    }
}
