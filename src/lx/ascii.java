package lx;

public class ascii {
		//ascii码与数字间的转化
		public static void main(String args[])
	    {
			//Scanner sc =new Scanner(System.in);
			int d = 100; 
			char e = (char)d;//如果是一串ascii码的话,最好存在byte[]中
			if(e>'c') {
			System.out.println("  "+e);
			}
			byte[] b ={97, 98, 99};
			System.out.println(new String(b));
	    }
	}


	/*
	public class ascii {
		private static int asnum;
		private static char stchar;

		public static void main(String[] args) {
			System.out.println(getAsc("A"));
			System.out.println(backchar(99));
		}

		/**
		 * 字符转ASC
		 * 
		 * @param st
		 * @return
		 */
	/*
		public static int getAsc(String st) {
			byte[] gc = st.getBytes();
			asnum = (int) gc[0];
			return asnum;
		}

		/**
		 * ASC转字符
		 * 
		 * @param backnum
		 * @return
		 */
	/*
		public static char backchar(int backnum) {
			stchar = (char) backnum;
			return stchar;
		}
	}
	**/
	/*
	public class ascii
	{
		public static void main(String args[])
	    {
			//Scanner sc =new Scanner(System.in);
			char b='A';
			System.out.println((int) b);
			int d=99;
			System.out.println((char)d);
	    }
	}
}
**/