package utility;

import Bean.CachLyBean;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class TableModelCachLy {

    public DefaultTableModel setTableCachLy(List<CachLyBean> listItem, String[] listColumn) {
        final int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel()  {
            @Override
            public boolean isCellEditable(int row, int column) {
                return super.isCellEditable(row, column); //To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 7 ? Boolean.class : String.class;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        obj = new Object[columns];
        listItem.forEach((CachLyBean item) -> {  
            obj[0]= item.getNhanKhauModel().getID();
            obj[1]= item.getNhanKhauModel().getHoTen();
            obj[2]= item.getListCachLyModels().get(0).getNgay(0);
            obj[3]= item.getListCachLyModels().get(0).getNoiCachLy();
            obj[4]= item.getListCachLyModels().get(0).getNgay(1);
            obj[5]= item.getListCachLyModels().get(0).getMucDoCachLy();
            obj[6]= item.getListCachLyModels().get(0).getLyDoCachLy();
            dtm.addRow(obj);
        });
        return dtm;
    }
    

        // TODO: Thêm các item ở đây nha
        
        
}
