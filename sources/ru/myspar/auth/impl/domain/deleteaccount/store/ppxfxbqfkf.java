package ru.myspar.auth.impl.domain.deleteaccount.store;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {

    public static final class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84465iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String smsMessage) {
            super(null);
            zdlpuopuiu.btonecajqb(smsMessage, "smsMessage");
            this.f84465iobyxmoadg = smsMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f84465iobyxmoadg, ((eablkybsjg) obj).f84465iobyxmoadg);
        }

        public int hashCode() {
            return this.f84465iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84465iobyxmoadg;
        }

        public String toString() {
            return "OnSmsMessageRetrieved(smsMessage=" + this.f84465iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f84466iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.auth.impl.domain.deleteaccount.store.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C1908ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1908ppxfxbqfkf f84467iobyxmoadg = new C1908ppxfxbqfkf();

        private C1908ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84468iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String sms) {
            super(null);
            zdlpuopuiu.btonecajqb(sms, "sms");
            this.f84468iobyxmoadg = sms;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f84468iobyxmoadg, ((wkgbmnqykc) obj).f84468iobyxmoadg);
        }

        public int hashCode() {
            return this.f84468iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84468iobyxmoadg;
        }

        public String toString() {
            return "OnSmsCodeChanged(sms=" + this.f84468iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f84469iobyxmoadg = new zoijcleaow();

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
