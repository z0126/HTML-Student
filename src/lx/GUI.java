
  package lx;
  
  import java.awt.*;
  
  import javax.swing.*;
  
  @SuppressWarnings("serial") public class GUI extends JFrame{
  
  public GUI(){
  
  JPanel inputPanel = new JPanel();
  
  JPanel inputPanel1 = new JPanel();
  
  JPanel inputPanel2 = new JPanel(); //创建三个面板对象分别放置三个编辑框及其标签
  
  JTextField inputField = new JTextField(22);
  
  JTextField inputField1 = new JTextField(22);
  
  JTextField inputField2 = new JTextField(22); //创建三个长度为22的空的文本编辑框
  
  Label label = new Label("用户名:");//创建标签对象 设置参数
  
  inputPanel.add(label); //将标签放入面板对象中
  
  inputPanel.add(inputField); //将空的文本编辑框放入面板对象中
  
  Label label1 = new Label("密    码:");
  
  inputPanel1.add(label1);
  
  inputPanel1.add(inputField1);//
  
  Label label2 = new Label("确认密码:");
  
  inputPanel2.add(label2);
  
  inputPanel2.add(inputField2);
  
  this.add(inputPanel);
  
  this.add(inputPanel1);
  
  this.add(inputPanel2); //将三个面板放入窗体中
  
  JPanel radiopanel = new JPanel();
  
  Label radiolabel = new Label("性别:");
  
  radiopanel.add(radiolabel);
  
  radiopanel.add(new JRadioButton("男"));
  
  radiopanel.add( new JRadioButton("女"));
  
  this.add(radiopanel); //创建两个单选按钮，标签为性别
  
  JPanel checkpanel = new JPanel();
  
  Label checklabel = new Label("爱好:");
  
  checkpanel.add(checklabel);
  
  checkpanel.add(new JCheckBox("阅读"));
  
  checkpanel.add(new JCheckBox("上网"));
  
  checkpanel.add(new JCheckBox("游泳"));
  
  checkpanel.add(new JCheckBox("旅游"));
  
  this.add(checkpanel); //创建四个复选按钮，标签为爱好
  
  JPanel inputPanel3 = new JPanel();
  
  JTextArea inputField3 = new JTextArea(2,20);
  
  Label inputlabel3 = new Label("地址:");
  
  inputPanel3.add(inputlabel3);
  
  inputPanel3.add(inputField3);
  
  this.add(inputPanel3); //创建一个具有指定行和列的空文本域
  
  JPanel combopanel = new JPanel();
  
  Label combolabel = new Label("学历:");
  
  combopanel.add(combolabel);
  
  JComboBox<String> comboBox = new JComboBox<String>();
  
  comboBox.addItem("请选择学历");
  
  comboBox.addItem("小学");
  
  comboBox.addItem("初中");
  
  comboBox.addItem("高中");
  
  comboBox.addItem("本科");
  
  combopanel.add(comboBox);
  
  this.add(combopanel); //创建一个下拉列表框
  
  JPanel panel = new JPanel();
  
  panel.add(new JButton("确定"));
  
  panel.add(new JButton("取消"));
  
  this.add(panel); //创建两个按钮
  
  this.setTitle("用户注册");//创建一个标题为用户注册的窗体
  
  this.setSize(340,450);//该窗体大小
  
  this.setLayout(new GridLayout(8,1));//该窗体中的面板的排列方式
  
  this.setVisible(true); //显示窗体
  
  }
  
  public static void main(String[] args){
  
  new GUI();
  
  }
  
  }
 

