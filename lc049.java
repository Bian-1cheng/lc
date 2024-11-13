package lc.lc;

import java.util.*;


/**
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 *
 * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
 */
public class lc049 {

    public static void main(String[] args) {
        List<List<String>> listList = groupAnagrams(new String[]{"duh", "ill","add","daa","dad"});
        for(List item : listList){
            for(Object childItem : item){
                System.out.print(childItem+",");
            }
            System.out.println();
        }
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<List<String>> list = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        int i=0;
        for(String item : strs){
            int num = getInt(item);
            if(!hashSet.contains(num)){
                List<String> listStr = new ArrayList<String>();
                listStr.add(item);
                list.add(listStr);
                hashMap.put(num,i++);

                hashSet.add(num);
            }else{
                Integer index = hashMap.get(num);
                List<String> strings = list.get(index);
                String s = strings.get(0);
                boolean flag = true;
                for(int j=0;j<s.length();j++){
                    if(!item.contains(s.charAt(j)+"")){
                        List<String> listStr = new ArrayList<String>();
                        listStr.add(item);
                        list.add(listStr);
                        hashMap.put(num,i++);
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    strings.add(item);
            }
        }
        return list;
    }

    public static int getInt(String str){
        char[] charArray = str.toCharArray();
        int result = 0;
        for(char item : charArray){
            result += (int)item;
        }
        return result;
    }

    public List<List<String>> groupAnagramsV2(String[] strs) {
        Map<String, List<String>> hashMap =  new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String str_s = String.valueOf(chars);
            if (hashMap.containsKey(str_s)){
                hashMap.get(str_s).add(str);
            } else {
                ArrayList<String> strings = new ArrayList<>();
                strings.add(str);
                hashMap.put(str_s, strings);
            }
        }
        List<List<String>> resultList = new ArrayList<>(hashMap.values());
        return resultList;
    }
}




