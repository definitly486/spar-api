package dg0;

import gg.wwaezpbzkn;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.user.models.User;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ca2.wkgbmnqykc f28085ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f28086wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final v10.zoijcleaow f28087zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f28088cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f28090jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f28091yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f28092zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f28090jyumaefscl = obj;
            this.f28088cqumvgiudr |= Integer.MIN_VALUE;
            return eablkybsjg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(v10.zoijcleaow sharedPreferencesRepository, ca2.wkgbmnqykc userSharedPreferences, ca2.ppxfxbqfkf userRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f28087zoijcleaow = sharedPreferencesRepository;
        this.f28085ppxfxbqfkf = userSharedPreferences;
        this.f28086wkgbmnqykc = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        LocalDate localDate;
        LocalDate localDate2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f28088cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f28088cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f28090jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f28088cqumvgiudr;
        boolean z13 = false;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (!this.f28085ppxfxbqfkf.nufgyqmvbu()) {
                return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
            }
            LocalDate localDateNow = LocalDate.now();
            LocalDate localDateJhduphickx = this.f28087zoijcleaow.jhduphickx();
            if (localDateJhduphickx == null) {
                localDateJhduphickx = localDateNow;
            }
            ca2.ppxfxbqfkf ppxfxbqfkfVar = this.f28086wkgbmnqykc;
            iobyxmoadgVar.f28092zdlpuopuiu = localDateNow;
            iobyxmoadgVar.f28091yggfygwlhe = localDateJhduphickx;
            iobyxmoadgVar.f28088cqumvgiudr = 1;
            Object objLqeggnwhkg = ppxfxbqfkfVar.lqeggnwhkg(iobyxmoadgVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            localDate = localDateJhduphickx;
            obj = objLqeggnwhkg;
            localDate2 = localDateNow;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            localDate = (LocalDate) iobyxmoadgVar.f28091yggfygwlhe;
            localDate2 = (LocalDate) iobyxmoadgVar.f28092zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        User user = (User) obj;
        Boolean boolIobyxmoadg = user != null ? kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(user.getIsIqosAgreementsApplied()) : null;
        if (localDate2.compareTo((ChronoLocalDate) localDate) >= 0 && (boolIobyxmoadg == null || !boolIobyxmoadg.booleanValue())) {
            z13 = true;
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
    }
}
