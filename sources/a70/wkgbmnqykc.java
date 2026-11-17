package a70;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f1078iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f1079zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String groupCode, String commentCode) {
            super(null);
            zdlpuopuiu.btonecajqb(groupCode, "groupCode");
            zdlpuopuiu.btonecajqb(commentCode, "commentCode");
            this.f1078iobyxmoadg = groupCode;
            this.f1079zoijcleaow = commentCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f1078iobyxmoadg, iobyxmoadgVar.f1078iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f1079zoijcleaow, iobyxmoadgVar.f1079zoijcleaow);
        }

        public int hashCode() {
            return (this.f1078iobyxmoadg.hashCode() * 31) + this.f1079zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f1079zoijcleaow;
        }

        public String toString() {
            return "ChangeCommentCheckedState(groupCode=" + this.f1078iobyxmoadg + ", commentCode=" + this.f1079zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f1078iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f1080iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f1081ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f1082wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f1083zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String groupCode, String code, boolean z13, String comment) {
            super(null);
            zdlpuopuiu.btonecajqb(groupCode, "groupCode");
            zdlpuopuiu.btonecajqb(code, "code");
            zdlpuopuiu.btonecajqb(comment, "comment");
            this.f1080iobyxmoadg = groupCode;
            this.f1083zoijcleaow = code;
            this.f1081ppxfxbqfkf = z13;
            this.f1082wkgbmnqykc = comment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f1080iobyxmoadg, ppxfxbqfkfVar.f1080iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f1083zoijcleaow, ppxfxbqfkfVar.f1083zoijcleaow) && this.f1081ppxfxbqfkf == ppxfxbqfkfVar.f1081ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f1082wkgbmnqykc, ppxfxbqfkfVar.f1082wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f1080iobyxmoadg.hashCode() * 31) + this.f1083zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f1081ppxfxbqfkf)) * 31) + this.f1082wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f1083zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f1080iobyxmoadg;
        }

        public String toString() {
            return "OnCommentChanged(groupCode=" + this.f1080iobyxmoadg + ", code=" + this.f1083zoijcleaow + ", isChecked=" + this.f1081ppxfxbqfkf + ", comment=" + this.f1082wkgbmnqykc + ")";
        }

        public final String zoijcleaow() {
            return this.f1082wkgbmnqykc;
        }
    }

    /* JADX INFO: renamed from: a70.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C0014wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0014wkgbmnqykc f1084iobyxmoadg = new C0014wkgbmnqykc();

        private C0014wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0014wkgbmnqykc);
        }

        public int hashCode() {
            return -766075998;
        }

        public String toString() {
            return "OnDoneClick";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f1085iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 564591292;
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
