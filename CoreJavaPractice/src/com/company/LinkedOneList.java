package com.company;

class LinkedTwoList{

    NodeType head;

    class NodeType {

        int data;
        NodeType next;

        NodeType(int d) {
            data = d;
        }

    }
        public  LinkedTwoList LinkedInsert(LinkedTwoList lisOfNodes, int Data){

            NodeType new_Node      = new NodeType(Data);
                     new_Node.next = null ;

                     if(lisOfNodes.head == null)
                     { lisOfNodes.head = new_Node; }
                     else
                     { NodeType last_Node = lisOfNodes.head;
                     while (last_Node.next != null){
                         last_Node = last_Node.next;
                     }
                     last_Node.next = new_Node;

                     }
            return lisOfNodes;
        }


    }

public class LinkedOneList {

    public static void main(String[] args) {

        LinkedTwoList list = new LinkedTwoList();

        list.LinkedInsert(list, 5);
        list.LinkedInsert(list, 7);
        list.LinkedInsert(list, 5);
        list.LinkedInsert(list, 9);
        list.LinkedInsert(list, 5);
        list.LinkedInsert(list, 8);
        list.LinkedInsert(list, 52);
        list.LinkedInsert(list, 2);
        list.LinkedInsert(list, 1);



    }


}
