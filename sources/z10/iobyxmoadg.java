package z10;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.components.geo.api.models.City;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final c20.eablkybsjg f127551ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final s20.iobyxmoadg f127552wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.ppxfxbqfkf f127553zoijcleaow;

    /* JADX INFO: renamed from: z10.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C3255iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f127554iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f127556yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f127557zdlpuopuiu;

        C3255iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f127556yggfygwlhe = obj;
            this.f127554iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.eablkybsjg(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(w10.ppxfxbqfkf cartLocalSource, c20.eablkybsjg isLoggedInUseCase, s20.iobyxmoadg getChosenCityUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(cartLocalSource, "cartLocalSource");
        zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        zdlpuopuiu.btonecajqb(getChosenCityUseCase, "getChosenCityUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f127553zoijcleaow = cartLocalSource;
        this.f127551ppxfxbqfkf = isLoggedInUseCase;
        this.f127552wkgbmnqykc = getChosenCityUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
        C3255iobyxmoadg c3255iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C3255iobyxmoadg) {
            c3255iobyxmoadg = (C3255iobyxmoadg) gxszxtbevoVar;
            int i13 = c3255iobyxmoadg.f127554iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3255iobyxmoadg.f127554iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c3255iobyxmoadg = new C3255iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c3255iobyxmoadg = new C3255iobyxmoadg(gxszxtbevoVar);
        }
        Object objNufgyqmvbu = c3255iobyxmoadg.f127556yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c3255iobyxmoadg.f127554iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            w10.ppxfxbqfkf ppxfxbqfkfVar = this.f127553zoijcleaow;
            c3255iobyxmoadg.f127557zdlpuopuiu = this;
            c3255iobyxmoadg.f127554iwizpuwonk = 1;
            objNufgyqmvbu = ppxfxbqfkfVar.nufgyqmvbu(c3255iobyxmoadg);
            if (objNufgyqmvbu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) c3255iobyxmoadg.f127557zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
        }
        y00.iobyxmoadg iobyxmoadgVar2 = (y00.iobyxmoadg) objNufgyqmvbu;
        return iobyxmoadgVar2 == null ? y00.zoijcleaow.iobyxmoadg(iobyxmoadgVar.lqeggnwhkg()) : iobyxmoadgVar2;
    }

    private final y00.iobyxmoadg gxszxtbevo() {
        City cityLqeggnwhkg = (City) this.f127552wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
        if (cityLqeggnwhkg == null) {
            cityLqeggnwhkg = lqeggnwhkg();
        }
        return y00.zoijcleaow.iobyxmoadg(cityLqeggnwhkg);
    }

    private final City lqeggnwhkg() {
        return City.INSTANCE.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        return ((Boolean) this.f127551ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue() ? eablkybsjg(gxszxtbevoVar) : gxszxtbevo();
    }
}
