package d9;

import android.graphics.drawable.Drawable;
import g9.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf implements dxjokdxxww {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private c9.ppxfxbqfkf f27212jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f27213yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f27214zdlpuopuiu;

    public ppxfxbqfkf() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // d9.dxjokdxxww
    public final void btonecajqb(nufgyqmvbu nufgyqmvbuVar) {
        nufgyqmvbuVar.gxszxtbevo(this.f27214zdlpuopuiu, this.f27213yggfygwlhe);
    }

    @Override // d9.dxjokdxxww
    public void dxjokdxxww(Drawable drawable) {
    }

    @Override // d9.dxjokdxxww
    public void gxszxtbevo(Drawable drawable) {
    }

    @Override // d9.dxjokdxxww
    public final c9.ppxfxbqfkf iobyxmoadg() {
        return this.f27212jyumaefscl;
    }

    @Override // z8.draadjrbmk
    public void onDestroy() {
    }

    @Override // z8.draadjrbmk
    public void onStart() {
    }

    @Override // z8.draadjrbmk
    public void onStop() {
    }

    @Override // d9.dxjokdxxww
    public final void ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar) {
    }

    @Override // d9.dxjokdxxww
    public final void zoijcleaow(c9.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f27212jyumaefscl = ppxfxbqfkfVar;
    }

    public ppxfxbqfkf(int i13, int i14) {
        if (draadjrbmk.zdlpuopuiu(i13, i14)) {
            this.f27214zdlpuopuiu = i13;
            this.f27213yggfygwlhe = i14;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i13 + " and height: " + i14);
    }
}
