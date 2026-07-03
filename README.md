# Java 高级语法练习题库：highwaf

本项目用于练习 Java 高级语法和常用工具类库，适合已经学完 Java 面向对象基础，希望进一步熟练使用集合、IO、泛型、序列化、网络编程、多线程等内容的学习者。

## 学习目标

通过 100 道练习题，熟练掌握以下内容：

- Java 数据结构
- Java 集合框架
- Java ArrayList
- Java LinkedList
- Java HashSet
- Java HashMap
- Java Iterator
- Java Object
- Java NIO Files
- Java 泛型
- Java 序列化
- Java 网络编程
- Java 发送邮件
- Java 多线程编程

## 建议练习方式

1. 每道题单独创建一个 Java 类完成。
2. 建议使用控制台输入输出验证结果。
3. 先实现基础功能，再考虑异常处理、边界情况和代码封装。
4. 每完成 10 道题，可以回顾一次相关 API。
5. 遇到集合类题目时，多尝试输出中间结果，观察数据变化。

## 项目目录结构

```text
src/
└── com/study/
    ├── p001/Main.java
    ├── p002/Main.java
    ├── ...
    └── p100/Main.java
```

每一道题对应一个独立包：

- 第 1 题：`com.study.p001.Main`
- 第 2 题：`com.study.p002.Main`
- 第 100 题：`com.study.p100.Main`

每个 `Main.java` 都包含：

- 当前题目说明。
- 可直接运行的控制台入口。
- 示例数据或输入提示。
- `TODO` 预留区域，供学员补全核心逻辑。

## 编译和运行

在 `highwaf` 目录下编译全部练习：

```bash
javac -encoding UTF-8 -d out $(find src -name "*.java")
```

运行指定题目，例如第 1 题：

```bash
java -cp out com.study.p001.Main
```

运行第 100 题：

```bash
java -cp out com.study.p100.Main
```

---

# 100 道 Java 高级语法练习题

## 一、Java 数据结构，1-8

### 1. 数组最大值和最小值

定义一个 `int[]` 数组，存放 10 个整数。通过循环找出最大值、最小值、总和和平均值。

要求：

- 不使用 `Arrays.stream()`。
- 输出最大值、最小值、总和、平均值。

### 2. 数组元素反转

定义一个字符串数组，例如：`{"Java", "Python", "Go", "C++"}`，将数组内容原地反转。

要求：

- 不能创建第二个数组保存结果。
- 输出反转前和反转后的数组。

### 3. 模拟栈 Stack

使用数组模拟一个栈结构。

要求：

- 支持 `push` 入栈。
- 支持 `pop` 出栈。
- 支持 `peek` 查看栈顶元素。
- 栈满或栈空时给出提示。

### 4. 模拟队列 Queue

使用数组模拟一个简单队列。

要求：

- 支持入队。
- 支持出队。
- 支持查看队首元素。
- 队满或队空时给出提示。

### 5. 统计字符出现次数

输入一段字符串，统计每个字符出现的次数。

要求：

- 可以先使用数组完成。
- 再尝试使用 `HashMap` 完成。

### 6. 查找数组中第二大的数字

定义一个整数数组，找出第二大的数字。

要求：

- 不能直接排序后取值。
- 注意数组中可能有重复数字。

### 7. 合并两个有序数组

给定两个升序数组，将它们合并成一个新的升序数组。

要求：

- 不使用现成排序方法。
- 使用双指针思想完成。

### 8. 简单学生成绩表

使用二维数组保存 3 名学生的 3 门课程成绩。

要求：

- 输出每个学生的总分和平均分。
- 输出每门课程的平均分。

---

## 二、Java 集合框架，9-16

### 9. 集合保存学生姓名

使用 `ArrayList<String>` 保存 5 个学生姓名。

要求：

- 添加姓名。
- 删除一个姓名。
- 修改一个姓名。
- 遍历输出所有姓名。

### 10. 集合保存学生对象

定义 `Student` 类，包含姓名和年龄。使用 `ArrayList<Student>` 保存多个学生。

要求：

- 添加 3 个学生对象。
- 输出所有学生信息。
- 找出年龄最大的学生。

### 11. Collection 常用方法练习

创建两个 `Collection<String>` 集合。

要求练习：

- `add`
- `remove`
- `contains`
- `size`
- `isEmpty`
- `clear`

### 12. 集合去重

输入一组整数，其中包含重复数字。使用集合去除重复元素。

要求：

- 先用 `ArrayList` 保存原始数据。
- 再用 `HashSet` 去重。
- 输出去重前和去重后的数据。

### 13. 集合交集

