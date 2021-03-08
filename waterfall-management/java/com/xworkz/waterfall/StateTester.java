package com.xworkz.waterfall;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.waterfall.dao.StateDAO;
import com.xworkz.waterfall.dao.StateDAOImpl;
import com.xworkz.waterfall.entity.StateEntity;

public class StateTester {

	public static void main(String[] args) {
		
		StateEntity state1=new StateEntity("Karnataka", 7.3, 31, "Kannada");
		StateEntity state2=new StateEntity("Goa", 1, 5, "Konkani");
		StateEntity state3=new StateEntity("Delhi", 15.5,11, "Hindi");
		StateEntity state4=new StateEntity("Andra", 6, 14, "Telugu");
		StateEntity state5=new StateEntity("Kerala", 2.4, 8, "Malayalam");
		
		List<StateEntity> list=new ArrayList();
		list.add(state1);
		list.add(state2);
		list.add(state3);
		list.add(state4);
		list.add(state5);
		
		StateDAO dao=new StateDAOImpl();
		dao.create(list);
		

	}

}
