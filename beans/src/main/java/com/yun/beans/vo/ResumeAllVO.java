package com.yun.beans.vo;



import com.yun.beans.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeAllVO {
    private Resume resume;
    private List<WorkExperience> workExperienceList;
    private List<ProjectExperience> projectExperienceList;
    private List<Skill> skillList;
    private List<Honor> honorList;
}
