
# 一、Collection接口
### 三级标题
#### 四级标题
##### 五级标题

**文字加粗阿萨德**
*我是斜体*
- **无序列表1**
- 无序列表2
- 无序列表3

`特殊标记`
1. 有序列表1
2. 有序列表2
3. 有序列表3
> 这是引入文字
---
# 一、Collection接口

>Collection接口是所有后续集合类型的一个公共抽象定义。  
>它本身没有一个直接的实现。  
>更多的是各种不同的集合类型在它的基础上继承了更多特殊的特性并做了一个实现。

###接口的主要方法包括：
- size()：集合内的对象数量
- add(E)/addAll(Collection)：向集合内添加单个/批量对象
- remove(Object)/removeAll(Collection)：从集合内删除单个/批量对象
- contains(Object)/containsAll(Collection)：判断集合中是否存在某个/某些对象
- toArray()：返回包含集合内所有对象的数组
- iterator()：返回Iterator对象，用于遍历集合中的元素

#二、List接口
###1. List接口概述
>List接口继承自Collection，
用于定义以列表形式存储的集合，List接口为集合中的每个对象分配了一个索引(index)，
标记该对象在List中的位置，并可以通过index定位到指定位置的对象。

###2. List类型集合特点：
集合中的元素有序且可重复,有下标。

注:有序指的是元素放到集合中的顺序和循环遍历出来的顺序一致。
###3. List接口常见的实现类有:
ArrayList、LinkedList、Vector等。
###4. 各个实现类区别：
对于数据的随机访问,ArrayList效率优于LinkedList,因为LinkedList要移动指针。  
对于新增和删除操作add和remove,LinedList比较占优势，因为ArrayList要移动数据。  
Vector是线程安全的集合,但是速度慢

5. List在Collection基础上增加的主要方法包括：
   - get(int) - 返回指定index位置上的对象
   - add(E)/add(int, E) - 在List末尾/指定index位置上插入一个对象
   - set(int, E) - 替换置于List指定index位置上的对象
   - indexOf(Object) - 返回指定对象在List中的index位置
   - subList(int,int) - 返回指定起始index到终止index的子List对象
   - ListIterator<E> - Iterator的子接口,List特有迭代器
   
 ###  `为什么要有这个特定的Iterator子接口：`
   在迭代时，不可以通过集合对象的方法操作集合中的元素。因为会发生ConcurrentModificationException异常。
   所以，在迭代器时，只能用迭代器的放过操作元素，可是Iterator方法是有限的，只能对元素进行判断，取出，删除的操作，
   如果想要其他的操作如添加，修改等，就需要使用其子接口，ListIterator。该接口只能通过List集合的listIterator方法获取。