package com.example.demo.Service.impl;

import com.example.demo.Service.IGiaoDichService;
import com.example.demo.entity.GiaoDich;
import com.example.demo.repository.IGiaoDichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GiaoDichService implements IGiaoDichService {
    @Autowired
    private IGiaoDichRepository giaoDichRepository;
    @Override
    public List<GiaoDich> getAll() {
        return giaoDichRepository.findAll();
    }

    @Override
    public GiaoDich getById(int id) {
        return null;
    }

    @Override
    public void add(GiaoDich giaoDich) {

    }

    @Override
    public void update(int id, GiaoDich giaoDich) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<GiaoDich> findByMaCanHo(Integer maCanHo) {
        return List.of();
    }

    @Override
    public List<GiaoDich> findAllByMaBatDongSan(Integer maLoaiBatDongSan) {
        return giaoDichRepository.findAllByBatDongsan_MaLoaiBatDongSan(maLoaiBatDongSan);
    }
}
