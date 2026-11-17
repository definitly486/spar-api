package oi;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public int compareTo(iobyxmoadg other) {
        zdlpuopuiu.btonecajqb(other, "other");
        int iCompareTo = zoijcleaow().compareTo(other.zoijcleaow());
        if (iCompareTo == 0 && !ppxfxbqfkf() && other.ppxfxbqfkf()) {
            return 1;
        }
        return iCompareTo;
    }

    public abstract boolean ppxfxbqfkf();

    public abstract zoijcleaow zoijcleaow();
}
