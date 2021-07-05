package mini.project.teinyazilim.business.abstracts;

import mini.project.teinyazilim.core.utilities.results.Result;
import mini.project.teinyazilim.entities.concretes.User;

public interface UserService {
    Result add(User user);
}
