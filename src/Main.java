public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        System.out.println("Тестирование метода put:");
        map.put("один", 1);
        map.put("два", 2);
        map.put("три", 3);
        map.put("четыре", 4);

        Integer oldValue = map.put("два", 22);
        System.out.println("Перезаписанное значение для ключа 'два': " + oldValue);

        System.out.println("\nТестирование метода get:");
        System.out.println("Значение для ключа 'один': " + map.get("один"));
        System.out.println("Значение для ключа 'два': " + map.get("два"));
        System.out.println("Значение для ключа 'три': " + map.get("три"));
        System.out.println("Значение для ключа 'четыре': " + map.get("четыре"));
        System.out.println("Значение для несуществующего ключа: " + map.get("пять"));

        System.out.println("\nТестирование метода remove:");

        Integer removedValue = map.remove("два");
        System.out.println("Удаленное значение для ключа 'два': " + removedValue);
        System.out.println("После удаления значение для ключа 'два': " + map.get("два"));
    }
}
