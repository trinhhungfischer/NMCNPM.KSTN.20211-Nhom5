/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import Bean.XetNghiemBean;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.EventObject;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import services.HoKhauService;
import utility.TableModelXetNghiem;
import views.infoViews.InfoJframe;

/**
 *
 * @author Admin
 */
public class XetNghiemPanelController {
    private JFrame parentJFrame;
    private List<XetNghiemBean> list;

    public void setParentJFrame(JFrame parentJFrame) {
        this.parentJFrame = parentJFrame;
    }
    private JTextField searchJtf;
    private JPanel tableJpn;
    
    // TODO: Sửa hộ khẩu service đi nha
    private final HoKhauService hoKhauService = new HoKhauService();
    private final TableModelXetNghiem tableModelXetNghiem = new TableModelXetNghiem();
    
    //TODO: Set các column ở đây nha dựa theo cái bean mà mn chọn đó
    private final String COLUNMS[] = {"", "", ""}; 

    public XetNghiemPanelController(JTextField searchJtf, JPanel tableJpn) {
        this.searchJtf = searchJtf;
        this.tableJpn = tableJpn;
    }
    
    
    
    
    public void setData() {
//        TODO: Xóa dòng commnet dưới sau khi thêm trường vào table
        DefaultTableModel model = tableModelXetNghiem.setTableXetNghiem(list, COLUNMS);

        JTable table = new JTable(model) {
            @Override
            public boolean editCellAt(int row, int column, EventObject e) {
                return false;
            }

        };
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();
        table.setFont(new Font("Arial", Font.PLAIN, 14));
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() > 1) {
                    XetNghiemBean temp = list.get(table.getSelectedRow());
                    InfoJframe infoJframe = new InfoJframe(temp.toString(), parentJFrame);
                    infoJframe.setLocationRelativeTo(null);
                    infoJframe.setVisible(true);
                }
            }

        });

        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);
        tableJpn.removeAll();
        tableJpn.setLayout(new BorderLayout());
        tableJpn.add(scroll);
        tableJpn.validate();
        tableJpn.repaint();
    }

}
