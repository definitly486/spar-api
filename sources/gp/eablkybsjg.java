package gp;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.api.model.AuthorizationFlowResult;
import ru.myspar.auth.api.model.RegistrationArgs;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: gp.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C0864eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f38129iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0864eablkybsjg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f38129iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0864eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f38129iobyxmoadg, ((C0864eablkybsjg) obj).f38129iobyxmoadg);
        }

        public int hashCode() {
            return this.f38129iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f38129iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f38129iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f38130iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f38131iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f38132iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AuthorizationFlowResult f38133iobyxmoadg;

        public ppxfxbqfkf(AuthorizationFlowResult authorizationFlowResult) {
            super(null);
            this.f38133iobyxmoadg = authorizationFlowResult;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f38133iobyxmoadg, ((ppxfxbqfkf) obj).f38133iobyxmoadg);
        }

        public int hashCode() {
            AuthorizationFlowResult authorizationFlowResult = this.f38133iobyxmoadg;
            if (authorizationFlowResult == null) {
                return 0;
            }
            return authorizationFlowResult.hashCode();
        }

        public final AuthorizationFlowResult iobyxmoadg() {
            return this.f38133iobyxmoadg;
        }

        public String toString() {
            return "NavigateToLoginBySmsScreen(result=" + this.f38133iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final RegistrationArgs f38134iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(RegistrationArgs args) {
            super(null);
            zdlpuopuiu.btonecajqb(args, "args");
            this.f38134iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f38134iobyxmoadg, ((wkgbmnqykc) obj).f38134iobyxmoadg);
        }

        public int hashCode() {
            return this.f38134iobyxmoadg.hashCode();
        }

        public final RegistrationArgs iobyxmoadg() {
            return this.f38134iobyxmoadg;
        }

        public String toString() {
            return "NavigateToRegistrationScreen(args=" + this.f38134iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f38135iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
