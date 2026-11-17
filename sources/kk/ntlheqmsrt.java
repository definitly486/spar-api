package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ntlheqmsrt extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final n9 f57844iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final sd f57845zoijcleaow;

    public ntlheqmsrt(n9 request, sd actionOnSuccess) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(actionOnSuccess, "actionOnSuccess");
        this.f57844iobyxmoadg = request;
        this.f57845zoijcleaow = actionOnSuccess;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntlheqmsrt)) {
            return false;
        }
        ntlheqmsrt ntlheqmsrtVar = (ntlheqmsrt) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57844iobyxmoadg, ntlheqmsrtVar.f57844iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57845zoijcleaow, ntlheqmsrtVar.f57845zoijcleaow);
    }

    public final int hashCode() {
        return this.f57845zoijcleaow.hashCode() + (this.f57844iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "PerformCreateOTPRequest(request=" + this.f57844iobyxmoadg + ", actionOnSuccess=" + this.f57845zoijcleaow + ")";
    }
}
