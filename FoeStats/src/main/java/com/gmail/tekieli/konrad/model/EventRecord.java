package com.gmail.tekieli.konrad.model;

import java.time.LocalDateTime;

import org.json.JSONObject;

import com.gmail.tekieli.konrad.Utils;

public class EventRecord {
    private Integer id;

    private String interaction_type;

    private Integer player_id;

    private String _class;

    private String type;

    private OtherPlayer other_player;

    private String date;

    private String entity_id;
    
    private String status;
    private LocalDateTime dateTime;


    public LocalDateTime getDateTime() {
        return dateTime;
    }


    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }


    public EventRecord(JSONObject obj) {
        super();
        if (obj.has("other_player")) {
            this.other_player =new OtherPlayer(obj.getJSONObject("other_player"));
        } else {
            this.other_player = null;
        }
        
        this.date = Utils.setValueString( "date", obj);
        this.type = Utils.setValueString( "type", obj);
        this.entity_id = Utils.setValueString( "entity_id", obj);
        this.interaction_type =  Utils.setValueString( "interaction_type", obj);
        this.player_id =  Utils.setValueInt("player_id", obj);
        this.id =  Utils.setValueInt("id", obj);
        this._class = Utils.setValueString("__class__", obj);
        this.status = Utils.setValueString("status", obj);
        this.dateTime = null;
    }


    public EventRecord() {
        this.id = null;
        this.interaction_type = null;
        this.player_id = null;
        this._class = null;
        this.type = null;
        this.other_player = new OtherPlayer();
        this.date = null;
        this.entity_id = null;
        this.status = null;
        this.dateTime = null;
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getInteraction_type() {
        return interaction_type;
    }


    public void setInteraction_type(String interaction_type) {
        this.interaction_type = interaction_type;
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


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public OtherPlayer getOther_player() {
        return other_player;
    }


    public void setOther_player(OtherPlayer other_player) {
        this.other_player = other_player;
    }


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public String getEntity_id() {
        return entity_id;
    }


    public void setEntity_id(String entity_id) {
        this.entity_id = entity_id;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "EventRecord [id=" + id + ", interaction_type=" + interaction_type + ", player_id=" + player_id + ", _class=" + _class + ", type="
                + type + ", other_player=" + other_player + ", date=" + date + ", entity_id=" + entity_id + ", status=" + status + ", dateTime="
                + dateTime + "]";
    }


    

      
    
}
