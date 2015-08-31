package com.wbqa.mytests;

import java.util.Map;

import com.wbqa.demo.MapExamples;

public class TestMapExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MapExamples ex = new MapExamples();
		Map map =ex.createMap();
		ex.printMap(map);
	}

}
