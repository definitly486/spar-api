package kk;

import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class kf extends yj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ms f57306iobyxmoadg = zv.zoijcleaow(R.string.spay_load_cards);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57306iobyxmoadg, ((kf) obj).f57306iobyxmoadg);
    }

    public final int hashCode() {
        ms msVar = this.f57306iobyxmoadg;
        if (msVar == null) {
            return 0;
        }
        return msVar.hashCode();
    }

    @Override // kk.yj
    public final vu iobyxmoadg() {
        return this.f57306iobyxmoadg;
    }

    public final String toString() {
        return "FullEmissionLoading(text=" + this.f57306iobyxmoadg + ")";
    }
}
