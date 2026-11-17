package wv1;

import aw1.AuthTokenResponse;
import bw1.UserEReceiptRequest;
import bw1.UserEditPersonalDataRequest;
import bw1.UserRegistrationRequest;
import bw1.UserSetAgreementRequest;
import bw1.UserSettingsRequest;
import cw1.UploadUserSettingsResponse;
import cw1.UserGetAgreementResponse;
import cw1.UserGetNewsResponse;
import cw1.UserPersonalDataResponse;
import cw1.UserSettingsResponse;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.Metadata;
import lg.gxszxtbevo;
import om.agtfadlqog;
import om.dxjokdxxww;
import om.ojitshcjhn;
import om.rgvfuqvkyq;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H§@¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H§@¢\u0006\u0004\b\u000e\u0010\fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006H§@¢\u0006\u0004\b\u0013\u0010\fJ \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H§@¢\u0006\u0004\b\u0018\u0010\fJ\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00190\u0006H§@¢\u0006\u0004\b\u001a\u0010\fJ \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006H§@¢\u0006\u0004\b\u001f\u0010\fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0006H§@¢\u0006\u0004\b!\u0010\fJ \u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\"H§@¢\u0006\u0004\b#\u0010$ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Lwv1/zoijcleaow;", "", "", "token", "Lbw1/eablkybsjg;", "request", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Law1/ppxfxbqfkf;", "eablkybsjg", "(Ljava/lang/String;Lbw1/eablkybsjg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lcw1/gxszxtbevo;", "oxmwwwfdhm", "Lbw1/ppxfxbqfkf;", "ppxfxbqfkf", "(Lbw1/ppxfxbqfkf;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lcw1/lqeggnwhkg;", "gxszxtbevo", "Lbw1/lqeggnwhkg;", "Lcw1/iobyxmoadg;", "zoijcleaow", "(Lbw1/lqeggnwhkg;Llg/gxszxtbevo;)Ljava/lang/Object;", "kcexrzcfyt", "", "vdvldrhtss", "Lbw1/gxszxtbevo;", "wkgbmnqykc", "(Lbw1/gxszxtbevo;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lcw1/ppxfxbqfkf;", "zynmafqrjb", "Lcw1/wkgbmnqykc;", "nufgyqmvbu", "Lbw1/zoijcleaow;", "lqeggnwhkg", "(Lbw1/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "user_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface zoijcleaow {
    @ojitshcjhn("spar-customer/customers")
    Object eablkybsjg(@dxjokdxxww("Authorization") String str, @om.iobyxmoadg UserRegistrationRequest eablkybsjgVar, gxszxtbevo<? super BasicResponse<AuthTokenResponse>> gxszxtbevoVar);

    @om.gxszxtbevo("spar-customer/customers/settings")
    Object gxszxtbevo(gxszxtbevo<? super BasicResponse<UserSettingsResponse>> gxszxtbevoVar);

    @om.zoijcleaow("spar-customer/customers")
    Object iobyxmoadg(gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("spar-customer/customers/email-confirm")
    Object kcexrzcfyt(gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @agtfadlqog("spar-customer/customers/ereceipt")
    Object lqeggnwhkg(@om.iobyxmoadg UserEReceiptRequest zoijcleaowVar, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.gxszxtbevo("spar-customer/customers/notices-count")
    Object nufgyqmvbu(gxszxtbevo<? super BasicResponse<UserGetNewsResponse>> gxszxtbevoVar);

    @om.gxszxtbevo("spar-customer/customers/personal-data")
    Object oxmwwwfdhm(gxszxtbevo<? super BasicResponse<UserPersonalDataResponse>> gxszxtbevoVar);

    @rgvfuqvkyq("spar-customer/customers/personal-data")
    Object ppxfxbqfkf(@om.iobyxmoadg UserEditPersonalDataRequest ppxfxbqfkfVar, gxszxtbevo<? super BasicResponse<UserPersonalDataResponse>> gxszxtbevoVar);

    @om.gxszxtbevo("spar-customer/customers/test-function")
    Object vdvldrhtss(gxszxtbevo<? super BasicResponse<List<String>>> gxszxtbevoVar);

    @agtfadlqog("spar-customer/customers/agreement")
    Object wkgbmnqykc(@om.iobyxmoadg UserSetAgreementRequest gxszxtbevoVar, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar2);

    @rgvfuqvkyq("spar-customer/customers/settings")
    Object zoijcleaow(@om.iobyxmoadg UserSettingsRequest lqeggnwhkgVar, gxszxtbevo<? super BasicResponse<UploadUserSettingsResponse>> gxszxtbevoVar);

    @om.gxszxtbevo("spar-customer/customers/agreement")
    Object zynmafqrjb(gxszxtbevo<? super BasicResponse<UserGetAgreementResponse>> gxszxtbevoVar);
}
