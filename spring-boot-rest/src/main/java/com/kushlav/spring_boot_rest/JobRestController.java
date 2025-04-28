package com.kushlav.spring_boot_rest;

import com.kushlav.spring_boot_rest.model.JobPost;
import com.kushlav.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RestController
//We can use @RestController as well in place of @Controller and we can skip using @Responsebody

@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired

    private JobService service;

//    For setting the content type we want to produce
//    @GetMapping(path="jobPosts", produces = {"application/json"})
    @GetMapping("jobPosts")
    @ResponseBody
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    @ResponseBody
    public JobPost getJob(@PathVariable("postId") int postId){
        return service.getJob(postId);
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    @ResponseBody
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword){
        return service.search(keyword);
    }
//    For setting the content type we want to consume
//    @PostMapping(path="jobPosts", consumes = {application/json})
    @PostMapping("jobPost")
    @ResponseBody
    public void addJob(@RequestBody JobPost job){
        service.addJob(job);
    }

    @PutMapping("jobPost")
    @ResponseBody
    public void updateJob(@RequestBody JobPost job){
         service.updateJob(job);
    }

    @DeleteMapping("jobPost/{postId}")
    @ResponseBody
    public String deleteJob(@PathVariable int postId){
        service.deleteJob(postId);
        return "deleted";
    }

    @GetMapping("load")
    @ResponseBody
    public String loadData(){
        service.load();
        return "Success loading data!!";
    }
}
