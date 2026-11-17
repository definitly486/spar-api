package mp1;

import gg.wwaezpbzkn;
import java.time.LocalDateTime;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends zr0.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j01.zoijcleaow f67812iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocalDateTime f67813iobyxmoadg;

        public iobyxmoadg(LocalDateTime localDateTime) {
            this.f67813iobyxmoadg = localDateTime;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67813iobyxmoadg, ((iobyxmoadg) obj).f67813iobyxmoadg);
        }

        public int hashCode() {
            LocalDateTime localDateTime = this.f67813iobyxmoadg;
            if (localDateTime == null) {
                return 0;
            }
            return localDateTime.hashCode();
        }

        public final LocalDateTime iobyxmoadg() {
            return this.f67813iobyxmoadg;
        }

        public String toString() {
            return "Params(localDateTime=" + this.f67813iobyxmoadg + ")";
        }
    }

    public ppxfxbqfkf(j01.zoijcleaow sharedPreferencesRepository) {
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        this.f67812iobyxmoadg = sharedPreferencesRepository;
    }

    @Override // zr0.zoijcleaow
    public /* bridge */ /* synthetic */ Object iobyxmoadg(Object obj) {
        ppxfxbqfkf((iobyxmoadg) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    protected void ppxfxbqfkf(iobyxmoadg parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        this.f67812iobyxmoadg.dxjokdxxww(parameters.iobyxmoadg());
    }
}
