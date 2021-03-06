package com.jianyu.concurrent.blockingqueue;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * 链阻塞队列 LinkedBlockingQueue
 * 
 * @author BaiJianyu <br>
 * @date 2018年5月14日下午4:40:44 <br>
 * Better late than never. <br>
 */
public class LinkedBlockingQueueTest {
	public static void main(String[] args) throws InterruptedException {
		LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<String>(1024);
		System.out.print("add添加一个元素："+queue.add("aaa"));
		System.out.println(queue);
		System.out.print("【推荐】offer添加一个元素："+queue.offer("bbb"));
		System.out.println(queue);
		System.out.print("【阻塞等待】put添加一个元素：");
		queue.put("ccc");
		queue.put("ddd");
		queue.put("eee");
		System.out.println(queue);
		System.out.print("remove移除指定元素："+queue.remove("ccc"));
		System.out.println(queue);
		System.out.print("remove移除不存在的元素："+queue.remove("zzz"));
		System.out.println(queue);
		
		System.out.print("poll获取并移除队列头部的元素："+queue.poll());
		System.out.println(queue);
		System.out.print("【阻塞等待】take获取并移除队列头部的元素："+queue.take());
		System.out.println(queue);
		System.out.println("----");
		System.out.print("peek获取队列头部的元素："+queue.peek());
		System.out.println(queue);
	}
}
