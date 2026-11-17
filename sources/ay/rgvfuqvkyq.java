package ay;

import b00.ResendAuthSmsDto;
import gg.wwaezpbzkn;
import iz.AuthSmsDto;
import iz.AuthTokenDto;
import kotlin.Metadata;
import ru.myspar.core.network.model.BasicResponse;
import uy.ResendAuthSmsRequest;
import vy.AuthSmsRequest;
import vy.AuthTokenRequest;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lay/rgvfuqvkyq;", "", "Lvy/zoijcleaow;", "request", "Lru/myspar/core/network/model/BasicResponse;", "Liz/zoijcleaow;", "gxszxtbevo", "(Lvy/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lgg/wwaezpbzkn;", "ppxfxbqfkf", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lvy/iobyxmoadg;", "Liz/iobyxmoadg;", "eablkybsjg", "(Lvy/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Luy/iwizpuwonk;", "Lb00/ppxfxbqfkf;", "wkgbmnqykc", "(Luy/iwizpuwonk;Llg/gxszxtbevo;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface rgvfuqvkyq {
    @om.ojitshcjhn("token/get_code/")
    Object eablkybsjg(@om.iobyxmoadg AuthSmsRequest iobyxmoadgVar, lg.gxszxtbevo<? super BasicResponse<AuthSmsDto>> gxszxtbevoVar);

    @om.ojitshcjhn("token/get/")
    Object gxszxtbevo(@om.iobyxmoadg AuthTokenRequest zoijcleaowVar, lg.gxszxtbevo<? super BasicResponse<AuthTokenDto>> gxszxtbevoVar);

    @om.gxszxtbevo("token/logout/")
    Object ppxfxbqfkf(lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.ojitshcjhn("token/resend_code/")
    Object wkgbmnqykc(@om.iobyxmoadg ResendAuthSmsRequest iwizpuwonkVar, lg.gxszxtbevo<? super BasicResponse<ResendAuthSmsDto>> gxszxtbevoVar);
}
