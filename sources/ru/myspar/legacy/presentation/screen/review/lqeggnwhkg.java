package ru.myspar.legacy.presentation.screen.review;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lqeggnwhkg {

    public static final class eablkybsjg extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f89576iobyxmoadg;

        public eablkybsjg(boolean z13) {
            super(null);
            this.f89576iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f89576iobyxmoadg == ((eablkybsjg) obj).f89576iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f89576iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f89576iobyxmoadg;
        }

        public String toString() {
            return "OnScrollStateChanged(isCanScrollToTop=" + this.f89576iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f89577iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(String itemId) {
            super(null);
            zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f89577iobyxmoadg = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f89577iobyxmoadg, ((gxszxtbevo) obj).f89577iobyxmoadg);
        }

        public int hashCode() {
            return this.f89577iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f89577iobyxmoadg;
        }

        public String toString() {
            return "OnShowAnswerClicked(itemId=" + this.f89577iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f89578iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String itemId) {
            super(null);
            zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f89578iobyxmoadg = itemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f89578iobyxmoadg, ((iobyxmoadg) obj).f89578iobyxmoadg);
        }

        public int hashCode() {
            return this.f89578iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f89578iobyxmoadg;
        }

        public String toString() {
            return "OnAnimatedAnswer(itemId=" + this.f89578iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f89579iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1103872564;
        }

        public String toString() {
            return "OnEditReviewClicked";
        }
    }

    public static final class wkgbmnqykc extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f89580iobyxmoadg;

        public wkgbmnqykc(int i13) {
            super(null);
            this.f89580iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f89580iobyxmoadg == ((wkgbmnqykc) obj).f89580iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f89580iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f89580iobyxmoadg;
        }

        public String toString() {
            return "OnNext(position=" + this.f89580iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f89581iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1095369455;
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