定义两个 `List<Integer>`，找出两个集合中都存在的数字。

要求：

- 不直接使用 `retainAll`。
- 自己通过循环实现。

### 14. 集合并集

定义两个 `List<String>`，合并成一个没有重复元素的新集合。

要求：

- 可以使用 `HashSet` 辅助完成。
- 输出合并前和合并后结果。

### 15. 集合排序

定义一个 `ArrayList<Integer>` 保存多个整数。

要求：

- 使用 `Collections.sort()` 升序排序。
- 使用自定义比较器降序排序。

### 16. 对象集合排序

定义 `Student` 类，包含姓名、年龄、成绩。使用集合保存学生。

要求：

- 按成绩从高到低排序。
- 成绩相同时按年龄从小到大排序。

---

## 三、Java ArrayList，17-24

### 17. ArrayList 增删改查菜单

使用 `ArrayList<String>` 实现一个控制台菜单。

要求：

- 添加商品。
- 删除商品。
- 修改商品。
- 查询全部商品。

### 18. ArrayList 按下标操作

创建一个 `ArrayList<Integer>`，练习通过下标操作元素。

要求：

- 使用 `get(index)` 获取元素。
- 使用 `set(index, value)` 修改元素。
- 下标越界时捕获异常并提示。

### 19. ArrayList 查找指定元素

使用 `ArrayList<String>` 保存城市名称。

要求：

- 用户输入城市名。
- 判断集合中是否存在。
- 如果存在，输出所在下标。

### 20. ArrayList 删除所有指定元素

定义一个 `ArrayList<String>`，其中有多个相同字符串。

要求：

- 删除所有等于指定值的元素。
- 思考正序删除和倒序删除的区别。

### 21. ArrayList 存储订单

定义 `Order` 类，包含订单编号、用户名、金额。

要求：

- 使用 `ArrayList<Order>` 保存订单。
- 查询金额大于 100 的订单。
- 统计所有订单总金额。

### 22. ArrayList 分页查询

使用 `ArrayList<String>` 保存 30 条数据。

要求：

- 用户输入页码和每页条数。
- 输出对应页的数据。
- 处理页码非法情况。

### 23. ArrayList 转数组

创建 `ArrayList<String>`，将集合转换为数组。

要求：

- 使用 `toArray`。
- 输出数组内容。

### 24. 数组转 ArrayList

定义一个字符串数组，将其转换成 `ArrayList<String>`。

要求：

- 使用 `Arrays.asList`。
- 观察转换后的集合是否支持添加元素。

---

## 四、Java LinkedList，25-31

### 25. LinkedList 模拟队列

使用 `LinkedList<String>` 模拟队列。

要求：

- 使用 `offer` 入队。
- 使用 `poll` 出队。
- 使用 `peek` 查看队首。

### 26. LinkedList 模拟栈

使用 `LinkedList<Integer>` 模拟栈。

要求：

- 使用 `push` 入栈。
- 使用 `pop` 出栈。
- 使用 `peek` 查看栈顶。

### 27. LinkedList 操作首尾元素

创建 `LinkedList<String>` 保存任务名称。

要求：

- 添加首元素。
- 添加尾元素。
- 删除首元素。
- 删除尾元素。

### 28. 浏览器历史记录

使用 `LinkedList<String>` 模拟浏览器历史记录。

要求：

- 访问新页面。
- 后退到上一个页面。
- 查看当前页面。

### 29. 音乐播放列表

使用 `LinkedList<String>` 保存歌曲列表。

要求：

- 添加歌曲。
- 删除歌曲。
- 下一首。
- 上一首。

### 30. ArrayList 与 LinkedList 插入性能对比

分别使用 `ArrayList` 和 `LinkedList` 在集合开头插入大量数据。

要求：

- 使用 `System.currentTimeMillis()` 统计耗时。
- 输出性能差异。

### 31. LinkedList 遍历方式

使用 `LinkedList<String>` 保存数据。

要求：

- 使用普通 for 循环遍历。
- 使用增强 for 循环遍历。
- 使用迭代器遍历。

---

## 五、Java HashSet，32-38

### 32. HashSet 基础操作

使用 `HashSet<String>` 保存水果名称。

要求：

- 添加元素。
- 删除元素。
- 判断元素是否存在。
- 遍历输出。

### 33. HashSet 自动去重

向 `HashSet<Integer>` 中添加重复数字。

要求：

- 输出集合内容。
- 观察重复元素是否会保留。

### 34. HashSet 存储自定义对象

定义 `Student` 类，包含姓名和年龄。使用 `HashSet<Student>` 保存学生。

