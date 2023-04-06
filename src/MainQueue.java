/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rrizz
 */
import java.util.*;
public class MainQueue {
    public static void queueExample() {
        Queue queue = new LinkedList();
        queue.add ("Java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");
        System.out.println("remove: " + queue.remove());
        System.out.println("elememt: " + queue.element());
        System.out.println("poll: " + queue.poll());
        System.out.println("peek: " + queue.peek());
    }
    
    public static void main (String args[]){
        MainQueue.queueExample();
    }
}
