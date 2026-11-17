package ru.myspar.auth.impl.presentation.deleteaccount;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f84599iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f84599iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f84599iobyxmoadg, ((iobyxmoadg) obj).f84599iobyxmoadg);
        }

        public int hashCode() {
            return this.f84599iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f84599iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f84599iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f84600iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84601iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String smsCode) {
            super(null);
            zdlpuopuiu.btonecajqb(smsCode, "smsCode");
            this.f84601iobyxmoadg = smsCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f84601iobyxmoadg, ((zoijcleaow) obj).f84601iobyxmoadg);
        }

        public int hashCode() {
            return this.f84601iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84601iobyxmoadg;
        }

        public String toString() {
            return "SmsCode(smsCode=" + this.f84601iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
