package f7;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f33046iobyxmoadg;

    public wkgbmnqykc(Context context) {
        this.f33046iobyxmoadg = context;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f33046iobyxmoadg, ((wkgbmnqykc) obj).f33046iobyxmoadg);
    }

    public int hashCode() {
        return this.f33046iobyxmoadg.hashCode();
    }

    @Override // f7.btonecajqb
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        DisplayMetrics displayMetrics = this.f33046iobyxmoadg.getResources().getDisplayMetrics();
        ppxfxbqfkf.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadg.iobyxmoadg(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new dxjokdxxww(iobyxmoadgVarIobyxmoadg, iobyxmoadgVarIobyxmoadg);
    }
}
