package r90;

import kotlin.Metadata;
import om.gxszxtbevo;
import om.zdlpuopuiu;
import ru.myspar.core.data.response.evropolis.EvropolisGiftDto;
import ru.myspar.core.network.model.BasicResponse;
import s90.EvropolisRedeemDto;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\t\u0010\nJ,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lr90/iobyxmoadg;", "", "", "giftId", "", "shopId", "deliveryType", "Lru/myspar/core/network/model/BasicResponse;", "Lru/myspar/core/data/response/evropolis/EvropolisGiftDto;", "zoijcleaow", "(ILjava/lang/String;Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "Ls90/iobyxmoadg;", "iobyxmoadg", "(Ljava/lang/String;Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @gxszxtbevo("monopoly/user/stickers/redeem/")
    Object iobyxmoadg(@zdlpuopuiu("shop_id") String str, @zdlpuopuiu("delivery_type") String str2, lg.gxszxtbevo<? super BasicResponse<EvropolisRedeemDto>> gxszxtbevoVar);

    @gxszxtbevo("monopoly/user/gift/")
    Object zoijcleaow(@zdlpuopuiu("id") int i13, @zdlpuopuiu("shop_id") String str, @zdlpuopuiu("delivery_type") String str2, lg.gxszxtbevo<? super BasicResponse<EvropolisGiftDto>> gxszxtbevoVar);
}
