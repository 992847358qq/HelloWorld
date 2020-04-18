package dataAlgorithm.tree.sortTree;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/22 17:03
 **/
public class BinaryT {
    //定义一个根节点
    Node root;


    /**
     * 增加节点
     * @param node
     */
    public void add(Node node){
        if (root == null){
            root =node;
        }else {
            root.add(node);
        }
    }
    //中序遍历
    public void midShow(){
        if (root!=null){
            root.midShow(root);
        }
    }
    //查找子节点
    public Node search(Node node){
        if (root == null){
            return null;
        }else {
                return root.search(node);
        }
    }

    public void deleteNode(Node node){
        if (root == null){
            return;
        }else {
            //找到这个节点
            Node target = search(node);
            if (target==null){
                return;
            }
            //找到他的父节点
            Node parent = searchParent(node);
            //要删除的节点是叶子节点
            if (target.leftNode==null && target.rightNode==null){
                //要删除的节点是父节点的左子节点
                if (parent.leftNode.value == node.value){
                    parent.leftNode =null;
                }else {
                    parent.rightNode = null;
                }
                //要删除的节点有两个子节点的情况
            } else if (target.leftNode!=null && target.rightNode!=null) {
                //删除右子树中值最小的节点，并获取到该节点的值
                    int min = deleteMin(target.rightNode);
                    //替换目标节点中的值
                    target.value = min;
                //要删除的节点有一个左子节点或右子节点
            }else {
                //有左子节点
                if (target.leftNode!=null){
                    //要删除的节点是父节点的左子节点
                    if (parent.leftNode.value == node.value){
                        parent.leftNode = target.leftNode;
                        //要删除的节点是父节点的右子节点
                    }
                    parent.rightNode = target.leftNode;
                    //有右子节点
                }else {
                    //要删除的节点是父节点的右子节点
                    if (parent.leftNode.value == node.value){
                        parent.leftNode = target.rightNode;
                        //要删除的节点是父节点的右子节点
                    }
                    parent.rightNode = target.rightNode;
                }
            }

        }
    }
    //删除右子树中最小的节点
    private int deleteMin(Node node) {
        //定义一个标志
        Node target = node;
        while (target.leftNode!=null){
            target =target.leftNode;
        }
        //删除最小的这个节点
        deleteNode(target);
        return target.value;
    }

    /**
     * 查找叶子节点的父节点
     * @param node
     * @return
     */
    public Node searchParent(Node node){
        if (root == null){
            return null;
        }
        if (node==null){
            return null;
        }
        return root.searchParent(node);
    }
}
