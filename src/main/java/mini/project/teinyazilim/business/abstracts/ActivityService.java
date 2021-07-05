package mini.project.teinyazilim.business.abstracts;

import java.util.List;
import mini.project.teinyazilim.core.utilities.results.DataResult;
import mini.project.teinyazilim.core.utilities.results.Result;
import mini.project.teinyazilim.entities.dtos.ActivityDto;

public interface ActivityService {
    Result add(ActivityDto activityDto);
    Result delete(int activityId);
    Result update(ActivityDto activityDto);
    DataResult<List<ActivityDto>> getAll();
    DataResult<ActivityDto> detail(int activityId);
}
