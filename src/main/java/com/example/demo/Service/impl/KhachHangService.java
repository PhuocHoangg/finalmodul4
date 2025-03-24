package com.example.demo.Service.impl;

import com.example.demo.Service.IKhachHangService;
import com.example.demo.entity.KhachHang;
import com.example.demo.repository.IKhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KhachHangService implements IKhachHangService {
    @Autowired
    private IKhachHangRepository khachHangRepository;
    @Override
    public List<KhachHang> getAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public KhachHang getById(int id) {
        return null;
    }

    @Override
    public void add(KhachHang khachHang) {

    }

    @Override
    public void update(int id, KhachHang khachHang) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<KhachHang> findByMaCanHo(Integer maCanHo) {
        return List.of();
    }
}
