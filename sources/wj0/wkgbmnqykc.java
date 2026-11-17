package wj0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f119991iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1604616282;
        }

        public String toString() {
            return "OnClose";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f119992iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1456561915;
        }

        public String toString() {
            return "OnPaymentSuccess";
        }
    }

    /* JADX INFO: renamed from: wj0.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2999wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f119993iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2999wkgbmnqykc(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f119993iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2999wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f119993iobyxmoadg, ((C2999wkgbmnqykc) obj).f119993iobyxmoadg);
        }

        public int hashCode() {
            return this.f119993iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f119993iobyxmoadg;
        }

        public String toString() {
            return "ShowMessage(message=" + this.f119993iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f119994iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1792906296;
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
