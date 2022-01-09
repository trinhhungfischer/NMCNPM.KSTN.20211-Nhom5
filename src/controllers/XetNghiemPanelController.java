package controllers;

import Bean.XetNghiemBean;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
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
import models.NhanKhauModel;
import services.XetNghiemService;
import utility.TableModelXetNghiem;
import views.infoViews.InfoJframe;

/**
 *
 * @author Hoang
 */
public class XetNghiemPanelController {
    private JPanel jpnView;
    private JTextField jtfsoLuong;
    private XetNghiemService xetNghiemService;
    private List<XetNghiemBean> listXetNghiemBeans;
    private TableModelXetNghiem tableModelXetNghiem;
    private JFrame parentJFrame;
    
    public XetNghiemPanelController(JPanel jpnView, JTextField jtfSoLuong){
        this.jpnView = jpnView;
        this.jtfsoLuong = jtfSoLuong;
        tableModelXetNghiem = new TableModelXetNghiem();
        this.xetNghiemService = new XetNghiemService();
        this.listXetNghiemBeans = this.xetNghiemService.getListXetNghiem();
        setSoLuong();
        setDataTable();

    }

    public XetNghiemPanelController() {
    }
    public void setSoLuong(){
        this.jtfsoLuong.setText("" + listXetNghiemBeans.size());
    }
    
    public void setDataTable(){
        DefaultTableModel model = tableModelXetNghiem.setTableXetNghiem(listXetNghiemBeans);
        JTable table = new JTable(model){
            @Override
            public boolean editCellAt(int row, int column, EventObject e) {
                return false;
            }
            
        };
        
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(40);
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
//                System.out.println(table.getSelectedRow());
                if (e.getClickCount() > 1) {
//                    System.out.println(table.getSelectedRow());
                    chiTiet(table.getSelectedRow());
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
    
    public void thongke(List<Boolean> boolCheckbox, List<Date> date,List<String> hinhthuc,List<String> ketqua){
        this.listXetNghiemBeans = this.xetNghiemService.thongKeListXetNghiem(boolCheckbox, date, hinhthuc, ketqua);
        setSoLuong();
        setDataTable();        
    }
    
    public void chiTiet(int i){
        XetNghiemBean temp = listXetNghiemBeans.get(i);
        XetNghiemBean info = xetNghiemService.getXetNghiem(temp.getNhanKhauModel().getID());
        InfoJframe infoJframe = new InfoJframe(info.toString(), parentJFrame);
        infoJframe.setLocationRelativeTo(null);
        infoJframe.setVisible(true);
    }
    public void timkiem(String field,String value){
        this.listXetNghiemBeans = this.xetNghiemService.findListXetNghiem(field, value);
        setSoLuong();
        setDataTable();
    }
    
    public void reset(){
        this.listXetNghiemBeans = this.xetNghiemService.getListXetNghiem();
        setSoLuong();
        setDataTable();
    }
    
    public JPanel getJpnView() {
        return jpnView;
    }

    public void setJpnView(JPanel jpnView) {
        this.jpnView = jpnView;
    }

    public JTextField getJtfsoLuong() {
        return jtfsoLuong;
    }

    public void setJtfsoLuong(JTextField jtfsoLuong) {
        this.jtfsoLuong = jtfsoLuong;
    }

    public XetNghiemService getXetNghiemService() {
        return xetNghiemService;
    }

    public void setCachLyService(XetNghiemService xetNghiemService) {
        this.xetNghiemService = xetNghiemService;
    }

    public List<XetNghiemBean> getListXetNghiemBeans() {
        return listXetNghiemBeans;
    }

    public void setListXetNghiemBeans(List<XetNghiemBean> listXetNghiemBeans) {
        this.listXetNghiemBeans = listXetNghiemBeans;
    }

    public TableModelXetNghiem getTableModelXetNghiem() {
        return tableModelXetNghiem;
    }

    public void setTableModelXetNghiem(TableModelXetNghiem tableModelXetNghiem) {
        this.tableModelXetNghiem = tableModelXetNghiem;
    }

    public JFrame getParentJFrame() {
        return parentJFrame;
    }

    public void setParentJFrame(JFrame parentJFrame) {
        this.parentJFrame = parentJFrame;
    }
    
}
