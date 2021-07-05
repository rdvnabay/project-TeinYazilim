package mini.project.teinyazilim.entities.dtos;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityDto {
    private String title;
    private String content;  
    private Date date;
    private boolean status;
}
