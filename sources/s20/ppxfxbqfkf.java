package s20;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import rs.wkgbmnqykc;
import ru.myspar.components.geo.api.models.City;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf extends ft.iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final v10.iobyxmoadg f105208zoijcleaow;

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f105209yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f105210zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            iobyxmoadgVar.f105209yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f105210zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            City city = (City) this.f105209yggfygwlhe;
            wkgbmnqykc.f83693iobyxmoadg.zoijcleaow("MOB-7588", "SubscribeToChosenCityUseCase " + city, true);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(City city, gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(city, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(v10.iobyxmoadg sharedPreferencesRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f105208zoijcleaow = sharedPreferencesRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.iobyxmoadg
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg iobyxmoadg(wwaezpbzkn parameters) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
        return dxjokdxxww.vdvldrhtss(dxjokdxxww.kegysxyocb(this.f105208zoijcleaow.istkbnxepw(), new iobyxmoadg(null)));
    }

    public final lqeggnwhkg wkgbmnqykc() {
        return dxjokdxxww.vdvldrhtss(this.f105208zoijcleaow.nufgyqmvbu());
    }
}
