package ww0;

import by0.CardListDto;
import kotlin.Metadata;
import om.ojitshcjhn;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import sx0.DeleteCardRequest;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lww0/ppxfxbqfkf;", "", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Lby0/zoijcleaow;", "iobyxmoadg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lsx0/iobyxmoadg;", "request", "zoijcleaow", "(Lsx0/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ppxfxbqfkf {
    @ojitshcjhn("cards/list/")
    Object iobyxmoadg(lg.gxszxtbevo<? super BasicResponse<CardListDto>> gxszxtbevoVar);

    @ojitshcjhn("cards/delete/")
    Object zoijcleaow(@om.iobyxmoadg DeleteCardRequest iobyxmoadgVar, lg.gxszxtbevo<? super BasicResponse<CardListDto>> gxszxtbevoVar);
}
