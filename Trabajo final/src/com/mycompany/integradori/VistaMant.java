package com.mycompany.integradori;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class VistaMant {
    Calendar fecha = new GregorianCalendar();
    
    String ano = Integer.toString(fecha.get(Calendar.YEAR));
    String mes = Integer.toString(fecha.get(Calendar.MONTH));
    String dia = Integer.toString(fecha.get(Calendar.DATE));
    
    String fechacomp = dia+"/"+mes+"/"+ano;
    
    String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String minuto = Integer.toString(fecha.get(Calendar.MINUTE));
    
    String horacomp = hora+":"+minuto;
}