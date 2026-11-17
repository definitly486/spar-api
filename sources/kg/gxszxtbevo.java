package kg;

import java.util.Comparator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
final class gxszxtbevo implements Comparator {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final gxszxtbevo f55376zdlpuopuiu = new gxszxtbevo();

    private gxszxtbevo() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a13, Comparable b13) {
        zdlpuopuiu.btonecajqb(a13, "a");
        zdlpuopuiu.btonecajqb(b13, "b");
        return a13.compareTo(b13);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return lqeggnwhkg.f55377zdlpuopuiu;
    }
}
