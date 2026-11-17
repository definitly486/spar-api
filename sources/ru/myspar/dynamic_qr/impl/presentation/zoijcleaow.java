package ru.myspar.dynamic_qr.impl.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface zoijcleaow {

    public static abstract class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f88193iobyxmoadg;

        /* JADX INFO: renamed from: ru.myspar.dynamic_qr.impl.presentation.zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2018iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            private final String f88194eablkybsjg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final String f88195ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private final int f88196wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f88197zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2018iobyxmoadg(String qrcodeValue, String description, int i13, String bonusInfo) {
                super(qrcodeValue, null);
                zdlpuopuiu.btonecajqb(qrcodeValue, "qrcodeValue");
                zdlpuopuiu.btonecajqb(description, "description");
                zdlpuopuiu.btonecajqb(bonusInfo, "bonusInfo");
                this.f88197zoijcleaow = qrcodeValue;
                this.f88195ppxfxbqfkf = description;
                this.f88196wkgbmnqykc = i13;
                this.f88194eablkybsjg = bonusInfo;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2018iobyxmoadg)) {
                    return false;
                }
                C2018iobyxmoadg c2018iobyxmoadg = (C2018iobyxmoadg) obj;
                return zdlpuopuiu.eablkybsjg(this.f88197zoijcleaow, c2018iobyxmoadg.f88197zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f88195ppxfxbqfkf, c2018iobyxmoadg.f88195ppxfxbqfkf) && this.f88196wkgbmnqykc == c2018iobyxmoadg.f88196wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f88194eablkybsjg, c2018iobyxmoadg.f88194eablkybsjg);
            }

            public int hashCode() {
                return (((((this.f88197zoijcleaow.hashCode() * 31) + this.f88195ppxfxbqfkf.hashCode()) * 31) + Integer.hashCode(this.f88196wkgbmnqykc)) * 31) + this.f88194eablkybsjg.hashCode();
            }

            public final String ppxfxbqfkf() {
                return this.f88194eablkybsjg;
            }

            public String toString() {
                return "BonusAvailable(qrcodeValue=" + this.f88197zoijcleaow + ", description=" + this.f88195ppxfxbqfkf + ", bonusCount=" + this.f88196wkgbmnqykc + ", bonusInfo=" + this.f88194eablkybsjg + ")";
            }

            public final String wkgbmnqykc() {
                return this.f88195ppxfxbqfkf;
            }

            public final int zoijcleaow() {
                return this.f88196wkgbmnqykc;
            }
        }

        /* JADX INFO: renamed from: ru.myspar.dynamic_qr.impl.presentation.zoijcleaow$iobyxmoadg$zoijcleaow, reason: collision with other inner class name */
        public static final class C2019zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            private final String f88198eablkybsjg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final String f88199ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private final boolean f88200wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f88201zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2019zoijcleaow(String str, String description, boolean z13, String errorInfo) {
                super(str, null);
                zdlpuopuiu.btonecajqb(description, "description");
                zdlpuopuiu.btonecajqb(errorInfo, "errorInfo");
                this.f88201zoijcleaow = str;
                this.f88199ppxfxbqfkf = description;
                this.f88200wkgbmnqykc = z13;
                this.f88198eablkybsjg = errorInfo;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2019zoijcleaow)) {
                    return false;
                }
                C2019zoijcleaow c2019zoijcleaow = (C2019zoijcleaow) obj;
                return zdlpuopuiu.eablkybsjg(this.f88201zoijcleaow, c2019zoijcleaow.f88201zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f88199ppxfxbqfkf, c2019zoijcleaow.f88199ppxfxbqfkf) && this.f88200wkgbmnqykc == c2019zoijcleaow.f88200wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f88198eablkybsjg, c2019zoijcleaow.f88198eablkybsjg);
            }

            public int hashCode() {
                String str = this.f88201zoijcleaow;
                return ((((((str == null ? 0 : str.hashCode()) * 31) + this.f88199ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f88200wkgbmnqykc)) * 31) + this.f88198eablkybsjg.hashCode();
            }

            public final String ppxfxbqfkf() {
                return this.f88199ppxfxbqfkf;
            }

            public String toString() {
                return "BonusUnavailable(qrcodeValue=" + this.f88201zoijcleaow + ", description=" + this.f88199ppxfxbqfkf + ", buttonIsLoading=" + this.f88200wkgbmnqykc + ", errorInfo=" + this.f88198eablkybsjg + ")";
            }

            public final String wkgbmnqykc() {
                return this.f88198eablkybsjg;
            }

            public final boolean zoijcleaow() {
                return this.f88200wkgbmnqykc;
            }
        }

        public /* synthetic */ iobyxmoadg(String str, gtknphoqwx gtknphoqwxVar) {
            this(str);
        }

        public final String iobyxmoadg() {
            return this.f88193iobyxmoadg;
        }

        private iobyxmoadg(String str) {
            this.f88193iobyxmoadg = str;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.dynamic_qr.impl.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2020zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2020zoijcleaow f88202iobyxmoadg = new C2020zoijcleaow();

        private C2020zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2020zoijcleaow);
        }

        public int hashCode() {
            return 50735558;
        }

        public String toString() {
            return "Shimmer";
        }
    }
}
