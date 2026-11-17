package n3;

import com.google.common.collect.iwizpuwonk;
import com.google.common.collect.zdlpuopuiu;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class gxszxtbevo implements iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ArrayList f68485iobyxmoadg = new ArrayList();

    private int gxszxtbevo(long j13) {
        for (int i13 = 0; i13 < this.f68485iobyxmoadg.size(); i13++) {
            if (j13 < ((q4.eablkybsjg) this.f68485iobyxmoadg.get(i13)).f77822zoijcleaow) {
                return i13;
            }
        }
        return this.f68485iobyxmoadg.size();
    }

    @Override // n3.iobyxmoadg
    public void clear() {
        this.f68485iobyxmoadg.clear();
    }

    @Override // n3.iobyxmoadg
    public void eablkybsjg(long j13) {
        int iGxszxtbevo = gxszxtbevo(j13);
        if (iGxszxtbevo == 0) {
            return;
        }
        long j14 = ((q4.eablkybsjg) this.f68485iobyxmoadg.get(iGxszxtbevo - 1)).f77821wkgbmnqykc;
        if (j14 == -9223372036854775807L || j14 >= j13) {
            iGxszxtbevo--;
        }
        this.f68485iobyxmoadg.subList(0, iGxszxtbevo).clear();
    }

    @Override // n3.iobyxmoadg
    public zdlpuopuiu iobyxmoadg(long j13) {
        int iGxszxtbevo = gxszxtbevo(j13);
        if (iGxszxtbevo == 0) {
            return zdlpuopuiu.zynmafqrjb();
        }
        q4.eablkybsjg eablkybsjgVar = (q4.eablkybsjg) this.f68485iobyxmoadg.get(iGxszxtbevo - 1);
        long j14 = eablkybsjgVar.f77821wkgbmnqykc;
        return (j14 == -9223372036854775807L || j13 < j14) ? eablkybsjgVar.f77819iobyxmoadg : zdlpuopuiu.zynmafqrjb();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // n3.iobyxmoadg
    public boolean ppxfxbqfkf(q4.eablkybsjg eablkybsjgVar, long j13) {
        boolean z13;
        y2.iobyxmoadg.iobyxmoadg(eablkybsjgVar.f77822zoijcleaow != -9223372036854775807L);
        if (eablkybsjgVar.f77822zoijcleaow <= j13) {
            long j14 = eablkybsjgVar.f77821wkgbmnqykc;
            if (j14 == -9223372036854775807L || j13 < j14) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        for (int size = this.f68485iobyxmoadg.size() - 1; size >= 0; size--) {
            if (eablkybsjgVar.f77822zoijcleaow >= ((q4.eablkybsjg) this.f68485iobyxmoadg.get(size)).f77822zoijcleaow) {
                this.f68485iobyxmoadg.add(size + 1, eablkybsjgVar);
                return z13;
            }
            if (((q4.eablkybsjg) this.f68485iobyxmoadg.get(size)).f77822zoijcleaow <= j13) {
                z13 = false;
            }
        }
        this.f68485iobyxmoadg.add(0, eablkybsjgVar);
        return z13;
    }

    @Override // n3.iobyxmoadg
    public long wkgbmnqykc(long j13) {
        if (this.f68485iobyxmoadg.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j13 < ((q4.eablkybsjg) this.f68485iobyxmoadg.get(0)).f77822zoijcleaow) {
            return ((q4.eablkybsjg) this.f68485iobyxmoadg.get(0)).f77822zoijcleaow;
        }
        for (int i13 = 1; i13 < this.f68485iobyxmoadg.size(); i13++) {
            q4.eablkybsjg eablkybsjgVar = (q4.eablkybsjg) this.f68485iobyxmoadg.get(i13);
            if (j13 < eablkybsjgVar.f77822zoijcleaow) {
                long j14 = ((q4.eablkybsjg) this.f68485iobyxmoadg.get(i13 - 1)).f77821wkgbmnqykc;
                return (j14 == -9223372036854775807L || j14 <= j13 || j14 >= eablkybsjgVar.f77822zoijcleaow) ? eablkybsjgVar.f77822zoijcleaow : j14;
            }
        }
        long j15 = ((q4.eablkybsjg) iwizpuwonk.wkgbmnqykc(this.f68485iobyxmoadg)).f77821wkgbmnqykc;
        if (j15 == -9223372036854775807L || j13 >= j15) {
            return Long.MIN_VALUE;
        }
        return j15;
    }

    @Override // n3.iobyxmoadg
    public long zoijcleaow(long j13) {
        if (this.f68485iobyxmoadg.isEmpty() || j13 < ((q4.eablkybsjg) this.f68485iobyxmoadg.get(0)).f77822zoijcleaow) {
            return -9223372036854775807L;
        }
        for (int i13 = 1; i13 < this.f68485iobyxmoadg.size(); i13++) {
            long j14 = ((q4.eablkybsjg) this.f68485iobyxmoadg.get(i13)).f77822zoijcleaow;
            if (j13 == j14) {
                return j14;
            }
            if (j13 < j14) {
                q4.eablkybsjg eablkybsjgVar = (q4.eablkybsjg) this.f68485iobyxmoadg.get(i13 - 1);
                long j15 = eablkybsjgVar.f77821wkgbmnqykc;
                return (j15 == -9223372036854775807L || j15 > j13) ? eablkybsjgVar.f77822zoijcleaow : j15;
            }
        }
        q4.eablkybsjg eablkybsjgVar2 = (q4.eablkybsjg) iwizpuwonk.wkgbmnqykc(this.f68485iobyxmoadg);
        long j16 = eablkybsjgVar2.f77821wkgbmnqykc;
        return (j16 == -9223372036854775807L || j13 < j16) ? eablkybsjgVar2.f77822zoijcleaow : j16;
    }
}