/*
package lx;
 import javax.swing.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    //本程序为计算器简单实现版，暂时不支持连续相乘功能
    @SuppressWarnings("serial")
	public class  GUI extends JFrame implements ActionListener{
    	String keys[]= {"7","8","9","*","4","5","6","-","1","2","3","+","0","C","/","="};
    	JButton buttons[]=new JButton[keys.length];//声明创建按钮组件
    	JTextField text= new JTextField("0"); //设置文本框组件
    	JMenuBar menubar;//声明菜单条
    	JMenu menu1,menu2,menu3,submenu;//声明4个菜单其中一个作嵌入子菜单
    	JMenuItem subm1,subm2;//声明两个个菜单项
    	String result="";//用于表示在文本框上显示的值
    	public  GUI() {
    		init();	//为美观这里将组件布局内容放到init()函数中
            setResizable(false);//是否可以自由改变大小，这里不可改变大小
            setBounds(360, 360, 360, 380); //设置窗口显示位置和大小
            setDefaultCloseOperation(EXIT_ON_CLOSE); //设置窗口关闭方式为直接关闭
            setVisible(true); //设置窗口可见
    	}
    	public void init()
    	{
    		SetMenu();//为体现程序封装思想，这里将菜单组件设置单独放到函数SetMenu();中
    		setLayout(null);  //设置null布局
    		text.setBounds(20, 10, 310, 45); //设置文本框位置
    		text.setHorizontalAlignment(JTextField.RIGHT);//设置文本的水平对齐方式
    		add(text);     //将文本组件添加到窗口中去
    		int x=20,y=65; //声明按钮组件放置位置变量x,y
            for (int i=0;i<keys.length;i++)
            {//通过循环有序添加按钮组件
                buttons[i] = new JButton();
                buttons[i].setText(keys[i]);
                buttons[i].setBounds(x, y, 70, 50);
                if(x<260) 	x+=80;
                else {x=20;  y+=60;}
                add(buttons[i]);//在窗口中添加按钮组件
                buttons[i].addActionListener(this);//将事件源和监视器建立联系
            }
    	}
    	public void SetMenu()
    	{
    		menubar=new JMenuBar();
    		menu1 = new JMenu("查看(V)");
    		menu2 = new JMenu("编辑(E)");
    		menu3 = new JMenu("帮助(H)");
    		submenu = new JMenu("其他");
    		subm1 = new JMenuItem("标准型(T)");
    		subm2 = new JMenuItem("科学型(S)");
    		menu1.add(subm1);
    		menu1.addSeparator();
    		menu1.add(subm2);
    		menu1.addSeparator();
    		menu1.add(submenu);
    		submenu.add(new JMenuItem("其他子项1"));
    		submenu.add(new JMenuItem("其他子项2"));
    		menubar.add(menu1);
    		menubar.add(menu2);
    		menubar.add(menu3);
    		setJMenuBar(menubar);
    	}
    	public void actionPerformed(ActionEvent e) {
    		String str=e.getActionCommand(); //获取封装在事件命令中的字符串
    		if(str=="C"){//输入按键为清空，则直接将文本框内容显示为0
    			result="";
    			text.setText("0");
    		}
    		else if(str=="="){//按键为计算出结果，则将
    			result=call();
    			text.setText(result);
    		}
    		else{
    			result = result +str;
    			text.setText(result);
    		}
    	}
    	public String call()
    	{
    		String num[]=new String[10];
    		String t="";
    		int j=0;
    		for(int i=0;i<result.length();)
    		{
    			//为更好实现计算器的相关功能，这里使用了一些很实用的函数，功能如下
    			//indexOf返回字符中indexof（string）中字串string在父串中首次出现的位置,没有返回-1
    			//result.charAt(i) 就是字符串result在第i个位置的字符
    			//String.valueOf(n) 将n转换成String
    			if ("0123456789.".indexOf(result.charAt(i))>=0)
    			{
    				String s="";
    				while(i<result.length()&&"0123456789.".indexOf(result.charAt(i))>=0)
    				{
    					s=s+result.charAt(i++);
    				}
    				num[j++]=s;
    			}
    			else
    			{//用t记录下中间的算术符号
    				t=result.charAt(i++)+"";
    			}
    		}
    		double x=Double.parseDouble(num[0]);
    		double y=Double.parseDouble(num[1]);
    		if("+".indexOf(t)>=0) {
    			return String.valueOf(x+y);
    		}
    		else if("-".indexOf(t)>=0) {
    			return String.valueOf(x-y);
    		}
    		else if("*".indexOf(t)>=0) {
    			return String.valueOf(x*y);
    		}
    		else if("/".indexOf(t)>=0) {
    			return String.valueOf(x/y);
    		}
    		return "error";
    	}
    	public static void main(String[] args) {
    		GUI a=new GUI();
    	}
    }

**/