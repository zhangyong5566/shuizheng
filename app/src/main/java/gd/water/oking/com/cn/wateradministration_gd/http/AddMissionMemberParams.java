package gd.water.oking.com.cn.wateradministration_gd.http;

import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;
import org.xutils.http.app.DefaultParamsBuilder;

/**
 * Created by zhao on 2017-3-30.
 */
@HttpRequest(
        host = DefaultContants.SERVER_HOST,
        path = "app/addwxuser",
        builder = DefaultParamsBuilder.class/*可选参数, 控制参数构建过程, 定义参数签名, SSL证书等*/)

public class AddMissionMemberParams extends RequestParams {

    public String userid;
    public String task_id;
    public String userids;
}
