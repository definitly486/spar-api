package dm1;

import gg.cqumvgiudr;
import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends wm0.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Map f29166eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final EnumC0582iobyxmoadg f29167ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f29168wkgbmnqykc;

    /* JADX INFO: renamed from: dm1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public enum EnumC0582iobyxmoadg {
        LOADING_ERROR("loader_error"),
        REVIEW_ERROR("review_error"),
        UNKNOWN_NEXT_ITEM("unknown_next_item"),
        ITEM_REVIEW("item_for_review"),
        REVIEW_COMPLETED("review_completed");


        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f29174pmvmpeiblj = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f29176zdlpuopuiu;

        EnumC0582iobyxmoadg(String str) {
            this.f29176zdlpuopuiu = str;
        }

        public final String wkgbmnqykc() {
            return this.f29176zdlpuopuiu;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(EnumC0582iobyxmoadg type, String str) {
        super("Контент экрана отзыва");
        zdlpuopuiu.btonecajqb(type, "type");
        this.f29167ppxfxbqfkf = type;
        this.f29168wkgbmnqykc = str;
        this.f29166eablkybsjg = tzroggbefp.wflxmlrfwp(cqumvgiudr.iobyxmoadg("type", type.wkgbmnqykc()), cqumvgiudr.iobyxmoadg("article", str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f29167ppxfxbqfkf == iobyxmoadgVar.f29167ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f29168wkgbmnqykc, iobyxmoadgVar.f29168wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = this.f29167ppxfxbqfkf.hashCode() * 31;
        String str = this.f29168wkgbmnqykc;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RateProductContentEvent(type=" + this.f29167ppxfxbqfkf + ", article=" + this.f29168wkgbmnqykc + ")";
    }

    @Override // wm0.iobyxmoadg
    public Map zoijcleaow() {
        return this.f29166eablkybsjg;
    }
}
