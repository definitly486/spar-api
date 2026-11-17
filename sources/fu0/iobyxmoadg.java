package fu0;

import gu0.AddressByLocationDto;
import gu0.CitiesOfPresenceDto;
import gu0.ShopsByLocationDto;
import kotlin.Metadata;
import om.gxszxtbevo;
import om.zdlpuopuiu;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H§@¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lfu0/iobyxmoadg;", "", "", "latitude", "longitude", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Lgu0/iobyxmoadg;", "iobyxmoadg", "(DDLlg/gxszxtbevo;)Ljava/lang/Object;", "Lgu0/ppxfxbqfkf;", "ppxfxbqfkf", "Lgu0/zoijcleaow;", "zoijcleaow", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @gxszxtbevo("geo/address/")
    Object iobyxmoadg(@zdlpuopuiu("lat") double d13, @zdlpuopuiu("lon") double d14, lg.gxszxtbevo<? super BasicResponse<AddressByLocationDto>> gxszxtbevoVar);

    @gxszxtbevo("geo/shops/")
    Object ppxfxbqfkf(@zdlpuopuiu("lat") double d13, @zdlpuopuiu("lon") double d14, lg.gxszxtbevo<? super BasicResponse<ShopsByLocationDto>> gxszxtbevoVar);

    @gxszxtbevo("geo/cities/")
    Object zoijcleaow(lg.gxszxtbevo<? super BasicResponse<CitiesOfPresenceDto>> gxszxtbevoVar);
}
