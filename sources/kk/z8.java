package kk;

import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class z8 extends kc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ErrorEntity f59540iobyxmoadg;

    public z8(ErrorEntity sPayApiError) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayApiError, "sPayApiError");
        this.f59540iobyxmoadg = sPayApiError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z8) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59540iobyxmoadg, ((z8) obj).f59540iobyxmoadg);
    }

    public final int hashCode() {
        return this.f59540iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "Error(sPayApiError=" + this.f59540iobyxmoadg + ")";
    }
}
