package ru.myspar.proloyalty.dynamic_qr.impl.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.card.domain.model.UserBalanceBreakDown;

/* JADX INFO: loaded from: classes5.dex */
public interface zoijcleaow {

    public static abstract class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f96011iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final UserBalanceBreakDown f96012zoijcleaow;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.dynamic_qr.impl.presentation.zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2262iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            private final String f96013eablkybsjg;

            /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
            private final String f96014gxszxtbevo;

            /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
            private final String f96015lqeggnwhkg;

            /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
            private final UserBalanceBreakDown f96016nufgyqmvbu;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final String f96017ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private final String f96018wkgbmnqykc;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2262iobyxmoadg(String qrcodeValue, String description, String bonusesValue, String bonusesFormated, String bonusInfo, UserBalanceBreakDown userBalanceBreakDown) {
                super(qrcodeValue, userBalanceBreakDown, null);
                zdlpuopuiu.btonecajqb(qrcodeValue, "qrcodeValue");
                zdlpuopuiu.btonecajqb(description, "description");
                zdlpuopuiu.btonecajqb(bonusesValue, "bonusesValue");
                zdlpuopuiu.btonecajqb(bonusesFormated, "bonusesFormated");
                zdlpuopuiu.btonecajqb(bonusInfo, "bonusInfo");
                this.f96017ppxfxbqfkf = qrcodeValue;
                this.f96018wkgbmnqykc = description;
                this.f96013eablkybsjg = bonusesValue;
                this.f96014gxszxtbevo = bonusesFormated;
                this.f96015lqeggnwhkg = bonusInfo;
                this.f96016nufgyqmvbu = userBalanceBreakDown;
            }

