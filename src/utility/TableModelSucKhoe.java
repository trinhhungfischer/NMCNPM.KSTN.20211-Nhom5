package utility;

import Bean.SucKhoeBean;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hoang
 */
public class TableModelSucKhoe {
    public DefaultTableModel setTableSucKhoe(List<SucKhoeBean> listItem, String[] listColumn){
    final int columns = listColumn.length;
    DefaultTableModel dtm = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return super.isCellEditable(row, column); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            return columnIndex == 5 ? Boolean.class : String.class; //To change body of generated methods, choose Tools | Templates.
        }
    
    };
    dtm.setColumnIdentifiers(listColumn);
    Object[] obj;
    obj = new Object[columns];
    listItem.forEach((SucKhoeBean item) -> {
        obj[0] = item.getNhanKhauBean().getNhanKhauModel().getHoTen();
        obj[1] = item.getNhanKhauBean().getChungMinhThuModel().getSoCMT();
        obj[2] = item.getSucKhoeCuoi().getNgayCapNhat();
        obj[3] = item.getSucKhoeCuoi().getTrieuChungCovid();
        obj[4] = item.getSucKhoeCuoi().getTrangThaiSucKhoe();
        dtm.addRow(obj);
    });
    return dtm;
    }
}
