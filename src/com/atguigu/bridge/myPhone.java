package com.atguigu.bridge;

public class myPhone extends Phone{
	public myPhone(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	//������
		
		
		public void open() {
			super.open();
			System.out.println(" �Լ���ʽ�ֻ� ");
		}
		
		public void close() {
			super.close();
			System.out.println(" �Լ���ʽ�ֻ� ");
		}
		
		public void call() {
			super.call();
			System.out.println(" �Լ���ʽ�ֻ� ");
		}
}
