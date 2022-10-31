package Mission5;

import java.util.*;

public class Work {
    private String Str;

    public void setStr(String str) {
        Str = str;
    }

    public Work(String str) {
        Str = str;
    }

    public void Alter(){
        System.out.print("请输入你要修改的内容：");
        Scanner myScanner = new Scanner(System.in);
        String temp = myScanner.next();//这个temp什么时候会自动销毁
        setStr(temp);
        System.out.println("修改成功");
    }
    public void display(){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<Str.length();i++){//知键求值
            char temp = Str.charAt(i);
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else{
                map.put(temp,1);
            }
        }//这块目的是将输入的字符串分解后的每一个字符的数量级记录下来
        //知道值求键
        int max = Collections.max(map.values());
        //调用Collections查找类似一维数组的结构中的最大值
         //通过for循环将value与键匹配
        Set<Character>set = new HashSet<>();//用来存放最后的结果，因为有可能多个键对应一个值
        for(Map.Entry<Character,Integer>entry:map.entrySet()){//因为这种遍历方式可以同时得到key和value
            if(entry.getValue()==max){
                set.add(entry.getKey());
            }
        }//固定搭配
        System.out.println("出现次数最多的字母为：" + set + " 最多出现次数为" + max);
    }//关于集合还需要重新复习保证真正掌握

    public static void main(String[] args) {
        Work work =new Work("hhaahahaa");
        work.display();
    }
}
