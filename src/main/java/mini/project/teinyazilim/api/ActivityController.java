package mini.project.teinyazilim.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mini.project.teinyazilim.business.abstracts.ActivityService;
import mini.project.teinyazilim.entities.dtos.ActivityDto;

@RestController
@RequestMapping("/api/activity")
public class ActivityController {
    
    @Autowired
    private ActivityService activityService;
    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(ActivityDto activityDto){
        return ResponseEntity.ok(this.activityService.add(activityDto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(int activityId){
        return ResponseEntity.ok(this.activityService.delete(activityId));
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(ActivityDto activityDto){
        return ResponseEntity.ok(this.activityService.update(activityDto));
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(this.activityService.getAll());
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<?> detail(int activityId){
        return ResponseEntity.ok(this.activityService.detail(activityId));
    }
}
