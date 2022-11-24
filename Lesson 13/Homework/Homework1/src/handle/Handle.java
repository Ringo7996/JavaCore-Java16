package handle;

import constant.Sex;
import constant.Type;
import entity.Pet;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Handle {
    public void match(ArrayList<Pet> pets) {
        Pet yourpet = addYourPet();
        showRandomPet(yourpet, pets);
        agree(yourpet, pets);
    }

    public void agree(Pet yourpet, ArrayList<Pet> pets) {
        System.out.println("Bạn có muốn tìm một pet khác không? 1. Có 2.Không");
        Scanner scanner = new Scanner(System.in);
        int agree = 0;
        agree = inputNumber(scanner, agree);
        while (true) {
            if (agree == 1) {
                showRandomPet(yourpet, pets);
                agree(yourpet, pets);
                break;
            } else if (agree == 2) {
                System.out.println("Cảm ơn bạn đã tham gia ghép đôi");
                System.exit(0);
            } else {
                System.out.print("Vui lòng chọn lại số hợp lệ: ");
                agree = inputNumber(scanner, agree);
            }
        }
    }

    public void showRandomPet(Pet yourpet, ArrayList<Pet> pets) {
        //tạo danh sách các pet đúng điều kiện ghép đôi.
        ArrayList<Pet> matchablePets = new ArrayList<>();
        for (Pet i : pets) {
            if (yourpet.getSex() != i.getSex() && yourpet.getType() == i.getType()) {
                matchablePets.add(i);
            }
        }

        // tạo random index để lấy 1 pet ngẫu nhiên trong danh sách đạt điều kiện.
        System.out.println("Pet ghép đôi của bạn:");
        int index = new Random().nextInt(matchablePets.size());
        System.out.println(matchablePets.get(index));
    }

    public Pet addYourPet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên pet: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giống loài của pet: ");
        String species = scanner.nextLine();
        System.out.print("Nhập tuổi pet: ");
        int age = 0;
        age = inputNumber(scanner, age);
        System.out.print("Nhập giới tính pet: 1. Boy 2.Girl ");
        int genderChoice = 0;
        genderChoice = inputNumber(scanner, genderChoice);
        String sex;
        while (true) {
            if (genderChoice == 1) {
                sex = Sex.BOY.value;
                break;
            } else if (genderChoice == 2) {
                sex = Sex.GIRL.value;
                break;
            } else {
                System.out.print("Vui lòng chọn lại loại hợp lệ: ");
                genderChoice = inputNumber(scanner, genderChoice);
            }
        }
        System.out.print("Nhập miêu tả pet: ");
        String description = scanner.nextLine();
        System.out.print("Nhập loại pet: 1.Dog 2.Cat");
        int typeChoice = 0;
        typeChoice = inputNumber(scanner, typeChoice);
        String type;
        while (true) {
            if (typeChoice == 1) {
                type = Type.DOG.value;
                break;
            } else if (typeChoice == 2) {
                type = Type.CAT.value;
                break;
            } else {
                System.out.print("Vui lòng chọn lại loại hợp lệ: ");
                typeChoice = inputNumber(scanner, typeChoice);

            }
        }
        System.out.print("Nhập hình ảnh pet: ");
        String images = scanner.nextLine();
        Pet yourpet = new Pet(name, species, age, sex, description, type, images);
        return yourpet;
    }

    public void addList(ArrayList<Pet> pets) {
        Pet pet1 = new Pet("Bon", "Sphynx", 2, "boy", "cute", "cat", "1");
        Pet pet2 = new Pet("Cún", "Chihuahua", 3, "girl", "pretty", "dog", "2");
        Pet pet3 = new Pet("Bông", "Poodle", 1, "boy", "cute", "dog", "3");
        Pet pet4 = new Pet("Kitty", "Anh", 2, "girl", "angry", "cat", "4");
        Pet pet5 = new Pet("Xám", "Alaska", 2, "boy", "friendly", "dog", "5");
        Pet pet6 = new Pet("Mực", "Xiêm", 1, "girl", "dark", "cat", "6");
        Pet pet7 = new Pet("Vàng", "Ta", 3, "boy", "cute", "cat", "7");
        Pet pet8 = new Pet("Mít", "Sphynx", 1, "boy", "cute", "cat", "1");
        Pet pet9 = new Pet("Tít", "Chihuahua", 2, "girl", "pretty", "dog", "2");
        Pet pet10 = new Pet("Tin", "Poodle", 1, "boy", "cute", "dog", "3");
        Pet pet11 = new Pet("Rex", "Anh", 4, "girl", "friendly", "cat", "4");
        Pet pet12 = new Pet("Tun", "Alaska", 2, "boy", "spoiled", "dog", "5");
        Pet pet13 = new Pet("Milo", "Xiêm", 1, "girl", "angry", "cat", "6");
        Pet pet14 = new Pet("Mic", "Ta", 3, "boy", "cute", "cat", "7");
        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        pets.add(pet4);
        pets.add(pet5);
        pets.add(pet6);
        pets.add(pet7);
        pets.add(pet8);
        pets.add(pet9);
        pets.add(pet10);
        pets.add(pet11);
        pets.add(pet12);
        pets.add(pet13);
        pets.add(pet14);
    }

    public int inputNumber(Scanner scanner, int number) {
        while (true) {
            try {
                number = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.print("Kiểu dữ liệu không hợp lệ, mời nhập lại: ");
                continue;
            }

            if (number < 1) {
                System.out.print("Vui lòng nhập số nguyên lớn hơn không: ");
                continue;
            }
            break;
        }
        return number;
    }

}
