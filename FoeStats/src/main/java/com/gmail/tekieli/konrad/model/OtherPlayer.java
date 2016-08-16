package com.gmail.tekieli.konrad.model;

import org.json.JSONObject;

import com.gmail.tekieli.konrad.Utils;

public class OtherPlayer {
    private Boolean is_friend;

    private String city_name;

    private Boolean is_guild_member;

    private Boolean is_active;

    private Boolean is_neighbor;

    private String name;

    private Integer player_id;

    private String _class;


    public OtherPlayer(JSONObject obj) {
        super();
        this.is_friend = Utils.setValueBoolean("is_friend", obj);;
        this.city_name = Utils.setValueString("city_name", obj);
        this.is_guild_member = Utils.setValueBoolean( "is_guild_member", obj);
        this.is_active =  Utils.setValueBoolean( "is_active", obj);
        this.is_neighbor = Utils.setValueBoolean( "is_neighbor", obj);
        this.name =  Utils.setValueString( "name", obj);
        this.player_id =  Utils.setValueInt("player_id", obj);
        this._class = Utils.setValueString("__class__", obj);
    }


    public OtherPlayer() {
        this.is_friend = null;
        this.city_name = null;
        this.is_guild_member =null;
        this.is_active =  null;
        this.is_neighbor = null;
        this.name =  null;
        this.player_id =  null;
        this._class = null;
    }


    public Boolean getIs_friend() {
        return is_friend;
    }


    public void setIs_friend(Boolean is_friend) {
        this.is_friend = is_friend;
    }


    public String getCity_name() {
        return city_name;
    }


    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }


    public Boolean getIs_guild_member() {
        return is_guild_member;
    }


    public void setIs_guild_member(Boolean is_guild_member) {
        this.is_guild_member = is_guild_member;
    }


    public Boolean getIs_active() {
        return is_active;
    }


    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }


    public Boolean getIs_neighbor() {
        return is_neighbor;
    }


    public void setIs_neighbor(Boolean is_neighbor) {
        this.is_neighbor = is_neighbor;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Integer getPlayer_id() {
        return player_id;
    }


    public void setPlayer_id(Integer player_id) {
        this.player_id = player_id;
    }


    public String get_class() {
        return _class;
    }


    public void set_class(String _class) {
        this._class = _class;
    }


    @Override
    public String toString() {
        return "OtherPlayer [is_friend=" + is_friend + ", city_name=" + city_name + ", is_guild_member=" + is_guild_member + ", is_active="
                + is_active + ", is_neighbor=" + is_neighbor + ", name=" + name + ", player_id=" + player_id + ", _class=" + _class + "]";
    }

   
    
}
