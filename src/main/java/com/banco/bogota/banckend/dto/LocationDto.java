package com.banco.bogota.banckend.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LocationDto {

    private int idLocation;

    @NotNull
    private String name;

    @NotNull
    private double areaM2;
}
