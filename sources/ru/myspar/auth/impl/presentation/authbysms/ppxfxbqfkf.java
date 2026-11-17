package ru.myspar.auth.impl.presentation.authbysms;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes4.dex */
public interface ppxfxbqfkf {

    public static final class eablkybsjg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84530iobyxmoadg;

        public eablkybsjg(String smsMessage) {
            zdlpuopuiu.btonecajqb(smsMessage, "smsMessage");
            this.f84530iobyxmoadg = smsMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f84530iobyxmoadg, ((eablkybsjg) obj).f84530iobyxmoadg);
        }

        public int hashCode() {
            return this.f84530iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84530iobyxmoadg;
        }

        public String toString() {
            return "OnSmsMessageRetrieved(smsMessage=" + this.f84530iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f84531iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 481517127;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.auth.impl.presentation.authbysms.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C1911ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1911ppxfxbqfkf f84532iobyxmoadg = new C1911ppxfxbqfkf();

        private C1911ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1911ppxfxbqfkf);
        }

        public int hashCode() {
            return 1486020259;
        }

        public String toString() {
            return "OnResendSmsClick";
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f84533iobyxmoadg;

        public wkgbmnqykc(tzroggbefp code) {
            zdlpuopuiu.btonecajqb(code, "code");
            this.f84533iobyxmoadg = code;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f84533iobyxmoadg, ((wkgbmnqykc) obj).f84533iobyxmoadg);
        }

        public int hashCode() {
            return this.f84533iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f84533iobyxmoadg;
        }

        public String toString() {
            return "OnSmsCodeChanged(code=" + this.f84533iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f84534iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1642500200;
        }

        public String toString() {
            return "OnContinueClick";
        }
    }
}
