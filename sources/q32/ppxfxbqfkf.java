package q32;

import gg.wwaezpbzkn;
import java.time.LocalDateTime;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends ft.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final v10.zoijcleaow f77800iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocalDateTime f77801iobyxmoadg;

        public iobyxmoadg(LocalDateTime localDateTime) {
            this.f77801iobyxmoadg = localDateTime;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f77801iobyxmoadg, ((iobyxmoadg) obj).f77801iobyxmoadg);
        }

        public int hashCode() {
            LocalDateTime localDateTime = this.f77801iobyxmoadg;
            if (localDateTime == null) {
                return 0;
            }
            return localDateTime.hashCode();
        }

        public final LocalDateTime iobyxmoadg() {
            return this.f77801iobyxmoadg;
        }

        public String toString() {
            return "Params(localDateTime=" + this.f77801iobyxmoadg + ")";
        }
    }

    public ppxfxbqfkf(v10.zoijcleaow sharedPreferencesRepository) {
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        this.f77800iobyxmoadg = sharedPreferencesRepository;
    }

    @Override // ft.zoijcleaow
    public /* bridge */ /* synthetic */ Object iobyxmoadg(Object obj) {
        ppxfxbqfkf((iobyxmoadg) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    protected void ppxfxbqfkf(iobyxmoadg parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        this.f77800iobyxmoadg.dxjokdxxww(parameters.iobyxmoadg());
    }
}
