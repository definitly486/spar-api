package ww0;

import ay0.AddHistoryRequest;
import ay0.DeleteHistoryRequest;
import gg.wwaezpbzkn;
import gk.cdpycssgdh;
import hg.tzroggbefp;
import kotlin.Metadata;
import om.ojitshcjhn;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ry0.HistoryListDto;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0003\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\u000f\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lww0/draadjrbmk;", "", "Lay0/iobyxmoadg;", "request", "Lru/myspar/proloyalty/core/network/model/BasicResponse;", "Lgg/wwaezpbzkn;", "gxszxtbevo", "(Lay0/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lgk/cdpycssgdh;", "Lry0/iobyxmoadg;", "iobyxmoadg", "(Lgk/cdpycssgdh;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lay0/zoijcleaow;", "eablkybsjg", "(Lay0/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "zoijcleaow", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface draadjrbmk {
    static /* synthetic */ Object ppxfxbqfkf(draadjrbmk draadjrbmkVar, cdpycssgdh cdpycssgdhVar, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHistoryList");
        }
        if ((i13 & 1) != 0) {
            cdpycssgdhVar = new cdpycssgdh(tzroggbefp.dxjokdxxww());
        }
        return draadjrbmkVar.iobyxmoadg(cdpycssgdhVar, gxszxtbevoVar);
    }

    static /* synthetic */ Object wkgbmnqykc(draadjrbmk draadjrbmkVar, cdpycssgdh cdpycssgdhVar, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearHistoryList");
        }
        if ((i13 & 1) != 0) {
            cdpycssgdhVar = new cdpycssgdh(tzroggbefp.dxjokdxxww());
        }
        return draadjrbmkVar.zoijcleaow(cdpycssgdhVar, gxszxtbevoVar);
    }

    @ojitshcjhn("search/history/delete/")
    Object eablkybsjg(@om.iobyxmoadg DeleteHistoryRequest zoijcleaowVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("search/history/add/")
    Object gxszxtbevo(@om.iobyxmoadg AddHistoryRequest iobyxmoadgVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);

    @ojitshcjhn("search/history/list/")
    Object iobyxmoadg(@om.iobyxmoadg cdpycssgdh cdpycssgdhVar, lg.gxszxtbevo<? super BasicResponse<HistoryListDto>> gxszxtbevoVar);

    @ojitshcjhn("search/history/clear/")
    Object zoijcleaow(@om.iobyxmoadg cdpycssgdh cdpycssgdhVar, lg.gxszxtbevo<? super BasicResponse<wwaezpbzkn>> gxszxtbevoVar);
}
