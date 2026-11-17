package ru.myspar.proloyalty.auth.impl.presentation.deleteaccount;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    public static final class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f92587iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String smsMessage) {
            super(null);
            zdlpuopuiu.btonecajqb(smsMessage, "smsMessage");
            this.f92587iobyxmoadg = smsMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f92587iobyxmoadg, ((eablkybsjg) obj).f92587iobyxmoadg);
        }

        public int hashCode() {
            return this.f92587iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f92587iobyxmoadg;
        }

        public String toString() {
            return "OnSmsMessageRetrieved(smsMessage=" + this.f92587iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f92588iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.presentation.deleteaccount.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2156ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2156ppxfxbqfkf f92589iobyxmoadg = new C2156ppxfxbqfkf();

        private C2156ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f92590iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String sms) {
            super(null);
            zdlpuopuiu.btonecajqb(sms, "sms");
            this.f92590iobyxmoadg = sms;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f92590iobyxmoadg, ((wkgbmnqykc) obj).f92590iobyxmoadg);
        }

        public int hashCode() {
            return this.f92590iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f92590iobyxmoadg;
        }

        public String toString() {
            return "OnSmsCodeChanged(sms=" + this.f92590iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f92591iobyxmoadg = new zoijcleaow();

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
