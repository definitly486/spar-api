package ap;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.api.model.AuthorizationFlowResult;
import ru.myspar.auth.api.model.NonAuthorizedPayload;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: ap.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C0212eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14030iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final NonAuthorizedPayload.zoijcleaow f14031ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AuthorizationFlowResult f14032zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0212eablkybsjg(String phoneNumber, AuthorizationFlowResult authorizationFlowResult, NonAuthorizedPayload.zoijcleaow zoijcleaowVar) {
            super(null);
            zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
            this.f14030iobyxmoadg = phoneNumber;
            this.f14032zoijcleaow = authorizationFlowResult;
            this.f14031ppxfxbqfkf = zoijcleaowVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0212eablkybsjg)) {
                return false;
            }
            C0212eablkybsjg c0212eablkybsjg = (C0212eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f14030iobyxmoadg, c0212eablkybsjg.f14030iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f14032zoijcleaow, c0212eablkybsjg.f14032zoijcleaow) && this.f14031ppxfxbqfkf == c0212eablkybsjg.f14031ppxfxbqfkf;
        }

        public int hashCode() {
            int iHashCode = this.f14030iobyxmoadg.hashCode() * 31;
            AuthorizationFlowResult authorizationFlowResult = this.f14032zoijcleaow;
            int iHashCode2 = (iHashCode + (authorizationFlowResult == null ? 0 : authorizationFlowResult.hashCode())) * 31;
            NonAuthorizedPayload.zoijcleaow zoijcleaowVar = this.f14031ppxfxbqfkf;
            return iHashCode2 + (zoijcleaowVar != null ? zoijcleaowVar.hashCode() : 0);
        }

        public final NonAuthorizedPayload.zoijcleaow iobyxmoadg() {
            return this.f14031ppxfxbqfkf;
        }

        public final AuthorizationFlowResult ppxfxbqfkf() {
            return this.f14032zoijcleaow;
        }

        public String toString() {
            return "ShowAuthBySmsScreen(phoneNumber=" + this.f14030iobyxmoadg + ", waitingResult=" + this.f14032zoijcleaow + ", errorType=" + this.f14031ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f14030iobyxmoadg;
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f14033iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1236401300;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14034iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AuthorizationFlowResult f14035zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String phoneNumber, AuthorizationFlowResult authorizationFlowResult) {
            super(null);
            zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
            this.f14034iobyxmoadg = phoneNumber;
            this.f14035zoijcleaow = authorizationFlowResult;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f14034iobyxmoadg, ppxfxbqfkfVar.f14034iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f14035zoijcleaow, ppxfxbqfkfVar.f14035zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f14034iobyxmoadg.hashCode() * 31;
            AuthorizationFlowResult authorizationFlowResult = this.f14035zoijcleaow;
            return iHashCode + (authorizationFlowResult == null ? 0 : authorizationFlowResult.hashCode());
        }

        public final String iobyxmoadg() {
            return this.f14034iobyxmoadg;
        }

        public String toString() {
            return "NavigateToRegistrationScreen(phoneNumber=" + this.f14034iobyxmoadg + ", waitingResult=" + this.f14035zoijcleaow + ")";
        }

        public final AuthorizationFlowResult zoijcleaow() {
            return this.f14035zoijcleaow;
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f14036iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f14036iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f14036iobyxmoadg, ((wkgbmnqykc) obj).f14036iobyxmoadg);
        }

        public int hashCode() {
            return this.f14036iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f14036iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f14036iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f14037iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 2045028226;
        }

        public String toString() {
            return "NavigateToLegalInfoScreen";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
