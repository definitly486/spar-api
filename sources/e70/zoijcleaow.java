package e70;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f30820iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f30821ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f30822zoijcleaow;

    public zoijcleaow(String key, String title, List items) {
        zdlpuopuiu.btonecajqb(key, "key");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(items, "items");
        this.f30820iobyxmoadg = key;
        this.f30822zoijcleaow = title;
        this.f30821ppxfxbqfkf = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f30820iobyxmoadg, zoijcleaowVar.f30820iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f30822zoijcleaow, zoijcleaowVar.f30822zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f30821ppxfxbqfkf, zoijcleaowVar.f30821ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f30820iobyxmoadg.hashCode() * 31) + this.f30822zoijcleaow.hashCode()) * 31) + this.f30821ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f30821ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f30822zoijcleaow;
    }

    public String toString() {
        return "CommentsBlockUiModel(key=" + this.f30820iobyxmoadg + ", title=" + this.f30822zoijcleaow + ", items=" + this.f30821ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f30820iobyxmoadg;
    }
}
