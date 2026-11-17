package po;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.tzroggbefp;
import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ra2.btonecajqb;
import ru.myspar.user.models.User;
import ru.myspar.user.models.UserState;
import sj.dxjokdxxww;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf implements lo.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final w32.zoijcleaow f77030eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private String f77031gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f77032iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dt.zoijcleaow f77033ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final btonecajqb f77034wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final cllcsxoeiz f77035zoijcleaow;

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f77036jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ lo.iobyxmoadg f77037yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f77038zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(lo.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f77037yggfygwlhe = iobyxmoadgVar;
            this.f77036jyumaefscl = draadjrbmkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f77037yggfygwlhe, this.f77036jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f77038zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                lo.iobyxmoadg iobyxmoadgVar = this.f77037yggfygwlhe;
                this.f77038zdlpuopuiu = 1;
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
                this.f77036jyumaefscl.invoke(this.f77037yggfygwlhe);
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
        /* synthetic */ Object f77040yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f77041zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = ppxfxbqfkf.this.new zoijcleaow(gxszxtbevoVar);
            zoijcleaowVar.f77040yggfygwlhe = obj;
            return zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f77041zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            UserState userState = (UserState) this.f77040yggfygwlhe;
            UserState.Authorized authorized = userState instanceof UserState.Authorized ? (UserState.Authorized) userState : null;
            User user = authorized != null ? authorized.getUser() : null;
            ppxfxbqfkf.this.f77031gxszxtbevo = user != null ? user.getXmlId() : null;
            ppxfxbqfkf.this.gtknphoqwx(user != null ? user.getXmlId() : null, user != null ? user.getGender() : null, user != null ? user.getDateBirth() : null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(UserState userState, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(userState, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public ppxfxbqfkf(Set analytics, cllcsxoeiz coroutineScope, dt.zoijcleaow dateUtils, btonecajqb subscribeToUserStateUseCase, w32.zoijcleaow performanceMonitor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analytics, "analytics");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dateUtils, "dateUtils");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToUserStateUseCase, "subscribeToUserStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(performanceMonitor, "performanceMonitor");
        this.f77032iobyxmoadg = analytics;
        this.f77035zoijcleaow = coroutineScope;
        this.f77033ppxfxbqfkf = dateUtils;
        this.f77034wkgbmnqykc = subscribeToUserStateUseCase;
        this.f77030eablkybsjg = performanceMonitor;
    }

    private final void btonecajqb(Set set, tg.draadjrbmk draadjrbmkVar) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            gtknphoqwx.wkgbmnqykc(this.f77035zoijcleaow, null, null, new iobyxmoadg((lo.iobyxmoadg) it.next(), draadjrbmkVar, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(String str, String str2, Integer num, lo.iobyxmoadg forEachEnabled) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(forEachEnabled, "$this$forEachEnabled");
        forEachEnabled.ppxfxbqfkf(str, str2, num);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gtknphoqwx(final String str, final String str2, String str3) {
        Period periodBetween;
        final Integer numValueOf = null;
        LocalDate localDateIobyxmoadg = str3 != null ? this.f77033ppxfxbqfkf.iobyxmoadg(str3) : null;
        if (localDateIobyxmoadg != null && (periodBetween = Period.between(localDateIobyxmoadg, LocalDate.now())) != null) {
            numValueOf = Integer.valueOf(periodBetween.getYears());
        }
        btonecajqb(this.f77032iobyxmoadg, new tg.draadjrbmk() { // from class: po.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.draadjrbmk(str, str2, numValueOf, (lo.iobyxmoadg) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(mo.iobyxmoadg iobyxmoadgVar, Map map, lo.iobyxmoadg forEachEnabled) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(forEachEnabled, "$this$forEachEnabled");
        forEachEnabled.iobyxmoadg(iobyxmoadgVar.iobyxmoadg(), map);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // lo.zoijcleaow
    public void eablkybsjg(w32.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        String str = this.f77031gxszxtbevo;
        if (str != null) {
            event.eablkybsjg(str);
        }
        this.f77030eablkybsjg.ppxfxbqfkf(event);
    }

    @Override // lo.zoijcleaow
    public void iobyxmoadg() {
        Iterator it = this.f77032iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((lo.iobyxmoadg) it.next()).init();
        }
        dxjokdxxww.hkdspvbjdz(dxjokdxxww.kegysxyocb(this.f77034wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new zoijcleaow(null)), this.f77035zoijcleaow);
    }

    @Override // lo.zoijcleaow
    public void ppxfxbqfkf(final mo.iobyxmoadg event) {
        final Map mapZoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        String str = this.f77031gxszxtbevo;
        if (str != null) {
            mapZoijcleaow = tzroggbefp.iwizpuwonk(event.zoijcleaow());
            mapZoijcleaow.put("profile_id", str);
        } else {
            mapZoijcleaow = event.zoijcleaow();
        }
        btonecajqb(this.f77032iobyxmoadg, new tg.draadjrbmk() { // from class: po.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.wflxmlrfwp(event, mapZoijcleaow, (lo.iobyxmoadg) obj);
            }
        });
    }

    @Override // lo.zoijcleaow
    public void wkgbmnqykc(w32.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        String str = this.f77031gxszxtbevo;
        if (str != null) {
            event.eablkybsjg(str);
        }
        this.f77030eablkybsjg.zoijcleaow(event);
    }

    @Override // lo.zoijcleaow
    public void zoijcleaow(w32.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        this.f77030eablkybsjg.iobyxmoadg(event);
    }
}
