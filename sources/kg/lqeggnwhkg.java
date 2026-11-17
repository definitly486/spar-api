package kg;

import java.util.Comparator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
final class lqeggnwhkg implements Comparator {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final lqeggnwhkg f55377zdlpuopuiu = new lqeggnwhkg();

    private lqeggnwhkg() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a13, Comparable b13) {
        zdlpuopuiu.btonecajqb(a13, "a");
        zdlpuopuiu.btonecajqb(b13, "b");
        return b13.compareTo(a13);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return gxszxtbevo.f55376zdlpuopuiu;
    }
}
