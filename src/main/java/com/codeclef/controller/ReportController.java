package com.codeclef.controller;

import com.codeclef.entity.ProjectData;
import com.codeclef.entity.SubLobData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class ReportController {

    @GetMapping("/")
    public String getProjectReportMetadata(Model model) {
        model.addAttribute("subLobs", getSubLobData());
        return "ProjectsPerSubLobs";
    }

    private List<SubLobData> getSubLobData() {
        List<SubLobData> subLobs = new ArrayList<>();

        subLobs.add(new SubLobData("sl1", "CIB", "Engineering & Architecture", "Nick", "John", Arrays.asList(
                new ProjectData("CIB Logical Data Model", "https://www.google.com/", 168, new Date().toString(), "Yesterday", "Successful"),
                new ProjectData("CIB-Versioned-MetadataRepository", "https://www.facebook.com/", 46, new Date().toString(), "Yesterday", "Successful"),
                new ProjectData("JMOF-Integrated-Model", "https://www.instagram.com/", 42, new Date().toString(), "Yesterday", "Failed")
        )));
        subLobs.add(new SubLobData("sl2", "CIB", "PAYMENTS", "Eric", "Melanie", Arrays.asList(
                new ProjectData("payment1 project", "https://www.google.com/", 168, new Date().toString(), "Yesterday", "Successful"),
                new ProjectData("payment2 project", "https://www.facebook.com/", 46, new Date().toString(), "Yesterday", "Successful"),
                new ProjectData("payment3 project", "https://www.instagram.com/", 42, new Date().toString(), "Yesterday", "Failed")
        )));
        return subLobs;
    }
}
