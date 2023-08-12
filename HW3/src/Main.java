public class Main {
    public static void main(String[] args) {

        // Вводим бесконечный цикл, чтобы пользователь мог вводить свои данные вновь и вновь в случае неуспешной валидации введённых данных
        while (true) {
            try {
                // Создаём экземпляр пользователя
                Person person = new Person();
                // Сохраняем в файл
                DataSaver.saveHumanData(person);

                System.out.println("Данные успешно сохранены.");
                // Выходим из бесконечного цикла
                break;
            } catch (RuntimeException e) {
                // DataReceptor.getHumanData при проблеме с валидацией данных выбрасывает исключение, которое выводим здесь
                System.err.println(e.getMessage());
                System.out.println("Укажите данные заново:");
            }
        }
    }
}