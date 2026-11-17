package kk;

import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class pg extends yj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ms f58081iobyxmoadg = zv.zoijcleaow(R.string.spay_wait_a_second);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58081iobyxmoadg, ((pg) obj).f58081iobyxmoadg);
    }

    public final int hashCode() {
        ms msVar = this.f58081iobyxmoadg;
        if (msVar == null) {
            return 0;
        }
        return msVar.hashCode();
    }

    @Override // kk.yj
    public final vu iobyxmoadg() {
        return this.f58081iobyxmoadg;
    }

    public final String toString() {
        return "JustASecond(text=" + this.f58081iobyxmoadg + ")";
    }
}
