
public class Person {
	public String name = null;
	public int age = 0;
	public String phoneNumber = null;
	public String address = null;
//	name age phoneNember address初期化
//	各項目変数の入った初期値

	public void talk(){
		System.out.println(this.name + "が話す");
	}
	public void walk(){
		System.out.println(this.name + "が歩く");
	}
	public void run(){
		System.out.println(this.name + "が走る");
	}
//	「this.name」は、「このインスタンスの name」をさしています
//	今回だと Person クラスのインスタンスである taro 内の「public String name;」を指しています。
//	Test クラスの「taro.name=”山田太郎”」により、taro インスタンスの name フィールドに「山 田太郎」が代入されます。


}
