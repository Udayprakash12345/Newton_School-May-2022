/*

  class Queue{ 
    static final int MAX = 10000; 
    int rear=0,front=0; 
    int a[] = new int[MAX]; 
}
   int rear=0,front=0; //pointer to rear and front
    int a[] //array that contain elements of queue
*/ 
public static void enqueue(int x, int k)
    {
      if(rear == k) {
        System.out.println("Queue is full") ;
      }
      else{
        if(front == -1) {
          front = 0 ;
        }
        //rear++ ;
        a[rear++] = x ;

      }
    }


   public static  void dequeue()
    {
      if(rear == front) {
        System.out.println("Queue is empty") ;
      }
      else {
        if(front >= rear) {
          front = -1 ;
          rear = -1 ;
        }
        else {
          front++ ;
        }
      }
    }

    public static void displayfront()
    {
      if(front == rear) {
        System.out.println("Queue is empty") ;
      }
      else{
        System.out.println(a[front]) ;
      }
    }
}
