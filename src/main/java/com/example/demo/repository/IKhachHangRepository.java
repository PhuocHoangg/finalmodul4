package com.example.demo.repository;

import com.example.demo.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IKhachHangRepository extends JpaRepository<KhachHang, Long> {
    List<KhachHang> findAllByMaKhachHang (Long maKhachHang);
    List<KhachHang> findAll();
}
