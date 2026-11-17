package ru.myspar.auth.impl.presentation.deleteaccount;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {

    public static final class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84594iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String smsMessage) {
            super(null);
            zdlpuopuiu.btonecajqb(smsMessage, "smsMessage");
            this.f84594iobyxmoadg = smsMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f84594iobyxmoadg, ((eablkybsjg) obj).f84594iobyxmoadg);
        }

        public int hashCode() {
            return this.f84594iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84594iobyxmoadg;
        }

        public String toString() {
            return "OnSmsMessageRetrieved(smsMessage=" + this.f84594iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f84595iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.auth.impl.presentation.deleteaccount.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C1913ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1913ppxfxbqfkf f84596iobyxmoadg = new C1913ppxfxbqfkf();

        private C1913ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84597iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String sms) {
            super(null);
            zdlpuopuiu.btonecajqb(sms, "sms");
            this.f84597iobyxmoadg = sms;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f84597iobyxmoadg, ((wkgbmnqykc) obj).f84597iobyxmoadg);
        }

        public int hashCode() {
            return this.f84597iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84597iobyxmoadg;
        }

        public String toString() {
            return "OnSmsCodeChanged(sms=" + this.f84597iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f84598iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
