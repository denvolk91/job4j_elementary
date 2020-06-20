package main.java.ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User userName = null;
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUsername().equals(login)) {
                userName = users[index];
                break;
            }
        }
        if (userName == null) {
            throw new UserNotFoundException("Пользователь не найден!");
        }
        return userName;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean valUser = true;
        if (user.isValid()) {
            valUser = false;
            throw new UserInvalidException("Пользователь невалиден!");
        } else if (user.getUsername().length() < 3) {
            valUser = false;
            throw new UserInvalidException("Имя пользователя меньше 3-х символов!");
        }
        return valUser;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
