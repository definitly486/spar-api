package ru.myspar.proloyalty.auth.impl.presentation.deleteaccount;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f92592iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f92592iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f92592iobyxmoadg, ((iobyxmoadg) obj).f92592iobyxmoadg);
        }

        public int hashCode() {
            return this.f92592iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f92592iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f92592iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f92593iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f92594iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String smsCode) {
            super(null);
            zdlpuopuiu.btonecajqb(smsCode, "smsCode");
            this.f92594iobyxmoadg = smsCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f92594iobyxmoadg, ((zoijcleaow) obj).f92594iobyxmoadg);
        }

        public int hashCode() {
            return this.f92594iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f92594iobyxmoadg;
        }

        public String toString() {
            return "SmsCode(smsCode=" + this.f92594iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
