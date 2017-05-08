/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.auxiliar;

import java.nio.ByteBuffer;
import java.util.UUID;

/**
 *
 * @author Thiago
 */
public class Codemaker {

    public static String getCodigo() {
        //Date date = new Date();
        //String codigo;
        
        //codigo = Long.toString(date.getTime());
       // codigo = codigo.substring(6);
       // return Integer.parseInt(codigo);
        String codigo = UUID.randomUUID().toString();
        long l = ByteBuffer.wrap(codigo.toString().getBytes()).getLong();
         return Long.toString(l, Character.MAX_RADIX);
        
    }
}
