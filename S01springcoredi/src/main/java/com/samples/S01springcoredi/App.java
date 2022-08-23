package com.samples.S01springcoredi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.S01springcoredi.Employee;



public class App 
{
    public static void main( String[] args )
    {
      // ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S01springcoredi/SpringConfig.xml");
       
      // Employee emp = (Employee) springContainer.getBean("emp"); 
       //System.out.println(emp);
      // Hospital hosp= (Hospital) springContainer.getBean("hosp");
       //System.out.println(hosp);
       //CarDealer cd=(CarDealer) springContainer.getBean("cd");
       //System.out.println(cd);
       //Customer ctm=(Customer) springContainer.getBean("ctm");
       //System.out.println(ctm);
    	 //ShoppingCart shoppingcart=(ShoppingCart) springContainer.getBean("shoppingcart");
        // System.out.println(shoppingcart);
//    	AbstractApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S01springcoredi/SpringConfig.xml");
        
//       Patient patient=(Patient) springContainer.getBean("patient");
//       System.out.println(patient);
    //   springContainer.registerShutdownHook();
    	ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S01springcoredi/SpringConfig.xml");
        
        Employee emp = (Employee) springContainer.getBean("emp"); 
        System.out.println(emp);
    }
}