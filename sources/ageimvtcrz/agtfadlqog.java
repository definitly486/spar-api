package ageimvtcrz;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import h.bfopjjpdmp;
import h.oipsdeybqn;

/* JADX INFO: loaded from: classes.dex */
final class agtfadlqog extends RippleDrawable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final iobyxmoadg f1802cqumvgiudr = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f1803iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Integer f1804jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private oipsdeybqn f1805yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final boolean f1806zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f1807iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public final void iobyxmoadg(RippleDrawable rippleDrawable, int i13) {
            rippleDrawable.setRadius(i13);
        }
    }

    public agtfadlqog(boolean z13) {
        super(ColorStateList.valueOf(-16777216), null, z13 ? new ColorDrawable(-1) : null);
        this.f1806zdlpuopuiu = z13;
    }

    private final long iobyxmoadg(long j13, float f13) {
        if (Build.VERSION.SDK_INT < 28) {
            f13 *= 2;
        }
        return oipsdeybqn.wflxmlrfwp(j13, zg.gtknphoqwx.dxjokdxxww(f13, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.f1806zdlpuopuiu) {
            this.f1803iwizpuwonk = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f1803iwizpuwonk = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.f1803iwizpuwonk;
    }

    public final void ppxfxbqfkf(int i13) {
        Integer num = this.f1804jyumaefscl;
        if (num != null && num.intValue() == i13) {
            return;
        }
        this.f1804jyumaefscl = Integer.valueOf(i13);
        zoijcleaow.f1807iobyxmoadg.iobyxmoadg(this, i13);
    }

    public final void zoijcleaow(long j13, float f13) {
        long jIobyxmoadg = iobyxmoadg(j13, f13);
        oipsdeybqn oipsdeybqnVar = this.f1805yggfygwlhe;
        if (oipsdeybqnVar == null ? false : oipsdeybqn.ojitshcjhn(oipsdeybqnVar.iwizpuwonk(), jIobyxmoadg)) {
            return;
        }
        this.f1805yggfygwlhe = oipsdeybqn.dxjokdxxww(jIobyxmoadg);
        setColor(ColorStateList.valueOf(bfopjjpdmp.nufgyqmvbu(jIobyxmoadg)));
    }
}
