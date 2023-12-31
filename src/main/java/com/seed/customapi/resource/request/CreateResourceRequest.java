package com.seed.customapi.resource.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateResourceRequest {
    Long userId;
    Long projId;
    String name;
    LinkedHashMap<String, String> dataStructure;
}
