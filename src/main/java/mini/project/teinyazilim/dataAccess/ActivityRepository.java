package mini.project.teinyazilim.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import mini.project.teinyazilim.entities.concretes.Activity;

public interface ActivityRepository extends JpaRepository<Activity,Integer>{
    
}
