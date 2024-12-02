public class Generic<T> {
    
    private T content;
    
    public void putSomething(T content){
        this.content = content;
    }

    public T getSomething(){
        return content;
    }
}
