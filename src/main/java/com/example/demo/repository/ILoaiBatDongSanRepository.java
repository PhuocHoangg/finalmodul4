package com.example.demo.repository;

import com.example.demo.entity.LoaiBatDongSan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ILoaiBatDongSanRepository extends JpaRepository<LoaiBatDongSan,Long> {
    List<LoaiBatDongSan> findAll();
}
