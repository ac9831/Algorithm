/**
 * Created by gunjunLee on 2016-08-13.
 */
public class Queue {

    public static void main(String[] args){

    }

    public class ArrayQueue {

        // 큐 배열은 front와 rear 그리고 maxSize를 가진다.
        private int front;
        private int rear;
        private int maxSize;
        private Object[] queueArray;

        // 큐 배열 생성
        public ArrayQueue(int maxSize){

            this.front = 0;
            this.rear = -1;
            this.maxSize = maxSize;
            this.queueArray = new Object[maxSize];
        }

        // 큐가 비어있는지 확인
        public boolean empty(){
            return (front == rear+1);
        }

        // 큐가 꽉 찼는지 확인
        public boolean full(){
            return (rear == maxSize-1);
        }

        // 큐 rear에 데이터 등록
        public void insert(Object item){

            if(full()) throw new ArrayIndexOutOfBoundsException();

            queueArray[++rear] = item;
        }

        // 큐에서 front 데이터 조회
        public Object peek(){

            if(empty()) throw new ArrayIndexOutOfBoundsException();

            return queueArray[front];
        }

        // 큐에서 front 데이터 제거
        public Object remove(){

            Object item = peek();
            front++;
            return item;
        }

    }

    public class ListQueue {

        private class Node{

            // 노드는 data와 다음 노드를 가진다.
            private Object  data;
            private Node nextNode;

            Node(Object data){
                this.data = data;
                this.nextNode = null;
            }
        }

        // 큐는 front노드와 rear노드를 가진다.
        private Node front;
        private Node rear;

        public ListQueue(){
            this.front = null;
            this.rear = null;
        }

        // 큐가 비어있는지 확인
        public boolean empty(){
            return (front==null);
        }

        // item을 큐의 rear에 넣는다.
        public void insert(Object item){

            Node node = new Node(item);
            node.nextNode = null;

            if(empty()){

                rear = node;
                front = node;

            }else{

                rear.nextNode = node;
                rear = node;

            }
        }

        // front 의 데이터를 반환한다.
        public Object peek(){
            if(empty()) throw new ArrayIndexOutOfBoundsException();
            return front.data;
        }

        // front 를 큐에서 제거한다.
        public Object remove(){

            Object item = peek();
            front = front.nextNode;

            if(front == null){
                rear = null;
            }

            return item;
        }
    }


}
