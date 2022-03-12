package com.atguigu.bridge;

public class myPhone extends Phone{
	public myPhone(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	//构造器
		
		
		public void open() {
			super.open();
			System.out.println(" 自己样式手机 ");
		}
		
		public void close() {
			super.close();
			System.out.println(" 自己样式手机 ");
		}
		
		public void call() {
			super.call();
			System.out.println(" 自己样式手机 ");
		}
}
