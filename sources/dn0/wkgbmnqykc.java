package dn0;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f29241iobyxmoadg;

        public eablkybsjg(tzroggbefp code) {
            zdlpuopuiu.btonecajqb(code, "code");
            this.f29241iobyxmoadg = code;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f29241iobyxmoadg, ((eablkybsjg) obj).f29241iobyxmoadg);
        }

        public int hashCode() {
            return this.f29241iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f29241iobyxmoadg;
        }

        public String toString() {
            return "OnSmsCodeChanged(code=" + this.f29241iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f29242iobyxmoadg;

        public gxszxtbevo(String smsMessage) {
            zdlpuopuiu.btonecajqb(smsMessage, "smsMessage");
            this.f29242iobyxmoadg = smsMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f29242iobyxmoadg, ((gxszxtbevo) obj).f29242iobyxmoadg);
        }

        public int hashCode() {
            return this.f29242iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f29242iobyxmoadg;
        }

        public String toString() {
            return "OnSmsMessageRetrieved(smsMessage=" + this.f29242iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f29243iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 583257741;
        }

        public String toString() {
            return "OnAcceptButtonClick";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f29244iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1863345264;
        }

        public String toString() {
            return "OnCloseClicked";
        }
    }

    /* JADX INFO: renamed from: dn0.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C0591wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0591wkgbmnqykc f29245iobyxmoadg = new C0591wkgbmnqykc();

        private C0591wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0591wkgbmnqykc);
        }

        public int hashCode() {
            return 408386091;
        }

        public String toString() {
            return "OnResendSmsClick";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f29246iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -612913217;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }
}
