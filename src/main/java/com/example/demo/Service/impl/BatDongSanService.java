package com.example.demo.Service.impl;

import com.example.demo.Service.IBatDongSanService;
import com.example.demo.entity.LoaiBatDongSan;
import com.example.demo.repository.ILoaiBatDongSanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BatDongSanService implements IBatDongSanService {
    @Autowired
    ILoaiBatDongSanRepository lRepository;
    @Override
    public List<LoaiBatDongSan> getAll() {
        return lRepository.findAll();
    }

    @Override
    public LoaiBatDongSan getById(int id) {
        return null;
    }

    @Override
    public void add(LoaiBatDongSan loaiBatDongSan) {

    }

    @Override
    public void update(int id, LoaiBatDongSan loaiBatDongSan) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<LoaiBatDongSan> findByMaCanHo(Integer maCanHo) {
        return List.of();
    }
}
