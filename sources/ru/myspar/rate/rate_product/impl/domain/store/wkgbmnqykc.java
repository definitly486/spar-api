package ru.myspar.rate.rate_product.impl.domain.store;

import gg.pmvmpeiblj;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public interface iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: ru.myspar.rate.rate_product.impl.domain.store.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2492iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final tzroggbefp f103012iobyxmoadg;

            public C2492iobyxmoadg(tzroggbefp value) {
                zdlpuopuiu.btonecajqb(value, "value");
                this.f103012iobyxmoadg = value;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2492iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f103012iobyxmoadg, ((C2492iobyxmoadg) obj).f103012iobyxmoadg);
            }

            public int hashCode() {
                return this.f103012iobyxmoadg.hashCode();
            }

            public final tzroggbefp iobyxmoadg() {
                return this.f103012iobyxmoadg;
            }

            public String toString() {
                return "Comment(value=" + this.f103012iobyxmoadg + ")";
            }
        }

        public static final class zoijcleaow implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final int f103013iobyxmoadg;

            public /* synthetic */ zoijcleaow(int i13, gtknphoqwx gtknphoqwxVar) {
                this(i13);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof zoijcleaow) && this.f103013iobyxmoadg == ((zoijcleaow) obj).f103013iobyxmoadg;
            }

            public int hashCode() {
                return pmvmpeiblj.wkgbmnqykc(this.f103013iobyxmoadg);
            }

            public final int iobyxmoadg() {
                return this.f103013iobyxmoadg;
            }

            public String toString() {
                return "Rating(value=" + pmvmpeiblj.eablkybsjg(this.f103013iobyxmoadg) + ")";
            }

            private zoijcleaow(int i13) {
                this.f103013iobyxmoadg = i13;
            }
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f103014iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1362979965;
        }

        public String toString() {
            return "Refresh";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.rate.rate_product.impl.domain.store.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2493wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2493wkgbmnqykc f103015iobyxmoadg = new C2493wkgbmnqykc();

        private C2493wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2493wkgbmnqykc);
        }

        public int hashCode() {
            return 1184094696;
        }

        public String toString() {
            return "SubmitReview";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f103016iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -480462009;
        }

        public String toString() {
            return "CloseMessage";
        }
    }
}
