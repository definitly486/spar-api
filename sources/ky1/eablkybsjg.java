package ky1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f61079iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -889296102;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f61080iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f61080iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f61080iobyxmoadg, ((ppxfxbqfkf) obj).f61080iobyxmoadg);
        }

        public int hashCode() {
            return this.f61080iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f61080iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f61080iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f61081iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String purchaseListId) {
            super(null);
            zdlpuopuiu.btonecajqb(purchaseListId, "purchaseListId");
            this.f61081iobyxmoadg = purchaseListId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f61081iobyxmoadg, ((zoijcleaow) obj).f61081iobyxmoadg);
        }

        public int hashCode() {
            return this.f61081iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f61081iobyxmoadg;
        }

        public String toString() {
            return "NavigateToDetailScreen(purchaseListId=" + this.f61081iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
