package m01;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import ow1.esjtqupxsv;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.components.geo.api.models.City;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final esjtqupxsv f64869ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final y01.iobyxmoadg f64870wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.ppxfxbqfkf f64871zoijcleaow;

    /* JADX INFO: renamed from: m01.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1348iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f64872iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f64874yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f64875zdlpuopuiu;

        C1348iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f64874yggfygwlhe = obj;
            this.f64872iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.eablkybsjg(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(k01.ppxfxbqfkf cartLocalSource, esjtqupxsv isAuthUseCase, y01.iobyxmoadg getChosenCityUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(cartLocalSource, "cartLocalSource");
        zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        zdlpuopuiu.btonecajqb(getChosenCityUseCase, "getChosenCityUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f64871zoijcleaow = cartLocalSource;
        this.f64869ppxfxbqfkf = isAuthUseCase;
        this.f64870wkgbmnqykc = getChosenCityUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
        C1348iobyxmoadg c1348iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C1348iobyxmoadg) {
            c1348iobyxmoadg = (C1348iobyxmoadg) gxszxtbevoVar;
            int i13 = c1348iobyxmoadg.f64872iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1348iobyxmoadg.f64872iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c1348iobyxmoadg = new C1348iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1348iobyxmoadg = new C1348iobyxmoadg(gxszxtbevoVar);
        }
        Object objNufgyqmvbu = c1348iobyxmoadg.f64874yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1348iobyxmoadg.f64872iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            k01.ppxfxbqfkf ppxfxbqfkfVar = this.f64871zoijcleaow;
            c1348iobyxmoadg.f64875zdlpuopuiu = this;
            c1348iobyxmoadg.f64872iwizpuwonk = 1;
            objNufgyqmvbu = ppxfxbqfkfVar.nufgyqmvbu(c1348iobyxmoadg);
            if (objNufgyqmvbu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) c1348iobyxmoadg.f64875zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
        }
        pz0.iobyxmoadg iobyxmoadgVar2 = (pz0.iobyxmoadg) objNufgyqmvbu;
        return iobyxmoadgVar2 == null ? pz0.zoijcleaow.iobyxmoadg(iobyxmoadgVar.lqeggnwhkg()) : iobyxmoadgVar2;
    }

    private final pz0.iobyxmoadg gxszxtbevo() {
        City cityLqeggnwhkg = (City) this.f64870wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
        if (cityLqeggnwhkg == null) {
            cityLqeggnwhkg = lqeggnwhkg();
        }
        return pz0.zoijcleaow.iobyxmoadg(cityLqeggnwhkg);
    }

    private final City lqeggnwhkg() {
        return City.INSTANCE.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        return ((Boolean) this.f64869ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue() ? eablkybsjg(gxszxtbevoVar) : gxszxtbevo();
    }
}
