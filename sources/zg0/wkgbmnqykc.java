package zg0;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import oa0.gtknphoqwx;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gtknphoqwx f129969ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final c20.eablkybsjg f129970wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yg0.iobyxmoadg f129971zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f129972iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f129974yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f129975zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f129974yggfygwlhe = obj;
            this.f129972iwizpuwonk |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(yg0.iobyxmoadg mySparSectionsRepository, gtknphoqwx isFeatureEnabledUseCase, c20.eablkybsjg isUserLoggedInUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(mySparSectionsRepository, "mySparSectionsRepository");
        zdlpuopuiu.btonecajqb(isFeatureEnabledUseCase, "isFeatureEnabledUseCase");
        zdlpuopuiu.btonecajqb(isUserLoggedInUseCase, "isUserLoggedInUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f129971zoijcleaow = mySparSectionsRepository;
        this.f129969ppxfxbqfkf = isFeatureEnabledUseCase;
        this.f129970wkgbmnqykc = isUserLoggedInUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f129972iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f129972iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f129974yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f129972iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                wkgbmnqykcVar = (wkgbmnqykc) iobyxmoadgVar.f129975zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        gtknphoqwx gtknphoqwxVar = this.f129969ppxfxbqfkf;
        wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
        iobyxmoadgVar.f129975zdlpuopuiu = this;
        iobyxmoadgVar.f129972iwizpuwonk = 1;
        objZoijcleaow = gtknphoqwxVar.zoijcleaow(wwaezpbzknVar2, iobyxmoadgVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        wkgbmnqykcVar = this;
        if (!((Boolean) objZoijcleaow).booleanValue() || !((Boolean) wkgbmnqykcVar.f129970wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            return jyumaefscl.wflxmlrfwp();
        }
        yg0.iobyxmoadg iobyxmoadgVar2 = wkgbmnqykcVar.f129971zoijcleaow;
        iobyxmoadgVar.f129975zdlpuopuiu = null;
        iobyxmoadgVar.f129972iwizpuwonk = 2;
        objZoijcleaow = iobyxmoadgVar2.iobyxmoadg(iobyxmoadgVar);
        return objZoijcleaow == objGxszxtbevo ? objGxszxtbevo : objZoijcleaow;
    }
}
