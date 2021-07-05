package mini.project.teinyazilim.business.concretes;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mini.project.teinyazilim.business.abstracts.ActivityService;
import mini.project.teinyazilim.core.utilities.results.DataResult;
import mini.project.teinyazilim.core.utilities.results.Result;
import mini.project.teinyazilim.core.utilities.results.SuccessDataResult;
import mini.project.teinyazilim.core.utilities.results.SuccessResult;
import mini.project.teinyazilim.dataAccess.ActivityRepository;
import mini.project.teinyazilim.entities.concretes.Activity;
import mini.project.teinyazilim.entities.dtos.ActivityDto;

@Service
public class ActivityManager implements ActivityService {
    @Autowired
    private ActivityRepository activityRepository;
    private ModelMapper modelMapper;

    public ActivityManager(ActivityRepository activityRepository, ModelMapper modelMapper) {
        this.activityRepository = activityRepository;
        this.modelMapper = modelMapper;
    }

    // command
    @Override
    public Result add(ActivityDto activityDto) {
        var activity=this.modelMapper.map(activityDto, Activity.class);
        this.activityRepository.save(activity);
        return new SuccessResult();
    }

    @Override
    public Result delete(int activityId) {
        var activity = this.activityRepository.getById(activityId);
        this.activityRepository.delete(activity);
        return new SuccessResult();
    }

    @Override
    public Result update(ActivityDto activityDto) {
        var activity = this.modelMapper.map(activityDto, Activity.class);
        this.activityRepository.save(activity);
        return new SuccessResult();
    }

    // query
    @Override
    public DataResult<List<ActivityDto>> getAll() {
        var activities = this.activityRepository.findAll();
        List<ActivityDto> activitiesDto = modelMapper.map(activities, new TypeToken<List<ActivityDto>>() {
        }.getType());
        return new SuccessDataResult<List<ActivityDto>>(activitiesDto);
    }

    @Override
    public DataResult<ActivityDto> detail(int activityId) {
        var activity = this.activityRepository.getById(activityId);
        var activityDto = this.modelMapper.map(activity, ActivityDto.class);
        return new SuccessDataResult<ActivityDto>(activityDto);
    }
}
