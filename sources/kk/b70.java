package kk;

import spay.sdk.domain.model.request.SpasiboBonusesRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class b70 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f55916iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final SpasiboBonusesRequestBody f55917zoijcleaow;

    public b70(String authorization, SpasiboBonusesRequestBody spasiboBonusesRequestBody) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authorization, "authorization");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(spasiboBonusesRequestBody, "spasiboBonusesRequestBody");
        this.f55916iobyxmoadg = authorization;
        this.f55917zoijcleaow = spasiboBonusesRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b70)) {
            return false;
        }
        b70 b70Var = (b70) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55916iobyxmoadg, b70Var.f55916iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55917zoijcleaow, b70Var.f55917zoijcleaow);
    }

    public final int hashCode() {
        return this.f55917zoijcleaow.hashCode() + (this.f55916iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "GetSpasiboBonusesUseCaseRequestParams(authorization=" + this.f55916iobyxmoadg + ", spasiboBonusesRequestBody=" + this.f55917zoijcleaow + ")";
    }
}
