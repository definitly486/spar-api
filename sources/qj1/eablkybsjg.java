package qj1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f78937iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 45908541;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f78938iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f78938iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f78938iobyxmoadg, ((ppxfxbqfkf) obj).f78938iobyxmoadg);
        }

        public int hashCode() {
            return this.f78938iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f78938iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f78938iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f78939iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String purchaseListId) {
            super(null);
            zdlpuopuiu.btonecajqb(purchaseListId, "purchaseListId");
            this.f78939iobyxmoadg = purchaseListId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f78939iobyxmoadg, ((zoijcleaow) obj).f78939iobyxmoadg);
        }

        public int hashCode() {
            return this.f78939iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f78939iobyxmoadg;
        }

        public String toString() {
            return "NavigateToDetailScreen(purchaseListId=" + this.f78939iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
