package pro.dengyi;

import java.io.Serializable;
import java.util.TreeMap;

public class SuperPojo extends TreeMap<String, Object> implements Serializable {


  private static final long serialVersionUID = 4601512145302053970L;

  public SuperPojo setPropertity(String key, Object value) {
    this.put(key, value);
    return this;
  }

}
