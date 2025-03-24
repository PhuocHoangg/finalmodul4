package com.example.demo.controller;

import com.example.demo.Service.impl.BatDongSanService;
import com.example.demo.Service.impl.GiaoDichService;
import com.example.demo.Service.impl.KhachHangService;
import com.example.demo.entity.GiaoDich;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class GiaoDichController {
   @Autowired
   private GiaoDichService giaoDichService;
  @Autowired
    private KhachHangService khachHangService;
  @Autowired
  private BatDongSanService batDongSanService;
@GetMapping("/list")
    public String showList(Model model,
                           @RequestParam(value = "name", required = false) Long maGiaoDich,
                           @RequestParam(value="khachHang",required = false) Long maKhachHang,
                           @RequestParam(value="loaiDichVu",required = false)String loaiDichVu,
                           @RequestParam(value="loaiBatDongSan",required = false)Integer maLoaiBatDongSan) {
    List<GiaoDich> giaoDich;
    if(maLoaiBatDongSan != null) {
       giaoDich=giaoDichService.findAllByMaBatDongSan(maLoaiBatDongSan);}
    else{
        giaoDich=giaoDichService.getAll();
        }
   model.addAttribute("loaiBatDongSans",maLoaiBatDongSan);
  model.addAttribute("loaiBatDongSan",batDongSanService.getAll());
  model.addAttribute("giaoDichs", giaoDich);
  model.addAttribute("giaoDich", giaoDichService.getAll());
  model.addAttribute("khachHang", khachHangService.getAll());
  return "list";
}
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("giaoDich", new GiaoDich());
        model.addAttribute("khachHangs", khachHangService.getAll());
        model.addAttribute("batDongSans", batDongSanService.getAll());
        return "add";
    }

    @PostMapping("/add")
    public String addGiaoDich(@ModelAttribute("giaoDich") GiaoDich giaoDich) {
        giaoDichService.add(giaoDich);
        return "redirect:/list";
    }
}
