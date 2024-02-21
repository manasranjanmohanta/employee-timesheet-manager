package com.ldtech.controllers;

import com.ldtech.dtos.DateRangeDTO;
import com.ldtech.payloads.EmployeeDashboardResponse;
import com.ldtech.payloads.HistoryResponse;
import com.ldtech.services.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/history")
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @GetMapping
    public ResponseEntity<List<HistoryResponse>> getAllHistoryInfos(){
        List<HistoryResponse> responses = historyService.getAllHistory();
        return ResponseEntity.ok(responses);
    }

    @GetMapping("/rangedDate")
    public ResponseEntity<List<HistoryResponse>> getAllHistoryInfosWithRangedDate(@RequestBody DateRangeDTO dateRangeDTO){
        List<HistoryResponse> responses = historyService.getAllHistoryWithRangedDate(dateRangeDTO);
        return ResponseEntity.ok(responses);
    }


}