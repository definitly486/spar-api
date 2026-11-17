package kk;

import spay.sdk.domain.model.request.SdkAuthRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class nt extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final dh0 f57842iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final SdkAuthRequestBody.AuthMethod f57843zoijcleaow;

    public nt() {
        this.f57842iobyxmoadg = null;
        this.f57843zoijcleaow = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt)) {
            return false;
        }
        nt ntVar = (nt) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57842iobyxmoadg, ntVar.f57842iobyxmoadg) && this.f57843zoijcleaow == ntVar.f57843zoijcleaow;
    }

    public final int hashCode() {
        dh0 dh0Var = this.f57842iobyxmoadg;
        int iHashCode = (dh0Var == null ? 0 : dh0Var.hashCode()) * 31;
        SdkAuthRequestBody.AuthMethod authMethod = this.f57843zoijcleaow;
        return iHashCode + (authMethod != null ? authMethod.hashCode() : 0);
    }

    public final String toString() {
        return "StartSdkAuth(authModel=" + this.f57842iobyxmoadg + ", authMethod=" + this.f57843zoijcleaow + ")";
    }

    public nt(dh0 dh0Var, SdkAuthRequestBody.AuthMethod authMethod) {
        this.f57842iobyxmoadg = dh0Var;
        this.f57843zoijcleaow = authMethod;
    }
}
