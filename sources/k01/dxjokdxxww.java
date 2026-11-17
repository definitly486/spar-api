package k01;

import java.util.List;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.core.domain.models.order.OrderPickupStatus;

/* JADX INFO: loaded from: classes5.dex */
public interface dxjokdxxww {
    static /* synthetic */ Object gtknphoqwx(dxjokdxxww dxjokdxxwwVar, String str, uz0.iobyxmoadg iobyxmoadgVar, uz0.gxszxtbevo gxszxtbevoVar, uz0.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar2, int i13, Object obj) {
        if (obj == null) {
            return dxjokdxxwwVar.nufgyqmvbu(str, (i13 & 2) != 0 ? null : iobyxmoadgVar, (i13 & 4) != 0 ? null : gxszxtbevoVar, zoijcleaowVar, gxszxtbevoVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEditOrder");
    }

    static /* synthetic */ Object lqeggnwhkg(dxjokdxxww dxjokdxxwwVar, String str, uz0.iobyxmoadg iobyxmoadgVar, uz0.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sessionEditOrder");
        }
        if ((i13 & 2) != 0) {
            iobyxmoadgVar = null;
        }
        return dxjokdxxwwVar.wflxmlrfwp(str, iobyxmoadgVar, zoijcleaowVar, gxszxtbevoVar);
    }

    Object btonecajqb(String str, uz0.iobyxmoadg iobyxmoadgVar, List list, boolean z13, lg.gxszxtbevo gxszxtbevoVar);

    Object draadjrbmk(sz0.eablkybsjg eablkybsjgVar, int i13, lg.gxszxtbevo gxszxtbevoVar);

    Object dxjokdxxww(String str, OrderPickupStatus orderPickupStatus, LocationData locationData, lg.gxszxtbevo gxszxtbevoVar);

    Object eablkybsjg(String str, int i13, String str2, lg.gxszxtbevo gxszxtbevoVar);

    Object gxszxtbevo(String str, lg.gxszxtbevo gxszxtbevoVar);

    Object iobyxmoadg(String str, lg.gxszxtbevo gxszxtbevoVar);

    Object nufgyqmvbu(String str, uz0.iobyxmoadg iobyxmoadgVar, uz0.gxszxtbevo gxszxtbevoVar, uz0.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar2);

    Object ppxfxbqfkf(String str, List list, lg.gxszxtbevo gxszxtbevoVar);

    Object wflxmlrfwp(String str, uz0.iobyxmoadg iobyxmoadgVar, uz0.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar);

    Object wkgbmnqykc(String str, lg.gxszxtbevo gxszxtbevoVar);

    Object zoijcleaow(String str, String str2, lg.gxszxtbevo gxszxtbevoVar);
}
