import java.util.*;

public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook();
        notebook1.name = "HP Pavilion Dv-6";
        notebook1.operMemory = 4;
        notebook1.hardDriveVolume = 250;
        notebook1.os = "Windows 7";
        notebook1.colour = "черный";

        Notebook notebook2 = new Notebook();
        notebook2.name = "Asus VivoBook 16";
        notebook2.operMemory = 16;
        notebook2.hardDriveVolume = 512;
        notebook2.os = "FreeDOS";
        notebook2.colour = "черный";

        Notebook notebook3 = new Notebook();
        notebook3.name = "Thunderobot 911M";
        notebook3.operMemory = 16;
        notebook3.hardDriveVolume = 512;
        notebook3.os = "Windows 11";
        notebook3.colour = "серый";

        Notebook notebook4 = new Notebook();
        notebook4.name = "Apple MacBook Air";
        notebook4.operMemory = 8;
        notebook4.hardDriveVolume = 256;
        notebook4.os = "MacOS";
        notebook4.colour = "розовый";

        Notebook notebook5 = new Notebook();
        notebook5.name = "Apple Macbook Pro";
        notebook5.operMemory = 8;
        notebook5.hardDriveVolume = 256;
        notebook5.os = "MacOS";
        notebook5.colour = "серый";

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);

        int operMemory = 0;
        int hdVolume = 0;
        String osType = "";
        String colour = "";


        Set<Notebook> notebooksFiltered = new HashSet<>();
        notebooksFiltered.addAll(filterAsOperMemory(notebooks, operMemory));
        notebooksFiltered.addAll(filterAsHardDriveVolume(notebooks, hdVolume));
        notebooksFiltered.addAll(filterAsColour(notebooks, colour));
        notebooksFiltered.addAll(filterAsOSType(notebooks, osType));

        printSet(notebooksFiltered);

        userInterface();




//            printSet(filterAsOperMemory(notebooks, operMemory), );
//        notebooks.forEach(notebook -> System.out.println(notebook));
        System.out.println();
    }

    static void userInterface() {
        int operMemory = 0;
        int hdVolume = 0;
        String osType = "";
        String colour = "";
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work){
            System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                    "1 - ОЗУ\n" +
                    "2 - Объем ЖД\n" +
                    "3 - Операционная система\n" +
                    "4 - Цвет\n" +
                    "5 - Поиск");
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 1){
                System.out.println("Введите объем оперативной памяти в Мб");
                operMemory = Integer.parseInt(scanner.nextLine());}
            else if (num == 2){
                System.out.println("Введите объем жесткого диска в ГБ");
                hdVolume = Integer.parseInt(scanner.nextLine());}
            else if (num == 3){
                System.out.println("Введите операционную систему");
                osType = String.valueOf(scanner.nextLine());}
            else if (num == 4){
                System.out.println("Введите объем жесткого диска");
                colour = String.valueOf(scanner.nextLine());}
            else if (num == 5){
                work = false;}
            else  {
                System.out.println("Некорректный ввод. Введите цифру от 1 до 5");
            }
        }
    }

    static Set<Notebook> filterAsOperMemory(Set<Notebook> notebooks, int operMemory) {
        Set<Notebook> operMemoryset = new HashSet<>();
        for (Notebook notebook : notebooks) {
            if (notebook.operMemory == operMemory) {
             operMemoryset.add(notebook);
        }
    }
    return operMemoryset;
}

    static Set<Notebook> filterAsHardDriveVolume(Set<Notebook> notebooks, int hdVolume) {
        Set<Notebook> hDvolumeSet = new HashSet<>();
        for (Notebook notebook : notebooks) {
         if (notebook.hardDriveVolume == hdVolume) {
               hDvolumeSet.add(notebook);
        }
    }
        return hDvolumeSet;
}

    static Set<Notebook> filterAsOSType(Set<Notebook> notebooks, String osType) {
        Set<Notebook> OsTypeSet = new HashSet<>();
        for (Notebook notebook : notebooks) {
            if (notebook.os.equals(osType)) {
                OsTypeSet.add(notebook);
        }
    }
    return OsTypeSet;
}

    static Set<Notebook> filterAsColour(Set<Notebook> notebooks, String colour) {
        Set<Notebook> ColourSet = new HashSet<>();
        for (Notebook notebook : notebooks) {
            if (notebook.colour.equals(colour)){
                ColourSet.add(notebook);
        }
    }
        return ColourSet;
}

    static void printSet(Set<Notebook> set) {
        for (Notebook notebook : set) {
            System.out.println(notebook);
    }


}
}




