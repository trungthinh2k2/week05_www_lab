package vn.edu.iuh.fit.week_05.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.iuh.fit.week_05.backend.models.Company;
import vn.edu.iuh.fit.week_05.backend.models.Job;
import vn.edu.iuh.fit.week_05.backend.repositories.CompanyRepository;
import vn.edu.iuh.fit.week_05.backend.services.JobService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class JobController {
    @Autowired
    private JobService jobService;
    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping("/{companyID}/jobs")
    public String showJobList(Model model, @PathVariable("companyID") long companyID, @RequestParam Optional<Integer> page, @RequestParam Optional<Integer> size){
        int currPage = page.orElse(1);
        int pageSize = size.orElse(10);
        Page<Job> jobPage = jobService.getAll(currPage - 1, pageSize, "id", "asc", companyID);
        model.addAttribute("pageJob", jobPage);
        Company company = companyRepository.findById(companyID).orElse(null);
        model.addAttribute("company", company);
        int totalPage = jobPage.getTotalPages();
        if(totalPage > 0){
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPage).boxed().collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "job/list";
    }
}
