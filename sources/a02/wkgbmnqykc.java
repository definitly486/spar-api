package a02;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f140iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String article) {
            super(null);
            zdlpuopuiu.btonecajqb(article, "article");
            this.f140iobyxmoadg = article;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f140iobyxmoadg, ((iobyxmoadg) obj).f140iobyxmoadg);
        }

        public int hashCode() {
            return this.f140iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f140iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(article=" + this.f140iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f141iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(tzroggbefp review) {
            super(null);
            zdlpuopuiu.btonecajqb(review, "review");
            this.f141iobyxmoadg = review;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f141iobyxmoadg, ((ppxfxbqfkf) obj).f141iobyxmoadg);
        }

        public int hashCode() {
            return this.f141iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f141iobyxmoadg;
        }

        public String toString() {
            return "OnReviewTextChanged(review=" + this.f141iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: a02.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C0004wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0004wkgbmnqykc f142iobyxmoadg = new C0004wkgbmnqykc();

        private C0004wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0004wkgbmnqykc);
        }

        public int hashCode() {
            return -362834229;
        }

        public String toString() {
            return "OnSendReviewButtonClicked";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f143iobyxmoadg;

        public zoijcleaow(int i13) {
            super(null);
            this.f143iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f143iobyxmoadg == ((zoijcleaow) obj).f143iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f143iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f143iobyxmoadg;
        }

        public String toString() {
            return "OnRatingChange(rating=" + this.f143iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
