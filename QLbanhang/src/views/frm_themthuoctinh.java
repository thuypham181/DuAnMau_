/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package views;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.ChatLieu;
import models.CoAo;
import models.DanhMucSP;
import models.KichCo;
import models.MauSac;
import models.NSX;
import models.PhongCach;
import models.ThuongHieu;
import services.IChatLieuServices;
import services.ICoAoServices;
import services.IDanhMucSPServices;
import services.IKichCoServices;
import services.IMauSacServices;
import services.INSXServices;
import services.IPhongCachServices;
import services.IThuongHieuServices;
import services.imp.ChatLieuServices;
import services.imp.CoAoServices;
import services.imp.DanhMucSPServices;
import services.imp.KichCoServices;
import services.imp.MauSacServices;
import services.imp.NSXServices;
import services.imp.PhongCachServices;
import services.imp.ThuongHieuServices;
import viewmodels.Objecttt;

/**
 *
 * @author hungh
 */
public class frm_themthuoctinh extends javax.swing.JDialog {

    private INSXServices iNSXServices;
    private IMauSacServices iMauSacServices;
    private IDanhMucSPServices iDanhMucSPServices;
    private IKichCoServices iKichCoServices;
    private IChatLieuServices iChatLieuServices;
    private IThuongHieuServices iThuongHieuServices;
    private IPhongCachServices iPhongCachServices;
    private ICoAoServices iCoAoServices;

    public frm_themthuoctinh(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        iChatLieuServices = new ChatLieuServices();
        iDanhMucSPServices = new DanhMucSPServices();
        iKichCoServices = new KichCoServices();
        iMauSacServices = new MauSacServices();
        iNSXServices = new NSXServices();
        iThuongHieuServices = new ThuongHieuServices();
        iCoAoServices = new CoAoServices();
        iPhongCachServices = new PhongCachServices();
        initComponents();
        setLocationRelativeTo(null);
        inittable();
        rdoChatlieu.setSelected(true);
        loadtablechatlieu();

    }
    int xx;
    int yy;

