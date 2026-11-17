package pt0;

import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: pt0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1715iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f77299iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f77300zoijcleaow;

        public C1715iobyxmoadg(tzroggbefp promoCode, String statusText) {
            zdlpuopuiu.btonecajqb(promoCode, "promoCode");
            zdlpuopuiu.btonecajqb(statusText, "statusText");
            this.f77299iobyxmoadg = promoCode;
            this.f77300zoijcleaow = statusText;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1715iobyxmoadg)) {
                return false;
            }
            C1715iobyxmoadg c1715iobyxmoadg = (C1715iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f77299iobyxmoadg, c1715iobyxmoadg.f77299iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f77300zoijcleaow, c1715iobyxmoadg.f77300zoijcleaow);
        }

        public int hashCode() {
            return (this.f77299iobyxmoadg.hashCode() * 31) + this.f77300zoijcleaow.hashCode();
        }

        @Override // pt0.iobyxmoadg
        public tzroggbefp iobyxmoadg() {
            return this.f77299iobyxmoadg;
        }

        public String toString() {
            return "Applied(promoCode=" + this.f77299iobyxmoadg + ", statusText=" + this.f77300zoijcleaow + ")";
        }

        @Override // pt0.iobyxmoadg
        public String wkgbmnqykc() {
            return this.f77300zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f77301iobyxmoadg;

        public ppxfxbqfkf(tzroggbefp promoCode) {
            zdlpuopuiu.btonecajqb(promoCode, "promoCode");
            this.f77301iobyxmoadg = promoCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f77301iobyxmoadg, ((ppxfxbqfkf) obj).f77301iobyxmoadg);
        }

        public int hashCode() {
            return this.f77301iobyxmoadg.hashCode();
        }

        @Override // pt0.iobyxmoadg
        public tzroggbefp iobyxmoadg() {
            return this.f77301iobyxmoadg;
        }

        public String toString() {
            return "NotEntered(promoCode=" + this.f77301iobyxmoadg + ")";
        }

        @Override // pt0.iobyxmoadg
        public String wkgbmnqykc() {
            return null;
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f77302iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f77303zoijcleaow;

        public zoijcleaow(tzroggbefp promoCode, String statusText) {
            zdlpuopuiu.btonecajqb(promoCode, "promoCode");
            zdlpuopuiu.btonecajqb(statusText, "statusText");
            this.f77302iobyxmoadg = promoCode;
            this.f77303zoijcleaow = statusText;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f77302iobyxmoadg, zoijcleaowVar.f77302iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f77303zoijcleaow, zoijcleaowVar.f77303zoijcleaow);
        }

        public int hashCode() {
            return (this.f77302iobyxmoadg.hashCode() * 31) + this.f77303zoijcleaow.hashCode();
        }

        @Override // pt0.iobyxmoadg
        public tzroggbefp iobyxmoadg() {
            return this.f77302iobyxmoadg;
        }

        public String toString() {
            return "NotApplied(promoCode=" + this.f77302iobyxmoadg + ", statusText=" + this.f77303zoijcleaow + ")";
        }

        @Override // pt0.iobyxmoadg
        public String wkgbmnqykc() {
            return this.f77303zoijcleaow;
        }
    }

    tzroggbefp iobyxmoadg();

    default boolean ppxfxbqfkf() {
        String strWkgbmnqykc = wkgbmnqykc();
        return !(strWkgbmnqykc == null || kcexrzcfyt.zfvoamnweg(strWkgbmnqykc));
    }

    String wkgbmnqykc();

    default boolean zoijcleaow() {
        return this instanceof zoijcleaow;
    }
}
