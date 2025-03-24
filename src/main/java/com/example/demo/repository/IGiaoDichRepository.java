package com.example.demo.repository;

import com.example.demo.entity.GiaoDich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IGiaoDichRepository extends JpaRepository<GiaoDich, Long> {
  List<GiaoDich> findAllByMaGiaoDich(Long maGiaoDich);
  List<GiaoDich> findAll();
  List<GiaoDich> findAllByBatDongsan_MaLoaiBatDongSan(Integer maLoaiBatDongSan);
}
