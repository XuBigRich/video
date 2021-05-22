package cn.piao888.video.aliyun.config;

import com.aliyun.vod20170321.Client;
import com.aliyun.teaopenapi.models.*;

public class Sample {


    /**
     * 使用AK&SK初始化账号Client
     *
     * @return Client
     * @throws Exception
     */
    public static Client createClient() throws Exception {
        Config config = new Config()
        // 您的AccessKey ID
                .setAccessKeyId("LTAI5t5uNpHKVDnc3z1MLNu5")
                // 您的AccessKey Secret
                .setAccessKeySecret("wJBySZspzQZMGQ2XZMxJK2lcc3i3lW");
        // 访问的域名
        config.endpoint = "vod.cn-shanghai.aliyuncs.com";
        return new Client(config);
    }


}
