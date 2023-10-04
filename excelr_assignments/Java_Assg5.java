package excelr_assignments;

import java.util.*;

class ListManager {
    private List<String> list;


    public ListManager() {
        list = new ArrayList<>();
    }


    public void addElement(String element) {
        list.add(element);
    }


    public void removeElement(String element) {
        list.remove(element);
    }


    public void displayElements() {
        for (String element : list) {
            System.out.println(element);
        }
    }
}


class SetManager {
    private Set<String> set;


    public SetManager() {
        set = new HashSet<>();
    }


    public void addElement(String element) {
        set.add(element);
    }


    public void removeElement(String element) {
        set.remove(element);
    }


    public void displayElements() {
        for (String element : set) {
            System.out.println(element);
        }
    }
}


class MapManager {
    private Map<String, String> map;


    public MapManager() {
        map = new TreeMap<>();
    }


    public void addKeyValuePair(String key, String value) {
        map.put(key, value);
    }


    public void removeKeyValuePair(String key) {
        map.remove(key);
    }


    public void displayKeyValues() {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


public class Java_Assg5 {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListManager listManager = new ListManager();
        SetManager setManager = new SetManager();
        MapManager mapManager = new MapManager();


        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. List Management");
            System.out.println("2. Set Management");
            System.out.println("3. Map Management");
            System.out.println("4. Exit\n");


            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline


            switch (choice) {
                case 1:
                    listManagement(scanner, listManager);
                    break;
                case 2:
                    setManagement(scanner, setManager);
                    break;
                case 3:
                    mapManagement(scanner, mapManager);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    
	}
	
	public static void listManagement(Scanner scanner, ListManager listManager) {
        while (true) {
            System.out.println("List Management:");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Display Elements");
            System.out.println("4. Back");


            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline


            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    String elementToAdd = scanner.nextLine();
                    listManager.addElement(elementToAdd);
                    break;
                case 2:
                    System.out.print("Enter element to remove: ");
                    String elementToRemove = scanner.nextLine();
                    listManager.removeElement(elementToRemove);
                    break;
                case 3:
                    System.out.println("Elements in the list:");
                    listManager.displayElements();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


    public static void setManagement(Scanner scanner, SetManager setManager) {
        while (true) {
            System.out.println("Set Management:");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Display Elements");
            System.out.println("4. Back");


            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline


            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    String elementToAdd = scanner.nextLine();
                    setManager.addElement(elementToAdd);
                    break;
                case 2:
                    System.out.print("Enter element to remove: ");
                    String elementToRemove = scanner.nextLine();
                    setManager.removeElement(elementToRemove);
                    break;
                case 3:
                    System.out.println("Elements in the set:");
                    setManager.displayElements();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


    public static void mapManagement(Scanner scanner, MapManager mapManager) {
        while (true) {
            System.out.println("Map Management:");
            System.out.println("1. Add Key-Value Pair");
            System.out.println("2. Remove Key-Value Pair");
            System.out.println("3. Display Key-Value Pairs");
            System.out.println("4. Back");


            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline


            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    String key = scanner.nextLine();
                    System.out.print("Enter value: ");
                    String value = scanner.nextLine();
                    mapManager.addKeyValuePair(key, value);
                    break;
                case 2:
                    System.out.print("Enter key to remove: ");
                    String keyToRemove = scanner.nextLine();
                    mapManager.removeKeyValuePair(keyToRemove);
                    break;
                case 3:
                    System.out.println("Key-Value pairs in the map:");
                    mapManager.displayKeyValues();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
