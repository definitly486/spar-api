package oa;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg extends gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Typeface f72386iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f72387ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final InterfaceC1568iobyxmoadg f72388zoijcleaow;

    /* JADX INFO: renamed from: oa.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC1568iobyxmoadg {
        void iobyxmoadg(Typeface typeface);
    }

    public iobyxmoadg(InterfaceC1568iobyxmoadg interfaceC1568iobyxmoadg, Typeface typeface) {
        this.f72386iobyxmoadg = typeface;
        this.f72388zoijcleaow = interfaceC1568iobyxmoadg;
    }

    private void wkgbmnqykc(Typeface typeface) {
        if (this.f72387ppxfxbqfkf) {
            return;
        }
        this.f72388zoijcleaow.iobyxmoadg(typeface);
    }

    @Override // oa.gxszxtbevo
    public void iobyxmoadg(int i13) {
        wkgbmnqykc(this.f72386iobyxmoadg);
    }

    public void ppxfxbqfkf() {
        this.f72387ppxfxbqfkf = true;
    }

    @Override // oa.gxszxtbevo
    public void zoijcleaow(Typeface typeface, boolean z13) {
        wkgbmnqykc(typeface);
    }
}
