package j30;

import ft.ppxfxbqfkf;
import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final v10.zoijcleaow f50604ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final p00.iobyxmoadg.InterfaceC1646iobyxmoadg f50605wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final p00.zoijcleaow f50606zoijcleaow;

    /* JADX INFO: renamed from: j30.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1086iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f50607iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f50609yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f50610zdlpuopuiu;

        C1086iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f50609yggfygwlhe = obj;
            this.f50607iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(p00.zoijcleaow updateManager, v10.zoijcleaow sharedPreferencesRepository, p00.iobyxmoadg.InterfaceC1646iobyxmoadg semiVersionBuilder, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(updateManager, "updateManager");
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        zdlpuopuiu.btonecajqb(semiVersionBuilder, "semiVersionBuilder");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f50606zoijcleaow = updateManager;
        this.f50604ppxfxbqfkf = sharedPreferencesRepository;
        this.f50605wkgbmnqykc = semiVersionBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        C1086iobyxmoadg c1086iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C1086iobyxmoadg) {
            c1086iobyxmoadg = (C1086iobyxmoadg) gxszxtbevoVar;
            int i13 = c1086iobyxmoadg.f50607iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1086iobyxmoadg.f50607iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c1086iobyxmoadg = new C1086iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1086iobyxmoadg = new C1086iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c1086iobyxmoadg.f50609yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1086iobyxmoadg.f50607iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            p00.zoijcleaow zoijcleaowVar = this.f50606zoijcleaow;
            c1086iobyxmoadg.f50610zdlpuopuiu = this;
            c1086iobyxmoadg.f50607iwizpuwonk = 1;
            objIobyxmoadg = zoijcleaowVar.iobyxmoadg(c1086iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) c1086iobyxmoadg.f50610zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        p00.ppxfxbqfkf ppxfxbqfkfVar = (p00.ppxfxbqfkf) objIobyxmoadg;
        String strPpxfxbqfkf = iobyxmoadgVar.f50604ppxfxbqfkf.ppxfxbqfkf();
        rs.wkgbmnqykc wkgbmnqykcVar = rs.wkgbmnqykc.f83693iobyxmoadg;
        rs.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar, "Current version " + strPpxfxbqfkf, false, 2, null);
        p00.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        rs.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar, "Config version " + iobyxmoadgVarPpxfxbqfkf, false, 2, null);
        p00.iobyxmoadg iobyxmoadgVarBuild = iobyxmoadgVar.f50605wkgbmnqykc.iobyxmoadg(strPpxfxbqfkf).build();
        boolean zZoijcleaow = iobyxmoadgVarBuild.zoijcleaow(iobyxmoadgVarPpxfxbqfkf);
        if (!ppxfxbqfkfVar.eablkybsjg()) {
            if (zZoijcleaow) {
                rs.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar, "App version " + iobyxmoadgVarBuild + " is equal or higher, skip update", false, 2, null);
                iobyxmoadgVar.f50604ppxfxbqfkf.iobyxmoadg(false);
                ppxfxbqfkfVar.lqeggnwhkg();
            } else {
                boolean zGxszxtbevo = iobyxmoadgVar.f50604ppxfxbqfkf.gxszxtbevo();
                rs.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar, "Ignore update is = " + zGxszxtbevo, false, 2, null);
                if (zGxszxtbevo) {
                    rs.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar, "Skip update", false, 2, null);
                    ppxfxbqfkfVar.lqeggnwhkg();
                }
            }
        }
        rs.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar, "Update message " + ppxfxbqfkfVar, false, 2, null);
        return ppxfxbqfkfVar;
    }
}
