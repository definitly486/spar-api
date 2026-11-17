package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class my extends androidx.biometric.eablkybsjg.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final /* synthetic */ pj.rgvfuqvkyq f57699iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final /* synthetic */ qz f57700zoijcleaow;

    public my(pj.rgvfuqvkyq rgvfuqvkyqVar, qz qzVar) {
        this.f57699iobyxmoadg = rgvfuqvkyqVar;
        this.f57700zoijcleaow = qzVar;
    }

    @Override // androidx.biometric.eablkybsjg.iobyxmoadg
    public final void iobyxmoadg(int i13, CharSequence errString) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(errString, "errString");
        super.iobyxmoadg(i13, errString);
        String str = "Authentication error: " + ((Object) errString);
        pj.rgvfuqvkyq rgvfuqvkyqVar = this.f57699iobyxmoadg;
        fx fxVar = new fx(str, false, 1);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(rgvfuqvkyqVar, "<this>");
        if (rgvfuqvkyqVar.isActive()) {
            rgvfuqvkyqVar.cllcsxoeiz(fxVar, null);
        }
        this.f57700zoijcleaow.f58249zoijcleaow.iobyxmoadg(new ow(nd.LC_FAIL_BIO_AUTH, we0.PAY_VIEW, mp.LC, null, null, null, null, 120));
    }

    @Override // androidx.biometric.eablkybsjg.iobyxmoadg
    public final void ppxfxbqfkf(androidx.biometric.eablkybsjg.zoijcleaow result) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        super.ppxfxbqfkf(result);
        ((jf0) this.f57700zoijcleaow.f58247iobyxmoadg).f57191wkgbmnqykc = true;
        pj.rgvfuqvkyq rgvfuqvkyqVar = this.f57699iobyxmoadg;
        fx fxVar = new fx(null, true, 3);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(rgvfuqvkyqVar, "<this>");
        if (rgvfuqvkyqVar.isActive()) {
            rgvfuqvkyqVar.cllcsxoeiz(fxVar, null);
        }
        this.f57700zoijcleaow.f58249zoijcleaow.iobyxmoadg(new ow(nd.LC_GOOD_BIO_AUTH, we0.PAY_VIEW, mp.LC, null, null, null, null, 120));
    }

    @Override // androidx.biometric.eablkybsjg.iobyxmoadg
    public final void zoijcleaow() {
        super.zoijcleaow();
        qz qzVar = this.f57700zoijcleaow;
        int i13 = qzVar.f58248ppxfxbqfkf + 1;
        qzVar.f58248ppxfxbqfkf = i13;
        if (i13 >= 3) {
            pj.rgvfuqvkyq rgvfuqvkyqVar = this.f57699iobyxmoadg;
            fx fxVar = new fx("Authentication failed", false, 1);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(rgvfuqvkyqVar, "<this>");
            if (rgvfuqvkyqVar.isActive()) {
                rgvfuqvkyqVar.cllcsxoeiz(fxVar, null);
            }
        }
        this.f57700zoijcleaow.f58249zoijcleaow.iobyxmoadg(new ow(nd.LC_FAIL_BIO_AUTH, we0.PAY_VIEW, mp.LC, null, null, null, null, 120));
    }
}
