package a02;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f121iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f121iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f121iobyxmoadg == ((iobyxmoadg) obj).f121iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f121iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f121iobyxmoadg;
        }

        public String toString() {
            return "Dismiss(isSentReview=" + this.f121iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f122iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f122iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f122iobyxmoadg, ((ppxfxbqfkf) obj).f122iobyxmoadg);
        }

        public int hashCode() {
            return this.f122iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f122iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f122iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f123iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String article) {
            super(null);
            zdlpuopuiu.btonecajqb(article, "article");
            this.f123iobyxmoadg = article;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f123iobyxmoadg, ((zoijcleaow) obj).f123iobyxmoadg);
        }

        public int hashCode() {
            return this.f123iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f123iobyxmoadg;
        }

        public String toString() {
            return "NavigateToSpecificOrderScreen(article=" + this.f123iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
