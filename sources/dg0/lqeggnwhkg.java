package dg0;

import gg.wwaezpbzkn;
import hg.ikoacuggdj;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends ft.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final v10.zoijcleaow f28116iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f28117iobyxmoadg;

        public iobyxmoadg(String popupId) {
            zdlpuopuiu.btonecajqb(popupId, "popupId");
            this.f28117iobyxmoadg = popupId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f28117iobyxmoadg, ((iobyxmoadg) obj).f28117iobyxmoadg);
        }

        public int hashCode() {
            return this.f28117iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f28117iobyxmoadg;
        }

        public String toString() {
            return "Params(popupId=" + this.f28117iobyxmoadg + ")";
        }
    }

    public lqeggnwhkg(v10.zoijcleaow sharedPreferencesRepository) {
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        this.f28116iobyxmoadg = sharedPreferencesRepository;
    }

    @Override // ft.zoijcleaow
    public /* bridge */ /* synthetic */ Object iobyxmoadg(Object obj) {
        ppxfxbqfkf((iobyxmoadg) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    protected void ppxfxbqfkf(iobyxmoadg parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        v10.zoijcleaow zoijcleaowVar = this.f28116iobyxmoadg;
        zoijcleaowVar.ylkuphrtab(ikoacuggdj.wflxmlrfwp(zoijcleaowVar.stevsuqkhv(), parameters.iobyxmoadg()));
    }
}
