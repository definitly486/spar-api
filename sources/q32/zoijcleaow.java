package q32;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ft.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final v10.zoijcleaow f77802iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f77803iobyxmoadg;

        public iobyxmoadg(String startMessage) {
            zdlpuopuiu.btonecajqb(startMessage, "startMessage");
            this.f77803iobyxmoadg = startMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f77803iobyxmoadg, ((iobyxmoadg) obj).f77803iobyxmoadg);
        }

        public int hashCode() {
            return this.f77803iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f77803iobyxmoadg;
        }

        public String toString() {
            return "Params(startMessage=" + this.f77803iobyxmoadg + ")";
        }
    }

    public zoijcleaow(v10.zoijcleaow sharedPreferencesRepository) {
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        this.f77802iobyxmoadg = sharedPreferencesRepository;
    }

    @Override // ft.zoijcleaow
    public /* bridge */ /* synthetic */ Object iobyxmoadg(Object obj) {
        ppxfxbqfkf((iobyxmoadg) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    protected void ppxfxbqfkf(iobyxmoadg parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        this.f77802iobyxmoadg.wypolnanlu(parameters.iobyxmoadg());
    }
}
