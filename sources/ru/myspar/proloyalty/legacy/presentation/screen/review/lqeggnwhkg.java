package ru.myspar.proloyalty.legacy.presentation.screen.review;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lqeggnwhkg {

    public static final class eablkybsjg extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f97255iobyxmoadg;

        public eablkybsjg(boolean z13) {
            super(null);
            this.f97255iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f97255iobyxmoadg == ((eablkybsjg) obj).f97255iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f97255iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f97255iobyxmoadg;
        }

        public String toString() {
            return "OnScrollStateChanged(isCanScrollToTop=" + this.f97255iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97256iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(String itemId) {
            super(null);
            zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f97256iobyxmoadg = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f97256iobyxmoadg, ((gxszxtbevo) obj).f97256iobyxmoadg);
        }

        public int hashCode() {
            return this.f97256iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f97256iobyxmoadg;
        }

        public String toString() {
            return "OnShowAnswerClicked(itemId=" + this.f97256iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97257iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String itemId) {
            super(null);
            zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f97257iobyxmoadg = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f97257iobyxmoadg, ((iobyxmoadg) obj).f97257iobyxmoadg);
        }

        public int hashCode() {
            return this.f97257iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f97257iobyxmoadg;
        }

        public String toString() {
            return "OnAnimatedAnswer(itemId=" + this.f97257iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f97258iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -2140418063;
        }

        public String toString() {
            return "OnEditReviewClicked";
        }
    }

    public static final class wkgbmnqykc extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f97259iobyxmoadg;

        public wkgbmnqykc(int i13) {
            super(null);
            this.f97259iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f97259iobyxmoadg == ((wkgbmnqykc) obj).f97259iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f97259iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f97259iobyxmoadg;
        }

        public String toString() {
            return "OnNext(position=" + this.f97259iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f97260iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1166172780;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public /* synthetic */ lqeggnwhkg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private lqeggnwhkg() {
    }
}
