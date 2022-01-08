
package controllers;

import Bean.CachLyBean;
import Bean.SucKhoeBean;
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
import services.CachLyService;
import services.SucKhoeService;
import utility.TableModelCachLy;
import views.infoViews.InfoJframe;

/**
 *
 * @author Hoang
 */
public class CachLyManagerPanelController {
    private JPanel jpnView;
    private JTextField jtfsoLuong;
    private CachLyService cachLyService;
    private List<CachLyBean> listCachLyBeans;
    private TableModelCachLy tableModelCachLy;
    private JFrame parentJFrame;
    
    public CachLyManagerPanelController(JPanel jpnView, JTextField jtfSoLuong){
        this.jpnView = jpnView;
        this.jtfsoLuong = jtfSoLuong;
        tableModelCachLy = new TableModelCachLy();
        this.cachLyService = new CachLyService();
        this.listCachLyBeans = this.cachLyService.getListCachLy();
        setSoLuong();
        setDataTable();

    }

    public CachLyManagerPanelController() {
    }
    public void setSoLuong(){
        this.jtfsoLuong.setText("" + listCachLyBeans.size());
    }
//    public void initAction(){
//        this.jtfSearch.getDocument().addDocumentListener(new DocumentListener(){
//            @Override
//            public void insertUpdate(DocumentEvent e) {
//                String key = jtfSearch.getText();
//                listSucKhoeBeans = sucKhoeService.search(key.trim());
//                setSoLuong();
//                setDataTable();
//            }
//
//            @Override
//            public void removeUpdate(DocumentEvent e) {
//                String key = jtfSearch.getText();
//                listSucKhoeBeans = sucKhoeService.search(key.trim());
//                setSoLuong();
//                setDataTable();
//            }
//
//            @Override
//            public void changedUpdate(DocumentEvent e) {
//                String key = jtfSearch.getText();
//                listSucKhoeBeans = sucKhoeService.search(key.trim());
//                setSoLuong();
//                setDataTable();
//            }
//        });
//    }
    
    public void setDataTable(){
        DefaultTableModel model = tableModelCachLy.setTableCachLy(listCachLyBeans);
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
    
    public void thongke(List<Boolean> boolCheckbox, List<Date> date,List<String> mucdo,List<String> lydo){
        this.listCachLyBeans = this.cachLyService.thongKeListCachLy(boolCheckbox, date, mucdo, lydo);
        setSoLuong();
        setDataTable();        
    }
    
    public void chiTiet(int i){
        CachLyBean temp = listCachLyBeans.get(i);
        CachLyBean info = cachLyService.getCachLy(temp.getNhanKhauModel().getID());
        InfoJframe infoJframe = new InfoJframe(info.toString(), parentJFrame);
        infoJframe.setLocationRelativeTo(null);
        infoJframe.setVisible(true);
    }
    public void timkiem(String field,String value){
        this.listCachLyBeans = this.cachLyService.findListCachLy(field, value);
        setSoLuong();
        setDataTable();
    }
    
    public void reset(){
        this.listCachLyBeans = this.cachLyService.getListCachLy();
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

    public CachLyService getCachLyService() {
        return cachLyService;
    }

    public void setCachLyService(CachLyService cachLyService) {
        this.cachLyService = cachLyService;
    }

    public List<CachLyBean> getListCachLyBeans() {
        return listCachLyBeans;
    }

    public void setListCachLyBeans(List<CachLyBean> listCachLyBeans) {
        this.listCachLyBeans = listCachLyBeans;
    }

    public TableModelCachLy getTableModelCachLy() {
        return tableModelCachLy;
    }

    public void setTableModelCachLy(TableModelCachLy tableModelCachLy) {
        this.tableModelCachLy = tableModelCachLy;
    }

    public JFrame getParentJFrame() {
        return parentJFrame;
    }

    public void setParentJFrame(JFrame parentJFrame) {
        this.parentJFrame = parentJFrame;
    }
    
}
