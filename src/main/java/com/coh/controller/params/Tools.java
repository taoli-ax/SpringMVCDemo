package com.coh.controller.params;

import com.coh.pojo.Cup;

import java.lang.reflect.Field;
import java.util.Map;

public class Tools {

    public static Object map2Object(Map<String, String[]> params, Class<?> ObjectClass) throws Exception {
        Object object=ObjectClass.newInstance();
        System.out.println("run in tools");
        for(Map.Entry<String,String[]> entry:params.entrySet()){
            String key=entry.getKey();
            String[] value=entry.getValue();
            System.out.println("key :"+key+"value:"+value);
            Field field=ObjectClass.getDeclaredField(key);
            System.out.println("field:"+field);
            field.setAccessible(true);
            if(field.getType()==String.class){
                field.set(object,value[0]);
            }else if(field.getType()==int.class||field.getType()== Integer.class){
                field.set(object,Integer.parseInt(value[0]));
            }


        }
        return object;

    }
}
