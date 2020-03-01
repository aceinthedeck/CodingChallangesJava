package com.aceinthedeck.linkedlists.tests;

import com.aceinthedeck.linkedlists.AddTwoNumbers;
import com.aceinthedeck.linkedlists.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {

    @Test
    public void test1(){

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);

        int output = 0;
        while(result!=null){
            output =  output*10 + result.val;
            result = result.next;
        }

        Assert.assertEquals(708, output);

    }

}
