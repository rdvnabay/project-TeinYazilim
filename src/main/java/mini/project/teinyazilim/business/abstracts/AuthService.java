package mini.project.teinyazilim.business.abstracts;

import mini.project.teinyazilim.core.utilities.results.Result;
import mini.project.teinyazilim.entities.dtos.UserForLoginDto;

public interface AuthService {
    Result login(UserForLoginDto userForLoginDto);
}
