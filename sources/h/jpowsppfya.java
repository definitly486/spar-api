package h;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class jpowsppfya implements dvvnrvtcbc {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Bitmap f38914zoijcleaow;

    public jpowsppfya(Bitmap bitmap) {
        this.f38914zoijcleaow = bitmap;
    }

    @Override // h.dvvnrvtcbc
    public int getHeight() {
        return this.f38914zoijcleaow.getHeight();
    }

    @Override // h.dvvnrvtcbc
    public int getWidth() {
        return this.f38914zoijcleaow.getWidth();
    }

    @Override // h.dvvnrvtcbc
    public void iobyxmoadg() {
        this.f38914zoijcleaow.prepareToDraw();
    }

    public final Bitmap ppxfxbqfkf() {
        return this.f38914zoijcleaow;
    }

    @Override // h.dvvnrvtcbc
    public int zoijcleaow() {
        Bitmap.Config config = this.f38914zoijcleaow.getConfig();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(config);
        return hkdspvbjdz.eablkybsjg(config);
    }
}
