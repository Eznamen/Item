import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();

        while (true) {
            System.out.println("Выберите операцию:");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            if (number == 1) {
                System.out.println("Какую покупку хотите добавить?");
                String item = scanner.nextLine();
                items.add(item);

                System.out.println("Итого в списке покупок: " + items.size());

            } else if (number == 2) {
                System.out.println("Список покупок:");
                for (int i = 0; i < items.size(); i++) {
                    System.out.println((i + 1) + " " + items.get(i));
                }

            } else if (number == 3) {
                System.out.println("Список покупок:");
                for (int i = 0; i < items.size(); i++) {
                    System.out.println((i + 1) + " " + items.get(i));
                }
                System.out.println("Какую позицию хотите удалить? Введите номер или название:");

                String delete = scanner.nextLine();
                try {
                    int d = Integer.parseInt(delete);
                    System.out.println("Покупка " + items.get(d - 1) + " удалена");
                    for (int i = 0; i < items.size(); i++) {
                        if (i == (d - 1)) {
                            items.remove(i);
                        }
                    }
                    System.out.println("Итого в списке покупок: " + items.size());
                } catch (NumberFormatException e) {
                    Iterator<String> itemsIterator = items.iterator();
                    while (itemsIterator.hasNext()) {
                        if (itemsIterator.next().equals(delete)) {
                            itemsIterator.remove();
                        }
                    }
                    System.out.println("Покупка " + delete + " удалена");
                    System.out.println("Итого в списке покупок: " + items.size());
                }
            } else if (number == 4) {
                System.out.println("Введите текст для поиска:");
                String qwerty = scanner.nextLine();
                String qwertyLower = qwerty.toLowerCase();
                System.out.println("Найдено:");
                for (int i = 0; i < items.size(); i++) {
                    String itemLower = items.get(i).toLowerCase();
                    if (itemLower.contains(qwertyLower)) {
                        System.out.println((i + 1) + ". " + items.get(i));
                    }
                }
            }

        }
    }
}

