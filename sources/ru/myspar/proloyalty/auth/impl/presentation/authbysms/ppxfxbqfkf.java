package ru.myspar.proloyalty.auth.impl.presentation.authbysms;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {

    public static final class eablkybsjg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f92525iobyxmoadg;

        public eablkybsjg(tzroggbefp code) {
            zdlpuopuiu.btonecajqb(code, "code");
            this.f92525iobyxmoadg = code;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f92525iobyxmoadg, ((eablkybsjg) obj).f92525iobyxmoadg);
        }

        public int hashCode() {
            return this.f92525iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f92525iobyxmoadg;
        }

        public String toString() {
            return "OnSmsCodeChanged(code=" + this.f92525iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f92526iobyxmoadg;

        public gxszxtbevo(String smsMessage) {
            zdlpuopuiu.btonecajqb(smsMessage, "smsMessage");
            this.f92526iobyxmoadg = smsMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f92526iobyxmoadg, ((gxszxtbevo) obj).f92526iobyxmoadg);
        }

        public int hashCode() {
            return this.f92526iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f92526iobyxmoadg;
        }

        public String toString() {
            return "OnSmsMessageRetrieved(smsMessage=" + this.f92526iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f92527iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1520080694;
        }

        public String toString() {
            return "OnAcceptClick";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.presentation.authbysms.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2153ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2153ppxfxbqfkf f92528iobyxmoadg = new C2153ppxfxbqfkf();

        private C2153ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2153ppxfxbqfkf);
        }

        public int hashCode() {
            return -1863308059;
        }

        public String toString() {
            return "OnCloseClicked";
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f92529iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 1097267552;
        }

        public String toString() {
            return "OnResendSmsClick";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f92530iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1760724138;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }
}
