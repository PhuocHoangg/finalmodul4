package com.example.demo.Service;

import com.example.demo.entity.GiaoDich;

import java.util.List;

public interface IGiaoDichService extends IService<GiaoDich>{
    List<GiaoDich> findAllByMaBatDongSan(Integer maBatDongSan);
}
