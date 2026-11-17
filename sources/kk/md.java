package kk;

import spay.sdk.domain.model.response.spasibo.SpasiboBonusesResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class md extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final SpasiboBonusesResponseBody f57632iobyxmoadg;

    public md(SpasiboBonusesResponseBody spasiboBonusesResponseBody) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(spasiboBonusesResponseBody, "spasiboBonusesResponseBody");
        this.f57632iobyxmoadg = spasiboBonusesResponseBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof md) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57632iobyxmoadg, ((md) obj).f57632iobyxmoadg);
    }

    public final int hashCode() {
        return this.f57632iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "SpasiboBonusesResult(spasiboBonusesResponseBody=" + this.f57632iobyxmoadg + ")";
    }
}
