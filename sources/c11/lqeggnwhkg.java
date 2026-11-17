package c11;

import java.util.Arrays;
import kotlin.jvm.internal.tzroggbefp;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends zr0.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final s21.iobyxmoadg f18510iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18511iobyxmoadg;

        public iobyxmoadg(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f18511iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f18511iobyxmoadg, ((iobyxmoadg) obj).f18511iobyxmoadg);
        }

        public int hashCode() {
            return this.f18511iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18511iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f18511iobyxmoadg + ")";
        }
    }

    public lqeggnwhkg(s21.iobyxmoadg apiEndPointsProvider) {
        zdlpuopuiu.btonecajqb(apiEndPointsProvider, "apiEndPointsProvider");
        this.f18510iobyxmoadg = apiEndPointsProvider;
    }

    private final String wkgbmnqykc(String str) {
        tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
        String str2 = String.format(this.f18510iobyxmoadg.wkgbmnqykc(), Arrays.copyOf(new Object[]{str}, 1));
        zdlpuopuiu.dxjokdxxww(str2, "format(...)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.zoijcleaow
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public String iobyxmoadg(iobyxmoadg parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        return wkgbmnqykc(parameters.iobyxmoadg());
    }
}
