package kk;

import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class nn extends wp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ErrorEntity f57834iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ho f57835zoijcleaow;

    public nn(ErrorEntity sPayApiError, ho payInFull) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayApiError, "sPayApiError");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payInFull, "payInFull");
        this.f57834iobyxmoadg = sPayApiError;
        this.f57835zoijcleaow = payInFull;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn)) {
            return false;
        }
        nn nnVar = (nn) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57834iobyxmoadg, nnVar.f57834iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57835zoijcleaow, nnVar.f57835zoijcleaow);
    }

    public final int hashCode() {
        return this.f57835zoijcleaow.hashCode() + (this.f57834iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorWithBnplEnabled(sPayApiError=" + this.f57834iobyxmoadg + ", payInFull=" + this.f57835zoijcleaow + ")";
    }
}
