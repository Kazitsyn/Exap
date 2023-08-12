/**
 Создайте метод doSomething(), который может быть источником одного
 из типов checked exceptions(тело самого метода прописывать не обязательно).
 Вызовите этот метод из main и обработайте в нем исключение, которое вызвал
 метод doSomething().
 */
public class Task1 {
    private static void soSomething() throws Exception {
        throw new Exception("error");
    }

}