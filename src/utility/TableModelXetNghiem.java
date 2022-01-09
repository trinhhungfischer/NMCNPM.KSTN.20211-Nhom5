package utility;

import Bean.XetNghiemBean;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Hai
 */
public class TableModelXetNghiem {
    
    public DefaultTableModel setTableXetNghiem(List<XetNghiemBean> listItem){
        String[] listColumn={"Nhân khẩu ID","Tên nhân khẩu","Ngày xét nghiệm","Nơi xét nghiệm",
            "Hình thức","Kết quả"};
        DateString dateString =new DateString();
        final int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel()  {
            @Override
            public boolean isCellEditable(int row, int column) {
                return super.isCellEditable(row, column); //To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 6 ? Boolean.class : String.class;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        obj = new Object[columns];
        listItem.forEach((XetNghiemBean item) -> {  
            obj[0]= item.getXetNghiemModel().getNhanKhauID();
            obj[1]= item.getNhanKhauModel().getHoTen();
            obj[2]= dateString.dateToString(item.getListXetNghiemModels().get(0).getNgayXetNghiem());
            obj[3]= item.getListXetNghiemModels().get(0).getNoiXetNghiem();
            obj[4]= item.getListXetNghiemModels().get(0).getHinhThucXetNghiem();
            obj[5]= item.getListXetNghiemModels().get(0).getKetQuaXetNghiem();
            
            dtm.addRow(obj);
        });
        return dtm;
    }
    

}
