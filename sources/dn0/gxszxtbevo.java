package dn0;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f29188iobyxmoadg;

        public eablkybsjg(boolean z13) {
            this.f29188iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f29188iobyxmoadg == ((eablkybsjg) obj).f29188iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f29188iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f29188iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f29188iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: dn0.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C0585gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f29189iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f29190zoijcleaow;

        public C0585gxszxtbevo(tzroggbefp code, boolean z13) {
            zdlpuopuiu.btonecajqb(code, "code");
            this.f29189iobyxmoadg = code;
            this.f29190zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0585gxszxtbevo)) {
                return false;
            }
            C0585gxszxtbevo c0585gxszxtbevo = (C0585gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f29189iobyxmoadg, c0585gxszxtbevo.f29189iobyxmoadg) && this.f29190zoijcleaow == c0585gxszxtbevo.f29190zoijcleaow;
        }

        public int hashCode() {
            return (this.f29189iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f29190zoijcleaow);
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f29189iobyxmoadg;
        }

        public String toString() {
            return "SmsCodeChanged(code=" + this.f29189iobyxmoadg + ", isError=" + this.f29190zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f29190zoijcleaow;
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f29191iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f29191iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f29191iobyxmoadg == ((iobyxmoadg) obj).f29191iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f29191iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f29191iobyxmoadg;
        }

        public String toString() {
            return "AcceptButtonEnabled(isEnabled=" + this.f29191iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f29192iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return -2045916798;
        }

        public String toString() {
            return "StopTimer";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f29193iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            this.f29193iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f29193iobyxmoadg == ((ppxfxbqfkf) obj).f29193iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f29193iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f29193iobyxmoadg;
        }

        public String toString() {
            return "ErrorTextChange(isError=" + this.f29193iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f29194iobyxmoadg;

        public wkgbmnqykc(String hash) {
            zdlpuopuiu.btonecajqb(hash, "hash");
            this.f29194iobyxmoadg = hash;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f29194iobyxmoadg, ((wkgbmnqykc) obj).f29194iobyxmoadg);
        }

        public int hashCode() {
            return this.f29194iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f29194iobyxmoadg;
        }

        public String toString() {
            return "HashRetrieved(hash=" + this.f29194iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f29195iobyxmoadg;

        public zoijcleaow(String timerValue) {
            zdlpuopuiu.btonecajqb(timerValue, "timerValue");
            this.f29195iobyxmoadg = timerValue;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f29195iobyxmoadg, ((zoijcleaow) obj).f29195iobyxmoadg);
        }

        public int hashCode() {
            return this.f29195iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f29195iobyxmoadg;
        }

        public String toString() {
            return "ChangeResendSmsTimer(timerValue=" + this.f29195iobyxmoadg + ")";
        }
    }
}
