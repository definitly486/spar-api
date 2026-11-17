package ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    public static final class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f92482iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String smsMessage) {
            super(null);
            zdlpuopuiu.btonecajqb(smsMessage, "smsMessage");
            this.f92482iobyxmoadg = smsMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f92482iobyxmoadg, ((eablkybsjg) obj).f92482iobyxmoadg);
        }

        public int hashCode() {
            return this.f92482iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f92482iobyxmoadg;
        }

        public String toString() {
            return "OnSmsMessageRetrieved(smsMessage=" + this.f92482iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f92483iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2151ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2151ppxfxbqfkf f92484iobyxmoadg = new C2151ppxfxbqfkf();

        private C2151ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f92485iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String sms) {
            super(null);
            zdlpuopuiu.btonecajqb(sms, "sms");
            this.f92485iobyxmoadg = sms;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f92485iobyxmoadg, ((wkgbmnqykc) obj).f92485iobyxmoadg);
        }

        public int hashCode() {
            return this.f92485iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f92485iobyxmoadg;
        }

        public String toString() {
            return "OnSmsCodeChanged(sms=" + this.f92485iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f92486iobyxmoadg = new zoijcleaow();

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
