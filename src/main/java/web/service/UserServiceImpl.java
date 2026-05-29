package web.service;
import web.model.User;
import web.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }
    @Override
    @Transactional
    public void update(User user) {
        userRepository.save(user);
    }
    @Override
    @Transactional
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}