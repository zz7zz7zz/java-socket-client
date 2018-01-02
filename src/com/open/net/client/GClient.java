package com.open.net.client;

import com.open.net.client.message.MessageBuffer;
import com.open.net.client.object.ClientConfig;
import com.open.net.client.pools.MessagePool;

/**
 * author       :   long
 * created on   :   2017/11/30
 * description  :   客户端全局数据
 */

public final class GClient {
    
    public static final void init(ClientConfig mClientConfig){
		if(null != mClientConfig) {
            MessagePool.init(mClientConfig.pool_size_small + mClientConfig.pool_size_middle + mClientConfig.pool_size_large);
            MessageBuffer.init( mClientConfig.pool_capacity_small,mClientConfig.pool_capacity_middle,mClientConfig.pool_capacity_large,
                                mClientConfig.pool_size_small,mClientConfig.pool_size_middle,mClientConfig.pool_size_large,
                                mClientConfig.pool_max_size_temporary_cache);
		}else {
            MessagePool.init(6);
            MessageBuffer.init(8 * MessageBuffer.KB, 64*MessageBuffer.KB, 1* MessageBuffer.MB, 5 , 2 , 0, 2);
		}
    }
}
