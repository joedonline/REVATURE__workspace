package com.revature.infra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.infra.beans.Cabin;
import com.revature.infra.beans.ComponentCabin;
import com.revature.infra.beans.House;
//import com.revature.infra.beans.WaterTower;


public class Driver {

	public static void main(String[] args) {
		
		/*
		WaterTower wt = new WaterTower();
		wt.setResource("water");
		House rileysHouse = new House();
		rileysHouse.setName("Riley's House");
		rileysHouse.setWaterTower(wt);
		
		rileysHouse.checkStatus();
		*/
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		//ApplicationContext ac = new ClassPathXmlApplicationContext("/infra/src/test/java/main/resources/beans.xml");
		
		//WaterTower wtBean = (WaterTower) ac.getBean("waterTower");
		// another option
		//WaterTower wtBeanOption = ac.getBean(WaterTower.class);
		
		//System.out.println(wtBean == wtBeanOption); // should be 'true' because it's in singleton scope
		//System.out.println(wtBean.getResource());
		
		House rileysHouse = ac.getBean("house", House.class);
		House rileysSummerHome = ac.getBean("house", House.class);
		
		rileysHouse.setName("Riley's House");
		rileysSummerHome.setName("Riley's Summer Home");
		rileysHouse.checkStatus();
		rileysSummerHome.checkStatus();
		
		Cabin rileysCabin = ac.getBean("cabin", Cabin.class);
		Cabin rileysSummerCabin = ac.getBean("cabin", Cabin.class);
		
		rileysCabin.setName("Riley's Cabin");
		rileysSummerCabin.setName("Riley's Summer Cabin");
		
		rileysCabin.checkStatus();
		rileysSummerCabin.checkStatus();
		
		ComponentCabin rileysComponentCabin = ac.getBean(ComponentCabin.class);
		rileysComponentCabin.setName("Riley's Component Cabin");
		rileysComponentCabin.checkStatus();
		
		//to close we need to cast
		((ConfigurableApplicationContext) ac).close();
		
	}

}
