package mini.project.teinyazilim.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mini.project.teinyazilim.business.abstracts.UserService;
import mini.project.teinyazilim.core.utilities.results.Result;
import mini.project.teinyazilim.core.utilities.results.SuccessResult;
import mini.project.teinyazilim.dataAccess.UserRepository;
import mini.project.teinyazilim.entities.concretes.User;

@Service
public class UserManager implements UserService{

    @Autowired
    private UserRepository userRepository;
    public UserManager(UserRepository userRepository) {
        this.userRepository=userRepository;
    }

    @Override
    public Result add(User user) {
        this.userRepository.save(user);
        return new SuccessResult();
    }
    
}
