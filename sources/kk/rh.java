package kk;

import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class rh extends yj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ms f58360iobyxmoadg = zv.zoijcleaow(R.string.spay_empty_string);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rh) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58360iobyxmoadg, ((rh) obj).f58360iobyxmoadg);
    }

    public final int hashCode() {
        ms msVar = this.f58360iobyxmoadg;
        if (msVar == null) {
            return 0;
        }
        return msVar.hashCode();
    }

    @Override // kk.yj
    public final vu iobyxmoadg() {
        return this.f58360iobyxmoadg;
    }

    public final String toString() {
        return "ListOfCardsLoading(text=" + this.f58360iobyxmoadg + ")";
    }
}
