package com.atguigu.builder.improve;

public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		house.setBaise("高楼打地基5米");
		// TODO Auto-generated method stub
		System.out.println(" 高楼的打地基100米 ");
	}

	@Override
	public void buildWalls() {
		house.setWall("高楼的砌墙20cm");
		// TODO Auto-generated method stub
		System.out.println(" 高楼的砌墙20cm ");
	}

	@Override
	public void roofed() {
		house.setRoofed("高楼的透明屋顶");
		// TODO Auto-generated method stub
		System.out.println(" 高楼的透明屋顶 ");
	}

}
