package i22;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k00.iobyxmoadg f41792ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final v10.zoijcleaow f41793wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final h22.iobyxmoadg f41794zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f41795iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f41797yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f41798zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f41797yggfygwlhe = obj;
            this.f41795iwizpuwonk |= Integer.MIN_VALUE;
            return eablkybsjg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(h22.iobyxmoadg scanGoRepository, k00.iobyxmoadg cartInteractor, v10.zoijcleaow sharedPreferencesRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(scanGoRepository, "scanGoRepository");
        zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f41794zoijcleaow = scanGoRepository;
        this.f41792ppxfxbqfkf = cartInteractor;
        this.f41793wkgbmnqykc = sharedPreferencesRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        eablkybsjg eablkybsjgVar;
        eablkybsjg eablkybsjgVar2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f41795iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f41795iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f41797yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f41795iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                eablkybsjgVar = (eablkybsjg) iobyxmoadgVar.f41798zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eablkybsjgVar2 = (eablkybsjg) iobyxmoadgVar.f41798zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            eablkybsjgVar2.f41793wkgbmnqykc.dxjokdxxww(null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        k00.iobyxmoadg iobyxmoadgVar2 = this.f41792ppxfxbqfkf;
        iobyxmoadgVar.f41798zdlpuopuiu = this;
        iobyxmoadgVar.f41795iwizpuwonk = 1;
        if (iobyxmoadgVar2.esjtqupxsv(iobyxmoadgVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        eablkybsjgVar = this;
        h22.iobyxmoadg iobyxmoadgVar3 = eablkybsjgVar.f41794zoijcleaow;
        iobyxmoadgVar.f41798zdlpuopuiu = eablkybsjgVar;
        iobyxmoadgVar.f41795iwizpuwonk = 2;
        if (iobyxmoadgVar3.zoijcleaow(iobyxmoadgVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        eablkybsjgVar2 = eablkybsjgVar;
        eablkybsjgVar2.f41793wkgbmnqykc.dxjokdxxww(null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
