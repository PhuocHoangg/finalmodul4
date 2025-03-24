package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Entity
@Table(name = "giao_dich")
@Getter
@Setter
public class GiaoDich {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_giao_dich")
    private Long maGiaoDich;

    @ManyToOne
    @JoinColumn(name = "ma_khach_hang")
    private KhachHang khachHang;

    @Column(name = "ngay_giao_dich")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngayGiaoDich;

    @Column(name = "don_gia")
    private Double donGia;

    @Column(name = "dien_tich")
    private Double dienTich;
    @ManyToOne
    @JoinColumn
    @NotNull
    private LoaiBatDongSan batDongsan;
}

