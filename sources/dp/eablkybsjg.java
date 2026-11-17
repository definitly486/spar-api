package dp;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.api.model.AuthorizationFlowResult;
import ru.myspar.auth.api.model.NonAuthorizedPayload;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final NonAuthorizedPayload.zoijcleaow f29267iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(NonAuthorizedPayload.zoijcleaow errorType) {
            super(null);
            zdlpuopuiu.btonecajqb(errorType, "errorType");
            this.f29267iobyxmoadg = errorType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f29267iobyxmoadg == ((iobyxmoadg) obj).f29267iobyxmoadg;
        }

        public int hashCode() {
            return this.f29267iobyxmoadg.hashCode();
        }

        public final NonAuthorizedPayload.zoijcleaow iobyxmoadg() {
            return this.f29267iobyxmoadg;
        }

        public String toString() {
            return "ChangeSelectedTab(errorType=" + this.f29267iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AuthorizationFlowResult f29268iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final NonAuthorizedPayload.zoijcleaow f29269zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(AuthorizationFlowResult authorizationFlowResult, NonAuthorizedPayload.zoijcleaow errorType) {
            super(null);
            zdlpuopuiu.btonecajqb(errorType, "errorType");
            this.f29268iobyxmoadg = authorizationFlowResult;
            this.f29269zoijcleaow = errorType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f29268iobyxmoadg, ppxfxbqfkfVar.f29268iobyxmoadg) && this.f29269zoijcleaow == ppxfxbqfkfVar.f29269zoijcleaow;
        }

        public int hashCode() {
            AuthorizationFlowResult authorizationFlowResult = this.f29268iobyxmoadg;
            return ((authorizationFlowResult == null ? 0 : authorizationFlowResult.hashCode()) * 31) + this.f29269zoijcleaow.hashCode();
        }

        public final NonAuthorizedPayload.zoijcleaow iobyxmoadg() {
            return this.f29269zoijcleaow;
        }

        public String toString() {
            return "NavigateToLoginBySms(waitingResult=" + this.f29268iobyxmoadg + ", errorType=" + this.f29269zoijcleaow + ")";
        }

        public final AuthorizationFlowResult zoijcleaow() {
            return this.f29268iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AuthorizationFlowResult f29270iobyxmoadg;

        public wkgbmnqykc(AuthorizationFlowResult authorizationFlowResult) {
            super(null);
            this.f29270iobyxmoadg = authorizationFlowResult;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f29270iobyxmoadg, ((wkgbmnqykc) obj).f29270iobyxmoadg);
        }

        public int hashCode() {
            AuthorizationFlowResult authorizationFlowResult = this.f29270iobyxmoadg;
            if (authorizationFlowResult == null) {
                return 0;
            }
            return authorizationFlowResult.hashCode();
        }

        public final AuthorizationFlowResult iobyxmoadg() {
            return this.f29270iobyxmoadg;
        }

        public String toString() {
            return "NavigateToRegister(waitingResult=" + this.f29270iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f29271iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -866692216;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
