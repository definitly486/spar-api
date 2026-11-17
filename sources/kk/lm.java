package kk;

import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class lm extends wp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ErrorEntity f57483iobyxmoadg;

    public lm(ErrorEntity sPayApiError) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayApiError, "sPayApiError");
        this.f57483iobyxmoadg = sPayApiError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lm) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57483iobyxmoadg, ((lm) obj).f57483iobyxmoadg);
    }

    public final int hashCode() {
        return this.f57483iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "Error(sPayApiError=" + this.f57483iobyxmoadg + ")";
    }
}
