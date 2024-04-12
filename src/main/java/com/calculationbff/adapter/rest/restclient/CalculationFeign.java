package com.calculationbff.adapter.rest.restclient;

import com.calculationbff.api.model.CalculationRequest;
import com.calculationbff.api.model.CalculationResponseFull;
import com.calculationbff.api.model.PageCalculationResponseFull;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "calculation", url = "http://${calculation.url}:${calculation.port}")
public interface CalculationFeign {

    @RequestMapping(method = RequestMethod.POST, value = "/calculation")
    CalculationResponseFull calculation(List<CalculationRequest> bodyRequest);

    @RequestMapping(method = RequestMethod.GET, value = "/calculation/pagination?page={page}&size={size}")
    PageCalculationResponseFull getAllSumPaginated(@PathVariable("page") int page, @PathVariable("size") int size);

}
