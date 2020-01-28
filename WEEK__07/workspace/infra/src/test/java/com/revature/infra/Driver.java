package com.revature.infra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.infra.beans.House;
import com.revature.infra.beans.WaterTower;

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
		
		WaterTower wtBean = (WaterTower) ac.getBean("waterTower");
		
		System.out.println(wtBean.getResource());
		
	}

}
