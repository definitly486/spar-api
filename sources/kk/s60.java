package kk;

import android.content.Context;
import npi.spay.An;

/* JADX INFO: loaded from: classes3.dex */
public final class s60 implements qc2.eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final qc2.zoijcleaow f58522iobyxmoadg;

    public s60(Context context, v70 settings, qc2.wkgbmnqykc dependencies) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(settings, "settings");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dependencies, "dependencies");
        qc2.zoijcleaow zoijcleaowVarIobyxmoadg = new qc2.ppxfxbqfkf(context, settings, dependencies).zoijcleaow(this).iobyxmoadg();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zoijcleaowVarIobyxmoadg, "BmsSdkBuilder(context, s…itListener(this).create()");
        this.f58522iobyxmoadg = zoijcleaowVarIobyxmoadg;
    }

    @Override // qc2.eablkybsjg
    public final void iobyxmoadg(String reason) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reason, "reason");
        throw new An(reason);
    }

    @Override // qc2.eablkybsjg
    public final void zoijcleaow() {
    }
}
