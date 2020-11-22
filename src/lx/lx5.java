package lx;


     //类的使用
	class sp{
		private String name;
		public void set(String i)
		{
			this.name=i;
		}
		public String get() {
		 return this.name;
		}
	}
	class cs{
		private String name;
		private sp s[];
		public void setname(String i)
		{
			this.name=i;
		}
		public String getsp()
		{
			return name;
		}
		public void sets(sp i[])
		{
			this.s=i;
		}
		public String gets()
		{
			return name;
		}
		public sp sell(String i)
		{
			for(int j=0;j<s.length;j++)
			{
				if(s[j].get()==i)
					return s[j];
			}
			return null;
		}
	}
	class human{
		private String name;
		public void setname(String i)
		{
			this.name=i;
		}
		public String getname()
		{
			return name;
		}
		sp shop(cs i,String j)
		{
			return i.sell(j);
		}
	}
	public class lx5 {
	public static void main(String args[]) {
		sp p1=new sp();
		sp p2=new sp();
		sp p3=new sp();
		p1.set("冰箱");
		p2.set("洗衣机");
		p3.set("牙膏");
		cs m=new cs();
		m.setname("华润万家");
		m.sets(new sp[] {p1,p2,p3});
		human p=new human();
		p.setname("小明");
		sp resurt=p.shop(m,"牙膏");
		if(resurt==null)
			System.out.printf(p.getname()+ "白跑一趟，在"
		+m.getsp()+"什么也没买到");
		else
			System.out.printf(p.getname() + "在"
					+m.gets()+"买到了"+m.getsp());
	}
}
