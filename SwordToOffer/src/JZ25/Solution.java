package JZ25;

import utils.RandomListNode;

import java.util.HashMap;

public class Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode p = pHead;
        //第一次遍历 新建立节点
        while (p != null) {
            RandomListNode newNode = new RandomListNode(p.label);
            map.put(p, newNode);
            p = p.next;
        }
        //第二次遍历 赋值映射关系
        p = pHead;
        while (p != null) {
            RandomListNode node = map.get(p);
            node.next = (p.next == null) ? null : map.get(p.next);
            node.random = (p.random == null) ? null : map.get(p.random);
            p = p.next;
        }
        return map.get(pHead);
    }
}
