package com.lei.ioc;

import com.sun.xml.internal.bind.v2.runtime.output.NamespaceContextImpl;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.SAXException;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ClassPathXmlApplicationContext implements  ApplicationContext{
    private Map<String,Object> ioc=new HashMap<>();
    public ClassPathXmlApplicationContext(String path){

        try {
            SAXReader reader=new SAXReader();
            Document document=reader.read("./src/main/resources/"+path);
            Element root=document.getRootElement();
            //System.out.println(root);
            Iterator<Element> iterator=root.elementIterator();
            while(iterator.hasNext()){
                Element element=iterator.next();
                //System.out.println(element);

                 String id=element.attributeValue("id");
                 String className=element.attributeValue("class");


                 /*通过反射机制获取对象*/
                Class clss=Class.forName(className);
                Constructor constructor= clss.getConstructor();
                Object object=constructor.newInstance();
                /*给目标对象赋值*/
                Iterator<Element> iterator1=element.elementIterator();
                while(iterator1.hasNext()){

                    Element property=iterator1.next();
                    String name=property.attributeValue("name");
                    String value=property.attributeValue("value");
                    String ref=property.attributeValue("ref");
                    if(ref==null){
                        String methodName="set"+name.substring(0,1).toUpperCase()+name.substring(1);
                        Field field=clss.getDeclaredField(name);
                        Method method=clss.getDeclaredMethod(methodName,field.getType());
                        /*根据成员变量的类型将value进行转换*/
                        Object FinalValue=null;
                        if(field.getType().getName()=="long"){
                            FinalValue=Long.parseLong(value);

                        }
                        if(field.getType().getName()=="java.lang.String"){

                            FinalValue=value;
                        }
                        if(field.getType().getName()=="int"){

                            FinalValue=Integer.parseInt(value);
                        }
                        method.invoke(object,FinalValue);

                    }
                    ioc.put(id,object);


                }

                System.out.println(ioc);


            }
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Object getBean(String id) {
        return ioc.get(id);
    }
}
