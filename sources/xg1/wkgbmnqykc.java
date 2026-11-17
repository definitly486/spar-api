package xg1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f122362iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -979038569;
        }

        public String toString() {
            return "OnClose";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f122363iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1559198370;
        }

        public String toString() {
            return "OnPaymentSuccess";
        }
    }

    /* JADX INFO: renamed from: xg1.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C3082wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f122364iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3082wkgbmnqykc(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f122364iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3082wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f122364iobyxmoadg, ((C3082wkgbmnqykc) obj).f122364iobyxmoadg);
        }

        public int hashCode() {
            return this.f122364iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f122364iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + this.f122364iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f122365iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1824579589;
        }

        public String toString() {
            return "OnCloseConfirmExitPopup";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
