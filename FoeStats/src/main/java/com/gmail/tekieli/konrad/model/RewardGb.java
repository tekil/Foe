package com.gmail.tekieli.konrad.model;

import org.json.JSONObject;

import com.gmail.tekieli.konrad.Utils;

public class RewardGb
{

    private Integer blueprints;

    private String _class;

    private Integer strategy_point_amount;

    public RewardGb(JSONObject obj) {
        super();
        this.blueprints = Utils.setValueInt("blueprints", obj);;
        this._class = Utils.setValueString("__class__", obj);
        this.strategy_point_amount = Utils.setValueInt("strategy_point_amount", obj);;
    }

    public Integer getBlueprints() {
        return blueprints;
    }

    public void setBlueprints(Integer blueprints) {
        this.blueprints = blueprints;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public Integer getStrategy_point_amount() {
        return strategy_point_amount;
    }

    public void setStrategy_point_amount(Integer strategy_point_amount) {
        this.strategy_point_amount = strategy_point_amount;
    }

    @Override
    public String toString() {
        return "RewardGb [blueprints=" + blueprints + ", _class=" + _class + ", strategy_point_amount=" + strategy_point_amount + "]";
    }


   
}