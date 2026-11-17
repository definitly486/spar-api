package androidx.compose.ui.platform;

import androidx.compose.runtime.c1;

/* JADX INFO: loaded from: classes.dex */
public final class rhgxfdycjh implements b0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private tg.iobyxmoadg f7039iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f7040ppxfxbqfkf = c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private androidx.compose.runtime.iwxlajgraz f7041zoijcleaow;

    public void eablkybsjg(boolean z13) {
        this.f7040ppxfxbqfkf.setValue(Boolean.valueOf(z13));
    }

    @Override // androidx.compose.ui.platform.b0
    public boolean iobyxmoadg() {
        return ((Boolean) this.f7040ppxfxbqfkf.getValue()).booleanValue();
    }

    public void ppxfxbqfkf(int i13) {
        c0.f6772iobyxmoadg.iobyxmoadg().setValue(t.hkdspvbjdz.iobyxmoadg(i13));
    }

    public final void wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
        if (this.f7041zoijcleaow == null) {
            this.f7039iobyxmoadg = iobyxmoadgVar;
        }
    }
}
