package kk;

import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;
import spay.sdk.R;
import spay.sdk.RedirectActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class qz implements sflfametgt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final de0 f58247iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public int f58248ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final bt f58249zoijcleaow;

    public qz(de0 authHandler, bt metricFacade) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authHandler, "authHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        this.f58247iobyxmoadg = authHandler;
        this.f58249zoijcleaow = metricFacade;
    }

    @Override // kk.sflfametgt
    public final Object iobyxmoadg(RedirectActivity redirectActivity, hkdspvbjdz hkdspvbjdzVar, lg.gxszxtbevo gxszxtbevoVar) {
        pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.lereixgezr();
        Executor mainExecutor = androidx.core.content.iobyxmoadg.getMainExecutor(redirectActivity);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(mainExecutor, "getMainExecutor(activity)");
        androidx.biometric.eablkybsjg eablkybsjgVar = new androidx.biometric.eablkybsjg(redirectActivity, mainExecutor, new my(rgvfuqvkyqVar, this));
        Context baseContext = redirectActivity.getBaseContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(baseContext, "activity.baseContext");
        androidx.biometric.eablkybsjg.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = new androidx.biometric.eablkybsjg.wkgbmnqykc.iobyxmoadg().eablkybsjg(baseContext.getString(R.string.spay_full_emission_biometric_title)).wkgbmnqykc(baseContext.getString(R.string.spay_full_emission_biometric_subtitle)).ppxfxbqfkf(baseContext.getString(R.string.spay_full_emission_biometric_negative)).zoijcleaow(KotlinVersion.MAX_COMPONENT_VALUE).iobyxmoadg();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wkgbmnqykcVarIobyxmoadg, "Builder()\n            .s…EAK)\n            .build()");
        eablkybsjgVar.iobyxmoadg(wkgbmnqykcVarIobyxmoadg);
        this.f58249zoijcleaow.iobyxmoadg(new ow(nd.LC_BIO_AUTH_START, we0.PAY_VIEW, mp.LC, null, null, null, null, 120));
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu;
    }

    @Override // kk.sflfametgt
    public final boolean zoijcleaow(RedirectActivity context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        return androidx.biometric.wkgbmnqykc.lqeggnwhkg(context).iobyxmoadg(KotlinVersion.MAX_COMPONENT_VALUE) == 0;
    }
}
