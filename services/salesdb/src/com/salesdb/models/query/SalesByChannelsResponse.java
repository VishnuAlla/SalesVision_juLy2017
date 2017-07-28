/*Copyright (c) 2015-2016 wavemaker-com All Rights Reserved.This software is the confidential and proprietary information of wavemaker-com You shall not disclose such Confidential Information and shall use it only in accordance with the terms of the source code license agreement you entered into with wavemaker-com*/
package com.salesdb.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class SalesByChannelsResponse implements Serializable {

    @JsonProperty("CHANNEL")
    @ColumnAlias("CHANNEL")
    private String channel;
    @JsonProperty("PERCENT")
    @ColumnAlias("PERCENT")
    private BigInteger percent;

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public BigInteger getPercent() {
        return this.percent;
    }

    public void setPercent(BigInteger percent) {
        this.percent = percent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalesByChannelsResponse)) return false;
        final SalesByChannelsResponse salesByChannelsResponse = (SalesByChannelsResponse) o;
        return Objects.equals(getChannel(), salesByChannelsResponse.getChannel()) &&
                Objects.equals(getPercent(), salesByChannelsResponse.getPercent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChannel(),
                getPercent());
    }
}