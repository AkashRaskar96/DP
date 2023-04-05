package com.aakash.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.aakash.sdp.Printer;
import com.aakash.sdp.PrinterEnum;

public class SingletonClassTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Printer printer = Printer.getInstance();
        System.out.println(printer.hashCode());
        
        
        printer = Printer.getInstance();
        System.out.println(printer.hashCode());
        
        
        
        
       /*
        
        Constructor[] constructors = PrinterEnum.class.getDeclaredConstructors();
        
        for (Constructor constructor : constructors) {
            // Below code will destroy the singleton
            // pattern
            constructor.setAccessible(true);
            printer
                = (Printer)constructor.newInstance();
            break;
        }
        
        
        System.out.println(printer.hashCode());
        
        
       
       
       */
        
        
        PrinterEnum printerEnum = PrinterEnum.getInstance();
        printerEnum.print("Ajay");
        Constructor[] constructors = PrinterEnum.class.getDeclaredConstructors();
        
        for (Constructor constructor : constructors) {
            // Below code will destroy the singleton
            // pattern
            constructor.setAccessible(true);
            printerEnum
                = (PrinterEnum)constructor.newInstance();
            break;
        }
        
        
        System.out.println(printerEnum.hashCode());
        
        
        
        
        
	}
}
