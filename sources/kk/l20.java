package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class l20 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final f80 f57383iobyxmoadg;

    public l20(f80 appTokenStoreSP) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appTokenStoreSP, "appTokenStoreSP");
        this.f57383iobyxmoadg = appTokenStoreSP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object iobyxmoadg(kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        f10 f10Var;
        if (wkgbmnqykcVar instanceof f10) {
            f10Var = (f10) wkgbmnqykcVar;
            int i13 = f10Var.f56482jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                f10Var.f56482jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                f10Var = new f10(this, wkgbmnqykcVar);
            }
        } else {
            f10Var = new f10(this, wkgbmnqykcVar);
        }
        Object objZoijcleaow = f10Var.f56484zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = f10Var.f56482jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            f80 f80Var = this.f57383iobyxmoadg;
            f10Var.f56482jyumaefscl = 1;
            objZoijcleaow = ((rb0) f80Var).zoijcleaow();
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        w40 w40Var = (w40) objZoijcleaow;
        if (w40Var == null) {
            return null;
        }
        return w40Var;
    }
}
