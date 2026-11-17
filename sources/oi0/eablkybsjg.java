package oi0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: oi0.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1583eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1583eablkybsjg f72877iobyxmoadg = new C1583eablkybsjg();

        private C1583eablkybsjg() {
            super(null);
        }
    }

    public static final class gxszxtbevo extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f72878iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f72879iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f72880iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f72881iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f72882zoijcleaow;

        public ppxfxbqfkf(String str, boolean z13) {
            super(null);
            this.f72881iobyxmoadg = str;
            this.f72882zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f72881iobyxmoadg, ppxfxbqfkfVar.f72881iobyxmoadg) && this.f72882zoijcleaow == ppxfxbqfkfVar.f72882zoijcleaow;
        }

        public int hashCode() {
            String str = this.f72881iobyxmoadg;
            return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.f72882zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f72881iobyxmoadg;
        }

        public String toString() {
            return "ShowAutoRenewalResultMessage(subscriptionName=" + this.f72881iobyxmoadg + ", isChecked=" + this.f72882zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f72882zoijcleaow;
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f72883iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f72883iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f72883iobyxmoadg, ((wkgbmnqykc) obj).f72883iobyxmoadg);
        }

        public int hashCode() {
            return this.f72883iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f72883iobyxmoadg;
        }

        public String toString() {
            return "ShowCanDeleteError(message=" + this.f72883iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f72884iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f72884iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f72884iobyxmoadg, ((zoijcleaow) obj).f72884iobyxmoadg);
        }

        public int hashCode() {
            return this.f72884iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f72884iobyxmoadg;
        }

        public String toString() {
            return "Error(error=" + this.f72884iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
