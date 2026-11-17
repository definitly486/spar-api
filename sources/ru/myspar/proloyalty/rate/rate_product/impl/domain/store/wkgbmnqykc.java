package ru.myspar.proloyalty.rate.rate_product.impl.domain.store;

import gg.pmvmpeiblj;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public interface iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2410iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final tzroggbefp f100300iobyxmoadg;

            public C2410iobyxmoadg(tzroggbefp value) {
                zdlpuopuiu.btonecajqb(value, "value");
                this.f100300iobyxmoadg = value;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2410iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f100300iobyxmoadg, ((C2410iobyxmoadg) obj).f100300iobyxmoadg);
            }

            public int hashCode() {
                return this.f100300iobyxmoadg.hashCode();
            }

            public final tzroggbefp iobyxmoadg() {
                return this.f100300iobyxmoadg;
            }

            public String toString() {
                return "Comment(value=" + this.f100300iobyxmoadg + ")";
            }
        }

        public static final class zoijcleaow implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final int f100301iobyxmoadg;

            public /* synthetic */ zoijcleaow(int i13, gtknphoqwx gtknphoqwxVar) {
                this(i13);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof zoijcleaow) && this.f100301iobyxmoadg == ((zoijcleaow) obj).f100301iobyxmoadg;
            }

            public int hashCode() {
                return pmvmpeiblj.wkgbmnqykc(this.f100301iobyxmoadg);
            }

            public final int iobyxmoadg() {
                return this.f100301iobyxmoadg;
            }

            public String toString() {
                return "Rating(value=" + pmvmpeiblj.eablkybsjg(this.f100301iobyxmoadg) + ")";
            }

            private zoijcleaow(int i13) {
                this.f100301iobyxmoadg = i13;
            }
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f100302iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -362268288;
        }

        public String toString() {
            return "Refresh";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2411wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2411wkgbmnqykc f100303iobyxmoadg = new C2411wkgbmnqykc();

        private C2411wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2411wkgbmnqykc);
        }

        public int hashCode() {
            return -915969525;
        }

        public String toString() {
            return "SubmitReview";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f100304iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1714441066;
        }

        public String toString() {
            return "CloseMessage";
        }
    }
}
