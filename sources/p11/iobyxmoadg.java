package p11;

import gg.wwaezpbzkn;
import j01.zoijcleaow;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f75394ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final hz0.iobyxmoadg.InterfaceC0966iobyxmoadg f75395wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final hz0.zoijcleaow f75396zoijcleaow;

    /* JADX INFO: renamed from: p11.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1654iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f75397iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f75399yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f75400zdlpuopuiu;

        C1654iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f75399yggfygwlhe = obj;
            this.f75397iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(hz0.zoijcleaow updateManager, zoijcleaow sharedPreferencesRepository, hz0.iobyxmoadg.InterfaceC0966iobyxmoadg semiVersionBuilder, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(updateManager, "updateManager");
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        zdlpuopuiu.btonecajqb(semiVersionBuilder, "semiVersionBuilder");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f75396zoijcleaow = updateManager;
        this.f75394ppxfxbqfkf = sharedPreferencesRepository;
        this.f75395wkgbmnqykc = semiVersionBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        C1654iobyxmoadg c1654iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C1654iobyxmoadg) {
            c1654iobyxmoadg = (C1654iobyxmoadg) gxszxtbevoVar;
            int i13 = c1654iobyxmoadg.f75397iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1654iobyxmoadg.f75397iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c1654iobyxmoadg = new C1654iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1654iobyxmoadg = new C1654iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c1654iobyxmoadg.f75399yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1654iobyxmoadg.f75397iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            hz0.zoijcleaow zoijcleaowVar = this.f75396zoijcleaow;
            c1654iobyxmoadg.f75400zdlpuopuiu = this;
            c1654iobyxmoadg.f75397iwizpuwonk = 1;
            objIobyxmoadg = zoijcleaowVar.iobyxmoadg(c1654iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) c1654iobyxmoadg.f75400zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        hz0.ppxfxbqfkf ppxfxbqfkfVar = (hz0.ppxfxbqfkf) objIobyxmoadg;
        String strPpxfxbqfkf = iobyxmoadgVar.f75394ppxfxbqfkf.ppxfxbqfkf();
        kr0.wkgbmnqykc wkgbmnqykcVar = kr0.wkgbmnqykc.f60450iobyxmoadg;
        kr0.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar, "Current version " + strPpxfxbqfkf, false, 2, null);
        hz0.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        kr0.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar, "Config version " + iobyxmoadgVarPpxfxbqfkf, false, 2, null);
        hz0.iobyxmoadg iobyxmoadgVarBuild = iobyxmoadgVar.f75395wkgbmnqykc.iobyxmoadg(strPpxfxbqfkf).build();
        boolean zZoijcleaow = iobyxmoadgVarBuild.zoijcleaow(iobyxmoadgVarPpxfxbqfkf);
        if (!ppxfxbqfkfVar.eablkybsjg()) {
            if (zZoijcleaow) {
                kr0.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar, "App version " + iobyxmoadgVarBuild + " is equal or higher, skip update", false, 2, null);
                iobyxmoadgVar.f75394ppxfxbqfkf.iobyxmoadg(false);
                ppxfxbqfkfVar.lqeggnwhkg();
            } else {
                boolean zGxszxtbevo = iobyxmoadgVar.f75394ppxfxbqfkf.gxszxtbevo();
                kr0.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar, "Ignore update is = " + zGxszxtbevo, false, 2, null);
                if (zGxszxtbevo) {
                    kr0.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar, "Skip update", false, 2, null);
                    ppxfxbqfkfVar.lqeggnwhkg();
                }
            }
        }
        kr0.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar, "Update message " + ppxfxbqfkfVar, false, 2, null);
        return ppxfxbqfkfVar;
    }
}
