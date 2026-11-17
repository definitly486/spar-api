package h20;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.core.error_handler.exceptions.UserAuthorizationException;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ca2.wkgbmnqykc f39166ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final lo.zoijcleaow f39167wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f39168zoijcleaow;

    /* JADX INFO: renamed from: h20.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0902iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f39169iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final no.zoijcleaow.C1522zoijcleaow f39170ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f39171zoijcleaow;

        public C0902iobyxmoadg(String str, boolean z13, no.zoijcleaow.C1522zoijcleaow c1522zoijcleaow) {
            this.f39169iobyxmoadg = str;
            this.f39171zoijcleaow = z13;
            this.f39170ppxfxbqfkf = c1522zoijcleaow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0902iobyxmoadg)) {
                return false;
            }
            C0902iobyxmoadg c0902iobyxmoadg = (C0902iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f39169iobyxmoadg, c0902iobyxmoadg.f39169iobyxmoadg) && this.f39171zoijcleaow == c0902iobyxmoadg.f39171zoijcleaow && zdlpuopuiu.eablkybsjg(this.f39170ppxfxbqfkf, c0902iobyxmoadg.f39170ppxfxbqfkf);
        }

        public int hashCode() {
            String str = this.f39169iobyxmoadg;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.f39171zoijcleaow)) * 31;
            no.zoijcleaow.C1522zoijcleaow c1522zoijcleaow = this.f39170ppxfxbqfkf;
            return iHashCode + (c1522zoijcleaow != null ? c1522zoijcleaow.hashCode() : 0);
        }

        public final no.zoijcleaow.C1522zoijcleaow iobyxmoadg() {
            return this.f39170ppxfxbqfkf;
        }

        public final boolean ppxfxbqfkf() {
            return this.f39171zoijcleaow;
        }

        public String toString() {
            return "Params(id=" + this.f39169iobyxmoadg + ", isFavorite=" + this.f39171zoijcleaow + ", analyticParams=" + this.f39170ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f39169iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f39172cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f39174jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f39175yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f39176zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f39174jyumaefscl = obj;
            this.f39172cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ca2.ppxfxbqfkf userRepository, ca2.wkgbmnqykc userSharedPreferences, lo.zoijcleaow analyticsTracker, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f39168zoijcleaow = userRepository;
        this.f39166ppxfxbqfkf = userSharedPreferences;
        this.f39167wkgbmnqykc = analyticsTracker;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0902iobyxmoadg c0902iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) throws UserAuthorizationException {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f39172cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f39172cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f39174jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f39172cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (!this.f39166ppxfxbqfkf.nufgyqmvbu()) {
                throw new UserAuthorizationException(null, 1, null);
            }
            ha2.zoijcleaow zoijcleaowVar2 = new ha2.zoijcleaow(c0902iobyxmoadg.zoijcleaow(), c0902iobyxmoadg.ppxfxbqfkf());
            ca2.ppxfxbqfkf ppxfxbqfkfVar = this.f39168zoijcleaow;
            zoijcleaowVar.f39176zdlpuopuiu = this;
            zoijcleaowVar.f39175yggfygwlhe = c0902iobyxmoadg;
            zoijcleaowVar.f39172cqumvgiudr = 1;
            if (ppxfxbqfkfVar.btonecajqb(zoijcleaowVar2, zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0902iobyxmoadg = (C0902iobyxmoadg) zoijcleaowVar.f39175yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f39176zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        if (c0902iobyxmoadg.iobyxmoadg() != null) {
            iobyxmoadgVar.f39167wkgbmnqykc.ppxfxbqfkf(!c0902iobyxmoadg.ppxfxbqfkf() ? new no.zoijcleaow.iobyxmoadg(c0902iobyxmoadg.iobyxmoadg()) : new no.zoijcleaow.ppxfxbqfkf(c0902iobyxmoadg.iobyxmoadg()));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
