package com.calculationbff.application.adapter;

import com.calculationbff.api.model.CalculationRequest;
import com.calculationbff.api.model.CalculationResponseFull;

import com.calculationbff.api.model.PageCalculationResponseFull;

import java.util.List;

public interface CalculationRestClient {

    CalculationResponseFull calculation(List<CalculationRequest> bodyRequest);

    PageCalculationResponseFull getAllSumPaginated(int page, int size);

}
