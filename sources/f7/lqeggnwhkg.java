package f7;

import android.view.View;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg implements draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f33039iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f33040zoijcleaow;

    public lqeggnwhkg(View view, boolean z13) {
        this.f33039iobyxmoadg = view;
        this.f33040zoijcleaow = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lqeggnwhkg) {
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            if (zdlpuopuiu.eablkybsjg(getView(), lqeggnwhkgVar.getView()) && wkgbmnqykc() == lqeggnwhkgVar.wkgbmnqykc()) {
                return true;
            }
        }
        return false;
    }

    @Override // f7.draadjrbmk
    public View getView() {
        return this.f33039iobyxmoadg;
    }

    public int hashCode() {
        return (getView().hashCode() * 31) + Boolean.hashCode(wkgbmnqykc());
    }

    @Override // f7.draadjrbmk
    public boolean wkgbmnqykc() {
        return this.f33040zoijcleaow;
    }
}
