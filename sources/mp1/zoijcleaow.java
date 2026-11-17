package mp1;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends zr0.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j01.zoijcleaow f67814iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f67815iobyxmoadg;

        public iobyxmoadg(String startMessage) {
            zdlpuopuiu.btonecajqb(startMessage, "startMessage");
            this.f67815iobyxmoadg = startMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67815iobyxmoadg, ((iobyxmoadg) obj).f67815iobyxmoadg);
        }

        public int hashCode() {
            return this.f67815iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f67815iobyxmoadg;
        }

        public String toString() {
            return "Params(startMessage=" + this.f67815iobyxmoadg + ")";
        }
    }

    public zoijcleaow(j01.zoijcleaow sharedPreferencesRepository) {
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        this.f67814iobyxmoadg = sharedPreferencesRepository;
    }

    @Override // zr0.zoijcleaow
    public /* bridge */ /* synthetic */ Object iobyxmoadg(Object obj) {
        ppxfxbqfkf((iobyxmoadg) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    protected void ppxfxbqfkf(iobyxmoadg parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        this.f67814iobyxmoadg.wypolnanlu(parameters.iobyxmoadg());
    }
}
