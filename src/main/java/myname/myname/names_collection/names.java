package myname.myname.names_collection;

import com.google.gson.Gson;

import java.util.*;

public class names {

    public static void createJsonNames() {
        String[] names = {"Олександр Іванов", "Ірина Петрова", "Василь Сидоров", "Наталія Коваленко", "Михайло Мельник",
                "Ольга Шевченко", "Андрій Бондаренко", "Тетяна Ковальчук", "Сергій Савченко", "Марія Павленко",
                "Євген Григоренко", "Анастасія Ткаченко", "Іван Остапенко", "Оксана Козак", "Петро Мороз", "Людмила Захарчук",
                "Дмитро Поляков", "Катерина Кузнецова", "Артем Волков", "Вікторія Сергієнко"};


        List<Map<String, String>> namesList = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            String[] parts = names[i].split(" ");
            if (parts.length >= 2) {
                String name = parts[0];
                String lastName = parts[1];

                Map<String, String> namesMap = new LinkedHashMap<>();
                namesMap.put("name", name);
                namesMap.put("lastName", lastName);

                namesList.add(namesMap);
            }
        }

        Gson gson = new Gson();
        System.out.println(gson.toJson(namesList));
    }
}
