package w10;

import java.util.List;
import ru.myspar.common.models.LocationData;
import ru.myspar.core.domain.models.order.OrderPickupStatus;

/* JADX INFO: loaded from: classes4.dex */
public interface dxjokdxxww {
    static /* synthetic */ Object draadjrbmk(dxjokdxxww dxjokdxxwwVar, String str, e10.iobyxmoadg iobyxmoadgVar, e10.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sessionEditOrder");
        }
        if ((i13 & 2) != 0) {
            iobyxmoadgVar = null;
        }
        return dxjokdxxwwVar.nufgyqmvbu(str, iobyxmoadgVar, zoijcleaowVar, gxszxtbevoVar);
    }

    static /* synthetic */ Object gtknphoqwx(dxjokdxxww dxjokdxxwwVar, String str, e10.iobyxmoadg iobyxmoadgVar, e10.gxszxtbevo gxszxtbevoVar, e10.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar2, int i13, Object obj) {
        if (obj == null) {
            return dxjokdxxwwVar.wflxmlrfwp(str, (i13 & 2) != 0 ? null : iobyxmoadgVar, (i13 & 4) != 0 ? null : gxszxtbevoVar, zoijcleaowVar, gxszxtbevoVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEditOrder");
    }

    Object btonecajqb(String str, OrderPickupStatus orderPickupStatus, LocationData locationData, lg.gxszxtbevo gxszxtbevoVar);

    Object dxjokdxxww(c10.gxszxtbevo gxszxtbevoVar, int i13, lg.gxszxtbevo gxszxtbevoVar2);

    Object eablkybsjg(String str, int i13, String str2, lg.gxszxtbevo gxszxtbevoVar);

    Object gxszxtbevo(String str, lg.gxszxtbevo gxszxtbevoVar);

    Object iobyxmoadg(String str, lg.gxszxtbevo gxszxtbevoVar);

    Object lqeggnwhkg(String str, e10.iobyxmoadg iobyxmoadgVar, List list, boolean z13, lg.gxszxtbevo gxszxtbevoVar);

    Object nufgyqmvbu(String str, e10.iobyxmoadg iobyxmoadgVar, e10.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar);

    Object ppxfxbqfkf(String str, List list, lg.gxszxtbevo gxszxtbevoVar);

    Object wflxmlrfwp(String str, e10.iobyxmoadg iobyxmoadgVar, e10.gxszxtbevo gxszxtbevoVar, e10.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar2);

    Object wkgbmnqykc(String str, lg.gxszxtbevo gxszxtbevoVar);

    Object zoijcleaow(String str, String str2, lg.gxszxtbevo gxszxtbevoVar);
}
