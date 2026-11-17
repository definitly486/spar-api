package v70;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f116277iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final f10.iobyxmoadg f116278iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(f10.iobyxmoadg args) {
            super(null);
            zdlpuopuiu.btonecajqb(args, "args");
            this.f116278iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f116278iobyxmoadg, ((ppxfxbqfkf) obj).f116278iobyxmoadg);
        }

        public int hashCode() {
            return this.f116278iobyxmoadg.hashCode();
        }

        public final f10.iobyxmoadg iobyxmoadg() {
            return this.f116278iobyxmoadg;
        }

        public String toString() {
            return "ShowPromoItem(args=" + this.f116278iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f116279iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String qrCode) {
            super(null);
            zdlpuopuiu.btonecajqb(qrCode, "qrCode");
            this.f116279iobyxmoadg = qrCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f116279iobyxmoadg, ((wkgbmnqykc) obj).f116279iobyxmoadg);
        }

        public int hashCode() {
            return this.f116279iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f116279iobyxmoadg;
        }

        public String toString() {
            return "ShowQrDialog(qrCode=" + this.f116279iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f116280iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f116280iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f116280iobyxmoadg, ((zoijcleaow) obj).f116280iobyxmoadg);
        }

        public int hashCode() {
            return this.f116280iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f116280iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f116280iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
