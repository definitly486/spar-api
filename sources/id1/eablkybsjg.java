package id1;

import gg.wwaezpbzkn;
import hg.ikoacuggdj;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg extends zr0.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j01.zoijcleaow f42421iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f42422iobyxmoadg;

        public iobyxmoadg(String popupId) {
            zdlpuopuiu.btonecajqb(popupId, "popupId");
            this.f42422iobyxmoadg = popupId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f42422iobyxmoadg, ((iobyxmoadg) obj).f42422iobyxmoadg);
        }

        public int hashCode() {
            return this.f42422iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f42422iobyxmoadg;
        }

        public String toString() {
            return "Params(popupId=" + this.f42422iobyxmoadg + ")";
        }
    }

    public eablkybsjg(j01.zoijcleaow sharedPreferencesRepository) {
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        this.f42421iobyxmoadg = sharedPreferencesRepository;
    }

    @Override // zr0.zoijcleaow
    public /* bridge */ /* synthetic */ Object iobyxmoadg(Object obj) {
        ppxfxbqfkf((iobyxmoadg) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    protected void ppxfxbqfkf(iobyxmoadg parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        j01.zoijcleaow zoijcleaowVar = this.f42421iobyxmoadg;
        zoijcleaowVar.ylkuphrtab(ikoacuggdj.wflxmlrfwp(zoijcleaowVar.stevsuqkhv(), parameters.iobyxmoadg()));
    }
}
