/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import Bean.SucKhoeBean;
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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import services.SucKhoeService;
import utility.TableModelSucKhoe;
import views.infoViews.InfoJframe;

/**
 *
 * @author Hoang
 */
public class SucKhoeManagerPanelController {
    private JPanel jpnView;
    private JTextField jtfSearch;
    private JTextField jtfsoLuong;
    private SucKhoeService sucKhoeService;
    private List<SucKhoeBean> listSucKhoeBeans;
    private TableModelSucKhoe tableModelSucKhoe;
    private final String[] COLUMNS = {"Họ tên", "Số CCCD", "Ngày cập nhật", "Triệu chứng Covid", "Tình trạng sức khỏe"};
    private JFrame parentJFrame;
    
    public SucKhoeManagerPanelController(JPanel jpnView, JTextField jtfSearch, JTextField jtfSoLuong){
        this.jpnView = jpnView;
        this.jtfSearch = jtfSearch;
        this.jtfsoLuong = jtfSoLuong;
        tableModelSucKhoe = new TableModelSucKhoe();
        this.sucKhoeService = new SucKhoeService();
        this.listSucKhoeBeans = this.sucKhoeService.getListSucKhoe();
        setSoLuong();
        initAction();
    }

    public SucKhoeManagerPanelController() {
    }
    public void setSoLuong(){
        this.jtfsoLuong.setText("" + listSucKhoeBeans.size());
    }
    public void initAction(){
        this.jtfSearch.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                String key = jtfSearch.getText();
                listSucKhoeBeans = sucKhoeService.search(key.trim());
                setSoLuong();
                setDataTable();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String key = jtfSearch.getText();
                listSucKhoeBeans = sucKhoeService.search(key.trim());
                setSoLuong();
                setDataTable();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                String key = jtfSearch.getText();
                listSucKhoeBeans = sucKhoeService.search(key.trim());
                setSoLuong();
                setDataTable();
            }
        });
    }
    
    public void setDataTable(){
        DefaultTableModel model = tableModelSucKhoe.setTableSucKhoe(listSucKhoeBeans, COLUMNS);
        JTable table = new JTable(model){
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
//        table.getColumnModel().getColumn(0).setMaxWidth(80);
//        table.getColumnModel().getColumn(0).setMinWidth(80);
//        table.getColumnModel().getColumn(0).setPreferredWidth(80);
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                JOptionPane.showConfirmDialog(null, table.getSelectedRow());
                if (e.getClickCount() > 1) {
                    SucKhoeBean temp = listSucKhoeBeans.get(table.getSelectedRow());
                    SucKhoeBean info = sucKhoeService.getSucKhoeBean(temp.getNhanKhauBean().getNhanKhauModel().getID());
                    InfoJframe infoJframe = new InfoJframe(info.toString(), parentJFrame);
                    infoJframe.setLocationRelativeTo(null);
                    infoJframe.setVisible(true);
                }
            }
            
        });
        
        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);
        scroll.setPreferredSize(new Dimension(1300, 290));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scroll);
        jpnView.validate();
        jpnView.repaint();
        
    }
    
    public void statistic(String tuNgay, String denNgay, String trieuChung, String tinhTrangSucKhoe){
            listSucKhoeBeans = sucKhoeService.statisticSucKhoe(tuNgay, denNgay, trieuChung, tinhTrangSucKhoe);
            setDataTable();
            setSoLuong();
    }
    public JPanel getJpnView() {
        return jpnView;
    }

    public void setJpnView(JPanel jpnView) {
        this.jpnView = jpnView;
    }

    public JTextField getJtfSearch() {
        return jtfSearch;
    }

    public void setJtfSearch(JTextField jtfSearch) {
        this.jtfSearch = jtfSearch;
    }

    public JTextField getJtfsoLuong() {
        return jtfsoLuong;
    }

    public void setJtfsoLuong(JTextField jtfsoLuong) {
        this.jtfsoLuong = jtfsoLuong;
    }

    public SucKhoeService getSucKhoeService() {
        return sucKhoeService;
    }

    public void setSucKhoeService(SucKhoeService sucKhoeService) {
        this.sucKhoeService = sucKhoeService;
    }

    public List<SucKhoeBean> getListSucKhoeBeans() {
        return listSucKhoeBeans;
    }

    public void setListSucKhoeBeans(List<SucKhoeBean> listSucKhoeBeans) {
        this.listSucKhoeBeans = listSucKhoeBeans;
    }

    public TableModelSucKhoe getTableModelSucKhoe() {
        return tableModelSucKhoe;
    }

    public void setTableModelSucKhoe(TableModelSucKhoe tableModelSucKhoe) {
        this.tableModelSucKhoe = tableModelSucKhoe;
    }

    public JFrame getParentJFrame() {
        return parentJFrame;
    }

    public void setParentJFrame(JFrame parentJFrame) {
        this.parentJFrame = parentJFrame;
    }
    
}
