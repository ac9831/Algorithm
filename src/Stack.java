/**
 * Created by gunjunLee on 2016-08-13.
 */
public class Stack {

    public static void main(String[] args){



    }

    public class ArrayStack {

        private int top;
        private int maxSize;
        private Object[] stackArray;

        private String d = "aaa";
        char[] a = d.toCharArray();

        // 배열 스택 생성,  스택의 최대 크기로 생성
        public ArrayStack(int maxSize){

            this.maxSize = maxSize;
            this.stackArray = new Object[maxSize];
            this.top = -1;
        }

        // 스택이 비어있는지 체크
        public boolean empty(){
            return (top == -1);
        }

        // 스택이 꽉찼는지 체크
        public boolean full(){
            return (top == maxSize-1);
        }

        // 스택에 item 입력
        public void push(Object item){

            if(full()) throw new ArrayIndexOutOfBoundsException((top+1)+">=" + maxSize);

            stackArray[++top] = item;
        }

        // 스택의 가장 위의 데이터 반환
        public Object peek(){

            if(empty()) throw new ArrayIndexOutOfBoundsException(top);

            return stackArray[top];
        }

        // 스택의 가장 위의 데이터 제거
        public Object pop(){

            Object item = peek();

            top--;

            return item;
        }

    }

    public class ListStack {

        private Node top;

        // 노드 class 단순연결리스트와 같다.
        private class Node{

            private Object data;
            private Node nextNode;

            Node(Object data){
                this.data = data;
                this.nextNode = null;
            }
        }

        // 생성자, stack이 비어있으므로 top은 null이다.
        public ListStack(){
            this.top = null;
        }

        // 스택이 비어있는지 확인
        public boolean empty(){
            return (top == null);
        }

        // item 을 스택의 top에 넣는다.
        public void push(Object item){

            Node newNode = new Node(item);
            newNode.nextNode = top;
            top = newNode;

        }

        // top 노드의 데이터를 반환한다.
        public Object peek(){
            if(empty()) throw new ArrayIndexOutOfBoundsException();
            return top.data;
        }

        // top 노드를 스택에서 제거한다.
        public Object pop(){

            Object item = peek();
            top = top.nextNode;
            return item;
        }

    }

}


