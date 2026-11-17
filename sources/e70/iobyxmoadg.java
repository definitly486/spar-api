package e70;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: e70.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0639iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f30805iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f30806ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f30807wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f30808zoijcleaow;

        public C0639iobyxmoadg(String code, String title, boolean z13, String groupCode) {
            zdlpuopuiu.btonecajqb(code, "code");
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(groupCode, "groupCode");
            this.f30805iobyxmoadg = code;
            this.f30808zoijcleaow = title;
            this.f30806ppxfxbqfkf = z13;
            this.f30807wkgbmnqykc = groupCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0639iobyxmoadg)) {
                return false;
            }
            C0639iobyxmoadg c0639iobyxmoadg = (C0639iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f30805iobyxmoadg, c0639iobyxmoadg.f30805iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f30808zoijcleaow, c0639iobyxmoadg.f30808zoijcleaow) && this.f30806ppxfxbqfkf == c0639iobyxmoadg.f30806ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f30807wkgbmnqykc, c0639iobyxmoadg.f30807wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f30805iobyxmoadg.hashCode() * 31) + this.f30808zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f30806ppxfxbqfkf)) * 31) + this.f30807wkgbmnqykc.hashCode();
        }

        public String iobyxmoadg() {
            return this.f30805iobyxmoadg;
        }

        public String ppxfxbqfkf() {
            return this.f30808zoijcleaow;
        }

        public String toString() {
            return "CheckBox(code=" + this.f30805iobyxmoadg + ", title=" + this.f30808zoijcleaow + ", isChecked=" + this.f30806ppxfxbqfkf + ", groupCode=" + this.f30807wkgbmnqykc + ")";
        }

        public boolean wkgbmnqykc() {
            return this.f30806ppxfxbqfkf;
        }

        public String zoijcleaow() {
            return this.f30807wkgbmnqykc;
        }
    }

    public static final class ppxfxbqfkf implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f30809iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f30810ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f30811wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f30812zoijcleaow;

        public ppxfxbqfkf(String code, String title, boolean z13, String groupCode) {
            zdlpuopuiu.btonecajqb(code, "code");
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(groupCode, "groupCode");
            this.f30809iobyxmoadg = code;
            this.f30812zoijcleaow = title;
            this.f30810ppxfxbqfkf = z13;
            this.f30811wkgbmnqykc = groupCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f30809iobyxmoadg, ppxfxbqfkfVar.f30809iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f30812zoijcleaow, ppxfxbqfkfVar.f30812zoijcleaow) && this.f30810ppxfxbqfkf == ppxfxbqfkfVar.f30810ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f30811wkgbmnqykc, ppxfxbqfkfVar.f30811wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f30809iobyxmoadg.hashCode() * 31) + this.f30812zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f30810ppxfxbqfkf)) * 31) + this.f30811wkgbmnqykc.hashCode();
        }

        public String iobyxmoadg() {
            return this.f30809iobyxmoadg;
        }

        public String ppxfxbqfkf() {
            return this.f30812zoijcleaow;
        }

        public String toString() {
            return "Radio(code=" + this.f30809iobyxmoadg + ", title=" + this.f30812zoijcleaow + ", isChecked=" + this.f30810ppxfxbqfkf + ", groupCode=" + this.f30811wkgbmnqykc + ")";
        }

        public boolean wkgbmnqykc() {
            return this.f30810ppxfxbqfkf;
        }

        public String zoijcleaow() {
            return this.f30811wkgbmnqykc;
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f30813eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final String f30814gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f30815iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final int f30816lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f30817ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f30818wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f30819zoijcleaow;

        public zoijcleaow(String code, String title, boolean z13, String groupCode, String inputText, String placeHolderText, int i13) {
            zdlpuopuiu.btonecajqb(code, "code");
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(groupCode, "groupCode");
            zdlpuopuiu.btonecajqb(inputText, "inputText");
            zdlpuopuiu.btonecajqb(placeHolderText, "placeHolderText");
            this.f30815iobyxmoadg = code;
            this.f30819zoijcleaow = title;
            this.f30817ppxfxbqfkf = z13;
            this.f30818wkgbmnqykc = groupCode;
            this.f30813eablkybsjg = inputText;
            this.f30814gxszxtbevo = placeHolderText;
            this.f30816lqeggnwhkg = i13;
        }

        public String eablkybsjg() {
            return this.f30814gxszxtbevo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f30815iobyxmoadg, zoijcleaowVar.f30815iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f30819zoijcleaow, zoijcleaowVar.f30819zoijcleaow) && this.f30817ppxfxbqfkf == zoijcleaowVar.f30817ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f30818wkgbmnqykc, zoijcleaowVar.f30818wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f30813eablkybsjg, zoijcleaowVar.f30813eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f30814gxszxtbevo, zoijcleaowVar.f30814gxszxtbevo) && this.f30816lqeggnwhkg == zoijcleaowVar.f30816lqeggnwhkg;
        }

        public boolean gxszxtbevo() {
            return this.f30817ppxfxbqfkf;
        }

        public int hashCode() {
            return (((((((((((this.f30815iobyxmoadg.hashCode() * 31) + this.f30819zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f30817ppxfxbqfkf)) * 31) + this.f30818wkgbmnqykc.hashCode()) * 31) + this.f30813eablkybsjg.hashCode()) * 31) + this.f30814gxszxtbevo.hashCode()) * 31) + Integer.hashCode(this.f30816lqeggnwhkg);
        }

        public String iobyxmoadg() {
            return this.f30815iobyxmoadg;
        }

        public final int ppxfxbqfkf() {
            return this.f30816lqeggnwhkg;
        }

        public String toString() {
            return "CommentInput(code=" + this.f30815iobyxmoadg + ", title=" + this.f30819zoijcleaow + ", isChecked=" + this.f30817ppxfxbqfkf + ", groupCode=" + this.f30818wkgbmnqykc + ", inputText=" + this.f30813eablkybsjg + ", placeHolderText=" + this.f30814gxszxtbevo + ", inputLimit=" + this.f30816lqeggnwhkg + ")";
        }

        public String wkgbmnqykc() {
            return this.f30813eablkybsjg;
        }

        public String zoijcleaow() {
            return this.f30818wkgbmnqykc;
        }
    }
}
