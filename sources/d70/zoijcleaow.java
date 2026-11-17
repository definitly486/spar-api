package d70;

import b70.nufgyqmvbu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.cart.CommentReferences;
import ru.myspar.delivery.impl.options.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements draadjrbmk {
    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public nufgyqmvbu invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        List commentsGroupList = state.getCommentsGroupList();
        ArrayList arrayList = new ArrayList();
        Iterator it = commentsGroupList.iterator();
        while (it.hasNext()) {
            e70.zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadg.iobyxmoadg((CommentReferences) it.next());
            if (zoijcleaowVarIobyxmoadg != null) {
                arrayList.add(zoijcleaowVarIobyxmoadg);
            }
        }
        return new nufgyqmvbu(arrayList, state.getIsLoading(), state.getHideScreen());
    }
}