要求：

- 重写 `equals` 和 `hashCode`。
- 姓名和年龄相同视为同一个学生。

### 35. HashSet 判断用户名是否重复

用户连续输入多个用户名。

要求：

- 使用 `HashSet` 保存用户名。
- 如果用户名已存在，提示重复。
- 如果不存在，添加成功。

### 36. 随机不重复数字

生成 10 个 1 到 100 之间的不重复随机数。

要求：

- 使用 `HashSet<Integer>`。
- 输出最终结果。

### 37. HashSet 和 ArrayList 去重对比

使用 `ArrayList` 保存重复数据，再用两种方式去重。

要求：

- 使用 `HashSet` 去重。
- 使用双重循环手动去重。
- 对比代码复杂度。

### 38. LinkedHashSet 保持插入顺序

使用 `HashSet` 和 `LinkedHashSet` 分别保存相同数据。

要求：

- 输出两种集合的遍历结果。
- 观察顺序区别。

---

## 六、Java HashMap，39-48

### 39. HashMap 保存电话簿

使用 `HashMap<String, String>` 保存姓名和手机号。

要求：

- 添加联系人。
- 根据姓名查询手机号。
- 删除联系人。
- 修改手机号。

### 40. HashMap 统计单词次数

输入一段英文句子，统计每个单词出现次数。

要求：

- 使用空格分割单词。
- 使用 `HashMap<String, Integer>`。

### 41. HashMap 遍历方式

创建一个 `HashMap<String, Integer>` 保存商品和价格。

要求：

- 遍历 keySet。
- 遍历 entrySet。
- 使用 forEach 遍历。

### 42. HashMap 保存学生成绩

使用 `HashMap<String, Integer>` 保存学生姓名和分数。

要求：

- 查询指定学生成绩。
- 找出最高分学生。
- 计算平均分。

### 43. HashMap 嵌套集合

使用 `HashMap<String, ArrayList<String>>` 保存班级和学生名单。

要求：

- 添加班级。
- 给班级添加学生。
- 输出每个班级的所有学生。

### 44. HashMap 判断 key 和 value

创建 `HashMap<String, String>` 保存国家和首都。

要求：

- 使用 `containsKey` 判断国家是否存在。
- 使用 `containsValue` 判断首都是否存在。

### 45. HashMap 统计字符次数

输入字符串，统计每个字符出现次数。

要求：

- 使用 `HashMap<Character, Integer>`。
- 忽略空格。

### 46. HashMap 存储对象

定义 `Product` 类，包含编号、名称、价格。

要求：

- 使用商品编号作为 key。
- 使用 `Product` 对象作为 value。
- 根据编号查询商品。

### 47. HashMap 按 value 排序

使用 `HashMap<String, Integer>` 保存姓名和成绩。

要求：

- 将 entry 转成 List。
- 按成绩从高到低排序。
- 输出排序结果。

### 48. HashMap 简易购物车

使用 `HashMap<String, Integer>` 保存商品名称和购买数量。

要求：

- 添加商品。
- 增加数量。
- 减少数量。
- 删除商品。

---

## 七、Java Iterator，49-54

### 49. Iterator 遍历集合

使用 `ArrayList<String>` 保存多个名字。

要求：

- 使用 `Iterator` 遍历。
- 输出每个元素。

### 50. Iterator 安全删除元素

使用 `ArrayList<Integer>` 保存 1 到 20。

要求：

- 使用 `Iterator` 删除所有偶数。
- 不能直接在增强 for 中调用 `list.remove()`。

### 51. ListIterator 双向遍历

使用 `LinkedList<String>` 保存数据。

要求：

- 使用 `ListIterator` 正向遍历。
- 使用 `ListIterator` 反向遍历。

### 52. Iterator 修改元素问题

使用集合保存字符串。

要求：

- 尝试在 Iterator 遍历时修改集合。
- 观察是否出现并发修改异常。
- 写出正确修改方式。

### 53. 自定义简单迭代器

定义一个简单容器类 `MyContainer`。

要求：

- 内部使用数组保存数据。
- 提供自己的 `hasNext` 和 `next` 方法。

### 54. Iterable 支持增强 for

定义一个班级类 `ClassRoom`，内部保存学生列表。

要求：

- 实现 `Iterable<String>`。
- 让 `ClassRoom` 可以使用增强 for 遍历。

---

## 八、Java Object，55-61

### 55. 重写 toString

定义 `Book` 类，包含书名、作者、价格。

要求：

- 重写 `toString()`。
- 直接打印对象时输出友好信息。

### 56. 重写 equals

