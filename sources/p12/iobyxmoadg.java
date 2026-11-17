package p12;

import kotlin.jvm.internal.zdlpuopuiu;
import w30.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
public interface iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: p12.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1655iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final String f75401cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final String f75402iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final String f75403jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f75404yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f75405zdlpuopuiu;

        public C1655iobyxmoadg(String appName, String packageName, String logoUrl, String bankLaunchSchema) {
            zdlpuopuiu.btonecajqb(appName, "appName");
            zdlpuopuiu.btonecajqb(packageName, "packageName");
            zdlpuopuiu.btonecajqb(logoUrl, "logoUrl");
            zdlpuopuiu.btonecajqb(bankLaunchSchema, "bankLaunchSchema");
            this.f75405zdlpuopuiu = appName;
            this.f75404yggfygwlhe = packageName;
            this.f75403jyumaefscl = logoUrl;
            this.f75402iwizpuwonk = bankLaunchSchema;
            this.f75401cqumvgiudr = packageName;
        }

        public final String eablkybsjg() {
            return this.f75403jyumaefscl;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1655iobyxmoadg)) {
                return false;
            }
            C1655iobyxmoadg c1655iobyxmoadg = (C1655iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f75405zdlpuopuiu, c1655iobyxmoadg.f75405zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f75404yggfygwlhe, c1655iobyxmoadg.f75404yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f75403jyumaefscl, c1655iobyxmoadg.f75403jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f75402iwizpuwonk, c1655iobyxmoadg.f75402iwizpuwonk);
        }

        @Override // w30.ppxfxbqfkf
        public String getItemId() {
            return this.f75401cqumvgiudr;
        }

        public int hashCode() {
            return (((((this.f75405zdlpuopuiu.hashCode() * 31) + this.f75404yggfygwlhe.hashCode()) * 31) + this.f75403jyumaefscl.hashCode()) * 31) + this.f75402iwizpuwonk.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f75405zdlpuopuiu;
        }

        public final String lqeggnwhkg() {
            return this.f75404yggfygwlhe;
        }

        public String toString() {
            return "BankUiModel(appName=" + this.f75405zdlpuopuiu + ", packageName=" + this.f75404yggfygwlhe + ", logoUrl=" + this.f75403jyumaefscl + ", bankLaunchSchema=" + this.f75402iwizpuwonk + ")";
        }

        public final String wkgbmnqykc() {
            return this.f75402iwizpuwonk;
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private static final String f75406yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f75407zdlpuopuiu;

        static {
            zoijcleaow zoijcleaowVar = new zoijcleaow();
            f75407zdlpuopuiu = zoijcleaowVar;
            String simpleName = zoijcleaowVar.getClass().getSimpleName();
            zdlpuopuiu.dxjokdxxww(simpleName, "getSimpleName(...)");
            f75406yggfygwlhe = simpleName;
        }

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        @Override // w30.ppxfxbqfkf
        public String getItemId() {
            return f75406yggfygwlhe;
        }

        public int hashCode() {
            return 864812626;
        }

        public String toString() {
            return "EmptyMessage";
        }
    }
}
