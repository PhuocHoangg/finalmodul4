package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class LoaiBatDongSan {
 @Id
@GeneratedValue
private int maLoaiBatDongSan;
private String tenLoaiBatDongSan;
}
