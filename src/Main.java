
public class Main {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();

        // Додавання файлу
        FileData file1 = new FileData("file1.txt", 1000, "/path/to/file");
        if (fileNavigator.checkConsistency("/path/to/file", file1)) {
            fileNavigator.add("/path/to/file", file1);
        } else {
            System.out.println("Помилка: Не можна додати файл, консистентність порушена.");
        }

        // Пошук файлів за шляхом
        List<FileData> foundFiles = fileNavigator.find("/path/to/file");
        for (FileData file : foundFiles) System.out.println(file.getName());

        // Фільтрація файлів за розміром
        boolean filteredFiles = fileNavigator.filterBySize(2000);
        for (FileData file : filteredFiles)
            System.out.println(file.getName());

        // Видалення шляху та пов'язаних файлів
        fileNavigator.remove("/path/to/file");

        // Сортування файлів за розміром
        List<FileData> sortedFiles = fileNavigator.sortBySize();
        for (FileData file : sortedFiles) {
            System.out.println(file.getName() + " - " + file.getSize);
        }
    }
}