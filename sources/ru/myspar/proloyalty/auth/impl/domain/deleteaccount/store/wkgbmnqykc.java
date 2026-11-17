package ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f92487iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f92488iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String smsCode) {
            super(null);
            zdlpuopuiu.btonecajqb(smsCode, "smsCode");
            this.f92488iobyxmoadg = smsCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f92488iobyxmoadg, ((ppxfxbqfkf) obj).f92488iobyxmoadg);
        }

        public int hashCode() {
            return this.f92488iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f92488iobyxmoadg;
        }

        public String toString() {
            return "SetSms(smsCode=" + this.f92488iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2152wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2152wkgbmnqykc f92489iobyxmoadg = new C2152wkgbmnqykc();

        private C2152wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f92490iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f92490iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f92490iobyxmoadg, ((zoijcleaow) obj).f92490iobyxmoadg);
        }

        public int hashCode() {
            return this.f92490iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f92490iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f92490iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
