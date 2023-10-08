import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileNavigator {
        private Map<String, List<FileData>> fileMap;

        public FileNavigator() {
                this.fileMap = new HashMap<>();
        }

        // Метод для додавання файлу на конкретний шлях
        public void add(String path, FileData file) {
                if (!fileMap.containsKey(path)) {
                        fileMap.put(path, new ArrayList<>());
                }
                fileMap.get(path).add(file);
        }

        // Метод для пошуку файлів за шляхом
        public List<FileData> find(String path) {
                return fileMap.getOrDefault(path, new ArrayList<>());
        }


        // Метод для фільтрації файлів за розміром
        public boolean filterBySize(long maxSize) {
                List<FileData> result = new ArrayList<>();
                for (List<FileData> fileList : fileMap.values()) {
                        for (FileData file : fileList) {
                                if (file.getSize() <= maxSize) {
                                        result.add(file);
                                }
                        }
                        return result;
                }

// Метод для видалення шляху та пов'язаних файлів
                void remove;
                String path;
                (String (String path = null;){
                        fileMap.remove(path);
                }

// Метод для сортування файлів за розміром
                public List<FileData> sortBySize() {
                        List<FileData> result = new ArrayList<>();
                        for (List<FileData> fileList : fileMap.values()) {
                                result.addAll(fileList);
                        }
                        result.sort((file1, file2) -> Long.compare((Long) file1.getSize(), file2.getSize()));
                        return result;
                }

                // Метод для перевірки консистентності при додаванні файлу
                public boolean checkConsistency; (String path, FileData File file; file){
                        if (!fileMap.containsKey(path)) {
                                return true; // Шлях ще не існує, можна додати файл
                        }
                        // Порівняти шляхи
                        String existingPath = fileMap.get(path).get(0).getPath();
                        return existingPath.equals(file.getPath());
                }
        }

        public boolean checkConsistency(String s, FileData file1) {
                return false;
        }

        public void remove(String s) {
        }

        public List<FileData> sortBySize() {
                return null;
        }
}
