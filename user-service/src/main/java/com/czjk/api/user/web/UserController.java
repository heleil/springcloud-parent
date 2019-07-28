/*
package com.czjk.api.user.web;

import com.czjk.api.user.pojo.User;
import com.czjk.api.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Random;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    Random random = new Random();

    @RequestMapping("{id}")
    public User queryById(@PathVariable("id") Long id) {
        try {
            Thread.sleep(random.nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User user = userService.queryById(id);
        return user;
    }

    public class Singleton{
        private Singleton(){}
        private static Singleton getinstance = new Singleton();
        public void  Singleton singleton(){
            if(getinstance == null){}
            return getinstance;
        }
    }
   */
/* public void sort(int []arr){
        int count=0;
        for(int x=0;x<arr.length-1;x++){
            for(int y=0;y<arr .length-x-1;y++){
                if(arr[y]>arr[y+1]){
                    int temp=0;
                    temp=arr[y];
                    arr[y]=arr[y+1];
                    arr[y+1]=temp;
                }
            }
        }
    }*//*

   public void sort(int []arr){
       for(int i=0;i<arr.length-1;i++){
           for(int j=0;j<arr.length-i-1;j++){
               if(arr[j+1]<arr[j]){
                   int temp=0;
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }
   }

    public static void main(String[]args){
        int [] arr={12,4,6,3,8,9};
        UserController userController = new UserController();
       userController.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
   */
/* public static void arr(int []arr) {
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
            //System.out.println(i+"");
        }
        System.out.println(count+",次数");
    }

    public static void main(String[] args) {
        int [] x = {12,4,7,8,3,9};
        arr( x);
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]+"");
        }

    }*//*


}
*/
/*public class TestMaoPao {

     public static void sortBub(int [] arr) {
                         //总的交换次数
            int count =0;
                         //遍历数组的趟数
            for( int i =0; i< arr. length-1; i++) {

                 for( int j =0; j< arr. length- i-1; j++) {
                //比较前一个元素与后一个元素的大小，将每趟中最大的元素放在末尾，
               // 末尾的元素再下一趟  不用再比较，所以 是  j< arr. length- i-1
                    //交换前后两个元素的位置
                      if( arr[ j]> arr[ j+1]) {
                            int temp = arr[ j];
                            arr[ j]= arr[ j+1];
                            arr[ j+1]= temp;
                            count++;
                     }
                }
           }
           System. out.println( "交换次数"+count );
     }

     public static void main(String[] args) {

            int [] arr = {2,23,1,34,23,45,12};
            sortBub(arr);
            for( int i=0; i< arr. length; i++) {
                System. out.print( arr[ i]+ " ");
           }
     }
}

* *//*


class Singleton{
    private Singleton(){}
    private static Singleton singleton;
    public static Singleton getSingleton(){
        if(singleton ==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
*/
