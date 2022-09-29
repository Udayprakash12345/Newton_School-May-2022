/*
// Information about the class Node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
static int minValue(Node node)
 {
  if(node==null) {
   return -1;
  }
  int min=node.data;
  while(node.left!=null) {
    min=node.left.data;
    node=node.left;
  }  
  return min;

 }
