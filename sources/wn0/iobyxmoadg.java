package wn0;

import gg.wwaezpbzkn;
import java.util.List;
import kotlin.Metadata;
import om.gxszxtbevo;
import om.ojitshcjhn;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import yn0.CardsReplacementRequest;
import zn0.CardActivationInfoResponse;
import zn0.PersonalCardBalanceResponse;
import zn0.PersonalCardDataDtoResponse;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lwn0/iobyxmoadg;", "", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Lzn0/ppxfxbqfkf;", "zoijcleaow", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lzn0/iobyxmoadg;", "iobyxmoadg", "Lyn0/iobyxmoadg;", "request", "Lgg/wwaezpbzkn;", "wkgbmnqykc", "(Lyn0/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "", "Lzn0/zoijcleaow;", "ppxfxbqfkf", "card_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @gxszxtbevo("spar-customer/cards/activation")
    Object iobyxmoadg(lg.gxszxtbevo<? super BasicResponse<CardActivationInfoResponse>> gxszxtbevoVar);

    @gxszxtbevo("spar-customer/cards/balance/BNS")
    Object ppxfxbqfkf(lg.gxszxtbevo<? super BasicResponse<List<PersonalCardBalanceResponse>>> gxszxtbevoVar);

    @ojitshcjhn("spar-customer/cards/replacement")
    Object wkgbmnqykc(@om.iobyxmoadg CardsReplacementRequest iobyxmoadgVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @gxszxtbevo("spar-customer/cards/info")
    Object zoijcleaow(lg.gxszxtbevo<? super BasicResponse<PersonalCardDataDtoResponse>> gxszxtbevoVar);
}
