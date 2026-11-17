package ikoacuggdj;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final long f44823iobyxmoadg = ViewConfiguration.getTapTimeout();

    public static final long iobyxmoadg() {
        return f44823iobyxmoadg;
    }

    private static final boolean ppxfxbqfkf(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final boolean zoijcleaow(z.btonecajqb btonecajqbVar) {
        return ppxfxbqfkf(z.draadjrbmk.iobyxmoadg(btonecajqbVar));
    }
}
