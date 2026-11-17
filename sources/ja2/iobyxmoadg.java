package ja2;

import aw1.AuthTokenResponse;
import ea2.ActivePushTokensResponse;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import la2.UpdateAgreementsParams;
import la2.UpdateEmailParamsRequest;
import la2.UpdateUserInfoParamsRequest;
import la2.UpdateUserNotificationsRequest;
import la2.UpdateUserPushTokenRequest;
import la2.UserChangeFavoriteRequest;
import la2.ppxfxbqfkf;
import lg.gxszxtbevo;
import ma2.UserDto;
import ma2.UserDynamicQrCodeDto;
import ma2.UserSharePromoDto;
import om.ojitshcjhn;
import ru.myspar.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\u0005J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0002H§@¢\u0006\u0004\b\u001e\u0010\u0005J \u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u001fH§@¢\u0006\u0004\b \u0010!J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0002H§@¢\u0006\u0004\b#\u0010\u0005J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0002H§@¢\u0006\u0004\b%\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006&À\u0006\u0001"}, d2 = {"Lja2/iobyxmoadg;", "", "Lru/myspar/core/network/model/BasicResponse;", "Lma2/zoijcleaow;", "dxjokdxxww", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lma2/iobyxmoadg;", "zoijcleaow", "Lgg/wwaezpbzkn;", "wkgbmnqykc", "Lla2/wkgbmnqykc;", "request", "nufgyqmvbu", "(Lla2/wkgbmnqykc;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lla2/gxszxtbevo;", "btonecajqb", "(Lla2/gxszxtbevo;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lla2/nufgyqmvbu;", "lqeggnwhkg", "(Lla2/nufgyqmvbu;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lla2/ppxfxbqfkf;", "wflxmlrfwp", "(Lla2/ppxfxbqfkf;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lla2/zoijcleaow;", "draadjrbmk", "(Lla2/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lla2/iobyxmoadg;", "gxszxtbevo", "(Lla2/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lma2/ppxfxbqfkf;", "ppxfxbqfkf", "Lla2/btonecajqb;", "iobyxmoadg", "(Lla2/btonecajqb;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lea2/iobyxmoadg;", "eablkybsjg", "Law1/ppxfxbqfkf;", "gtknphoqwx", "user_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @ojitshcjhn("user/params/")
    Object btonecajqb(@om.iobyxmoadg UpdateUserNotificationsRequest updateUserNotificationsRequest, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("user/params/")
    Object draadjrbmk(@om.iobyxmoadg UpdateEmailParamsRequest updateEmailParamsRequest, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.gxszxtbevo("user/qr/")
    Object dxjokdxxww(gxszxtbevo<? super BasicResponse<UserDynamicQrCodeDto>> gxszxtbevoVar);

    @om.gxszxtbevo("user/pushtokens/")
    Object eablkybsjg(gxszxtbevo<? super BasicResponse<ActivePushTokensResponse>> gxszxtbevoVar);

    @ojitshcjhn("jwt/create")
    Object gtknphoqwx(gxszxtbevo<? super BasicResponse<AuthTokenResponse>> gxszxtbevoVar);

    @ojitshcjhn("user/params/")
    Object gxszxtbevo(@om.iobyxmoadg UpdateAgreementsParams updateAgreementsParams, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("user/favorite/")
    Object iobyxmoadg(@om.iobyxmoadg UserChangeFavoriteRequest userChangeFavoriteRequest, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("user/params/")
    Object lqeggnwhkg(@om.iobyxmoadg UpdateUserPushTokenRequest updateUserPushTokenRequest, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("user/update/")
    Object nufgyqmvbu(@om.iobyxmoadg UpdateUserInfoParamsRequest updateUserInfoParamsRequest, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.gxszxtbevo("user/share/")
    Object ppxfxbqfkf(gxszxtbevo<? super BasicResponse<UserSharePromoDto>> gxszxtbevoVar);

    @ojitshcjhn("user/params/")
    Object wflxmlrfwp(@om.iobyxmoadg ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.gxszxtbevo("user/can-delete/")
    Object wkgbmnqykc(gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.gxszxtbevo("user/profile/")
    Object zoijcleaow(gxszxtbevo<? super BasicResponse<UserDto>> gxszxtbevoVar);
}
