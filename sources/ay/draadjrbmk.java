package ay;

import kotlin.Metadata;
import pz.CouponGroupsDto;
import ru.myspar.core.network.model.BasicResponse;
import wz.PushesDto;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H§@¢\u0006\u0004\b\b\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lay/draadjrbmk;", "", "Lru/myspar/core/network/model/BasicResponse;", "Lwz/zoijcleaow;", "iobyxmoadg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "zoijcleaow", "Lpz/ppxfxbqfkf;", "ppxfxbqfkf", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface draadjrbmk {
    @om.gxszxtbevo("push/list/")
    Object iobyxmoadg(lg.gxszxtbevo<? super BasicResponse<PushesDto>> gxszxtbevoVar);

    @om.gxszxtbevo("push/discounts/")
    Object ppxfxbqfkf(lg.gxszxtbevo<? super BasicResponse<CouponGroupsDto>> gxszxtbevoVar);

    @om.gxszxtbevo("push/orders/")
    Object zoijcleaow(lg.gxszxtbevo<? super BasicResponse<PushesDto>> gxszxtbevoVar);
}