定义 `User` 类，包含用户名和手机号。

要求：

- 用户名和手机号都相同视为同一个用户。
- 重写 `equals()`。

### 57. 重写 hashCode

在第 56 题基础上重写 `hashCode()`。

要求：

- 将多个相同用户放入 `HashSet`。
- 验证去重效果。

### 58. getClass 获取类信息

创建几个不同对象。

要求：

- 使用 `getClass()` 获取类名。
- 输出完整类名和简单类名。

### 59. Object 多态数组

创建 `Object[]` 数组，保存字符串、整数、学生对象。

要求：

- 遍历数组。
- 使用 `instanceof` 判断真实类型。

### 60. clone 浅拷贝体验

定义一个实现 `Cloneable` 的类。

要求：

- 重写 `clone()`。
- 比较原对象和克隆对象是否为同一个对象。

### 61. Objects 工具类

练习 `java.util.Objects`。

要求：

- 使用 `Objects.equals` 比较字符串。
- 使用 `Objects.isNull` 判断空。
- 使用 `Objects.requireNonNull` 做非空校验。

---

## 九、Java NIO Files，62-70

### 62. 创建文件

使用 `java.nio.file.Files` 创建一个文本文件。

要求：

- 文件不存在时创建。
- 文件存在时提示已存在。

### 63. 写入文本文件

使用 `Files.write` 向文件写入多行文本。

要求：

- 使用 UTF-8 编码。
- 写入后提示成功。

### 64. 读取文本文件

使用 `Files.readAllLines` 读取文本文件。

要求：

- 按行输出内容。
- 处理文件不存在异常。

### 65. 复制文件

使用 `Files.copy` 复制文件。

要求：

- 源文件路径从控制台输入。
- 目标文件路径从控制台输入。
- 如果目标文件已存在，提示用户。

### 66. 删除文件

使用 `Files.deleteIfExists` 删除文件。

要求：

- 文件存在则删除。
- 文件不存在则提示。

### 67. 遍历目录

使用 `Files.list` 遍历指定目录。

要求：

- 输出目录下所有文件和文件夹名称。
- 区分普通文件和目录。

### 68. 递归遍历目录

使用 `Files.walk` 递归遍历目录。

要求：

- 输出所有文件路径。
- 统计普通文件数量。

### 69. 统计文件大小

输入一个文件路径，输出文件大小。

要求：

- 使用 `Files.size`。
- 输出单位为字节和 KB。

### 70. 简易文件搜索

输入目录路径和关键字，搜索文件名包含关键字的文件。

要求：

- 使用 `Files.walk`。
- 输出匹配文件完整路径。

---

## 十、Java 泛型，71-78

### 71. 泛型方法打印数组

编写泛型方法 `printArray`。

要求：

- 可以打印 `String[]`。
- 可以打印 `Integer[]`。
- 可以打印自定义对象数组。

### 72. 泛型类 Box

定义泛型类 `Box<T>`。

要求：

- 可以保存任意类型数据。
- 提供 `get` 和 `set` 方法。

### 73. 泛型集合类型安全

分别创建不使用泛型和使用泛型的集合。

要求：

- 观察不使用泛型时可能出现的类型转换问题。
- 说明泛型的好处。

### 74. 泛型通配符读取

定义方法接收 `List<?>`。

要求：

- 可以传入 `List<String>`。
- 可以传入 `List<Integer>`。
- 遍历输出元素。

### 75. 泛型上限

定义方法接收 `List<? extends Number>`。

要求：

- 支持 `List<Integer>`。
- 支持 `List<Double>`。
- 计算所有数字总和。

### 76. 泛型下限

定义方法接收 `List<? super Integer>`。

要求：

- 向集合中添加整数。
- 理解下限通配符的使用场景。

### 77. 泛型接口

定义泛型接口 `Repository<T>`。

要求：

- 包含 `save(T data)` 和 `findById(String id)` 方法。
- 创建 `UserRepository` 实现类。

### 78. 泛型工具类

定义工具类 `ArrayUtils`。

要求：

- 编写泛型方法交换数组中两个元素。
- 支持不同类型数组。

---

## 十一、Java 序列化，79-84

### 79. 对象序列化到文件

定义 `Student` 类，实现 `Serializable`。

要求：

- 将学生对象写入文件。
- 使用 `ObjectOutputStream`。

### 80. 从文件反序列化对象

读取第 79 题保存的对象。

要求：

- 使用 `ObjectInputStream`。
- 输出学生信息。

### 81. transient 关键字

在 `Student` 类中添加密码字段。

要求：

- 使用 `transient` 修饰密码。
- 序列化和反序列化后观察密码字段变化。

