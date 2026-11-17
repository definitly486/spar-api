package w72;

import kotlin.Metadata;
import lg.gxszxtbevo;
import om.ojitshcjhn;
import ru.myspar.core.network.model.BasicResponse;
import x72.GetStoriesRequest;
import x72.GetStotyByIdRequest;
import y72.StoriesListDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lw72/iobyxmoadg;", "", "Lx72/iobyxmoadg;", "body", "Lru/myspar/core/network/model/BasicResponse;", "Ly72/iobyxmoadg;", "iobyxmoadg", "(Lx72/iobyxmoadg;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lx72/zoijcleaow;", "zoijcleaow", "(Lx72/zoijcleaow;Llg/gxszxtbevo;)Ljava/lang/Object;", "story_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface iobyxmoadg {
    @ojitshcjhn("stories/list/")
    Object iobyxmoadg(@om.iobyxmoadg GetStoriesRequest getStoriesRequest, gxszxtbevo<? super BasicResponse<StoriesListDto>> gxszxtbevoVar);

    @ojitshcjhn("stories/list/")
    Object zoijcleaow(@om.iobyxmoadg GetStotyByIdRequest getStotyByIdRequest, gxszxtbevo<? super BasicResponse<StoriesListDto>> gxszxtbevoVar);
}
