package wv1;

import bw1.UserChangeFavoriteRequest;
import cw1.UserSharePromoDto;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;
import om.ojitshcjhn;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\u000b\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lwv1/ppxfxbqfkf;", "", "Lbw1/iobyxmoadg;", "request", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Lbw1/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lcw1/nufgyqmvbu;", "ppxfxbqfkf", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "wkgbmnqykc", "user_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ppxfxbqfkf {
    @ojitshcjhn("user/favorite/")
    Object iobyxmoadg(@om.iobyxmoadg UserChangeFavoriteRequest iobyxmoadgVar, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @om.gxszxtbevo("user/share/")
    Object ppxfxbqfkf(gxszxtbevo<? super BasicResponse<UserSharePromoDto>> gxszxtbevoVar);

    @om.gxszxtbevo("user/can-delete/")
    Object wkgbmnqykc(gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);
}
