package zo;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.api.model.AuthorizationFlowResult;
import ru.myspar.auth.api.model.NonAuthorizedPayload;

/* JADX INFO: loaded from: classes4.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f130535iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1510628398;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f130536iobyxmoadg;

        public ppxfxbqfkf(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f130536iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f130536iobyxmoadg, ((ppxfxbqfkf) obj).f130536iobyxmoadg);
        }

        public int hashCode() {
            return this.f130536iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f130536iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f130536iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f130537iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -1847285768;
        }

        public String toString() {
            return "StartSmsRetriever";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AuthorizationFlowResult f130538iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final NonAuthorizedPayload.zoijcleaow f130539zoijcleaow;

        public zoijcleaow(AuthorizationFlowResult authorizationFlowResult, NonAuthorizedPayload.zoijcleaow zoijcleaowVar) {
            this.f130538iobyxmoadg = authorizationFlowResult;
            this.f130539zoijcleaow = zoijcleaowVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f130538iobyxmoadg, zoijcleaowVar.f130538iobyxmoadg) && this.f130539zoijcleaow == zoijcleaowVar.f130539zoijcleaow;
        }

        public int hashCode() {
            AuthorizationFlowResult authorizationFlowResult = this.f130538iobyxmoadg;
            int iHashCode = (authorizationFlowResult == null ? 0 : authorizationFlowResult.hashCode()) * 31;
            NonAuthorizedPayload.zoijcleaow zoijcleaowVar = this.f130539zoijcleaow;
            return iHashCode + (zoijcleaowVar != null ? zoijcleaowVar.hashCode() : 0);
        }

        public final NonAuthorizedPayload.zoijcleaow iobyxmoadg() {
            return this.f130539zoijcleaow;
        }

        public String toString() {
            return "BackToMain(waitingResult=" + this.f130538iobyxmoadg + ", errorType=" + this.f130539zoijcleaow + ")";
        }

        public final AuthorizationFlowResult zoijcleaow() {
            return this.f130538iobyxmoadg;
        }
    }
}
