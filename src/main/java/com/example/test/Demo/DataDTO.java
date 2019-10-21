package com.example.test.Demo;

import lombok.Data;

import java.util.List;

@Data
public class DataDTO{
    private  String id;

    private  String parentId;

    private  String resourceCode;

    private  String resourceName;

    private  String icon;

    private  String url;

    private  String type;

    private List<DataDTO> children;



}
