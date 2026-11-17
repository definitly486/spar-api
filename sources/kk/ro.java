package kk;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ro {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f58458iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final List f58459ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final List f58460zoijcleaow;

    public ro(String resultString, List links, List substringIndexes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resultString, "resultString");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(links, "links");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(substringIndexes, "substringIndexes");
        this.f58458iobyxmoadg = resultString;
        this.f58460zoijcleaow = links;
        this.f58459ppxfxbqfkf = substringIndexes;
    }

    public static ro iobyxmoadg(ro roVar, String resultString, List links, List substringIndexes, int i13) {
        if ((i13 & 1) != 0) {
            resultString = roVar.f58458iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            links = roVar.f58460zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            substringIndexes = roVar.f58459ppxfxbqfkf;
        }
        roVar.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resultString, "resultString");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(links, "links");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(substringIndexes, "substringIndexes");
        return new ro(resultString, links, substringIndexes);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro)) {
            return false;
        }
        ro roVar = (ro) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58458iobyxmoadg, roVar.f58458iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58460zoijcleaow, roVar.f58460zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58459ppxfxbqfkf, roVar.f58459ppxfxbqfkf);
    }

    public final int hashCode() {
        return this.f58459ppxfxbqfkf.hashCode() + ((this.f58460zoijcleaow.hashCode() + (this.f58458iobyxmoadg.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ParsedStringData(resultString=" + this.f58458iobyxmoadg + ", links=" + this.f58460zoijcleaow + ", substringIndexes=" + this.f58459ppxfxbqfkf + ")";
    }
}
