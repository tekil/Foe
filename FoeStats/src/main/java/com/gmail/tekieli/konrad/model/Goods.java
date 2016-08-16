package com.gmail.tekieli.konrad.model;

import org.json.JSONObject;

import com.gmail.tekieli.konrad.Utils;

public class Goods {
    private String good_id;
    private Integer value;
    private String _class;
    
    public Goods(JSONObject obj) {
        super();
        this.good_id = Utils.setValueString("good_id", obj);
        this.value = Utils.setValueInt("value", obj);
        this._class = Utils.setValueString("__class__", obj);
    }
    
    public String getGood_id() {
        return good_id;
    }
    public void setGood_id(String good_id) {
        this.good_id = good_id;
    }
    public Integer getValue() {
        return value;
    }
    public void setValue(Integer value) {
        this.value = value;
    }
    public String get_class() {
        return _class;
    }
    public void set_class(String _class) {
        this._class = _class;
    }
    @Override
    public String toString() {
        return "Goods [good_id=" + good_id + ", value=" + value + ", _class=" + _class + "]";
    }
    
}
