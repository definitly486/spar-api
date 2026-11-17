package b80;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: b80.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C0262eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f15469iobyxmoadg;

        public C0262eablkybsjg(boolean z13) {
            super(null);
            this.f15469iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0262eablkybsjg) && this.f15469iobyxmoadg == ((C0262eablkybsjg) obj).f15469iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f15469iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f15469iobyxmoadg;
        }

        public String toString() {
            return "OnScrollStateChanged(isCanScrollToTop=" + this.f15469iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f15470iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(String itemId) {
            super(null);
            zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f15470iobyxmoadg = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f15470iobyxmoadg, ((gxszxtbevo) obj).f15470iobyxmoadg);
        }

        public int hashCode() {
            return this.f15470iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f15470iobyxmoadg;
        }

        public String toString() {
            return "OnShowAnswerClicked(itemId=" + this.f15470iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f15471iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String itemId) {
            super(null);
            zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f15471iobyxmoadg = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f15471iobyxmoadg, ((iobyxmoadg) obj).f15471iobyxmoadg);
        }

        public int hashCode() {
            return this.f15471iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f15471iobyxmoadg;
        }

        public String toString() {
            return "OnAnimatedAnswer(itemId=" + this.f15471iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f15472iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 2141084878;
        }

        public String toString() {
            return "OnEditReviewClicked";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f15473iobyxmoadg;

        public wkgbmnqykc(int i13) {
            super(null);
            this.f15473iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f15473iobyxmoadg == ((wkgbmnqykc) obj).f15473iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f15473iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f15473iobyxmoadg;
        }

        public String toString() {
            return "OnNext(position=" + this.f15473iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f15474iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1922885367;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
