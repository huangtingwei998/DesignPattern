package com.atguigu.builder.improve;

public class CommonHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		house.setBaise("��ͨ���Ӵ�ػ�5��");
		// TODO Auto-generated method stub
		System.out.println(" ��ͨ���Ӵ�ػ�5�� ");
	}

	@Override
	public void buildWalls() {
		house.setWall("��ͨ������ǽ10cm");
		// TODO Auto-generated method stub
		System.out.println(" ��ͨ������ǽ10cm ");
	}

	@Override
	public void roofed() {
		house.setRoofed("��ͨ�����ݶ�");
		// TODO Auto-generated method stub
		System.out.println(" ��ͨ�����ݶ� ");
	}

}
