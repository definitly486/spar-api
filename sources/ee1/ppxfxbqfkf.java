package ee1;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ow1.esjtqupxsv;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final t81.iobyxmoadg f31216ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final esjtqupxsv f31217wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final de1.iobyxmoadg f31218zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f31219iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f31221yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f31222zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f31221yggfygwlhe = obj;
            this.f31219iwizpuwonk |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(de1.iobyxmoadg mySparSectionsRepository, t81.iobyxmoadg featureManager, esjtqupxsv isAuthUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(mySparSectionsRepository, "mySparSectionsRepository");
        zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f31218zoijcleaow = mySparSectionsRepository;
        this.f31216ppxfxbqfkf = featureManager;
        this.f31217wkgbmnqykc = isAuthUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f31219iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f31219iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = iobyxmoadgVar.f31221yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f31219iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                ppxfxbqfkfVar = (ppxfxbqfkf) iobyxmoadgVar.f31222zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        t81.iobyxmoadg iobyxmoadgVar2 = this.f31216ppxfxbqfkf;
        s81.iobyxmoadg iobyxmoadgVar3 = s81.iobyxmoadg.f105723dsvhmnatus;
        iobyxmoadgVar.f31222zdlpuopuiu = this;
        iobyxmoadgVar.f31219iwizpuwonk = 1;
        objPpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf(iobyxmoadgVar3, iobyxmoadgVar);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar = this;
        if (!((Boolean) objPpxfxbqfkf).booleanValue() || !((Boolean) ppxfxbqfkfVar.f31217wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            return jyumaefscl.wflxmlrfwp();
        }
        de1.iobyxmoadg iobyxmoadgVar4 = ppxfxbqfkfVar.f31218zoijcleaow;
        iobyxmoadgVar.f31222zdlpuopuiu = null;
        iobyxmoadgVar.f31219iwizpuwonk = 2;
        objPpxfxbqfkf = iobyxmoadgVar4.iobyxmoadg(iobyxmoadgVar);
        return objPpxfxbqfkf == objGxszxtbevo ? objGxszxtbevo : objPpxfxbqfkf;
    }
}
