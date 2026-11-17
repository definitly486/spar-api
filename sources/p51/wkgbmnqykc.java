package p51;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f75677iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f75678zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String groupCode, String commentCode) {
            super(null);
            zdlpuopuiu.btonecajqb(groupCode, "groupCode");
            zdlpuopuiu.btonecajqb(commentCode, "commentCode");
            this.f75677iobyxmoadg = groupCode;
            this.f75678zoijcleaow = commentCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f75677iobyxmoadg, iobyxmoadgVar.f75677iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f75678zoijcleaow, iobyxmoadgVar.f75678zoijcleaow);
        }

        public int hashCode() {
            return (this.f75677iobyxmoadg.hashCode() * 31) + this.f75678zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f75678zoijcleaow;
        }

        public String toString() {
            return "ChangeCommentCheckedState(groupCode=" + this.f75677iobyxmoadg + ", commentCode=" + this.f75678zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f75677iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f75679iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f75680ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f75681wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f75682zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String groupCode, String code, boolean z13, String comment) {
            super(null);
            zdlpuopuiu.btonecajqb(groupCode, "groupCode");
            zdlpuopuiu.btonecajqb(code, "code");
            zdlpuopuiu.btonecajqb(comment, "comment");
            this.f75679iobyxmoadg = groupCode;
            this.f75682zoijcleaow = code;
            this.f75680ppxfxbqfkf = z13;
            this.f75681wkgbmnqykc = comment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f75679iobyxmoadg, ppxfxbqfkfVar.f75679iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f75682zoijcleaow, ppxfxbqfkfVar.f75682zoijcleaow) && this.f75680ppxfxbqfkf == ppxfxbqfkfVar.f75680ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f75681wkgbmnqykc, ppxfxbqfkfVar.f75681wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f75679iobyxmoadg.hashCode() * 31) + this.f75682zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f75680ppxfxbqfkf)) * 31) + this.f75681wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f75682zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f75679iobyxmoadg;
        }

        public String toString() {
            return "OnCommentChanged(groupCode=" + this.f75679iobyxmoadg + ", code=" + this.f75682zoijcleaow + ", isChecked=" + this.f75680ppxfxbqfkf + ", comment=" + this.f75681wkgbmnqykc + ")";
        }

        public final String zoijcleaow() {
            return this.f75681wkgbmnqykc;
        }
    }

    /* JADX INFO: renamed from: p51.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1669wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1669wkgbmnqykc f75683iobyxmoadg = new C1669wkgbmnqykc();

        private C1669wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1669wkgbmnqykc);
        }

        public int hashCode() {
            return -293163259;
        }

        public String toString() {
            return "OnDoneClick";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f75684iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -232799905;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
