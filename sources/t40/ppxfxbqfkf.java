package t40;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import hg.agtfadlqog;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf extends RecyclerView.yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final RecyclerView.rgvfuqvkyq f109662iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f109663ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f109664zoijcleaow;

    public ppxfxbqfkf(LinearLayoutManager layoutManager) {
        zdlpuopuiu.btonecajqb(layoutManager, "layoutManager");
        this.f109664zoijcleaow = 5;
        this.f109662iobyxmoadg = layoutManager;
    }

    private final int iobyxmoadg() {
        RecyclerView.rgvfuqvkyq rgvfuqvkyqVar = this.f109662iobyxmoadg;
        if (rgvfuqvkyqVar instanceof StaggeredGridLayoutManager) {
            int[] iArrZ0 = ((StaggeredGridLayoutManager) rgvfuqvkyqVar).z0(null);
            zdlpuopuiu.lqeggnwhkg(iArrZ0);
            return zoijcleaow(iArrZ0);
        }
        if (rgvfuqvkyqVar instanceof GridLayoutManager) {
            return ((GridLayoutManager) rgvfuqvkyqVar).s0();
        }
        if (rgvfuqvkyqVar instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) rgvfuqvkyqVar).s0();
        }
        throw new IllegalArgumentException("Layout manager is not supported");
    }

    private final int ppxfxbqfkf() {
        RecyclerView.rgvfuqvkyq rgvfuqvkyqVar = this.f109662iobyxmoadg;
        if (rgvfuqvkyqVar instanceof StaggeredGridLayoutManager) {
            int[] iArrB0 = ((StaggeredGridLayoutManager) rgvfuqvkyqVar).B0(null);
            zdlpuopuiu.lqeggnwhkg(iArrB0);
            return wkgbmnqykc(iArrB0);
        }
        if (rgvfuqvkyqVar instanceof GridLayoutManager) {
            return ((GridLayoutManager) rgvfuqvkyqVar).v0();
        }
        if (rgvfuqvkyqVar instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) rgvfuqvkyqVar).v0();
        }
        throw new IllegalArgumentException("Layout manager is not supported");
    }

    private final int wkgbmnqykc(int[] iArr) {
        Integer numValueOf;
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i13 = iArr[0];
            int iOipsdeybqn = agtfadlqog.oipsdeybqn(iArr);
            if (iOipsdeybqn == 0) {
                numValueOf = Integer.valueOf(i13);
            } else {
                if (1 <= iOipsdeybqn) {
                    int i14 = 1;
                    int i15 = i13;
                    while (true) {
                        int i16 = iArr[i14];
                        if (i13 < i16) {
                            i13 = i16;
                            i15 = i13;
                        }
                        if (i14 == iOipsdeybqn) {
                            break;
                        }
                        i14++;
                    }
                    i13 = i15;
                }
                numValueOf = Integer.valueOf(i13);
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    private final int zoijcleaow(int[] iArr) {
        Integer numValueOf;
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i13 = iArr[0];
            int iOipsdeybqn = agtfadlqog.oipsdeybqn(iArr);
            if (iOipsdeybqn == 0) {
                numValueOf = Integer.valueOf(i13);
            } else {
                if (1 <= iOipsdeybqn) {
                    int i14 = 1;
                    int i15 = i13;
                    while (true) {
                        int i16 = iArr[i14];
                        if (i13 > i16) {
                            i13 = i16;
                            i15 = i13;
                        }
                        if (i14 == iOipsdeybqn) {
                            break;
                        }
                        i14++;
                    }
                    i13 = i15;
                }
                numValueOf = Integer.valueOf(i13);
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    protected abstract void eablkybsjg(int i13);

    public final void gxszxtbevo() {
        this.f109663ppxfxbqfkf = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.yggfygwlhe
    public void onScrolled(RecyclerView view, int i13, int i14) {
        zdlpuopuiu.btonecajqb(view, "view");
        int iIobyxmoadg = i14 < 0 ? iobyxmoadg() : ppxfxbqfkf();
        if (iIobyxmoadg != this.f109663ppxfxbqfkf) {
            eablkybsjg(iIobyxmoadg);
        }
        this.f109663ppxfxbqfkf = iIobyxmoadg;
    }

    public ppxfxbqfkf(GridLayoutManager layoutManager) {
        zdlpuopuiu.btonecajqb(layoutManager, "layoutManager");
        this.f109664zoijcleaow = 5;
        this.f109662iobyxmoadg = layoutManager;
        this.f109664zoijcleaow = 5 * layoutManager.q1();
    }
}
