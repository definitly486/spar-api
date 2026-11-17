package kk;

import android.content.Context;
import spay.sdk.SPaySdkApp;

/* JADX INFO: loaded from: classes3.dex */
public final class ol {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static volatile hp f57971ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final zz f57972iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final l20 f57973zoijcleaow;

    public ol(Context context) {
        rj rjVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        synchronized (this) {
            try {
                if (f57971ppxfxbqfkf == null) {
                    bq sdkComponent = SPaySdkApp.INSTANCE.getInstance().getSdkComponent();
                    if (sdkComponent != null && (rjVar = r80.f58286zoijcleaow) != null) {
                        bq bqVar = (bq) ag.dxjokdxxww.zoijcleaow(sdkComponent);
                        zh zhVar = (zh) ag.dxjokdxxww.zoijcleaow(rjVar);
                        Context context2 = (Context) ag.dxjokdxxww.zoijcleaow(context);
                        ag.dxjokdxxww.iobyxmoadg(bqVar, bq.class);
                        ag.dxjokdxxww.iobyxmoadg(zhVar, zh.class);
                        ag.dxjokdxxww.iobyxmoadg(context2, Context.class);
                        f57971ppxfxbqfkf = new hp(new lj(), new se(), new i9(), new k10(), bqVar, zhVar, context2);
                    }
                    hp hpVar = f57971ppxfxbqfkf;
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(hpVar);
                    this.f57972iobyxmoadg = (zz) hpVar.f56944ppxfxbqfkf.get();
                    this.f57973zoijcleaow = (l20) hpVar.f56945wkgbmnqykc.get();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object iobyxmoadg(kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        lk lkVar;
        if (wkgbmnqykcVar instanceof lk) {
            lkVar = (lk) wkgbmnqykcVar;
            int i13 = lkVar.f57480jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lkVar.f57480jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                lkVar = new lk(this, wkgbmnqykcVar);
            }
        } else {
            lkVar = new lk(this, wkgbmnqykcVar);
        }
        Object objIobyxmoadg = lkVar.f57482zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lkVar.f57480jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            l20 l20Var = this.f57973zoijcleaow;
            if (l20Var == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("getAppTokenUseCase");
                l20Var = null;
            }
            lkVar.f57480jyumaefscl = 1;
            objIobyxmoadg = l20Var.iobyxmoadg(lkVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(objIobyxmoadg != null);
    }
}
