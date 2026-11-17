package ru.myspar.auth.impl.domain.deleteaccount.store;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f84470iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f84471iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84472iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String smsCode) {
            super(null);
            zdlpuopuiu.btonecajqb(smsCode, "smsCode");
            this.f84472iobyxmoadg = smsCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f84472iobyxmoadg, ((ppxfxbqfkf) obj).f84472iobyxmoadg);
        }

        public int hashCode() {
            return this.f84472iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84472iobyxmoadg;
        }

        public String toString() {
            return "SetSms(smsCode=" + this.f84472iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.auth.impl.domain.deleteaccount.store.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1909wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1909wkgbmnqykc f84473iobyxmoadg = new C1909wkgbmnqykc();

        private C1909wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f84474iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f84474iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f84474iobyxmoadg, ((zoijcleaow) obj).f84474iobyxmoadg);
        }

        public int hashCode() {
            return this.f84474iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f84474iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f84474iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
