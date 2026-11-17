package x20;

import java.util.Arrays;
import kotlin.jvm.internal.tzroggbefp;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends ft.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final l40.zoijcleaow f121034iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f121035iobyxmoadg;

        public iobyxmoadg(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f121035iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f121035iobyxmoadg, ((iobyxmoadg) obj).f121035iobyxmoadg);
        }

        public int hashCode() {
            return this.f121035iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f121035iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f121035iobyxmoadg + ")";
        }
    }

    public lqeggnwhkg(l40.zoijcleaow apiEndPointsProvider) {
        zdlpuopuiu.btonecajqb(apiEndPointsProvider, "apiEndPointsProvider");
        this.f121034iobyxmoadg = apiEndPointsProvider;
    }

    private final String wkgbmnqykc(String str) {
        tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
        String str2 = String.format(xx.iobyxmoadg.f123319iobyxmoadg.jhduphickx(), Arrays.copyOf(new Object[]{this.f121034iobyxmoadg.iobyxmoadg(), str}, 2));
        zdlpuopuiu.dxjokdxxww(str2, "format(...)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.zoijcleaow
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public String iobyxmoadg(iobyxmoadg parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        return wkgbmnqykc(parameters.iobyxmoadg());
    }
}
