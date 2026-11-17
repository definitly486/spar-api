package wv1;

import aw1.AuthSignupResponse;
import aw1.AuthTokenResponse;
import bw1.UserUploadDeviceInfoRequest;
import cw1.UserFetchPushTokensResponse;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;
import om.ojitshcjhn;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import zv1.AuthLogoutRequest;
import zv1.AuthNewTokenRequest;
import zv1.AuthSignupRequest;
import zv1.AuthVerifyRequest;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004H§@¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lwv1/iobyxmoadg;", "", "Lzv1/ppxfxbqfkf;", "request", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Law1/iobyxmoadg;", "iobyxmoadg", "(Lzv1/ppxfxbqfkf;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lzv1/wkgbmnqykc;", "Law1/ppxfxbqfkf;", "zoijcleaow", "(Lzv1/wkgbmnqykc;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lzv1/iobyxmoadg;", "Lgg/wwaezpbzkn;", "ppxfxbqfkf", "(Lzv1/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lbw1/dxjokdxxww;", "gxszxtbevo", "(Lbw1/dxjokdxxww;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lzv1/zoijcleaow;", "eablkybsjg", "(Lzv1/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lcw1/zoijcleaow;", "wkgbmnqykc", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "user_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @ojitshcjhn("spar-auth/token/refresh")
    Object eablkybsjg(@om.iobyxmoadg AuthNewTokenRequest zoijcleaowVar, gxszxtbevo<? super BasicResponse<AuthTokenResponse>> gxszxtbevoVar);

    @ojitshcjhn("spar-auth/device/update")
    Object gxszxtbevo(@om.iobyxmoadg UserUploadDeviceInfoRequest dxjokdxxwwVar, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("spar-auth/otp/signup")
    Object iobyxmoadg(@om.iobyxmoadg AuthSignupRequest ppxfxbqfkfVar, gxszxtbevo<? super BasicResponse<AuthSignupResponse>> gxszxtbevoVar);

    @ojitshcjhn("spar-auth/logout")
    Object ppxfxbqfkf(@om.iobyxmoadg AuthLogoutRequest iobyxmoadgVar, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.gxszxtbevo("spar-auth/device/push-tokens")
    Object wkgbmnqykc(gxszxtbevo<? super BasicResponse<UserFetchPushTokensResponse>> gxszxtbevoVar);

    @ojitshcjhn("spar-auth/otp/verify")
    Object zoijcleaow(@om.iobyxmoadg AuthVerifyRequest wkgbmnqykcVar, gxszxtbevo<? super BasicResponse<AuthTokenResponse>> gxszxtbevoVar);
}
