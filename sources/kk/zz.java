package kk;

import spay.seamlessAuth.core.data.model.OIDCStand;

/* JADX INFO: loaded from: classes3.dex */
public final class zz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final f80 f59637iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final c70 f59638zoijcleaow;

    public zz(f80 appTokenStoreSP, c70 appTokenRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appTokenStoreSP, "appTokenStoreSP");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appTokenRepository, "appTokenRepository");
        this.f59637iobyxmoadg = appTokenStoreSP;
        this.f59638zoijcleaow = appTokenRepository;
    }

    public static xl ppxfxbqfkf(String str, w40 w40Var) {
        if (str == null) {
            return null;
        }
        return new xl(zoijcleaow(OIDCStand.INSTANCE.getActualOIDCStand()) + str, w40Var.f59092zoijcleaow, w40Var.f59091ppxfxbqfkf);
    }

    public static String zoijcleaow(OIDCStand oIDCStand) {
        return ir.ppxfxbqfkf(oIDCStand.getUrl()) + "?token=";
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object iobyxmoadg(String str, String str2, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        uy uyVar;
        Object obj;
        String str3;
        zz zzVar;
        w40 w40Var;
        if (wkgbmnqykcVar instanceof uy) {
            uyVar = (uy) wkgbmnqykcVar;
            int i13 = uyVar.f58917esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                uyVar.f58917esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                uyVar = new uy(this, wkgbmnqykcVar);
            }
        } else {
            uyVar = new uy(this, wkgbmnqykcVar);
        }
        Object objIobyxmoadg = uyVar.f58918iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = uyVar.f58917esjtqupxsv;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            f80 f80Var = this.f59637iobyxmoadg;
            uyVar.f58921zdlpuopuiu = this;
            uyVar.f58920yggfygwlhe = str;
            uyVar.f58919jyumaefscl = str2;
            uyVar.f58917esjtqupxsv = 1;
            w40 w40VarZoijcleaow = ((rb0) f80Var).zoijcleaow();
            if (w40VarZoijcleaow != objGxszxtbevo) {
                obj = w40VarZoijcleaow;
                str3 = str2;
                zzVar = this;
            }
            return objGxszxtbevo;
        }
        if (i14 == 1) {
            String str4 = uyVar.f58919jyumaefscl;
            str = (String) uyVar.f58920yggfygwlhe;
            zz zzVar2 = uyVar.f58921zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            str3 = str4;
            zzVar = zzVar2;
            obj = objIobyxmoadg;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w40Var = (w40) uyVar.f58920yggfygwlhe;
            zzVar = uyVar.f58921zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        zm zmVar = (zm) objIobyxmoadg;
        String str5 = zmVar != null ? zmVar.f59602iobyxmoadg : null;
        zzVar.getClass();
        return ppxfxbqfkf(str5, w40Var);
        w40 w40Var2 = (w40) obj;
        if (w40Var2 == null) {
            return null;
        }
        c70 c70Var = zzVar.f59638zoijcleaow;
        uyVar.f58921zdlpuopuiu = zzVar;
        uyVar.f58920yggfygwlhe = w40Var2;
        uyVar.f58919jyumaefscl = null;
        uyVar.f58917esjtqupxsv = 2;
        objIobyxmoadg = c70Var.iobyxmoadg(w40Var2, str3, str, uyVar);
        if (objIobyxmoadg != objGxszxtbevo) {
            w40Var = w40Var2;
            zm zmVar2 = (zm) objIobyxmoadg;
            if (zmVar2 != null) {
            }
            zzVar.getClass();
            return ppxfxbqfkf(str5, w40Var);
        }
        return objGxszxtbevo;
    }
}
