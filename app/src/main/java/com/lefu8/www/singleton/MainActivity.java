package com.lefu8.www.singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.lefu8.www.singleton.Bridge.Circle;
import com.lefu8.www.singleton.Bridge.Rantangle;
import com.lefu8.www.singleton.Bridge.V1Drawing;
import com.lefu8.www.singleton.builder.AppleBuilder;
import com.lefu8.www.singleton.builder.ComputerProduct;
import com.lefu8.www.singleton.builder.Director;
import com.lefu8.www.singleton.builder.MsiBuilder;
import com.lefu8.www.singleton.command.demo1.ClientRole;
import com.lefu8.www.singleton.command.demo2.Command;
import com.lefu8.www.singleton.command.demo2.Producer;
import com.lefu8.www.singleton.facade.TvController;
import com.lefu8.www.singleton.factory.abstractF.AbstractFactory;
import com.lefu8.www.singleton.factory.abstractF.FactoryOne;
import com.lefu8.www.singleton.factory.abstractF.Flyable;
import com.lefu8.www.singleton.factory.abstractF.Writeable;
import com.lefu8.www.singleton.factory.method.BroomFactory;
import com.lefu8.www.singleton.factory.method.CarFactory;
import com.lefu8.www.singleton.factory.method.Moveable;
import com.lefu8.www.singleton.factory.method.VehicleFactory;
import com.lefu8.www.singleton.factory.simple.BigHouse;
import com.lefu8.www.singleton.factory.simple.Car;
import com.lefu8.www.singleton.factory.simple.SimpleFactory;
import com.lefu8.www.singleton.iterator.ConcreteAggregate;
import com.lefu8.www.singleton.observer.BroadcastObservable;
import com.lefu8.www.singleton.observer.CEO;
import com.lefu8.www.singleton.observer.TeamLeader;
import com.lefu8.www.singleton.observer.VP;
import com.lefu8.www.singleton.prototype.WordDocument;
import com.lefu8.www.singleton.proxy.ProxyRmail;
import com.lefu8.www.singleton.responsibilitychain.low.Boss;
import com.lefu8.www.singleton.responsibilitychain.low.GroupLeader;
import com.lefu8.www.singleton.responsibilitychain.low.Manager;
import com.lefu8.www.singleton.responsibilitychain.low.ProgramApe;
import com.lefu8.www.singleton.sligleton.Singleton;
import com.lefu8.www.singleton.sligleton.SingletonContainer;
import com.lefu8.www.singleton.sligleton.SingletonDCL;
import com.lefu8.www.singleton.sligleton.SingletonEnum;
import com.lefu8.www.singleton.sligleton.SingletonStatic;
import com.lefu8.www.singleton.strategy.AddCal;
import com.lefu8.www.singleton.strategy.Cal;
import com.lefu8.www.singleton.strategy.DivCal;
import com.lefu8.www.singleton.strategy.MultiCal;
import com.lefu8.www.singleton.strategy.SubCal;
import com.lefu8.www.singleton.templatemethod.CoderComputer;
import com.lefu8.www.singleton.templatemethod.MilitaryComputer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    initView();
  }

  private void initView() {
    TextView tvSingleton = (TextView) findViewById(R.id.tv_singleton);
    TextView tvBuilder = (TextView) findViewById(R.id.tv_builder);
    TextView tvObserver = (TextView) findViewById(R.id.tv_observer);
    TextView tvPrototype = (TextView) findViewById(R.id.tv_prototype);
    TextView tvFacade = (TextView) findViewById(R.id.tv_facade);
    TextView tvTemplateMethod = (TextView) findViewById(R.id.tv_template_method);
    TextView tvStrategy = (TextView) findViewById(R.id.tv_strategy);
    TextView tvProxy = (TextView) findViewById(R.id.tv_proxy);
    TextView tvIterator = (TextView) findViewById(R.id.tv_iterator);
    TextView tvResponsibilityChain = (TextView) findViewById(R.id.tv_responsibility_chain);
    TextView tvCommand = (TextView) findViewById(R.id.tv_command);
    TextView tvBridge = (TextView) findViewById(R.id.tv_bridge);
    TextView tvFactory = (TextView) findViewById(R.id.tv_factory);

    tvSingleton.setOnClickListener(this);
    tvBuilder.setOnClickListener(this);
    tvObserver.setOnClickListener(this);
    tvPrototype.setOnClickListener(this);
    tvFacade.setOnClickListener(this);
    tvTemplateMethod.setOnClickListener(this);
    tvStrategy.setOnClickListener(this);
    tvProxy.setOnClickListener(this);
    tvIterator.setOnClickListener(this);
    tvResponsibilityChain.setOnClickListener(this);
    tvCommand.setOnClickListener(this);
    tvBridge.setOnClickListener(this);
    tvFactory.setOnClickListener(this);
  }

  @Override public void onClick(View v) {
    switch (v.getId()) {
      case R.id.tv_singleton:
        // 1 懒汉模式
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Log.i("Singleton lanhan1-->", instance1.toString());
        Log.i("Singleton lanhan2-->", instance2.toString());
        // 2 DCL
        SingletonDCL instance3 = SingletonDCL.getInstance();
        SingletonDCL instance4 = SingletonDCL.getInstance();
        Log.i("Singleton DCL-->", instance3.toString());
        Log.i("Singleton DCL-->", instance4.toString());
        // 3 静态内部类模式
        SingletonStatic instance5 = SingletonStatic.getInstance();
        SingletonStatic instance6 = SingletonStatic.getInstance();
        Log.i("Singleton static-->", instance5.toString());
        Log.i("Singleton static-->", instance6.toString());
        // 4 枚举 enum
        SingletonEnum instance7 = SingletonEnum.INSTANCE;
        SingletonEnum instance8 = SingletonEnum.INSTANCE;
        Log.i("Singleton static-->", instance7.toString());
        Log.i("Singleton static-->", instance8.toString());
        // 5 容器模式
        SingletonContainer.registerService("layoutInflateService", new InflateService());
        SingletonContainer.registerService("broadService", new BroadService());
        Object instance9 = SingletonContainer.getService("layoutInflateService");
        Object instance11 = SingletonContainer.getService("layoutInflateService");
        Object instance10 = SingletonContainer.getService("broadService");
        Object instance12 = SingletonContainer.getService("broadService");
        Log.i("SingletonContainer-->", instance9.toString());
        Log.i("SingletonContainer-->", instance11.toString());
        Log.i("SingletonContainer-->", instance10.toString());
        Log.i("SingletonContainer-->", instance12.toString());
        break;
      case R.id.tv_builder:
        // apple
        AppleBuilder appleBuilder = new AppleBuilder();
        Director appleDirector = new Director(appleBuilder);
        appleDirector.construct("i7", "3.0GHz", "16G", "2333MHz", "GTX960M", "4G");
        ComputerProduct appleProduct = appleBuilder.create();
        Toast.makeText(MainActivity.this, appleProduct.toString(), Toast.LENGTH_SHORT).show();
        // msi
        MsiBuilder msiBuilder = new MsiBuilder();
        Director msiDirector = new Director(msiBuilder);
        msiDirector.construct("i7", "3.0GHz", "8G", "2333MHz", "GTX1080", "2G");
        ComputerProduct msiProduct = msiBuilder.create();
        Toast.makeText(MainActivity.this, msiProduct.toString(), Toast.LENGTH_SHORT).show();
        break;
      case R.id.tv_observer:
        BroadcastObservable broadcastObservable = new BroadcastObservable();
        CEO ceo = new CEO();
        TeamLeader teamLeader = new TeamLeader();
        VP vp = new VP();
        broadcastObservable.addObserver(ceo);
        broadcastObservable.addObserver(teamLeader);
        broadcastObservable.addObserver(vp);
        broadcastObservable.notifyMsg("今天公司有福利哦~");
        break;
      case R.id.tv_prototype:
        // 原型模式的关键点在于拷贝：浅拷贝和深拷贝
        // 需要注意的是通过clone拷贝对象的时候并不会执行构造函数！

        // 拷贝--文本内容修改，不影响原对象文本值
        //WordDocument originDoc = new WordDocument();
        //originDoc.setText("这是一篇文档");
        //originDoc.addImage("图片1");
        //originDoc.addImage("图片2");
        //originDoc.addImage("图片3");
        //originDoc.showDocument();
        //WordDocument doc2 = originDoc.callClone();
        //doc2.showDocument();
        //doc2.setText("这是修改过的Doc2文本");
        //doc2.showDocument();
        //originDoc.showDocument();

        // 浅拷贝演示--改变了原始对象值
        WordDocument originDoc = new WordDocument();
        originDoc.setText("这是一篇文档");
        originDoc.addImage("图片1");
        originDoc.addImage("图片2");
        originDoc.addImage("图片3");
        originDoc.showDocument();
        WordDocument doc2 = originDoc.callClone();
        doc2.showDocument();
        doc2.setText("这是修改过的Doc2文本");
        // 引用型的字段
        doc2.addImage("哈哈.jpg");
        doc2.showDocument();
        originDoc.showDocument();
        break;
      case R.id.tv_facade:
        TvController tvController = new TvController();
        // 打开电视
        tvController.powerOn();
        // 调大音量
        tvController.turnUp();
        // 切换频道
        tvController.nextChannel();
        break;
      case R.id.tv_template_method:
        CoderComputer coderComputer = new CoderComputer();
        coderComputer.startUp();
        MilitaryComputer militaryComputer = new MilitaryComputer();
        militaryComputer.startUp();
        break;
      case R.id.tv_strategy:
        Cal cal = new Cal();
        // +
        AddCal addCal = new AddCal();
        cal.setStrategy(addCal);
        cal.calc(122, 109);
        // -
        SubCal subCal = new SubCal();
        cal.setStrategy(subCal);
        cal.calc(122, 109);
        // *
        MultiCal multiCal = new MultiCal();
        cal.setStrategy(multiCal);
        cal.calc(122, 109);
        // /
        DivCal divCal = new DivCal();
        cal.setStrategy(divCal);
        cal.calc(122, 109);
        break;
      case R.id.tv_proxy:
        ProxyRmail proxyRmail = new ProxyRmail();
        proxyRmail.obtainEmail("dc,come on~");
        break;
      case R.id.tv_iterator:
        // 提供一种方法访问一个容器对象中各个元素，而又不暴露该对象的内部细节

        // Android 示例
        //AndroidMileage androidMileage = new AndroidMileage();
        //Iterator<AndroidMileage.Mileage> iterator = androidMileage.iterator();
        //while (iterator.hasNext()) {
        //  AndroidMileage.Mileage mileage = iterator.next();
        //  if (mileage.name.equalsIgnoreCase("16")) {
        //    //remove掉的是当前的这个,暂时只是置空,并未真的移掉
        //    iterator.remove();
        //  }
        //  Log.e("mileage", mileage.toString());
        //}
        // hashMap 示例
        HashMap<String, String> ageMap = new HashMap<>();
        ageMap.put("wmz", "19");
        ageMap.put("zyz", "20");
        ageMap.put("srr", "21");
        Iterator<String> iterator = ageMap.keySet().iterator();
        while (iterator.hasNext()) {
          String key = iterator.next();
          String value = ageMap.get(key);
          Log.i("iterator", "name:" + key + "age:" + value);
        }
        // JSONObject遍历
        String paramString = "{menu:{\"1\":\"sql\", \"2\":\"android\", \"3\":\"mvc\"}}";
        JSONObject menuJSONObj = null;
        try {
          menuJSONObj = new JSONObject(paramString);
          JSONObject menuObj = menuJSONObj.getJSONObject("menu");
          Iterator iter = menuObj.keys();
          while (iter.hasNext()) {
            String key = (String) iter.next();
            String value = menuObj.getString(key);
            Log.i("iterator", "key:" + key + "value:" + value);
          }
        } catch (JSONException e) {
          e.printStackTrace();
        }
        // 基于list的自定义迭代器
        List<Object> list = new ArrayList<>();
        Beautiful beautiful = new Beautiful();
        beautiful.age = 21;
        beautiful.height = 165;
        list.add(beautiful);
        Beautiful beautiful1 = new Beautiful();
        beautiful1.age = 22;
        beautiful1.height = 168;
        list.add(beautiful1);
        Beautiful beautiful2 = new Beautiful();
        beautiful2.age = 23;
        beautiful2.height = 170;
        list.add(beautiful2);
        ConcreteAggregate concreteAggregate = new ConcreteAggregate(list);
        com.lefu8.www.singleton.iterator.Iterator ite = concreteAggregate.iterator();
        while (ite.hasNext()) {
          Beautiful beautiful3 = (Beautiful) ite.next();
          Log.i("iterator", "age:" + beautiful3.age + "height:" + beautiful3.height);
        }
        break;
      case R.id.tv_responsibility_chain:
        //一个请求沿着一条“链”传递，直到该“链”上的某个处理者处理它为止
        //先来一个程序猿 这里给他一个三万以内的随机值表示需要申请的差旅费
        ProgramApe ape = new ProgramApe((int) (Math.random() * 30000));
        Log.i("responsibilitychainlow", "爷要申请：" + ape.getExpenses() + "元");
        //再来四个老大
        GroupLeader leader = new GroupLeader();
        com.lefu8.www.singleton.responsibilitychain.low.Director director =
            new com.lefu8.www.singleton.responsibilitychain.low.Director();
        Manager manager = new Manager();
        Boss boss = new Boss();
        //处理申请
        if (ape.getExpenses() <= 1000) {
          leader.handleRequest(ape);
        } else if (ape.getExpenses() <= 5000) {
          director.handleRequest(ape);
        } else if (ape.getExpenses() <= 10000) {
          manager.handleRequest(ape);
        } else {
          boss.handleRequest(ape);
        }
        // 抽象，接口必须要用啊
    /*
     * 先来一个程序猿 这里给他一个三万以内的随机值表示需要申请的差旅费
		 */
        com.lefu8.www.singleton.responsibilitychain.optimization.ProgramApes ape1 =
            new com.lefu8.www.singleton.responsibilitychain.optimization.AndroidApe(
                (int) (Math.random() * 30000));
    /*
     * 再来四个老大
		 */
        com.lefu8.www.singleton.responsibilitychain.optimization.Leader leader1 =
            new com.lefu8.www.singleton.responsibilitychain.optimization.GroupLeader(1000);
        com.lefu8.www.singleton.responsibilitychain.optimization.Leader director1 =
            new com.lefu8.www.singleton.responsibilitychain.optimization.Director(5000);
        com.lefu8.www.singleton.responsibilitychain.optimization.Leader manager1 =
            new com.lefu8.www.singleton.responsibilitychain.optimization.Manager(10000);
        com.lefu8.www.singleton.responsibilitychain.optimization.Leader boss1 =
            new com.lefu8.www.singleton.responsibilitychain.optimization.Boss(40000);
    /*
		 * 设置老大的上一个老大
		 */
        leader1.setLeader(director1);
        director1.setLeader(manager1);
        manager1.setLeader(boss1);
        // 处理申请
        leader1.handleRequest(ape1);
        break;
      case R.id.tv_command:
        //
        // 命令模式牵涉到5个角色:
        // Command:接口，通用抽象方法
        // Receiver:真正的执行者
        // ConcreteCommand:具体的命令（持有接收着引用）
        // Invoker:命令通用执行着（持有命令的引用）
        // Client:客户角色
        // demo1-->
        ClientRole client = new ClientRole();
        client.assembleAction();
        // demo2-->
        List queue = Producer.produceRequests();
        for (Iterator it = queue.iterator(); it.hasNext(); )
        // 取出List中东东,其他特征都不能确定,只能保证一个特征是100%正确,
        // 他们至少是接口Command的"儿子".所以强制转换类型为接口Command
        ((Command)it.next()).execute();
        break;
      case R.id.tv_bridge:
        //编写一个程序，使用两个绘图的程序的其中一个来绘制矩形或者原型，
        // 同时，在实例化矩形的时候，它要知道使用绘图程序1（DP1）还是绘图程序2（DP2）
        // 抽象化角色shape，具体抽象化角色circle，实例化角色drawing，具体实例化角色V1Drawing
        V1Drawing v1Drawing = new V1Drawing();
        Circle circle = new Circle(v1Drawing);
        circle.draw();
        //矩形
        V1Drawing v1Drawing2 = new V1Drawing();
        Rantangle tangle = new Rantangle(v1Drawing2);
        tangle.draw();
        break;
      case R.id.tv_factory:
        // simple factory
        SimpleFactory simpleFactory = new SimpleFactory();
        BigHouse bigHouse = (BigHouse) simpleFactory.create(BigHouse.class);
        Car car = (Car) simpleFactory.create(Car.class);
        bigHouse.squre();
        car.want();
        // factory method
        VehicleFactory factory = new BroomFactory();
        Moveable moveable = factory.create();
        moveable.run();
        VehicleFactory carFactory = new CarFactory();
        Moveable BMW = carFactory.create();
        BMW.run();
        // 具体工厂A和B需要生产一些同类型的不同产品
        // 那么我们就可以试试抽象工厂模式
        AbstractFactory factory1 = new FactoryOne();
        Flyable flyable = factory1.createFlyable();
        flyable.fly(1589);
        com.lefu8.www.singleton.factory.abstractF.Moveable move = factory1.createMoveable();
        move.run();
        Writeable writeable = factory1.createWriteable();
        writeable.write();
        break;

    }
  }

  class Beautiful {
    public int age;
    public float height;
  }

  class InflateService {
  }

  class BroadService {
  }
}
