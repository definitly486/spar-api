package zo;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes4.dex */
public interface gxszxtbevo {

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f130540iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 75654751;
        }

        public String toString() {
            return "StopTimer";
        }
    }

    /* JADX INFO: renamed from: zo.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C3329gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f130541iobyxmoadg;

        public C3329gxszxtbevo(String token) {
            zdlpuopuiu.btonecajqb(token, "token");
            this.f130541iobyxmoadg = token;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3329gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f130541iobyxmoadg, ((C3329gxszxtbevo) obj).f130541iobyxmoadg);
        }

        public int hashCode() {
            return this.f130541iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f130541iobyxmoadg;
        }

        public String toString() {
            return "TokenReceived(token=" + this.f130541iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f130542iobyxmoadg;

        public iobyxmoadg(String timerValue) {
            zdlpuopuiu.btonecajqb(timerValue, "timerValue");
            this.f130542iobyxmoadg = timerValue;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f130542iobyxmoadg, ((iobyxmoadg) obj).f130542iobyxmoadg);
        }

        public int hashCode() {
            return this.f130542iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f130542iobyxmoadg;
        }

        public String toString() {
            return "ChangeResendSmsTimer(timerValue=" + this.f130542iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f130543iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            this.f130543iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f130543iobyxmoadg == ((ppxfxbqfkf) obj).f130543iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f130543iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f130543iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f130543iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f130544iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f130545ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f130546zoijcleaow;

        public wkgbmnqykc(tzroggbefp code, boolean z13, boolean z14) {
            zdlpuopuiu.btonecajqb(code, "code");
            this.f130544iobyxmoadg = code;
            this.f130546zoijcleaow = z13;
            this.f130545ppxfxbqfkf = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f130544iobyxmoadg, wkgbmnqykcVar.f130544iobyxmoadg) && this.f130546zoijcleaow == wkgbmnqykcVar.f130546zoijcleaow && this.f130545ppxfxbqfkf == wkgbmnqykcVar.f130545ppxfxbqfkf;
        }

        public int hashCode() {
            return (((this.f130544iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f130546zoijcleaow)) * 31) + Boolean.hashCode(this.f130545ppxfxbqfkf);
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f130544iobyxmoadg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f130545ppxfxbqfkf;
        }

        public String toString() {
            return "SmsCodeChanged(code=" + this.f130544iobyxmoadg + ", isContinueButtonEnabled=" + this.f130546zoijcleaow + ", isError=" + this.f130545ppxfxbqfkf + ")";
        }

        public final boolean zoijcleaow() {
            return this.f130546zoijcleaow;
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f130547iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f130548zoijcleaow;

        public zoijcleaow(boolean z13, String errorText) {
            zdlpuopuiu.btonecajqb(errorText, "errorText");
            this.f130547iobyxmoadg = z13;
            this.f130548zoijcleaow = errorText;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f130547iobyxmoadg == zoijcleaowVar.f130547iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f130548zoijcleaow, zoijcleaowVar.f130548zoijcleaow);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f130547iobyxmoadg) * 31) + this.f130548zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f130548zoijcleaow;
        }

        public String toString() {
            return "ErrorTextChange(isError=" + this.f130547iobyxmoadg + ", errorText=" + this.f130548zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f130547iobyxmoadg;
        }
    }
}
