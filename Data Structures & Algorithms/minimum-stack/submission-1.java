class MinStack {

    private ArrayList<Integer> stackElement;
    private int size;
    private ArrayList<Integer> minStackElement;

    public MinStack() {
        stackElement = new ArrayList<>();
        size = 0;
        minStackElement = new ArrayList<>();
    }
    
    public void push(int val) {
        stackElement.add(val);
        size++;

        if(minStackElement.size() == 0 || val <= minStackElement.get(minStackElement.size()-1)){
            minStackElement.add(val);
        }
        
    }
    
    public void pop() {
        int temp = stackElement.get(size-1);
        stackElement.remove(size-1);
        size--;

        if(temp == minStackElement.get(minStackElement.size()-1)){
            minStackElement.remove(minStackElement.size()-1);
        }
    }
    
    public int top() {
        return stackElement.get(size-1);
        
    }
    
    public int getMin() {
        return minStackElement.get(minStackElement.size()-1);
    }
}
