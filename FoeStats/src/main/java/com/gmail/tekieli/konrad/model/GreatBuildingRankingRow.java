package com.gmail.tekieli.konrad.model;

import org.json.JSONObject;

import com.gmail.tekieli.konrad.Utils;

public class GreatBuildingRankingRow {

    private Integer forge_points;

    private Integer rank;

    private RewardGb reward;
    
    private String _class;
    
    public GreatBuildingRankingRow(JSONObject obj) {
        super();
        this.forge_points =   Utils.setValueInt("forge_points", obj);
        
        if (obj.has("rank")) {
            this.rank =  Utils.setValueInt("rank", obj);
        } else {
            this.rank =  null;
        }
        if (obj.has("reward")) {
            this.reward = new RewardGb(obj.getJSONObject("reward"));
        } else {
            this.reward = null;
        }
        this._class = Utils.setValueString("__class__", obj);
    }
    

    public Integer getForge_points() {
        return forge_points;
    }

    public void setForge_points(Integer forge_points) {
        this.forge_points = forge_points;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public RewardGb getReward() {
        return reward;
    }

    public void setReward(RewardGb reward) {
        this.reward = reward;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    @Override
    public String toString() {
        return "GreatBuildingRankingRow [forge_points=" + forge_points + ", rank=" + rank + ", reward=" + reward + ", _class=" + _class + "]";
    }


    
    
}
