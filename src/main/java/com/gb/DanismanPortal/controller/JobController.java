package com.gb.DanismanPortal.controller;

import com.gb.DanismanPortal.request.Address.AddressAddRequest;
import com.gb.DanismanPortal.request.Job.JobAddRequest;
import com.gb.DanismanPortal.response.AddressResponse;
import com.gb.DanismanPortal.response.HttpResponseMessage;
import com.gb.DanismanPortal.response.JobResponse;
import com.gb.DanismanPortal.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/job")
public class JobController {
    private final JobService jobService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public ResponseEntity<?> getAll(){
         List<JobResponse> jobResponses = jobService.listAll();
         HttpResponseMessage message = new HttpResponseMessage.HttpResponseMessageBuilder()
                .success(true)
                .items(jobResponses)
                .build();
        return new ResponseEntity<>(jobResponses, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> save(@RequestBody JobAddRequest jobAddRequest){
        jobService.save(jobAddRequest);
        HttpResponseMessage message = new HttpResponseMessage.HttpResponseMessageBuilder()
                .success(true)
                .build();
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
