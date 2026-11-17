package ay;

import a00.ClosestShopDto;
import a00.ShopsDto;
import kotlin.Metadata;
import ru.myspar.core.network.model.BasicResponse;
import uy.CoordinateRequest;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lay/ojitshcjhn;", "", "Luy/gxszxtbevo;", "request", "Lru/myspar/core/network/model/BasicResponse;", "La00/iobyxmoadg;", "zoijcleaow", "(Luy/gxszxtbevo;Llg/gxszxtbevo;)Ljava/lang/Object;", "La00/eablkybsjg;", "iobyxmoadg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ojitshcjhn {
    @om.gxszxtbevo("shops/list/")
    Object iobyxmoadg(lg.gxszxtbevo<? super BasicResponse<ShopsDto>> gxszxtbevoVar);

    @om.ojitshcjhn("shops/closest/")
    Object zoijcleaow(@om.iobyxmoadg CoordinateRequest gxszxtbevoVar, lg.gxszxtbevo<? super BasicResponse<ClosestShopDto>> gxszxtbevoVar2);
}
