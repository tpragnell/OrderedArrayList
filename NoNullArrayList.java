import java.util.ArrayList;
import java.lang.IllegalArgumentException;
;

public class NoNullArrayList<T> extends ArrayList<T> {
  private ArrayList<T> list;

  public NoNullArrayList() {
    list = new ArrayList<T>(0);
  }

  public NoNullArrayList(int _startingCapacity) {
    list = new ArrayList<T>(_startingCapacity);
  }

  public T set(int _index, T _value) throws IllegalArgumentException{
    if(_value == null)
      throw new IllegalArgumentException();
    list.set(_index, _value);
    return _value;
  }

  public boolean add(T _value) throws IllegalArgumentException{
    if(_value == null)
      throw new IllegalArgumentException();
    return list.add(_value);
  }

  public void add(int _index, T _value) throws IllegalArgumentException{
    if(_value == null)
      throw new IllegalArgumentException();
    list.add(_index, _value);
  }
}
