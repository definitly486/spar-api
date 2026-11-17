package tw;

import kotlin.Metadata;
import om.gxszxtbevo;
import om.zdlpuopuiu;
import ru.myspar.core.network.model.BasicResponse;
import ww.SearchAddressResponseDto;
import xw.SearchShopsResponseDto;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ4\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H§@¢\u0006\u0004\b\f\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Ltw/iobyxmoadg;", "", "", "searchText", "", "lat", "lon", "Lru/myspar/core/network/model/BasicResponse;", "Lxw/zoijcleaow;", "zoijcleaow", "(Ljava/lang/String;DDLlg/gxszxtbevo;)Ljava/lang/Object;", "Lww/zoijcleaow;", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @gxszxtbevo("search/addresses/")
    Object iobyxmoadg(@zdlpuopuiu("searchText") String str, @zdlpuopuiu("lat") double d13, @zdlpuopuiu("lon") double d14, lg.gxszxtbevo<? super BasicResponse<SearchAddressResponseDto>> gxszxtbevoVar);

    @gxszxtbevo("search/shops/")
    Object zoijcleaow(@zdlpuopuiu("searchText") String str, @zdlpuopuiu("lat") double d13, @zdlpuopuiu("lon") double d14, lg.gxszxtbevo<? super BasicResponse<SearchShopsResponseDto>> gxszxtbevoVar);
}
