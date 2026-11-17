package eo1;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final cz0.iobyxmoadg f31639ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final j01.zoijcleaow f31640wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final do1.iobyxmoadg f31641zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f31642iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f31644yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f31645zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f31644yggfygwlhe = obj;
            this.f31642iwizpuwonk |= Integer.MIN_VALUE;
            return eablkybsjg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(do1.iobyxmoadg scanGoRepository, cz0.iobyxmoadg cartInteractor, j01.zoijcleaow sharedPreferencesRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(scanGoRepository, "scanGoRepository");
        zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f31641zoijcleaow = scanGoRepository;
        this.f31639ppxfxbqfkf = cartInteractor;
        this.f31640wkgbmnqykc = sharedPreferencesRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        eablkybsjg eablkybsjgVar;
        eablkybsjg eablkybsjgVar2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f31642iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f31642iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f31644yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f31642iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                eablkybsjgVar = (eablkybsjg) iobyxmoadgVar.f31645zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eablkybsjgVar2 = (eablkybsjg) iobyxmoadgVar.f31645zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            eablkybsjgVar2.f31640wkgbmnqykc.dxjokdxxww(null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        cz0.iobyxmoadg iobyxmoadgVar2 = this.f31639ppxfxbqfkf;
        iobyxmoadgVar.f31645zdlpuopuiu = this;
        iobyxmoadgVar.f31642iwizpuwonk = 1;
        if (iobyxmoadgVar2.iwizpuwonk(iobyxmoadgVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        eablkybsjgVar = this;
        do1.iobyxmoadg iobyxmoadgVar3 = eablkybsjgVar.f31641zoijcleaow;
        iobyxmoadgVar.f31645zdlpuopuiu = eablkybsjgVar;
        iobyxmoadgVar.f31642iwizpuwonk = 2;
        if (iobyxmoadgVar3.zoijcleaow(iobyxmoadgVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        eablkybsjgVar2 = eablkybsjgVar;
        eablkybsjgVar2.f31640wkgbmnqykc.dxjokdxxww(null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
