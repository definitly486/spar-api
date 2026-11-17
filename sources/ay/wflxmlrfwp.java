package ay;

import b00.FetchSmsDto;
import gg.wwaezpbzkn;
import iz.AuthTokenDto;
import iz.CheckRegistrationDto;
import kotlin.Metadata;
import ru.myspar.core.network.model.BasicResponse;
import uy.CheckPromoRequest;
import uy.CheckRegistrationRequest;
import uy.FetchSmsRequest;
import uy.RegisterUserRequest;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lay/wflxmlrfwp;", "", "Luy/wkgbmnqykc;", "request", "Lru/myspar/core/network/model/BasicResponse;", "Liz/ppxfxbqfkf;", "iobyxmoadg", "(Luy/wkgbmnqykc;Llg/gxszxtbevo;)Ljava/lang/Object;", "Luy/dxjokdxxww;", "Lb00/zoijcleaow;", "ppxfxbqfkf", "(Luy/dxjokdxxww;Llg/gxszxtbevo;)Ljava/lang/Object;", "Luy/yggfygwlhe;", "Liz/zoijcleaow;", "wkgbmnqykc", "(Luy/yggfygwlhe;Llg/gxszxtbevo;)Ljava/lang/Object;", "Luy/ppxfxbqfkf;", "Lgg/wwaezpbzkn;", "zoijcleaow", "(Luy/ppxfxbqfkf;Llg/gxszxtbevo;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface wflxmlrfwp {
    @om.ojitshcjhn("reg/check/")
    Object iobyxmoadg(@om.iobyxmoadg CheckRegistrationRequest wkgbmnqykcVar, lg.gxszxtbevo<? super BasicResponse<CheckRegistrationDto>> gxszxtbevoVar);

    @om.ojitshcjhn("reg/getsms/")
    Object ppxfxbqfkf(@om.iobyxmoadg FetchSmsRequest dxjokdxxwwVar, lg.gxszxtbevo<? super BasicResponse<FetchSmsDto>> gxszxtbevoVar);

    @om.ojitshcjhn("reg/register/")
    Object wkgbmnqykc(@om.iobyxmoadg RegisterUserRequest yggfygwlheVar, lg.gxszxtbevo<? super BasicResponse<AuthTokenDto>> gxszxtbevoVar);

    @om.ojitshcjhn("reg/checkpromo/")
    Object zoijcleaow(@om.iobyxmoadg CheckPromoRequest ppxfxbqfkfVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);
}
