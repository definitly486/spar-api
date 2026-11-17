package kk;

import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class he extends yj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ms f56896iobyxmoadg = zv.zoijcleaow(R.string.spay_empty_string);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof he) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56896iobyxmoadg, ((he) obj).f56896iobyxmoadg);
    }

    public final int hashCode() {
        ms msVar = this.f56896iobyxmoadg;
        if (msVar == null) {
            return 0;
        }
        return msVar.hashCode();
    }

    @Override // kk.yj
    public final vu iobyxmoadg() {
        return this.f56896iobyxmoadg;
    }

    public final String toString() {
        return "CommonLoading(text=" + this.f56896iobyxmoadg + ")";
    }
}
