package com.atguigu.builder.improve;

public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		house.setBaise("��¥��ػ�5��");
		// TODO Auto-generated method stub
		System.out.println(" ��¥�Ĵ�ػ�100�� ");
	}

	@Override
	public void buildWalls() {
		house.setWall("��¥����ǽ20cm");
		// TODO Auto-generated method stub
		System.out.println(" ��¥����ǽ20cm ");
	}

	@Override
	public void roofed() {
		house.setRoofed("��¥��͸���ݶ�");
		// TODO Auto-generated method stub
		System.out.println(" ��¥��͸���ݶ� ");
	}

}
