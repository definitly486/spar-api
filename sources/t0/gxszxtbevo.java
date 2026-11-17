package t0;

import android.text.style.TtsSpan;
import j0.p;
import j0.r;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo {
    public static final TtsSpan iobyxmoadg(p pVar) {
        if (pVar instanceof r) {
            return zoijcleaow((r) pVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TtsSpan zoijcleaow(r rVar) {
        return new TtsSpan.VerbatimBuilder(rVar.iobyxmoadg()).build();
    }
}
