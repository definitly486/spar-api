package s51;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import q51.nufgyqmvbu;
import ru.myspar.proloyalty.core.domain.models.cart.CommentReferences;
import ru.myspar.proloyalty.delivery.impl.options.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements draadjrbmk {
    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public nufgyqmvbu invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        List commentsGroupList = state.getCommentsGroupList();
        ArrayList arrayList = new ArrayList();
        Iterator it = commentsGroupList.iterator();
        while (it.hasNext()) {
            t51.zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadg.iobyxmoadg((CommentReferences) it.next());
            if (zoijcleaowVarIobyxmoadg != null) {
                arrayList.add(zoijcleaowVarIobyxmoadg);
            }
        }
        return new nufgyqmvbu(arrayList, state.getIsLoading(), state.getHideScreen());
    }
}
