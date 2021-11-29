package com.gb.DanismanPortal.mapper;

import com.gb.DanismanPortal.entity.Job;
import com.gb.DanismanPortal.reponse.JobResponse;
import com.gb.DanismanPortal.request.Job.JobAddRequest;

import java.util.List;

@Mapper(componentModel = "spring")
public interface JobMapper {
    List<JobResponse> toJobResponseList (List<Job> jobs);
    JobResponse toJobResponse (Job job);
    Job toJob (JobAddRequest jobAddRequest);

}
