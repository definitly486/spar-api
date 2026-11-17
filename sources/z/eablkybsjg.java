package z;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg implements androidx.compose.ui.focus.dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final eablkybsjg f126983iobyxmoadg = new eablkybsjg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static Boolean f126984zoijcleaow;

    private eablkybsjg() {
    }

    public final void agtfadlqog() {
        f126984zoijcleaow = null;
    }

    @Override // androidx.compose.ui.focus.dxjokdxxww
    public void gxszxtbevo(boolean z13) {
        f126984zoijcleaow = Boolean.valueOf(z13);
    }

    @Override // androidx.compose.ui.focus.dxjokdxxww
    public boolean lqeggnwhkg() {
        Boolean bool = f126984zoijcleaow;
        if (bool != null) {
            return bool.booleanValue();
        }
        w.iobyxmoadg.ppxfxbqfkf("canFocus is read before it is written");
        throw new KotlinNothingValueException();
    }

    public final boolean wflxmlrfwp() {
        return f126984zoijcleaow != null;
    }
}
