package ra2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.user.models.User;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f82452zoijcleaow;

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f82455cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f82457jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f82458yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f82459zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f82457jyumaefscl = obj;
            this.f82455cqumvgiudr |= Integer.MIN_VALUE;
            return lqeggnwhkg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(ca2.ppxfxbqfkf userRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f82452zoijcleaow = userRepository;
    }

    private final User eablkybsjg(User user) {
        return user.zoijcleaow((2088959 & 1) != 0 ? user.xmlId : null, (2088959 & 2) != 0 ? user.phone : null, (2088959 & 4) != 0 ? user.email : null, (2088959 & 8) != 0 ? user.firstName : null, (2088959 & 16) != 0 ? user.lastName : null, (2088959 & 32) != 0 ? user.userCard : null, (2088959 & 64) != 0 ? user.gender : null, (2088959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? user.dateBirth : null, (2088959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? user.notifications : null, (2088959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? user.isIqosAgreementsApplied : false, (2088959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? user.scanGoAccessGranted : false, (2088959 & 2048) != 0 ? user.isEmailConfirmed : false, (2088959 & 4096) != 0 ? user.digitalChecks : false, (2088959 & 8192) != 0 ? user.notificationsNew : 0, (2088959 & 16384) != 0 ? user.discountsNew : 0, (2088959 & 32768) != 0 ? user.promoNew : 0, (2088959 & 65536) != 0 ? user.testerFunctions : null, (2088959 & 131072) != 0 ? user.verifySum : null, (2088959 & 262144) != 0 ? user.userSubscriptions : null, (2088959 & 524288) != 0 ? user.segments : null, (2088959 & 1048576) != 0 ? user.gameToken : null);
    }

    private final User wkgbmnqykc(User user) {
        return user.zoijcleaow((2088959 & 1) != 0 ? user.xmlId : null, (2088959 & 2) != 0 ? user.phone : null, (2088959 & 4) != 0 ? user.email : null, (2088959 & 8) != 0 ? user.firstName : null, (2088959 & 16) != 0 ? user.lastName : null, (2088959 & 32) != 0 ? user.userCard : null, (2088959 & 64) != 0 ? user.gender : null, (2088959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? user.dateBirth : null, (2088959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? user.notifications : null, (2088959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? user.isIqosAgreementsApplied : false, (2088959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? user.scanGoAccessGranted : false, (2088959 & 2048) != 0 ? user.isEmailConfirmed : false, (2088959 & 4096) != 0 ? user.digitalChecks : false, (2088959 & 8192) != 0 ? user.notificationsNew : 0, (2088959 & 16384) != 0 ? user.discountsNew : 0, (2088959 & 32768) != 0 ? user.promoNew : 0, (2088959 & 65536) != 0 ? user.testerFunctions : null, (2088959 & 131072) != 0 ? user.verifySum : null, (2088959 & 262144) != 0 ? user.userSubscriptions : null, (2088959 & 524288) != 0 ? user.segments : null, (2088959 & 1048576) != 0 ? user.gameToken : null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        lqeggnwhkg lqeggnwhkgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f82455cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f82455cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = zoijcleaowVar.f82457jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f82455cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f82458yggfygwlhe;
                lqeggnwhkgVar = (lqeggnwhkg) zoijcleaowVar.f82459zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        ca2.ppxfxbqfkf ppxfxbqfkfVar = this.f82452zoijcleaow;
        zoijcleaowVar.f82459zdlpuopuiu = this;
        zoijcleaowVar.f82458yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar.f82455cqumvgiudr = 1;
        objLqeggnwhkg = ppxfxbqfkfVar.lqeggnwhkg(zoijcleaowVar);
        if (objLqeggnwhkg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        lqeggnwhkgVar = this;
        User userEablkybsjg = (User) objLqeggnwhkg;
        if (userEablkybsjg == null) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!iobyxmoadgVar.iobyxmoadg() && !iobyxmoadgVar.zoijcleaow()) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (iobyxmoadgVar.iobyxmoadg()) {
            userEablkybsjg = lqeggnwhkgVar.wkgbmnqykc(userEablkybsjg);
        }
        if (iobyxmoadgVar.zoijcleaow()) {
            userEablkybsjg = lqeggnwhkgVar.eablkybsjg(userEablkybsjg);
        }
        ca2.ppxfxbqfkf ppxfxbqfkfVar2 = lqeggnwhkgVar.f82452zoijcleaow;
        zoijcleaowVar.f82459zdlpuopuiu = null;
        zoijcleaowVar.f82458yggfygwlhe = null;
        zoijcleaowVar.f82455cqumvgiudr = 2;
        if (ppxfxbqfkfVar2.draadjrbmk(userEablkybsjg, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f82453iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f82454zoijcleaow;

        public iobyxmoadg(boolean z13, boolean z14) {
            this.f82453iobyxmoadg = z13;
            this.f82454zoijcleaow = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f82453iobyxmoadg == iobyxmoadgVar.f82453iobyxmoadg && this.f82454zoijcleaow == iobyxmoadgVar.f82454zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f82453iobyxmoadg) * 31) + Boolean.hashCode(this.f82454zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f82453iobyxmoadg;
        }

        public String toString() {
            return "Params(resetCoupons=" + this.f82453iobyxmoadg + ", resetPromotions=" + this.f82454zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f82454zoijcleaow;
        }

        public /* synthetic */ iobyxmoadg(boolean z13, boolean z14, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? false : z14);
        }
    }
}
