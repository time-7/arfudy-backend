package com.arfudy.backend.domain;

import java.util.List;

import com.arfudy.backend.entity.Prato;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PratoResponse {

    @JsonProperty(value = "result", required = true)
    List<Prato> pratoList;

    public PratoResponse(List<Prato> pratoList) {

        this.pratoList = pratoList;
    }
}
