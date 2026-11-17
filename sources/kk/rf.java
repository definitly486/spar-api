package kk;

import spay.sdk.domain.model.request.SdkAuthRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class rf extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final dh0 f58323iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final SdkAuthRequestBody.AuthMethod f58324zoijcleaow;

    public rf(dh0 dh0Var, SdkAuthRequestBody.AuthMethod authMethod) {
        this.f58323iobyxmoadg = dh0Var;
        this.f58324zoijcleaow = authMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf)) {
            return false;
        }
        rf rfVar = (rf) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58323iobyxmoadg, rfVar.f58323iobyxmoadg) && this.f58324zoijcleaow == rfVar.f58324zoijcleaow;
    }

    public final int hashCode() {
        dh0 dh0Var = this.f58323iobyxmoadg;
        int iHashCode = (dh0Var == null ? 0 : dh0Var.hashCode()) * 31;
        SdkAuthRequestBody.AuthMethod authMethod = this.f58324zoijcleaow;
        return iHashCode + (authMethod != null ? authMethod.hashCode() : 0);
    }

    public final String toString() {
        return "StartSdkAuth(sidAuthResultModel=" + this.f58323iobyxmoadg + ", authMethod=" + this.f58324zoijcleaow + ")";
    }
}