            public final String eablkybsjg() {
                return this.f96014gxszxtbevo;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2262iobyxmoadg)) {
                    return false;
                }
                C2262iobyxmoadg c2262iobyxmoadg = (C2262iobyxmoadg) obj;
                return zdlpuopuiu.eablkybsjg(this.f96017ppxfxbqfkf, c2262iobyxmoadg.f96017ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f96018wkgbmnqykc, c2262iobyxmoadg.f96018wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f96013eablkybsjg, c2262iobyxmoadg.f96013eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f96014gxszxtbevo, c2262iobyxmoadg.f96014gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f96015lqeggnwhkg, c2262iobyxmoadg.f96015lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f96016nufgyqmvbu, c2262iobyxmoadg.f96016nufgyqmvbu);
            }

            public final String gxszxtbevo() {
                return this.f96013eablkybsjg;
            }

            public int hashCode() {
                int iHashCode = ((((((((this.f96017ppxfxbqfkf.hashCode() * 31) + this.f96018wkgbmnqykc.hashCode()) * 31) + this.f96013eablkybsjg.hashCode()) * 31) + this.f96014gxszxtbevo.hashCode()) * 31) + this.f96015lqeggnwhkg.hashCode()) * 31;
                UserBalanceBreakDown userBalanceBreakDown = this.f96016nufgyqmvbu;
                return iHashCode + (userBalanceBreakDown == null ? 0 : userBalanceBreakDown.hashCode());
            }

            @Override // ru.myspar.proloyalty.dynamic_qr.impl.presentation.zoijcleaow.iobyxmoadg
            public UserBalanceBreakDown iobyxmoadg() {
                return this.f96016nufgyqmvbu;
            }

            public final String lqeggnwhkg() {
                return this.f96018wkgbmnqykc;
            }

            public String toString() {
                return "BonusAvailable(qrcodeValue=" + this.f96017ppxfxbqfkf + ", description=" + this.f96018wkgbmnqykc + ", bonusesValue=" + this.f96013eablkybsjg + ", bonusesFormated=" + this.f96014gxszxtbevo + ", bonusInfo=" + this.f96015lqeggnwhkg + ", breakdown=" + this.f96016nufgyqmvbu + ")";
            }

            public final String wkgbmnqykc() {
                return this.f96015lqeggnwhkg;
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.dynamic_qr.impl.presentation.zoijcleaow$iobyxmoadg$zoijcleaow, reason: collision with other inner class name */
        public static final class C2263zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            private final boolean f96019eablkybsjg;

            /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
            private final String f96020gxszxtbevo;

            /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
            private final UserBalanceBreakDown f96021lqeggnwhkg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final String f96022ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private final String f96023wkgbmnqykc;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2263zoijcleaow(String str, String description, boolean z13, String errorInfo, UserBalanceBreakDown userBalanceBreakDown) {
                super(str, userBalanceBreakDown, null);
                zdlpuopuiu.btonecajqb(description, "description");
                zdlpuopuiu.btonecajqb(errorInfo, "errorInfo");
                this.f96022ppxfxbqfkf = str;
                this.f96023wkgbmnqykc = description;
                this.f96019eablkybsjg = z13;
                this.f96020gxszxtbevo = errorInfo;
                this.f96021lqeggnwhkg = userBalanceBreakDown;
            }

            public final String eablkybsjg() {
                return this.f96023wkgbmnqykc;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2263zoijcleaow)) {
                    return false;
                }
                C2263zoijcleaow c2263zoijcleaow = (C2263zoijcleaow) obj;
                return zdlpuopuiu.eablkybsjg(this.f96022ppxfxbqfkf, c2263zoijcleaow.f96022ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f96023wkgbmnqykc, c2263zoijcleaow.f96023wkgbmnqykc) && this.f96019eablkybsjg == c2263zoijcleaow.f96019eablkybsjg && zdlpuopuiu.eablkybsjg(this.f96020gxszxtbevo, c2263zoijcleaow.f96020gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f96021lqeggnwhkg, c2263zoijcleaow.f96021lqeggnwhkg);
            }

            public final String gxszxtbevo() {
                return this.f96020gxszxtbevo;
            }

            public int hashCode() {
                String str = this.f96022ppxfxbqfkf;
                int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.f96023wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f96019eablkybsjg)) * 31) + this.f96020gxszxtbevo.hashCode()) * 31;
                UserBalanceBreakDown userBalanceBreakDown = this.f96021lqeggnwhkg;
                return iHashCode + (userBalanceBreakDown != null ? userBalanceBreakDown.hashCode() : 0);
            }

            @Override // ru.myspar.proloyalty.dynamic_qr.impl.presentation.zoijcleaow.iobyxmoadg
            public UserBalanceBreakDown iobyxmoadg() {
                return this.f96021lqeggnwhkg;
            }

            public String toString() {
                return "BonusUnavailable(qrcodeValue=" + this.f96022ppxfxbqfkf + ", description=" + this.f96023wkgbmnqykc + ", buttonIsLoading=" + this.f96019eablkybsjg + ", errorInfo=" + this.f96020gxszxtbevo + ", breakdown=" + this.f96021lqeggnwhkg + ")";
            }

            public final boolean wkgbmnqykc() {
                return this.f96019eablkybsjg;
            }
        }

        public /* synthetic */ iobyxmoadg(String str, UserBalanceBreakDown userBalanceBreakDown, gtknphoqwx gtknphoqwxVar) {
            this(str, userBalanceBreakDown);
        }

        public abstract UserBalanceBreakDown iobyxmoadg();

        public final String ppxfxbqfkf() {
            return this.f96011iobyxmoadg;
        }

        public final boolean zoijcleaow() {
            UserBalanceBreakDown userBalanceBreakDownIobyxmoadg = iobyxmoadg();
            return (userBalanceBreakDownIobyxmoadg == null || userBalanceBreakDownIobyxmoadg.eablkybsjg()) ? false : true;
        }

        private iobyxmoadg(String str, UserBalanceBreakDown userBalanceBreakDown) {
            this.f96011iobyxmoadg = str;
            this.f96012zoijcleaow = userBalanceBreakDown;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.dynamic_qr.impl.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2264zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2264zoijcleaow f96024iobyxmoadg = new C2264zoijcleaow();

        private C2264zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2264zoijcleaow);
        }

        public int hashCode() {
            return 356907433;
        }

        public String toString() {
            return "Shimmer";
        }
    }
}
