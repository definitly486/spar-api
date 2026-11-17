package zo;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f130599iobyxmoadg;

        public eablkybsjg(String smsMessage) {
            zdlpuopuiu.btonecajqb(smsMessage, "smsMessage");
            this.f130599iobyxmoadg = smsMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f130599iobyxmoadg, ((eablkybsjg) obj).f130599iobyxmoadg);
        }

        public int hashCode() {
            return this.f130599iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f130599iobyxmoadg;
        }

        public String toString() {
            return "OnSmsMessageRetrieved(smsMessage=" + this.f130599iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f130600iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1570204132;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f130601iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 337582766;
        }

        public String toString() {
            return "OnResendSmsClick";
        }
    }

    /* JADX INFO: renamed from: zo.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C3335wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f130602iobyxmoadg;

        public C3335wkgbmnqykc(tzroggbefp code) {
            zdlpuopuiu.btonecajqb(code, "code");
            this.f130602iobyxmoadg = code;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3335wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f130602iobyxmoadg, ((C3335wkgbmnqykc) obj).f130602iobyxmoadg);
        }

        public int hashCode() {
            return this.f130602iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f130602iobyxmoadg;
        }

        public String toString() {
            return "OnSmsCodeChanged(code=" + this.f130602iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f130603iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 947873884;
        }

        public String toString() {
            return "OnContinueClicked";
        }
    }
}
