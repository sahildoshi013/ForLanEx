package com.example.sahilj.mfli.Responses;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sahil J on 4/4/2017.
 */

public class UserChatPrivacy {
    @SerializedName("chat_id")
    private Integer id;

    @SerializedName("who_can_message_you")
    private Integer who_can_message_you;

    @SerializedName("chat_options")
    private Integer chat_options;

    public Integer getId() {
        return id;
    }

    public Integer getWho_can_message_you() {
        return (who_can_message_you-1);
    }

    public Integer getChat_options() {
        return (chat_options-1);
    }
}
