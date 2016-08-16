
package com.gmail.tekieli.konrad.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.gmail.tekieli.konrad.Utils;

public class Revenue {

    private Integer money;
    private List<Goods> goods = new ArrayList<Goods>();
    private String _class;
    private Integer strategy_points;
    public Integer getStrategy_points() {
        return strategy_points;
    }


    public void setStrategy_points(Integer strategy_points) {
        this.strategy_points = strategy_points;
    }

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Revenue(JSONObject obj) {
        if(obj.has("goods")){
            for (int i = 0; i < obj.getJSONArray("goods").length(); i++) {
                this.goods.add(new Goods(obj.getJSONArray("goods").getJSONObject(i)));
            }
        }else{
            this.goods = null;
        }
        if(obj.has("strategy_points")){
            this.strategy_points = Utils.setValueInt("currentSP", obj.getJSONObject("strategy_points"));
        }else{
            this.strategy_points =  null;
        }
        this._class = Utils.setValueString("__class__", obj);
        this.money = Utils.setValueInt("money", obj);
        this._class = Utils.setValueString("__class__", obj);
    }


    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    @Override
    public String toString() {
        return "Revenue [money=" + money + ", goods=" + goods + ", _class=" + _class + ", strategy_points=" + strategy_points
                + ", additionalProperties=" + additionalProperties + "]";
    }

   

}
