package ng;

import hg.agtfadlqog;
import java.io.Serializable;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
final class ppxfxbqfkf extends hg.wkgbmnqykc implements iobyxmoadg, Serializable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Enum[] f70047yggfygwlhe;

    public ppxfxbqfkf(Enum[] entries) {
        zdlpuopuiu.btonecajqb(entries, "entries");
        this.f70047yggfygwlhe = entries;
    }

    private final Object writeReplace() {
        return new wkgbmnqykc(this.f70047yggfygwlhe);
    }

    public int agtfadlqog(Enum element) {
        zdlpuopuiu.btonecajqb(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) agtfadlqog.weqkydbzbr(this.f70047yggfygwlhe, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    public boolean btonecajqb(Enum element) {
        zdlpuopuiu.btonecajqb(element, "element");
        return ((Enum) agtfadlqog.weqkydbzbr(this.f70047yggfygwlhe, element.ordinal())) == element;
    }

    @Override // hg.zoijcleaow, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return btonecajqb((Enum) obj);
        }
        return false;
    }

    @Override // hg.wkgbmnqykc, java.util.List
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public Enum get(int i13) {
        hg.wkgbmnqykc.f40274zdlpuopuiu.zoijcleaow(i13, this.f70047yggfygwlhe.length);
        return this.f70047yggfygwlhe[i13];
    }

    @Override // hg.wkgbmnqykc, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return agtfadlqog((Enum) obj);
        }
        return -1;
    }

    @Override // hg.wkgbmnqykc, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return ojitshcjhn((Enum) obj);
        }
        return -1;
    }

    public int ojitshcjhn(Enum element) {
        zdlpuopuiu.btonecajqb(element, "element");
        return indexOf(element);
    }

    @Override // hg.zoijcleaow
    public int wkgbmnqykc() {
        return this.f70047yggfygwlhe.length;
    }
}
