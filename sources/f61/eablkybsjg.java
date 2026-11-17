package f61;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f32956iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f32957iobyxmoadg;

        public ppxfxbqfkf(String str) {
            super(null);
            this.f32957iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f32957iobyxmoadg, ((ppxfxbqfkf) obj).f32957iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f32957iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f32957iobyxmoadg;
        }

        public String toString() {
            return "ShowEmailTakenSnackbar(error=" + this.f32957iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f32958iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String email) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f32958iobyxmoadg = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f32958iobyxmoadg, ((wkgbmnqykc) obj).f32958iobyxmoadg);
        }

        public int hashCode() {
            return this.f32958iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f32958iobyxmoadg;
        }

        public String toString() {
            return "ShowEmailVerifyDialog(email=" + this.f32958iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f32959iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f32959iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f32959iobyxmoadg, ((zoijcleaow) obj).f32959iobyxmoadg);
        }

        public int hashCode() {
            return this.f32959iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f32959iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f32959iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
