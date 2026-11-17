package xg1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f122343iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f122343iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f122343iobyxmoadg == ((iobyxmoadg) obj).f122343iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f122343iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f122343iobyxmoadg;
        }

        public String toString() {
            return "Back(isPaymentSuccess=" + this.f122343iobyxmoadg + ")";
        }

        public /* synthetic */ iobyxmoadg(boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? false : z13);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f122344iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 566682613;
        }

        public String toString() {
            return "ShowConfirmExitPopup";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f122345iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f122345iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f122345iobyxmoadg, ((wkgbmnqykc) obj).f122345iobyxmoadg);
        }

        public int hashCode() {
            return this.f122345iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f122345iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + this.f122345iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f122346iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f122346iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f122346iobyxmoadg, ((zoijcleaow) obj).f122346iobyxmoadg);
        }

        public int hashCode() {
            return this.f122346iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f122346iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f122346iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
