package x42;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;
import om.ojitshcjhn;
import ru.myspar.core.network.model.BasicResponse;
import z42.ApplyCompetitionRequest;
import z42.GetSpecialBannerRequest;
import z42.SendBannerFormRequest;
import z42.SpecialBannerDetailsDto;
import z42.dxjokdxxww;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lx42/iobyxmoadg;", "", "Lz42/zoijcleaow;", "request", "Lru/myspar/core/network/model/BasicResponse;", "Lz42/gxszxtbevo;", "iobyxmoadg", "(Lz42/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lz42/iobyxmoadg;", "Lz42/dxjokdxxww$gxszxtbevo$ppxfxbqfkf;", "zoijcleaow", "(Lz42/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lz42/eablkybsjg;", "Lgg/wwaezpbzkn;", "ppxfxbqfkf", "(Lz42/eablkybsjg;Llg/gxszxtbevo;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @ojitshcjhn("other/banner/")
    Object iobyxmoadg(@om.iobyxmoadg GetSpecialBannerRequest getSpecialBannerRequest, gxszxtbevo<? super BasicResponse<SpecialBannerDetailsDto>> gxszxtbevoVar);

    @ojitshcjhn("other/banner_form/")
    Object ppxfxbqfkf(@om.iobyxmoadg SendBannerFormRequest sendBannerFormRequest, gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("other/competition/")
    Object zoijcleaow(@om.iobyxmoadg ApplyCompetitionRequest applyCompetitionRequest, gxszxtbevo<? super BasicResponse<dxjokdxxww.ButtonParticipateBannerDto.DataButtonParticipateBannerDto>> gxszxtbevoVar);
}
