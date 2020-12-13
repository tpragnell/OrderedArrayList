import java.util.ArrayList;
import java.lang.IllegalArgumentException;
import java.util.Collections;


public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList() {
    new ArrayList<T>(0);
  }

  public OrderedArrayList(int _startingCapacity) {
    new ArrayList<T>(_startingCapacity);
  }

  public T set(int _index, T _value){
    T ans = super.get(_index);
    super.set(_index, _value);
    Collections.sort(this);
    return ans;

  }

  public boolean add(T _value){
    Boolean b = super.add(_value);
    Collections.sort(this);
    return b;
  }

  public void add(int _index, T _value){
    super.add(_index, _value);
    Collections.sort(this);
  }
}
