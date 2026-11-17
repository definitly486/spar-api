package kk;

import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class w7 extends hl implements ylkuphrtab {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ErrorEntity f59105iobyxmoadg;

    public w7(ErrorEntity sPayApiError) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayApiError, "sPayApiError");
        this.f59105iobyxmoadg = sPayApiError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w7) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59105iobyxmoadg, ((w7) obj).f59105iobyxmoadg);
    }

    public final int hashCode() {
        return this.f59105iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "ShowPayResultError(sPayApiError=" + this.f59105iobyxmoadg + ")";
    }
}
