package gn1;

import b21.ppxfxbqfkf;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: gn1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0863iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final String f37976cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final String f37977iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final String f37978jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f37979yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f37980zdlpuopuiu;

        public C0863iobyxmoadg(String appName, String packageName, String logoUrl, String bankLaunchSchema) {
            zdlpuopuiu.btonecajqb(appName, "appName");
            zdlpuopuiu.btonecajqb(packageName, "packageName");
            zdlpuopuiu.btonecajqb(logoUrl, "logoUrl");
            zdlpuopuiu.btonecajqb(bankLaunchSchema, "bankLaunchSchema");
            this.f37980zdlpuopuiu = appName;
            this.f37979yggfygwlhe = packageName;
            this.f37978jyumaefscl = logoUrl;
            this.f37977iwizpuwonk = bankLaunchSchema;
            this.f37976cqumvgiudr = packageName;
        }

        public final String eablkybsjg() {
            return this.f37978jyumaefscl;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0863iobyxmoadg)) {
                return false;
            }
            C0863iobyxmoadg c0863iobyxmoadg = (C0863iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f37980zdlpuopuiu, c0863iobyxmoadg.f37980zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f37979yggfygwlhe, c0863iobyxmoadg.f37979yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f37978jyumaefscl, c0863iobyxmoadg.f37978jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f37977iwizpuwonk, c0863iobyxmoadg.f37977iwizpuwonk);
        }

        @Override // b21.ppxfxbqfkf
        public String getItemId() {
            return this.f37976cqumvgiudr;
        }

        public int hashCode() {
            return (((((this.f37980zdlpuopuiu.hashCode() * 31) + this.f37979yggfygwlhe.hashCode()) * 31) + this.f37978jyumaefscl.hashCode()) * 31) + this.f37977iwizpuwonk.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f37980zdlpuopuiu;
        }

        public final String lqeggnwhkg() {
            return this.f37979yggfygwlhe;
        }

        public String toString() {
            return "BankUiModel(appName=" + this.f37980zdlpuopuiu + ", packageName=" + this.f37979yggfygwlhe + ", logoUrl=" + this.f37978jyumaefscl + ", bankLaunchSchema=" + this.f37977iwizpuwonk + ")";
        }

        public final String wkgbmnqykc() {
            return this.f37977iwizpuwonk;
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private static final String f37981yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f37982zdlpuopuiu;

        static {
            zoijcleaow zoijcleaowVar = new zoijcleaow();
            f37982zdlpuopuiu = zoijcleaowVar;
            String simpleName = zoijcleaowVar.getClass().getSimpleName();
            zdlpuopuiu.dxjokdxxww(simpleName, "getSimpleName(...)");
            f37981yggfygwlhe = simpleName;
        }

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        @Override // b21.ppxfxbqfkf
        public String getItemId() {
            return f37981yggfygwlhe;
        }

        public int hashCode() {
            return -479395953;
        }

        public String toString() {
            return "EmptyMessage";
        }
    }
}
