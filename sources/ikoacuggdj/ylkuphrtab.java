package ikoacuggdj;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
final class ylkuphrtab extends EdgeEffect {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f44961iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private float f44962zoijcleaow;

    public ylkuphrtab(Context context) {
        super(context);
        this.f44961iobyxmoadg = w0.iobyxmoadg.iobyxmoadg(context).I(w0.nufgyqmvbu.lqeggnwhkg(1));
    }

    public final void iobyxmoadg(float f13) {
        float f14 = this.f44962zoijcleaow + f13;
        this.f44962zoijcleaow = f14;
        if (Math.abs(f14) > this.f44961iobyxmoadg) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i13) {
        this.f44962zoijcleaow = 0.0f;
        super.onAbsorb(i13);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f13, float f14) {
        this.f44962zoijcleaow = 0.0f;
        super.onPull(f13, f14);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.f44962zoijcleaow = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f13) {
        this.f44962zoijcleaow = 0.0f;
        super.onPull(f13);
    }
}
