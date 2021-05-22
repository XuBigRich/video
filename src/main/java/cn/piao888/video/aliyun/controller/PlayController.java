package cn.piao888.video.aliyun.controller;

import cn.piao888.video.aliyun.config.Sample;
import com.aliyun.vod20170321.Client;
import com.aliyun.vod20170321.models.GetPlayInfoRequest;
import com.aliyun.vod20170321.models.GetPlayInfoResponse;
import com.aliyuncs.DefaultAcsClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author 许鸿志
 * @since 2021/5/18
 */
@RestController
@CrossOrigin
public class PlayController {
    /*获取播放地址函数*/

    /**
     * @param vid
     * @return
     * @throws Exception
     */
    @PostMapping("getPlayInfo")
    public  GetPlayInfoResponse getPlayInfo( String vid) throws Exception {
        Client client = Sample.createClient();
        GetPlayInfoRequest request = new GetPlayInfoRequest();
        request.setVideoId(vid);
        return client.getPlayInfo(request);
    }

}
