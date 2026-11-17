package au1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f14614iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f14615ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f14616zoijcleaow;

    public iobyxmoadg(String id2, List slides, int i13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(slides, "slides");
        this.f14614iobyxmoadg = id2;
        this.f14616zoijcleaow = slides;
        this.f14615ppxfxbqfkf = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f14614iobyxmoadg, iobyxmoadgVar.f14614iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f14616zoijcleaow, iobyxmoadgVar.f14616zoijcleaow) && this.f14615ppxfxbqfkf == iobyxmoadgVar.f14615ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f14614iobyxmoadg.hashCode() * 31) + this.f14616zoijcleaow.hashCode()) * 31) + Integer.hashCode(this.f14615ppxfxbqfkf);
    }

    public final String iobyxmoadg() {
        return this.f14614iobyxmoadg;
    }

    public final List ppxfxbqfkf() {
        return this.f14616zoijcleaow;
    }

    public String toString() {
        return "StoryGroupUiModel(id=" + this.f14614iobyxmoadg + ", slides=" + this.f14616zoijcleaow + ", initialSlideIndex=" + this.f14615ppxfxbqfkf + ")";
    }

    public final int zoijcleaow() {
        return this.f14615ppxfxbqfkf;
    }
}
