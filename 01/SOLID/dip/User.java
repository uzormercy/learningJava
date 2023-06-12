package SOLID.dip;

public class User {
    public static void main(String[] args) {
        
    }
}

interface UserRepository {
    void saveUser(User user);
}

class DatabaseUserRepository implements UserRepository {
    public void saveUser(User user) {
        // code to save user to a database
    }
}

class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(User user) {
        userRepository.saveUser(user);
    }
}