package linearSearchMethod;

/**
 * remark: Simple Implementation Linear Search Method
 * Create By Administrator
 * time:2020/7/29
 **/
public class LinearSearchMethodSimple {
    /**
     * 私有化类，不允许外部类创建对象
     */
    private LinearSearchMethodSimple(){}

    public static void main(String[] args) {
        Integer[] a = {5,4,3,76,8,9,0,2};
        int result = LinearSearchMethodSimple.search(a,2);
        System.out.println(result);
    }
    /**
      *@Author:Administrator on2020/7/29 13:17
      *@param:
      *@return:
      *@Description:搜索数组中某一个值,数组类型不确定
      */
    public static <E> int search(E[] data , E target){
        for(int i=0 ; i<data.length ; i++){
            if(data[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
}
