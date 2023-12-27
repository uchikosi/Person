
public class Test {
	public static void main(String[] args){
	Person taro = new Person();
//	new =インスタンス化(コピー) したものを変数 Aに代入
	taro.name="山田太郎";
	taro.age=20;

	System.out.println(taro.name);
	System.out.println(taro.age);

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

	Person suzuki = new Person();
	suzuki.name = "鈴木花子";
	suzuki.age = 16;

	System.out.println(suzuki.name);
	System.out.println(suzuki.age);

	Person uchikosi = new Person();
	uchikosi.name= "打越友貴";
	uchikosi.age=10;

	System.out.println(uchikosi.name);
	System.out.println(uchikosi.age);

	Person aibo = new Person();
	aibo.name= "犬型ロボット";

	Person asimo = new Person();
	asimo.name="ダンスロボット";

	Person pepper = new Person();
	pepper.name="接客ロボット";

	System.out.println(pepper.name);

	pepper.talk();
	pepper.walk();
	pepper.run();

	}


}
