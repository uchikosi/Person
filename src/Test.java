
public class Test {
	public static void main(String[] args){
	Person taro = new Person();
//	new =インスタンス化(コピー) したものを変数 Aに代入
//	personクラスの中に入っている各変数をnowで呼び出して、
//	Perosn()で新しい値を代入（更新）している
	taro.name="山田太郎";
	taro.age=20;
	taro.phoneNumber = "080-2222-2222";
	taro.address ="ccc@ccc";
//

	System.out.println(taro.name);
	System.out.println(taro.age);
	System.out.println(taro.phoneNumber);
	System.out.println(taro.address);

//	「taro.talk();」はtalk()メソッドでpersonクラスの中に入っている「System.out.println(this.name + “が話す”);」が呼びされ、
//	「this.name」は、このインスタンス（今回だとPersonクラスのインスタンスである taro 内の「public String name;」）の name」をさしています。
//	 Test クラスの「taro.name=”山田太郎”」により、taro インスタンスの name フィールドに「山田太郎」が代入されます。
//	 結果「山田太郎が話す」ということになります。

	taro.talk();
	taro.walk();
	taro.run();

	Person kimura = new Person();
	kimura.name = "木村二郎";
	kimura.age = 18;
	kimura.phoneNumber = "080-0000-0000";
	kimura.address = "aaa@aaa";

	System.out.println(kimura.name);
	System.out.println(kimura.age);
	System.out.println(kimura.phoneNumber);
	System.out.println(kimura.address);

	kimura.talk();
	kimura.walk();
	kimura.run();

	Person suzuki = new Person();
	suzuki.name = "鈴木花子";
	suzuki.age = 16;
	suzuki.phoneNumber = "090-0000-0000";
	suzuki.address = "bbb@bbb";

	System.out.println(suzuki.name);
	System.out.println(suzuki.age);
	System.out.println(suzuki.phoneNumber);
	System.out.println(suzuki.address);

	suzuki.talk();
	suzuki.walk();
	suzuki.run();

	Person uchikosi = new Person();
	uchikosi.name= "打越友貴";
	uchikosi.age=10;
	uchikosi.phoneNumber = "090-1111-1111";
	uchikosi.address ="ccc@ccc";

	System.out.println(uchikosi.name);
	System.out.println(uchikosi.age);
	System.out.println(uchikosi.phoneNumber);
	System.out.println(uchikosi.address);

	uchikosi.talk();
	uchikosi.walk();
	uchikosi.run();

	Robot aibo = new Robot();
	aibo.name= "犬型ロボット";

	Robot asimo = new Robot();
	asimo.name="ダンスロボット";

	Robot pepper = new Robot();
	pepper.name="接客ロボット";

	System.out.println(aibo.name);
	aibo.talk();
	aibo.walk();
	aibo.run();

	System.out.println(asimo.name);
	asimo.talk();
	asimo.walk();
	asimo.run();

	System.out.println(pepper.name);
	pepper.talk();
	pepper.walk();
	pepper.run();
	}


}
