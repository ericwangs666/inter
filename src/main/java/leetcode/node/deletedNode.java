package leetcode.node;


import com.alibaba.fastjson2.JSON;
import org.junit.Test;

public class deletedNode {

//203.移除链表元素
//    力扣题目链接(opens new window)
//    题意：删除链表中等于给定值 val 的所有节点。
//    示例 1： 输入：head = [1,2,6,3,4,5,6], val = 6 输出：[1,2,3,4,5]
//    示例 2： 输入：head = [], val = 1 输出：[]
//    示例 3： 输入：head = [7,7,7,7], val = 7 输出：[]


    public ListNode removeElements(ListNode head, int val) {

        //删除头节点
        while (head != null && head.val == val) {
            head = head.next;
        }
        //删除非头节点
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.next.val == val) {
                //删除当前节点，就是当前节点现在等于当前节点的下一个节点
                cur.next = cur.next.next;
            } else {
                //向下走一位
                cur = cur.next;
            }
        }

        return head;
    }

    public ListNode removeElement(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        // 已经为null，提前退出
        if (head == null) {
            return null;
        }
        // 已确定当前head.val != val
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
    public ListNode removeElementss(ListNode head, int val) {
        // 设置一个虚拟的头结点
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode cur = dummy;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    @Test
    public void test() {
        ListNode node = new ListNode();
        node.val = 1;
        node.next = new ListNode(2);
        node.next.val = 6;
        node.next.next = new ListNode(3);
        node.next.next.val = 4;
        node.next.next.next = new ListNode(4);
        node.next.next.next.val = 6; // 再添加一个值为6的节点用于测试

        ListNode listNode = removeElements(node, 1);
        System.out.println(JSON.toJSONString(listNode));
    }

    public class ListNode {
        // 结点的值
        int val;

        // 下一个结点
        ListNode next;

        // 节点的构造函数(无参)
        public ListNode() {
        }

        // 节点的构造函数(有一个参数)
        public ListNode(int val) {
            this.val = val;
        }

        // 节点的构造函数(有两个参数)
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        // 添加 getter 方法以便序列化
        public int getVal() {
            return val;
        }

        public ListNode getNext() {
            return next;
        }
    }

}
