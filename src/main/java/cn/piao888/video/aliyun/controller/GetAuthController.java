package cn.piao888.video.aliyun.controller;

import cn.piao888.video.aliyun.config.Sample;
import com.aliyun.vod20170321.Client;
import com.aliyun.vod20170321.models.CreateUploadVideoRequest;
import com.aliyun.vod20170321.models.CreateUploadVideoResponse;
import com.aliyun.vod20170321.models.CreateUploadVideoResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 许鸿志
 * @since 2021/5/18
 */
@RestController
@CrossOrigin
public class GetAuthController {
    @PostMapping("auth")
    public CreateUploadVideoResponseBody auth(String fileName, String title) throws Exception {
        Client client = Sample.createClient();
        CreateUploadVideoRequest createUploadVideoRequest = new CreateUploadVideoRequest();
        createUploadVideoRequest.setFileName(fileName);
        createUploadVideoRequest.setTitle(title);
        // 复制代码运行请自行打印 API 的返回值
        CreateUploadVideoResponse response = client.createUploadVideo(createUploadVideoRequest);
        return response.body;
    }
}
