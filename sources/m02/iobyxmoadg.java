package m02;

import gg.cqumvgiudr;
import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends mo.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Map f64915eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final EnumC1352iobyxmoadg f64916ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f64917wkgbmnqykc;

    /* JADX INFO: renamed from: m02.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public enum EnumC1352iobyxmoadg {
        LOADING_ERROR("loader_error"),
        REVIEW_ERROR("review_error"),
        UNKNOWN_NEXT_ITEM("unknown_next_item"),
        ITEM_REVIEW("item_for_review"),
        REVIEW_COMPLETED("review_completed");


        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f64923pmvmpeiblj = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f64925zdlpuopuiu;

        EnumC1352iobyxmoadg(String str) {
            this.f64925zdlpuopuiu = str;
        }

        public final String wkgbmnqykc() {
            return this.f64925zdlpuopuiu;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(EnumC1352iobyxmoadg type, String str) {
        super("Контент экрана отзыва");
        zdlpuopuiu.btonecajqb(type, "type");
        this.f64916ppxfxbqfkf = type;
        this.f64917wkgbmnqykc = str;
        this.f64915eablkybsjg = tzroggbefp.wflxmlrfwp(cqumvgiudr.iobyxmoadg("type", type.wkgbmnqykc()), cqumvgiudr.iobyxmoadg("article", str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f64916ppxfxbqfkf == iobyxmoadgVar.f64916ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f64917wkgbmnqykc, iobyxmoadgVar.f64917wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = this.f64916ppxfxbqfkf.hashCode() * 31;
        String str = this.f64917wkgbmnqykc;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RateProductContentEvent(type=" + this.f64916ppxfxbqfkf + ", article=" + this.f64917wkgbmnqykc + ")";
    }

    @Override // mo.iobyxmoadg
    public Map zoijcleaow() {
        return this.f64915eablkybsjg;
    }
}
