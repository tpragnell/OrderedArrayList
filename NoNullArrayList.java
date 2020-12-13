import java.util.ArrayList;
import java.lang.IllegalArgumentException;


public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    new ArrayList<T>(0);
  }

  public NoNullArrayList(int _startingCapacity) {
    new ArrayList<T>(_startingCapacity);
  }

  public T set(int _index, T _value) throws IllegalArgumentException{
    if(_value == null)
      throw new IllegalArgumentException();
    T ans = super.get(_index);
    super.set(_index, _value);
    return ans;

  }

  public boolean add(T _value) throws IllegalArgumentException{
    if(_value == null)
      throw new IllegalArgumentException();
    return super.add(_value);
  }

  public void add(int _index, T _value) throws IllegalArgumentException{
    if(_value == null)
      throw new IllegalArgumentException();
    super.add(_index, _value);
  }
}
