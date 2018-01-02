package com.open.net.client.object;

/**
 * author       :   long
 * created on   :   2017/11/30
 * description  :   连接状态回调
 */

public interface IConnectListener {

    void onConnectionSuccess(BaseClient mClient);

    void onConnectionFailed(BaseClient mClient);
}
