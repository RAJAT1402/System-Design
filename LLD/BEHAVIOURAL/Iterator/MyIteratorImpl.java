package Iterator;

import java.util.List;

public class MyIteratorImpl implements MyIterator{

    private List<User> list;
    private int length;
    private int pos;

    public MyIteratorImpl(List<User> list){
        this.list = list;
        this.length = list.size();
        this.pos = 0;
    }

    @Override
    public boolean hasNext(){
        if(this.pos < this.length){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next(){
        User user = this.list.get(pos);
        this.pos += 1;

        return user;
    }
}