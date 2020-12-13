import java.util.ArrayList;
import java.lang.IllegalArgumentException;
;

public class NoNullArrayList<T> extends ArrayList<T> {
  private ArrayList<T> list;

  public NoNullArrayList() {
    ArrayList<T> list = new ArrayList<T>(0);
  }

  public T set(int _index, T _value) throws IllegalArgumentException{
    if(_value == null)
      throw new IllegalArgumentException();
    list.set(_index, _value);
    return _value;
  }
}
