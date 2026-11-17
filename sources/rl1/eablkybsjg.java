package rl1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83082iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f83082iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f83082iobyxmoadg == ((iobyxmoadg) obj).f83082iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f83082iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f83082iobyxmoadg;
        }

        public String toString() {
            return "Dismiss(isSentReview=" + this.f83082iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f83083iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f83083iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f83083iobyxmoadg, ((ppxfxbqfkf) obj).f83083iobyxmoadg);
        }

        public int hashCode() {
            return this.f83083iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f83083iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f83083iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83084iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String article) {
            super(null);
            zdlpuopuiu.btonecajqb(article, "article");
            this.f83084iobyxmoadg = article;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f83084iobyxmoadg, ((zoijcleaow) obj).f83084iobyxmoadg);
        }

        public int hashCode() {
            return this.f83084iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83084iobyxmoadg;
        }

        public String toString() {
            return "NavigateToSpecificOrderScreen(article=" + this.f83084iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
