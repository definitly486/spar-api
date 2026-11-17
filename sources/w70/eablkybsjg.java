package w70;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.api.model.NonAuthorizedPayload;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: w70.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2959eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f118933iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2959eablkybsjg(String qrCode) {
            super(null);
            zdlpuopuiu.btonecajqb(qrCode, "qrCode");
            this.f118933iobyxmoadg = qrCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2959eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f118933iobyxmoadg, ((C2959eablkybsjg) obj).f118933iobyxmoadg);
        }

        public int hashCode() {
            return this.f118933iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f118933iobyxmoadg;
        }

        public String toString() {
            return "ShowQrCode(qrCode=" + this.f118933iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f118934iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f118935iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f118936iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f118936iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f118936iobyxmoadg, ((ppxfxbqfkf) obj).f118936iobyxmoadg);
        }

        public int hashCode() {
            return this.f118936iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f118936iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f118936iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final f10.iobyxmoadg f118937iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(f10.iobyxmoadg args) {
            super(null);
            zdlpuopuiu.btonecajqb(args, "args");
            this.f118937iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f118937iobyxmoadg, ((wkgbmnqykc) obj).f118937iobyxmoadg);
        }

        public int hashCode() {
            return this.f118937iobyxmoadg.hashCode();
        }

        public final f10.iobyxmoadg iobyxmoadg() {
            return this.f118937iobyxmoadg;
        }

        public String toString() {
            return "ShowPromoItem(args=" + this.f118937iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final NonAuthorizedPayload.zoijcleaow f118938iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(NonAuthorizedPayload.zoijcleaow errorType) {
            super(null);
            zdlpuopuiu.btonecajqb(errorType, "errorType");
            this.f118938iobyxmoadg = errorType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f118938iobyxmoadg == ((zoijcleaow) obj).f118938iobyxmoadg;
        }

        public int hashCode() {
            return this.f118938iobyxmoadg.hashCode();
        }

        public String toString() {
            return "OpenNotAuthorizedScreen(errorType=" + this.f118938iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
