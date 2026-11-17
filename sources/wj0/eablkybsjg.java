package wj0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f119973iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f119973iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f119973iobyxmoadg == ((iobyxmoadg) obj).f119973iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f119973iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f119973iobyxmoadg;
        }

        public String toString() {
            return "Back(isPaymentSuccess=" + this.f119973iobyxmoadg + ")";
        }

        public /* synthetic */ iobyxmoadg(boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? false : z13);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f119974iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 955435320;
        }

        public String toString() {
            return "ShowConfirmExitPopup";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f119975iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f119975iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f119975iobyxmoadg, ((wkgbmnqykc) obj).f119975iobyxmoadg);
        }

        public int hashCode() {
            return this.f119975iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f119975iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + this.f119975iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f119976iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f119976iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f119976iobyxmoadg, ((zoijcleaow) obj).f119976iobyxmoadg);
        }

        public int hashCode() {
            return this.f119976iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f119976iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f119976iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
