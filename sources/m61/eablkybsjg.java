package m61;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: m61.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1363eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f66214iobyxmoadg;

        public C1363eablkybsjg(boolean z13) {
            super(null);
            this.f66214iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1363eablkybsjg) && this.f66214iobyxmoadg == ((C1363eablkybsjg) obj).f66214iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f66214iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f66214iobyxmoadg;
        }

        public String toString() {
            return "OnScrollStateChanged(isCanScrollToTop=" + this.f66214iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f66215iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(String itemId) {
            super(null);
            zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f66215iobyxmoadg = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f66215iobyxmoadg, ((gxszxtbevo) obj).f66215iobyxmoadg);
        }

        public int hashCode() {
            return this.f66215iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f66215iobyxmoadg;
        }

        public String toString() {
            return "OnShowAnswerClicked(itemId=" + this.f66215iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f66216iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String itemId) {
            super(null);
            zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f66216iobyxmoadg = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f66216iobyxmoadg, ((iobyxmoadg) obj).f66216iobyxmoadg);
        }

        public int hashCode() {
            return this.f66216iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f66216iobyxmoadg;
        }

        public String toString() {
            return "OnAnimatedAnswer(itemId=" + this.f66216iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f66217iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1463603467;
        }

        public String toString() {
            return "OnEditReviewClicked";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f66218iobyxmoadg;

        public wkgbmnqykc(int i13) {
            super(null);
            this.f66218iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f66218iobyxmoadg == ((wkgbmnqykc) obj).f66218iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f66218iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f66218iobyxmoadg;
        }

        public String toString() {
            return "OnNext(position=" + this.f66218iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f66219iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -922173690;
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
