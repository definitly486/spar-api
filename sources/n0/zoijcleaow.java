package n0;

import android.content.Context;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements jpowsppfya {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f68374iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f68375zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f68376iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f68378yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f68379zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f68378yggfygwlhe = obj;
            this.f68376iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.ppxfxbqfkf(null, this);
        }
    }

    public zoijcleaow(Context context) {
        this.f68374iobyxmoadg = context.getApplicationContext();
    }

    @Override // n0.jpowsppfya
    public Object iobyxmoadg() {
        return this.f68375zoijcleaow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // n0.jpowsppfya
    public Object ppxfxbqfkf(draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f68376iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f68376iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = iobyxmoadgVar.f68378yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f68376iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            }
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            draadjrbmkVar = (draadjrbmk) iobyxmoadgVar.f68379zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            return mbcevpiqjq.ppxfxbqfkf((Typeface) objWkgbmnqykc, ((ntlheqmsrt) draadjrbmkVar).eablkybsjg(), this.f68374iobyxmoadg);
        }
        gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        if (draadjrbmkVar instanceof n0.iobyxmoadg) {
            n0.iobyxmoadg iobyxmoadgVar2 = (n0.iobyxmoadg) draadjrbmkVar;
            n0.iobyxmoadg.InterfaceC1469iobyxmoadg interfaceC1469iobyxmoadgWkgbmnqykc = iobyxmoadgVar2.wkgbmnqykc();
            Context context = this.f68374iobyxmoadg;
            iobyxmoadgVar.f68376iwizpuwonk = 1;
            objWkgbmnqykc = interfaceC1469iobyxmoadgWkgbmnqykc.zoijcleaow(context, iobyxmoadgVar2, iobyxmoadgVar);
            return objWkgbmnqykc == objGxszxtbevo ? objGxszxtbevo : objWkgbmnqykc;
        }
        if (!(draadjrbmkVar instanceof ntlheqmsrt)) {
            throw new IllegalArgumentException("Unknown font type: " + draadjrbmkVar);
        }
        Context context2 = this.f68374iobyxmoadg;
        iobyxmoadgVar.f68379zdlpuopuiu = draadjrbmkVar;
        iobyxmoadgVar.f68376iwizpuwonk = 2;
        objWkgbmnqykc = ppxfxbqfkf.wkgbmnqykc((ntlheqmsrt) draadjrbmkVar, context2, iobyxmoadgVar);
        if (objWkgbmnqykc == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return mbcevpiqjq.ppxfxbqfkf((Typeface) objWkgbmnqykc, ((ntlheqmsrt) draadjrbmkVar).eablkybsjg(), this.f68374iobyxmoadg);
    }

    @Override // n0.jpowsppfya
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Typeface zoijcleaow(draadjrbmk draadjrbmkVar) {
        Object objWkgbmnqykc;
        Typeface typefacePpxfxbqfkf;
        if (draadjrbmkVar instanceof n0.iobyxmoadg) {
            n0.iobyxmoadg iobyxmoadgVar = (n0.iobyxmoadg) draadjrbmkVar;
            return iobyxmoadgVar.wkgbmnqykc().iobyxmoadg(this.f68374iobyxmoadg, iobyxmoadgVar);
        }
        if (!(draadjrbmkVar instanceof ntlheqmsrt)) {
            return null;
        }
        ntlheqmsrt ntlheqmsrtVar = (ntlheqmsrt) draadjrbmkVar;
        int iIobyxmoadg = ntlheqmsrtVar.iobyxmoadg();
        cqumvgiudr.iobyxmoadg iobyxmoadgVar2 = cqumvgiudr.f68240iobyxmoadg;
        if (cqumvgiudr.eablkybsjg(iIobyxmoadg, iobyxmoadgVar2.zoijcleaow())) {
            typefacePpxfxbqfkf = ppxfxbqfkf.ppxfxbqfkf(ntlheqmsrtVar, this.f68374iobyxmoadg);
        } else {
            if (!cqumvgiudr.eablkybsjg(iIobyxmoadg, iobyxmoadgVar2.ppxfxbqfkf())) {
                if (cqumvgiudr.eablkybsjg(iIobyxmoadg, iobyxmoadgVar2.iobyxmoadg())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) cqumvgiudr.lqeggnwhkg(ntlheqmsrtVar.iobyxmoadg())));
            }
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(ppxfxbqfkf.ppxfxbqfkf((ntlheqmsrt) draadjrbmkVar, this.f68374iobyxmoadg));
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            typefacePpxfxbqfkf = (Typeface) (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc);
        }
        return mbcevpiqjq.ppxfxbqfkf(typefacePpxfxbqfkf, ntlheqmsrtVar.eablkybsjg(), this.f68374iobyxmoadg);
    }
}
