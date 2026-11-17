package kk;

import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class vi extends yj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ms f59029iobyxmoadg = zv.zoijcleaow(R.string.spay_pay_loading_text);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vi) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59029iobyxmoadg, ((vi) obj).f59029iobyxmoadg);
    }

    public final int hashCode() {
        ms msVar = this.f59029iobyxmoadg;
        if (msVar == null) {
            return 0;
        }
        return msVar.hashCode();
    }

    @Override // kk.yj
    public final vu iobyxmoadg() {
        return this.f59029iobyxmoadg;
    }

    public final String toString() {
        return "PaymentLoading(text=" + this.f59029iobyxmoadg + ")";
    }
}
