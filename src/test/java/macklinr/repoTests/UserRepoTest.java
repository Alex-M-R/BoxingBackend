package macklinr.repoTests;

import macklinr.models.User;
import macklinr.repositories.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class UserRepoTest
{
    @Autowired
    UserRepository userRepository;

    @Test
    void save_user_test()
    {
        User user = new User(0, "test@test", "test", "tess", "ter", "defaultPic");
        User savedUser = this.userRepository.save(user);
        Assertions.assertNotEquals(0, savedUser.getId());
    }
}
