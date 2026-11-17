package e0;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.collection.iozdgvuglv;
import gg.wwaezpbzkn;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iozdgvuglv f30116iobyxmoadg = new iozdgvuglv(0, 1, null);

    public final void iobyxmoadg() {
        synchronized (this) {
            this.f30116iobyxmoadg.lqeggnwhkg();
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public final TypedValue zoijcleaow(Resources resources, int i13) {
        TypedValue typedValue;
        synchronized (this) {
            typedValue = (TypedValue) this.f30116iobyxmoadg.zoijcleaow(i13);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i13, typedValue, true);
                this.f30116iobyxmoadg.agtfadlqog(i13, typedValue);
            }
        }
        return typedValue;
    }
}
