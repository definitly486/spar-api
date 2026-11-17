package g0;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static AtomicInteger f35716iobyxmoadg = new AtomicInteger(0);

    public static final int iobyxmoadg() {
        return f35716iobyxmoadg.addAndGet(1);
    }

    public static /* synthetic */ androidx.compose.ui.wkgbmnqykc ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z13, tg.draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        return zoijcleaow(wkgbmnqykcVar, z13, draadjrbmkVar);
    }

    public static final androidx.compose.ui.wkgbmnqykc zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z13, tg.draadjrbmk draadjrbmkVar) {
        return wkgbmnqykcVar.eablkybsjg(new AppendedSemanticsElement(z13, draadjrbmkVar));
    }
}
