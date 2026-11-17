package kk;

import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class q5 extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ErrorEntity f58155iobyxmoadg;

    public q5(ErrorEntity sPayApiError) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayApiError, "sPayApiError");
        this.f58155iobyxmoadg = sPayApiError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q5) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58155iobyxmoadg, ((q5) obj).f58155iobyxmoadg);
    }

    public final int hashCode() {
        return this.f58155iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "ShowPayBindingError(sPayApiError=" + this.f58155iobyxmoadg + ")";
    }
}
