import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;



public class Person {
    private String firstName;
    private String lastName;
    private String fatherName;
    private String birthday;
    private String phoneNumber;
    private String sex;

    Scanner scanner = new Scanner(System.in);

    public Person() {
        System.out.println("Введите (Фамилия Имя Отчество датарождения(дд.мм.гггг) номертелефона пол(f,m) через пробел ");
        String line = scanner.nextLine();
        String[] arr = line.split(" ");
        if (arr.length < 6) {
            throw new RuntimeException("не все данные внесены");

        }
        this.lastName = arr[0];
        this.firstName = arr[1];
        this.fatherName = arr[2];
        if (isValid(arr[3])){
            this.birthday = arr[3];
        }else {
            throw new RuntimeException("некоректная дата");

        }
        if (arr[4].length() >= 9 && arr[4].length() <= 13 && isDigit(arr[4])){
            this.phoneNumber = arr[4];
        }else {
            throw new RuntimeException("некоректный номер телефона");
        }
        if (arr[5].length() == 1 && (arr[5].equals("f")||arr[5].equals("m"))){
            this.sex = arr[5];
        }else {
            throw new RuntimeException("неправильный символ индефицирующий пол");
        }

    }

    @Override
    public String toString() {
        return
                "<" + lastName  +
                "><" + firstName +
                "><" + fatherName +
                "><" + birthday +
                "><" + phoneNumber +
                "><" + sex +
                '>';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    private boolean isDigit(String word) {

        boolean isOnlyDigits = true;
        for(int i = 0; i < word.length() && isOnlyDigits; i++) {
            if(!Character.isDigit(word.charAt(i))) {
                isOnlyDigits = false;
            }
        }
        return isOnlyDigits;
    }

    public boolean isValid(String dateStr) {
        String pattern = "dd.MM.yyyy";
        DateFormat sdf = new SimpleDateFormat(pattern);
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);

        } catch (ParseException e) {
            return false;
        }
        return true;
    }
}