    private void inittable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setColumnCount(0);
        model.addColumn("ID");
        model.addColumn("Tên");
    }
    private void loadtablecoao() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (CoAo x : iCoAoServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }
        private void loadtablephongcach() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (PhongCach x : iPhongCachServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }
    private void loadtablechatlieu() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (ChatLieu x : iChatLieuServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }

    private void loadtablensx() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (NSX x : iNSXServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }

    private void loadtablemausac() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (MauSac x : iMauSacServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }

    private void loadtablesize() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (KichCo x : iKichCoServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }

    private void loadtabledanhmuc() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (DanhMucSP x : iDanhMucSPServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }

    private void loadtablethuonghieu() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (ThuongHieu x : iThuongHieuServices.getAll()) {
            model.addRow(new Object[]{x.getId(), x.getTen()});
        }
    }

    private Objecttt getdatdtb(int row) {
        if (row == -1) {
            return null;
        }
        int id = (int) jTable1.getValueAt(row, 0);
        String ten = (String) jTable1.getValueAt(row, 1);
        return new Objecttt(id, ten);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelGradiente1 = new swing.PanelGradiente();
        panelBorder1 = new swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        panelBorder3 = new swing.PanelBorder();
        rdoThuonghieu = new javax.swing.JRadioButton();
        rdoChatlieu = new javax.swing.JRadioButton();
        rdoNSX = new javax.swing.JRadioButton();
        rdoMausac = new javax.swing.JRadioButton();
        rdoSize = new javax.swing.JRadioButton();
        rdodanhmuc = new javax.swing.JRadioButton();
        rdoCoAo = new javax.swing.JRadioButton();
        rdoPhongCach = new javax.swing.JRadioButton();
        panelBorder4 = new swing.PanelBorder();
        jTextField1 = new javax.swing.JTextField();
        btn_them = new swing.MyButton();
        btn_xoa = new swing.MyButton();
        btn_LamMoi = new swing.MyButton();
        Btn_capNhat = new swing.MyButton();
        panelBorder2 = new swing.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelBorder5 = new swing.PanelBorder();
        searchText1 = new swing.SearchText();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm thuộc tính phụ");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);

        panelGradiente1.setColorPrimario(new java.awt.Color(204, 255, 255));

        panelBorder1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText(" Nhập Tên");
        panelBorder1.add(jLabel1);
        jLabel1.setBounds(60, 60, 250, 30);

        panelBorder3.setBackground(new java.awt.Color(255, 255, 255));

        rdoThuonghieu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoThuonghieu);
        rdoThuonghieu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoThuonghieu.setText("Thương hiệu");
        rdoThuonghieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoThuonghieuActionPerformed(evt);
            }
        });
        panelBorder3.add(rdoThuonghieu);
        rdoThuonghieu.setBounds(250, 100, 110, 40);

        rdoChatlieu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoChatlieu);
        rdoChatlieu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoChatlieu.setText("Chất liệu");
        rdoChatlieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChatlieuActionPerformed(evt);
            }
        });
        panelBorder3.add(rdoChatlieu);
        rdoChatlieu.setBounds(20, 30, 110, 40);

        rdoNSX.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNSX);
        rdoNSX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoNSX.setText("Nhà sản xuất");
        rdoNSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNSXActionPerformed(evt);
            }
        });
        panelBorder3.add(rdoNSX);
        rdoNSX.setBounds(370, 30, 110, 40);

        rdoMausac.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoMausac);
        rdoMausac.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoMausac.setText("Màu sắc");
        rdoMausac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMausacActionPerformed(evt);
            }
        });
        panelBorder3.add(rdoMausac);
        rdoMausac.setBounds(140, 30, 110, 40);

        rdoSize.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoSize);
        rdoSize.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoSize.setText("Size");
        rdoSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoSizeActionPerformed(evt);
            }
        });
        panelBorder3.add(rdoSize);
        rdoSize.setBounds(30, 100, 110, 40);

        rdodanhmuc.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdodanhmuc);
        rdodanhmuc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdodanhmuc.setText("Danh mục");
        rdodanhmuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdodanhmucActionPerformed(evt);
            }
        });
        panelBorder3.add(rdodanhmuc);
        rdodanhmuc.setBounds(140, 100, 110, 40);

        rdoCoAo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoCoAo);
        rdoCoAo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoCoAo.setText("Cổ Áo");
        rdoCoAo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCoAoActionPerformed(evt);
            }
        });
        panelBorder3.add(rdoCoAo);
        rdoCoAo.setBounds(370, 100, 110, 40);

        rdoPhongCach.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoPhongCach);
        rdoPhongCach.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoPhongCach.setText("Phong Cách");
        rdoPhongCach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoPhongCachActionPerformed(evt);
            }
        });
        panelBorder3.add(rdoPhongCach);
        rdoPhongCach.setBounds(260, 30, 110, 40);

        panelBorder1.add(panelBorder3);
        panelBorder3.setBounds(350, 20, 490, 170);

        panelBorder4.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setBorder(null);
        panelBorder4.add(jTextField1);
        jTextField1.setBounds(10, 0, 230, 50);

        panelBorder1.add(panelBorder4);
        panelBorder4.setBounds(60, 90, 250, 50);

        btn_them.setBackground(new java.awt.Color(125, 224, 237));
        btn_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btn_them.setText("Thêm");
        btn_them.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_them);
        btn_them.setBounds(1010, 50, 120, 31);

        btn_xoa.setBackground(new java.awt.Color(125, 224, 237));
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tay.png"))); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_xoa);
        btn_xoa.setBounds(1010, 130, 120, 31);

        btn_LamMoi.setBackground(new java.awt.Color(125, 224, 237));
        btn_LamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        btn_LamMoi.setText("Làm Mới");
        btn_LamMoi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamMoiActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_LamMoi);
        btn_LamMoi.setBounds(860, 50, 120, 31);

        Btn_capNhat.setBackground(new java.awt.Color(125, 224, 237));
        Btn_capNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/floppy-disk.png"))); // NOI18N
        Btn_capNhat.setText("Cập nhật");
        Btn_capNhat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_capNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_capNhatActionPerformed(evt);
            }
        });
        panelBorder1.add(Btn_capNhat);
        Btn_capNhat.setBounds(860, 130, 120, 31);

        panelGradiente1.add(panelBorder1);
        panelBorder1.setBounds(10, 50, 1160, 230);

        panelBorder2.setBackground(new java.awt.Color(204, 204, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(204, 204, 255));
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        panelBorder2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 60, 1160, 250);

        panelBorder5.setBackground(new java.awt.Color(255, 255, 255));

        searchText1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelBorder5.add(searchText1);
        searchText1.setBounds(10, 0, 240, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_24px.png"))); // NOI18N
        panelBorder5.add(jLabel2);
        jLabel2.setBounds(264, 0, 40, 50);

        panelBorder2.add(panelBorder5);
        panelBorder5.setBounds(790, 10, 300, 50);

        panelGradiente1.add(panelBorder2);
        panelBorder2.setBounds(10, 300, 1160, 340);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        panelGradiente1.add(jLabel3);
        jLabel3.setBounds(1140, 0, 40, 40);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelGradiente1.add(jPanel1);
        jPanel1.setBounds(0, 0, 1130, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 1178, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
        clearfrom();
        if (rdoChatlieu.isSelected() == true) {
            loadtablechatlieu();
        } else if (rdoNSX.isSelected() == true) {
            loadtablensx();
        } else if (rdoMausac.isSelected() == true) {
            loadtablemausac();
        } else if (rdoSize.isSelected() == true) {
            loadtablesize();
        } else if (rdodanhmuc.isSelected() == true) {
            loadtabledanhmuc();
        } else if (rdoThuonghieu.isSelected() == true) {
            loadtablethuonghieu();
        }else if (rdoCoAo.isSelected() == true) {
            loadtablecoao();
        }else if (rdoPhongCach.isSelected() == true) {
            loadtablephongcach();
        }
    }//GEN-LAST:event_btn_LamMoiActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        if (getdatafrom() == null) {

            return;
        }
        if (rdoChatlieu.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iChatLieuServices.Add(getdatafrom()));
            loadtablechatlieu();
        } else if (rdoNSX.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iNSXServices.Add(getdatafrom()));
            loadtablensx();
        } else if (rdoMausac.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iMauSacServices.Add(getdatafrom()));
            loadtablemausac();
        } else if (rdoSize.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iKichCoServices.Add(getdatafrom()));
            loadtablesize();
        } else if (rdodanhmuc.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iDanhMucSPServices.Add(getdatafrom()));
            loadtabledanhmuc();
        } else if (rdoThuonghieu.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iThuongHieuServices.Add(getdatafrom()));
            loadtablethuonghieu();
        }else if (rdoCoAo.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iCoAoServices.Add(getdatafrom()));
            loadtablecoao();
        }else if (rdoPhongCach.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iPhongCachServices.Add(getdatafrom()));
            loadtablephongcach();
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void Btn_capNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_capNhatActionPerformed
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Bạn cần chọn 1 dòng để sửa");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn sửa không")!= JOptionPane.YES_OPTION) {
            return;
        }
        int id = (int) jTable1.getValueAt(row, 0);
        if (rdoChatlieu.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iChatLieuServices.Update(getdatafrom(), id));
            loadtablechatlieu();
        } else if (rdoNSX.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iNSXServices.Update(getdatafrom(), id));
            loadtablensx();
        } else if (rdoMausac.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iMauSacServices.Update(getdatafrom(), id));
            loadtablemausac();
        } else if (rdoSize.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iKichCoServices.Update(getdatafrom(), id));
            loadtablesize();
        } else if (rdodanhmuc.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iDanhMucSPServices.Update(getdatafrom(), id));
            loadtabledanhmuc();
        } else if (rdoThuonghieu.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iThuongHieuServices.Update(getdatafrom(), id));
            loadtablethuonghieu();
        }else if (rdoCoAo.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iCoAoServices.Update(getdatafrom(), id));
            loadtablecoao();
        }else if (rdoPhongCach.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iPhongCachServices.Update(getdatafrom(), id));
            loadtablephongcach();
        }
    }//GEN-LAST:event_Btn_capNhatActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "chọn 1 dòng để xóa");
            return;
        }
        int id = (int) jTable1.getValueAt(row, 0);
        if (rdoChatlieu.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iChatLieuServices.Delete(id));
            loadtablechatlieu();
        } else if (rdoNSX.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iNSXServices.Delete(id));
            loadtablensx();
        } else if (rdoMausac.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iMauSacServices.Delete(id));
            loadtablemausac();
        } else if (rdoSize.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iKichCoServices.Delete(id));
            loadtablesize();
        } else if (rdodanhmuc.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iDanhMucSPServices.Delete(id));
            loadtabledanhmuc();
        } else if (rdoThuonghieu.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iThuongHieuServices.Delete(id));
            loadtablethuonghieu();
        }else if (rdoCoAo.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iCoAoServices.Delete(id));
            loadtablecoao();
        }else if (rdoPhongCach.isSelected() == true) {
            JOptionPane.showMessageDialog(this, iPhongCachServices.Delete(id));
            loadtablephongcach();
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void rdoChatlieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChatlieuActionPerformed
        if (rdoChatlieu.isSelected() == true) {
            loadtablechatlieu();
        }
    }//GEN-LAST:event_rdoChatlieuActionPerformed

    private void rdoNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNSXActionPerformed
        if (rdoNSX.isSelected() == true) {
            loadtablensx();
        }
    }//GEN-LAST:event_rdoNSXActionPerformed

    private void rdoMausacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMausacActionPerformed
        if (rdoMausac.isSelected() == true) {
            loadtablemausac();
        }
    }//GEN-LAST:event_rdoMausacActionPerformed

    private void rdoSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoSizeActionPerformed
        if (rdoSize.isSelected() == true) {
            loadtablesize();
        }
    }//GEN-LAST:event_rdoSizeActionPerformed

    private void rdodanhmucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdodanhmucActionPerformed
        if (rdodanhmuc.isSelected() == true) {
            loadtabledanhmuc();
        }
    }//GEN-LAST:event_rdodanhmucActionPerformed

    private void rdoThuonghieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoThuonghieuActionPerformed
        if (rdoThuonghieu.isSelected() == true) {
            loadtablethuonghieu();
        }
    }//GEN-LAST:event_rdoThuonghieuActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            return;
        }
        Objecttt x = getdatdtb(row);
        jTextField1.setText(x.getTen());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        new frm_Sanpham().initcbo();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void rdoCoAoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCoAoActionPerformed
          if (rdoCoAo.isSelected() == true) {
            loadtablecoao();
        }
    }//GEN-LAST:event_rdoCoAoActionPerformed

    private void rdoPhongCachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoPhongCachActionPerformed
           if (rdoPhongCach.isSelected() == true) {
            loadtablephongcach();
        }
    }//GEN-LAST:event_rdoPhongCachActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton Btn_capNhat;
    private swing.MyButton btn_LamMoi;
    private swing.MyButton btn_them;
    private swing.MyButton btn_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorder panelBorder2;
    private swing.PanelBorder panelBorder3;
    private swing.PanelBorder panelBorder4;
    private swing.PanelBorder panelBorder5;
    private swing.PanelGradiente panelGradiente1;
    private javax.swing.JRadioButton rdoChatlieu;
    private javax.swing.JRadioButton rdoCoAo;
    private javax.swing.JRadioButton rdoMausac;
    private javax.swing.JRadioButton rdoNSX;
    private javax.swing.JRadioButton rdoPhongCach;
    private javax.swing.JRadioButton rdoSize;
    private javax.swing.JRadioButton rdoThuonghieu;
    private javax.swing.JRadioButton rdodanhmuc;
    private swing.SearchText searchText1;
    // End of variables declaration//GEN-END:variables

    private Objecttt getdatafrom() {
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, " Bạn chưa nhập tên thuộc tính!");
            jTextField1.requestFocus();
            return null;
        }

        return new Objecttt(0, jTextField1.getText());

    }

    private void clearfrom() {
        jTextField1.setText("");
    }
}
