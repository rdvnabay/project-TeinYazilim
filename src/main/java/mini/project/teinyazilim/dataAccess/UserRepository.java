package mini.project.teinyazilim.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import mini.project.teinyazilim.entities.concretes.User;

public interface UserRepository extends JpaRepository<User,Integer>{
    
}