### 82. 序列化多个对象

创建多个 `Student` 对象。

要求：

- 使用 `ArrayList<Student>` 保存。
- 将整个集合序列化到文件。
- 再读取并遍历输出。

### 83. serialVersionUID

给可序列化类添加 `serialVersionUID`。

要求：

- 理解它的作用。
- 尝试修改类字段后再反序列化。

### 84. 简易联系人持久化

定义联系人类 `Contact`。

要求：

- 添加联系人后序列化保存。
- 程序启动时读取联系人文件。
- 实现简单的查看联系人功能。

---

## 十二、Java 网络编程，85-90

### 85. TCP 服务端

编写一个 TCP 服务端。

要求：

- 监听本机端口。
- 接收客户端发送的一行文本。
- 打印客户端消息。

### 86. TCP 客户端

编写一个 TCP 客户端。

要求：

- 连接第 85 题服务端。
- 从控制台输入消息并发送。

### 87. TCP 回声服务器

在 TCP 服务端中实现回声功能。

要求：

- 客户端发送什么，服务端返回什么。
- 客户端接收并打印服务端响应。

### 88. 多客户端连接

改造 TCP 服务端支持多个客户端。

要求：

- 每个客户端连接创建一个线程处理。
- 服务端可以同时处理多个客户端。

### 89. UDP 消息发送

编写 UDP 发送端。

要求：

- 向指定 IP 和端口发送消息。
- 消息内容从控制台输入。

### 90. UDP 消息接收

编写 UDP 接收端。

要求：

- 监听指定端口。
- 接收并打印 UDP 消息。

---

## 十三、Java 发送邮件，91-94

### 91. 邮件参数配置类

定义 `MailConfig` 类保存邮件配置。

要求：

- SMTP 地址。
- 端口。
- 发件人账号。
- 授权码。
- 是否启用 SSL。

### 92. 构建邮件内容

定义 `MailMessage` 类。

要求：

- 收件人。
- 邮件标题。
- 邮件正文。
- 支持多个收件人。

### 93. 使用 JavaMail 发送文本邮件

使用 JavaMail 或 Jakarta Mail 发送一封文本邮件。

要求：

- 从控制台输入收件人、标题、正文。
- 邮箱授权码不要硬编码在代码中。
- 可以从环境变量读取授权码。

### 94. 邮件发送异常处理

在第 93 题基础上完善异常处理。

要求：

- 邮箱配置错误时输出友好提示。
- 收件人格式错误时输出友好提示。
- 发送成功后输出成功信息。

---

## 十四、Java 多线程编程，95-100

### 95. 继承 Thread 创建线程

创建一个类继承 `Thread`。

要求：

- 重写 `run()` 方法。
- 启动 3 个线程。
- 每个线程输出自己的名称。

### 96. 实现 Runnable 创建线程

创建一个类实现 `Runnable`。

要求：

- 使用 `new Thread(runnable)` 启动线程。
- 对比 Runnable 和 Thread 的区别。

### 97. 多线程售票

模拟 100 张票由 3 个窗口同时售卖。

要求：

- 使用共享变量表示剩余票数。
- 观察线程安全问题。
- 使用 `synchronized` 修复问题。

### 98. 生产者消费者

使用 `wait` 和 `notify` 实现生产者消费者模型。

要求：

- 一个线程生产数据。
- 一个线程消费数据。
- 仓库为空时消费者等待。
- 仓库满时生产者等待。

### 99. 线程池基础使用

使用 `ExecutorService` 创建固定大小线程池。

要求：

- 提交 10 个任务。
- 每个任务输出线程名。
- 任务结束后关闭线程池。

### 100. Callable 和 Future

使用 `Callable<Integer>` 计算 1 到 100 的和。

要求：

- 使用线程池提交任务。
- 使用 `Future.get()` 获取结果。
- 输出计算结果。

---

## 完成标准

完成本题库后，应能熟练使用：

1. `ArrayList`、`LinkedList`、`HashSet`、`HashMap` 等集合。
2. `Iterator`、`ListIterator` 遍历和安全删除元素。
3. `Object` 常用方法，如 `toString`、`equals`、`hashCode`。
4. `Files`、`Path` 等 NIO 文件 API。
5. 泛型类、泛型方法、通配符上下限。
6. `Serializable`、`ObjectOutputStream`、`ObjectInputStream`。
7. `Socket`、`ServerSocket`、`DatagramSocket`。
8. 邮件配置和发送流程。
9. `Thread`、`Runnable`、`synchronized`、线程池、`Callable`、`Future`。
