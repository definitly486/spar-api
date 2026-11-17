package vu;

import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes4.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: vu.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2930iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f118070iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f118071zoijcleaow;

        public C2930iobyxmoadg(tzroggbefp promoCode, String statusText) {
            zdlpuopuiu.btonecajqb(promoCode, "promoCode");
            zdlpuopuiu.btonecajqb(statusText, "statusText");
            this.f118070iobyxmoadg = promoCode;
            this.f118071zoijcleaow = statusText;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2930iobyxmoadg)) {
                return false;
            }
            C2930iobyxmoadg c2930iobyxmoadg = (C2930iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f118070iobyxmoadg, c2930iobyxmoadg.f118070iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118071zoijcleaow, c2930iobyxmoadg.f118071zoijcleaow);
        }

        public int hashCode() {
            return (this.f118070iobyxmoadg.hashCode() * 31) + this.f118071zoijcleaow.hashCode();
        }

        @Override // vu.iobyxmoadg
        public tzroggbefp iobyxmoadg() {
            return this.f118070iobyxmoadg;
        }

        public String toString() {
            return "Applied(promoCode=" + this.f118070iobyxmoadg + ", statusText=" + this.f118071zoijcleaow + ")";
        }

        @Override // vu.iobyxmoadg
        public String wkgbmnqykc() {
            return this.f118071zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f118072iobyxmoadg;

        public ppxfxbqfkf(tzroggbefp promoCode) {
            zdlpuopuiu.btonecajqb(promoCode, "promoCode");
            this.f118072iobyxmoadg = promoCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f118072iobyxmoadg, ((ppxfxbqfkf) obj).f118072iobyxmoadg);
        }

        public int hashCode() {
            return this.f118072iobyxmoadg.hashCode();
        }

        @Override // vu.iobyxmoadg
        public tzroggbefp iobyxmoadg() {
            return this.f118072iobyxmoadg;
        }

        public String toString() {
            return "NotEntered(promoCode=" + this.f118072iobyxmoadg + ")";
        }

        @Override // vu.iobyxmoadg
        public String wkgbmnqykc() {
            return null;
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f118073iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f118074zoijcleaow;

        public zoijcleaow(tzroggbefp promoCode, String statusText) {
            zdlpuopuiu.btonecajqb(promoCode, "promoCode");
            zdlpuopuiu.btonecajqb(statusText, "statusText");
            this.f118073iobyxmoadg = promoCode;
            this.f118074zoijcleaow = statusText;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f118073iobyxmoadg, zoijcleaowVar.f118073iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118074zoijcleaow, zoijcleaowVar.f118074zoijcleaow);
        }

        public int hashCode() {
            return (this.f118073iobyxmoadg.hashCode() * 31) + this.f118074zoijcleaow.hashCode();
        }

        @Override // vu.iobyxmoadg
        public tzroggbefp iobyxmoadg() {
            return this.f118073iobyxmoadg;
        }

        public String toString() {
            return "NotApplied(promoCode=" + this.f118073iobyxmoadg + ", statusText=" + this.f118074zoijcleaow + ")";
        }

        @Override // vu.iobyxmoadg
        public String wkgbmnqykc() {
            return this.f118074zoijcleaow;
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
