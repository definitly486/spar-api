package rl1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f83101iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String article) {
            super(null);
            zdlpuopuiu.btonecajqb(article, "article");
            this.f83101iobyxmoadg = article;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f83101iobyxmoadg, ((iobyxmoadg) obj).f83101iobyxmoadg);
        }

        public int hashCode() {
            return this.f83101iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f83101iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(article=" + this.f83101iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f83102iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(tzroggbefp review) {
            super(null);
            zdlpuopuiu.btonecajqb(review, "review");
            this.f83102iobyxmoadg = review;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f83102iobyxmoadg, ((ppxfxbqfkf) obj).f83102iobyxmoadg);
        }

        public int hashCode() {
            return this.f83102iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f83102iobyxmoadg;
        }

        public String toString() {
            return "OnReviewTextChanged(review=" + this.f83102iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: rl1.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1866wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1866wkgbmnqykc f83103iobyxmoadg = new C1866wkgbmnqykc();

        private C1866wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1866wkgbmnqykc);
        }

        public int hashCode() {
            return 1052806984;
        }

        public String toString() {
            return "OnSendReviewButtonClicked";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f83104iobyxmoadg;

        public zoijcleaow(int i13) {
            super(null);
            this.f83104iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f83104iobyxmoadg == ((zoijcleaow) obj).f83104iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f83104iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f83104iobyxmoadg;
        }

        public String toString() {
            return "OnRatingChange(rating=" + this.f83104iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
