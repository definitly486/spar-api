package zm0;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.tzroggbefp;
import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ow1.jpowsppfya;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.user.domain.model.UserInfo;
import ru.myspar.proloyalty.user.domain.model.UserState;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements vm0.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private String f130429eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f130430iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final jpowsppfya f130431ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final sp1.zoijcleaow f130432wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final cllcsxoeiz f130433zoijcleaow;

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f130434jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ vm0.iobyxmoadg f130435yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f130436zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(vm0.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f130435yggfygwlhe = iobyxmoadgVar;
            this.f130434jyumaefscl = draadjrbmkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f130435yggfygwlhe, this.f130434jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f130436zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                vm0.iobyxmoadg iobyxmoadgVar = this.f130435yggfygwlhe;
                this.f130436zdlpuopuiu = 1;
                obj = iobyxmoadgVar.zoijcleaow(this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                this.f130434jyumaefscl.invoke(this.f130435yggfygwlhe);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f130438yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f130439zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = ppxfxbqfkf.this.new zoijcleaow(gxszxtbevoVar);
            zoijcleaowVar.f130438yggfygwlhe = obj;
            return zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            lr0.zoijcleaow gender;
            mg.zoijcleaow.gxszxtbevo();
            if (this.f130439zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            UserState userState = (UserState) this.f130438yggfygwlhe;
            UserState.IsAuth isAuth = userState instanceof UserState.IsAuth ? (UserState.IsAuth) userState : null;
            UserInfo userInfo = isAuth != null ? isAuth.getUserInfo() : null;
            ppxfxbqfkf.this.f130429eablkybsjg = userInfo != null ? userInfo.getId() : null;
            ppxfxbqfkf.this.gtknphoqwx(userInfo != null ? userInfo.getId() : null, (userInfo == null || (gender = userInfo.getGender()) == null) ? null : gender.wkgbmnqykc(), userInfo != null ? userInfo.getDateBirth() : null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(UserState userState, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(userState, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public ppxfxbqfkf(Set analytics, cllcsxoeiz coroutineScope, jpowsppfya subscribeUserStateUseCase, sp1.zoijcleaow performanceMonitor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analytics, "analytics");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeUserStateUseCase, "subscribeUserStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(performanceMonitor, "performanceMonitor");
        this.f130430iobyxmoadg = analytics;
        this.f130433zoijcleaow = coroutineScope;
        this.f130431ppxfxbqfkf = subscribeUserStateUseCase;
        this.f130432wkgbmnqykc = performanceMonitor;
    }

    private final void btonecajqb(Set set, tg.draadjrbmk draadjrbmkVar) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            gtknphoqwx.wkgbmnqykc(this.f130433zoijcleaow, null, null, new iobyxmoadg((vm0.iobyxmoadg) it.next(), draadjrbmkVar, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(String str, String str2, Integer num, vm0.iobyxmoadg forEachEnabled) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(forEachEnabled, "$this$forEachEnabled");
        forEachEnabled.ppxfxbqfkf(str, str2, num);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gtknphoqwx(final String str, final String str2, LocalDate localDate) {
        Period periodBetween;
        final Integer numValueOf = (localDate == null || (periodBetween = Period.between(localDate, LocalDate.now())) == null) ? null : Integer.valueOf(periodBetween.getYears());
        btonecajqb(this.f130430iobyxmoadg, new tg.draadjrbmk() { // from class: zm0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.draadjrbmk(str, str2, numValueOf, (vm0.iobyxmoadg) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(wm0.iobyxmoadg iobyxmoadgVar, Map map, vm0.iobyxmoadg forEachEnabled) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(forEachEnabled, "$this$forEachEnabled");
        forEachEnabled.iobyxmoadg(iobyxmoadgVar.iobyxmoadg(), map);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // vm0.zoijcleaow
    public void eablkybsjg(sp1.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        String str = this.f130429eablkybsjg;
        if (str != null) {
            event.eablkybsjg(str);
        }
        this.f130432wkgbmnqykc.ppxfxbqfkf(event);
    }

    @Override // vm0.zoijcleaow
    public void iobyxmoadg() {
        Iterator it = this.f130430iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((vm0.iobyxmoadg) it.next()).init();
        }
        dxjokdxxww.hkdspvbjdz(dxjokdxxww.kegysxyocb((lqeggnwhkg) this.f130431ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new zoijcleaow(null)), this.f130433zoijcleaow);
    }

    @Override // vm0.zoijcleaow
    public void ppxfxbqfkf(sp1.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        String str = this.f130429eablkybsjg;
        if (str != null) {
            event.eablkybsjg(str);
        }
        this.f130432wkgbmnqykc.zoijcleaow(event);
    }

    @Override // vm0.zoijcleaow
    public void wkgbmnqykc(final wm0.iobyxmoadg event) {
        final Map mapZoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        String str = this.f130429eablkybsjg;
        if (str != null) {
            mapZoijcleaow = tzroggbefp.iwizpuwonk(event.zoijcleaow());
            mapZoijcleaow.put("profile_id", str);
        } else {
            mapZoijcleaow = event.zoijcleaow();
        }
        btonecajqb(this.f130430iobyxmoadg, new tg.draadjrbmk() { // from class: zm0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.wflxmlrfwp(event, mapZoijcleaow, (vm0.iobyxmoadg) obj);
            }
        });
    }

    @Override // vm0.zoijcleaow
    public void zoijcleaow(sp1.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        this.f130432wkgbmnqykc.iobyxmoadg(event);
    }
}
