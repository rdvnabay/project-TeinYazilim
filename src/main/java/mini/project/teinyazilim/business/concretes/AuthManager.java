package mini.project.teinyazilim.business.concretes;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mini.project.teinyazilim.business.abstracts.AuthService;
import mini.project.teinyazilim.business.abstracts.UserService;
import mini.project.teinyazilim.core.utilities.results.Result;
import mini.project.teinyazilim.core.utilities.results.SuccessResult;
import mini.project.teinyazilim.dataAccess.UserRepository;
import mini.project.teinyazilim.entities.concretes.User;
import mini.project.teinyazilim.entities.dtos.UserForLoginDto;


@Service
public class AuthManager implements AuthService {
    @Autowired
    private UserService userService;
    private ModelMapper modelMapper;

    public AuthManager(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @Override
    public Result login(UserForLoginDto userForLoginDto) {

        var user = this.modelMapper.map(userForLoginDto, User.class);
        this.userService.add(user);
      return new SuccessResult();
    }
}
