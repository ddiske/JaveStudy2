package com.root.app.utils.collections.test;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		
		Medic medic = new Medic();
		Marine marine = new Marine();
		Marine marine2 = new Marine();
		Wraith wraith = new Wraith();
		
		
		// <? extends GroundUnit>
		// <? super GroundUnit>
		
		
		ArrayList<Marine> ar = new ArrayList<>();
		ar.add(marine);
		ar.add(marine2);
		
		ArrayList<GroundUnit> ar2 = new ArrayList<>();
		ar2.add(marine2);
		ar2.add(medic);
		
		UnitView view = new UnitView();
		
		view.view(ar);
		view.view(ar2);
		
//		view.view2(ar);
		view.view2(ar2);
		

	}

}
