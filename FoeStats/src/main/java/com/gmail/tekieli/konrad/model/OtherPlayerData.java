
package com.gmail.tekieli.konrad.model;

import org.json.JSONObject;

import com.gmail.tekieli.konrad.Utils;


public class OtherPlayerData extends Utils{

    public OtherPlayerData(){
        
    }

    public OtherPlayerData(JSONObject obj) {
        super();
        this.score = Utils.setValueInt( "score", obj);
        this.rank = Utils.setValueInt( "rank", obj);
        this.isOnline = Utils.setValueBoolean( "is_online", obj);
        this.isFriend = Utils.setValueBoolean( "is_friend", obj);
        this.isNeighbor = Utils.setValueBoolean( "is_neighbor", obj);
        this.isGuildMember = Utils.setValueBoolean( "is_guild_member", obj);
        this.isInvited = Utils.setValueBoolean("is_Invited", obj);
        this.isSelf = Utils.setValueBoolean( "is_Self", obj);
        this.cityName = Utils.setValueString("city_name", obj);
        this.clanId = Utils.setValueInt("clan_id", obj);
        this.isActive = Utils.setValueBoolean( "is_aSctive", obj);
        this.playerId = Utils.setValueInt("player_id", obj);
        this.name = Utils.setValueString( "name", obj);
    }
    

    @Override
    public String toString() {
        return "OtherPlayerData [score=" + score + ", rank=" + rank + ", isOnline=" + isOnline + ", isFriend=" + isFriend + ", isNeighbor="
                + isNeighbor + ", isGuildMember=" + isGuildMember + ", isInvited=" + isInvited + ", isSelf=" + isSelf + ", cityName=" + cityName
                + ", clanId=" + clanId + ", isActive=" + isActive + ", playerId=" + playerId + ", name=" + name + "]";
    }

    private Integer score;

    private Integer rank;

    private Boolean isOnline;
 
    private Boolean isFriend;
 
    private Boolean isNeighbor;

    private Boolean isGuildMember;

    private Boolean isInvited;

    private Boolean isSelf;
    
    private String cityName;

    private Integer clanId;

    private Boolean isActive;

    private Integer playerId;

    private String name;
    
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public Boolean getIsFriend() {
        return isFriend;
    }

    public void setIsFriend(Boolean isFriend) {
        this.isFriend = isFriend;
    }

    public Boolean getIsNeighbor() {
        return isNeighbor;
    }

    public void setIsNeighbor(Boolean isNeighbor) {
        this.isNeighbor = isNeighbor;
    }

    public Boolean getIsGuildMember() {
        return isGuildMember;
    }

    public void setIsGuildMember(Boolean isGuildMember) {
        this.isGuildMember = isGuildMember;
    }

    public Boolean getIsInvited() {
        return isInvited;
    }

    public void setIsInvited(Boolean isInvited) {
        this.isInvited = isInvited;
    }

    public Boolean getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(Boolean isSelf) {
        this.isSelf = isSelf;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getClanId() {
        return clanId;
    }

    public void setClanId(Integer clanId) {
        this.clanId = clanId;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    };
    
    

}
