package com.hcl;

class Test {

	 public static void main(String[] args) {
			int n = 12;
			System.out.println("��" + n + "���£����ӵ�����Ϊ" + fun(n));

		}

		private static int fun(int a) {
			if ((1 == a) || (2 == a))
				return 1;
			else
				return (fun(a - 1) + fun(a - 2));
		}
}