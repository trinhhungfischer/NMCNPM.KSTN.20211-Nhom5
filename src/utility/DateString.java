/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author TGDD
 */
public class DateString {
    private Calendar calendar;
    public String dateToString(Date date){
        calendar = Calendar.getInstance();
        calendar.setTime(date);
        String y=String.valueOf(calendar.get(Calendar.YEAR)),
                m=String.valueOf(calendar.get(Calendar.MONTH)+1),
                d=String.valueOf(calendar.get(Calendar.DATE));
        if(m.length()<2)m="0"+m;
        if(d.length()<2)d="0"+d;
        return y+"-"+m+"-"+d;
    }
}
