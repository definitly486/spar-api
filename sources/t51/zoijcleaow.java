package t51;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f109758iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f109759ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f109760zoijcleaow;

    public zoijcleaow(String key, String title, List items) {
        zdlpuopuiu.btonecajqb(key, "key");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(items, "items");
        this.f109758iobyxmoadg = key;
        this.f109760zoijcleaow = title;
        this.f109759ppxfxbqfkf = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f109758iobyxmoadg, zoijcleaowVar.f109758iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f109760zoijcleaow, zoijcleaowVar.f109760zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f109759ppxfxbqfkf, zoijcleaowVar.f109759ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f109758iobyxmoadg.hashCode() * 31) + this.f109760zoijcleaow.hashCode()) * 31) + this.f109759ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f109759ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f109760zoijcleaow;
    }

    public String toString() {
        return "CommentsBlockUiModel(key=" + this.f109758iobyxmoadg + ", title=" + this.f109760zoijcleaow + ", items=" + this.f109759ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f109758iobyxmoadg;
    }
}
