package j00;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import pj.pkzmftpjix;
import ru.myspar.user.models.UserNotifications;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends j00.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f50376eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f50377ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f50378wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final v10.zoijcleaow f50379zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class zoijcleaow extends draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f50380cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ boolean f50381iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f50382jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f50383yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f50384zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(boolean z13, boolean z14, boolean z15, wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f50383yggfygwlhe = z13;
            this.f50382jyumaefscl = z14;
            this.f50381iwizpuwonk = z15;
            this.f50380cqumvgiudr = wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f50383yggfygwlhe, this.f50382jyumaefscl, this.f50381iwizpuwonk, this.f50380cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f50384zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
            }
            zdlpuopuiu.zoijcleaow(obj);
            UserNotifications userNotifications = new UserNotifications(this.f50383yggfygwlhe, this.f50382jyumaefscl, this.f50381iwizpuwonk);
            ca2.ppxfxbqfkf ppxfxbqfkfVar = this.f50380cqumvgiudr.f50377ppxfxbqfkf;
            this.f50384zdlpuopuiu = 1;
            if (ppxfxbqfkfVar.rgvfuqvkyq(userNotifications, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ca2.ppxfxbqfkf ppxfxbqfkfVar2 = this.f50380cqumvgiudr.f50377ppxfxbqfkf;
            this.f50384zdlpuopuiu = 2;
            obj = ppxfxbqfkfVar2.gxszxtbevo(this);
            return obj == objGxszxtbevo ? objGxszxtbevo : obj;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(v10.zoijcleaow sharedPreferencesRepository, ca2.ppxfxbqfkf userRepository, pkzmftpjix dispatcher) {
        super(dispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f50379zoijcleaow = sharedPreferencesRepository;
        this.f50377ppxfxbqfkf = userRepository;
    }

    public final void agtfadlqog(LocalDate localDate) {
        this.f50379zoijcleaow.hcddaimhww(localDate);
    }

    public final boolean btonecajqb(String promoId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoId, "promoId");
        if (promoId.length() <= 0 || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50379zoijcleaow.rgvfuqvkyq(), promoId)) {
            return false;
        }
        this.f50379zoijcleaow.lmojexxdyd(promoId);
        return true;
    }

    public final boolean draadjrbmk() {
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDateDxjokdxxww = dxjokdxxww();
        if (localDateDxjokdxxww == null) {
            localDateDxjokdxxww = LocalDate.now();
        }
        return localDateNow.compareTo((ChronoLocalDate) localDateDxjokdxxww) >= 0;
    }

    public final LocalDate dxjokdxxww() {
        return this.f50379zoijcleaow.yggfygwlhe();
    }

    public final boolean gtknphoqwx() {
        return this.f50379zoijcleaow.btonecajqb();
    }

    public final Object kcexrzcfyt(boolean z13, boolean z14, boolean z15, lg.gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new zoijcleaow(z13, z14, z15, this, null), gxszxtbevoVar);
    }

    public final void ojitshcjhn(boolean z13) {
        this.f50379zoijcleaow.dsvhmnatus(z13);
    }

    public final void oxmwwwfdhm() {
        agtfadlqog(LocalDate.now().plusWeeks(1L));
    }

    public final void rgvfuqvkyq(boolean z13) {
        this.f50378wkgbmnqykc = z13;
    }

    public final void vdvldrhtss() {
        this.f50379zoijcleaow.zdlpuopuiu(LocalDate.now().plusMonths(1L));
    }

    public final boolean wflxmlrfwp() {
        return this.f50378wkgbmnqykc;
    }
}
