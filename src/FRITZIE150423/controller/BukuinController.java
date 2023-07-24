/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FRITZIE150423.controller;

import javax.swing.table.DefaultTableModel;
import FRITZIE150423.Model.*;
import FRITZIE150423.view.*;


public class BukuinController {
    private FormBuku formBukuin;
    private BukuinDao bukuinDao;
    private Bukuin bukuin;

    public BukuinControllerer(FormBuku formBukuin){
        this.formBukuin = formBukuin;
        bukuinDao = new BukuinDaoImpl();
    }

    public void clearForm(){
        formBukuin.getTxtKodebuku().setText("");
        formBukuin.getTxtJudul().setText("");
        formBukuin.getTxtPengarang().setText("");
        formBukuin.getTxtPenerbit().setText("");
        formBukuin.getTxtTahunterbit().setText("");
    }

    public void saveBukuin(){
        bukuin = new Bukuin();

        bukuin.setKode(formBukuin.getTxtKodebuku().getText());
        bukuin.setJudul(formBukuin.getTxtJudul().getText());
        bukuin.setPengarang(formBukuin.getTxtPengarang().getText());
        bukuin.setPenerbit(formBukuin.getTxtPenerbit().getText());
        bukuin.setTahunterbir(formBukuin.getTxtTahunterbit().getText());
        bukuinDao.save(bukuin);
        javax.swing.JOptionPane.showMessageDialog(formBukuin, "Entri ok");
    }

    public void getBukuin(){
        int index = formBukuin.getTblBukuin().getSelectedRow();
        bukuin = bukuinDao.getBukuin(index);
        if (bukuin != null){
            formBukuin.getTxtKodebuku().setText(bukuin.getKode());
            formBukuin.getTxtJudul().setText(bukuin.getJudul());
            formBukuin.getTxtPengarang().setText(bukuin.getPengarang());
            formBukuin.getTxtPenerbit().setText(bukuin.getPenerbit());
            formBukuin.getTxtTahunterbit().setText(bukuin.getTahunterbit());
        }
    }
    public void updateBukuin(){
        int index = formBukuin.getTblBukuin().getSelectedRow();
        bukuin.setKode(formBukuin.getTxtKodebuku().getText());
        bukuin.setJudul(formBukuin.getTxtJudul().getText());
        bukuin.setPengarang(formBukuin.getTxtPengarang().getText());
        bukuin.setPenerbit(formBukuin.getTxtPenerbit().getText());
        bukuin.setTahunterbir(formBukuin.getTxtTahunterbit().getText());
        bukuinDao.update(index, bukuin);
        javax.swing.JOptionPane.showMessageDialog(formBukuin, "Update ok");
    }
    public void deleteBukuin(){
        int index = formBukuin.getTblBukuin().getSelectedRow();
        bukuinDao.delete(index);
    }

    public void tampilData(){
        DefaultTableModel tableModel = (DefaultTableModel) formBukuin.getTblBukuin().getModel();
        tableModel.setRowCount(0);
        java.util.List<Bukuin> list = bukuinDao.getAll();
        for (Bukuin bukuin : list){
            Object[] data = {
                bukuin.getKode(),
                bukuin.getJudul(),
                bukuin.getPengarang(),
                bukuin.getPenerbit(),
                bukuin.getTahunterbit()
            };
            tableModel.addRow(data);
        }
    }
}
