package h82;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f39911iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f39912ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f39913zoijcleaow;

    public iobyxmoadg(String id2, List slides, int i13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(slides, "slides");
        this.f39911iobyxmoadg = id2;
        this.f39913zoijcleaow = slides;
        this.f39912ppxfxbqfkf = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f39911iobyxmoadg, iobyxmoadgVar.f39911iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39913zoijcleaow, iobyxmoadgVar.f39913zoijcleaow) && this.f39912ppxfxbqfkf == iobyxmoadgVar.f39912ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f39911iobyxmoadg.hashCode() * 31) + this.f39913zoijcleaow.hashCode()) * 31) + Integer.hashCode(this.f39912ppxfxbqfkf);
    }

    public final String iobyxmoadg() {
        return this.f39911iobyxmoadg;
    }

    public final List ppxfxbqfkf() {
        return this.f39913zoijcleaow;
    }

    public String toString() {
        return "StoryGroupUiModel(id=" + this.f39911iobyxmoadg + ", slides=" + this.f39913zoijcleaow + ", initialSlideIndex=" + this.f39912ppxfxbqfkf + ")";
    }

    public final int zoijcleaow() {
        return this.f39912ppxfxbqfkf;
    }
}
