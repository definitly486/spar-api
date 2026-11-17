package n3;

import com.google.common.collect.pkzmftpjix;
import com.google.common.collect.zdlpuopuiu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg implements iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final pkzmftpjix f68483zoijcleaow = pkzmftpjix.lqeggnwhkg().nufgyqmvbu(new xa.eablkybsjg() { // from class: n3.ppxfxbqfkf
        @Override // xa.eablkybsjg
        public final Object apply(Object obj) {
            return eablkybsjg.nufgyqmvbu((q4.eablkybsjg) obj);
        }
    }).iobyxmoadg(pkzmftpjix.lqeggnwhkg().dxjokdxxww().nufgyqmvbu(new xa.eablkybsjg() { // from class: n3.wkgbmnqykc
        @Override // xa.eablkybsjg
        public final Object apply(Object obj) {
            return eablkybsjg.dxjokdxxww((q4.eablkybsjg) obj);
        }
    }));

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f68484iobyxmoadg = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long dxjokdxxww(q4.eablkybsjg eablkybsjgVar) {
        return Long.valueOf(eablkybsjgVar.f77820ppxfxbqfkf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long nufgyqmvbu(q4.eablkybsjg eablkybsjgVar) {
        return Long.valueOf(eablkybsjgVar.f77822zoijcleaow);
    }

    @Override // n3.iobyxmoadg
    public void clear() {
        this.f68484iobyxmoadg.clear();
    }

    @Override // n3.iobyxmoadg
    public void eablkybsjg(long j13) {
        int i13 = 0;
        while (i13 < this.f68484iobyxmoadg.size()) {
            long j14 = ((q4.eablkybsjg) this.f68484iobyxmoadg.get(i13)).f77822zoijcleaow;
            if (j13 > j14 && j13 > ((q4.eablkybsjg) this.f68484iobyxmoadg.get(i13)).f77821wkgbmnqykc) {
                this.f68484iobyxmoadg.remove(i13);
                i13--;
            } else if (j13 < j14) {
                return;
            }
            i13++;
        }
    }

    @Override // n3.iobyxmoadg
    public zdlpuopuiu iobyxmoadg(long j13) {
        if (!this.f68484iobyxmoadg.isEmpty()) {
            if (j13 >= ((q4.eablkybsjg) this.f68484iobyxmoadg.get(0)).f77822zoijcleaow) {
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < this.f68484iobyxmoadg.size(); i13++) {
                    q4.eablkybsjg eablkybsjgVar = (q4.eablkybsjg) this.f68484iobyxmoadg.get(i13);
                    if (j13 >= eablkybsjgVar.f77822zoijcleaow && j13 < eablkybsjgVar.f77821wkgbmnqykc) {
                        arrayList.add(eablkybsjgVar);
                    }
                    if (j13 < eablkybsjgVar.f77822zoijcleaow) {
                        break;
                    }
                }
                zdlpuopuiu zdlpuopuiuVarYlkuphrtab = zdlpuopuiu.ylkuphrtab(f68483zoijcleaow, arrayList);
                zdlpuopuiu.iobyxmoadg iobyxmoadgVarKcexrzcfyt = zdlpuopuiu.kcexrzcfyt();
                for (int i14 = 0; i14 < zdlpuopuiuVarYlkuphrtab.size(); i14++) {
                    iobyxmoadgVarKcexrzcfyt.btonecajqb(((q4.eablkybsjg) zdlpuopuiuVarYlkuphrtab.get(i14)).f77819iobyxmoadg);
                }
                return iobyxmoadgVarKcexrzcfyt.gtknphoqwx();
            }
        }
        return zdlpuopuiu.zynmafqrjb();
    }

    @Override // n3.iobyxmoadg
    public boolean ppxfxbqfkf(q4.eablkybsjg eablkybsjgVar, long j13) {
        y2.iobyxmoadg.iobyxmoadg(eablkybsjgVar.f77822zoijcleaow != -9223372036854775807L);
        y2.iobyxmoadg.iobyxmoadg(eablkybsjgVar.f77820ppxfxbqfkf != -9223372036854775807L);
        boolean z13 = eablkybsjgVar.f77822zoijcleaow <= j13 && j13 < eablkybsjgVar.f77821wkgbmnqykc;
        for (int size = this.f68484iobyxmoadg.size() - 1; size >= 0; size--) {
            if (eablkybsjgVar.f77822zoijcleaow >= ((q4.eablkybsjg) this.f68484iobyxmoadg.get(size)).f77822zoijcleaow) {
                this.f68484iobyxmoadg.add(size + 1, eablkybsjgVar);
                return z13;
            }
        }
        this.f68484iobyxmoadg.add(0, eablkybsjgVar);
        return z13;
    }

    @Override // n3.iobyxmoadg
    public long wkgbmnqykc(long j13) {
        long jMin = -9223372036854775807L;
        for (int i13 = 0; i13 < this.f68484iobyxmoadg.size(); i13++) {
            long j14 = ((q4.eablkybsjg) this.f68484iobyxmoadg.get(i13)).f77822zoijcleaow;
            long j15 = ((q4.eablkybsjg) this.f68484iobyxmoadg.get(i13)).f77821wkgbmnqykc;
            if (j13 < j14) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j14);
                    break;
                }
                jMin = j14;
                break;
            }
            if (j13 < j15) {
                jMin = jMin == -9223372036854775807L ? j15 : Math.min(jMin, j15);
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // n3.iobyxmoadg
    public long zoijcleaow(long j13) {
        if (this.f68484iobyxmoadg.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j13 < ((q4.eablkybsjg) this.f68484iobyxmoadg.get(0)).f77822zoijcleaow) {
            return -9223372036854775807L;
        }
        long jMax = ((q4.eablkybsjg) this.f68484iobyxmoadg.get(0)).f77822zoijcleaow;
        for (int i13 = 0; i13 < this.f68484iobyxmoadg.size(); i13++) {
            long j14 = ((q4.eablkybsjg) this.f68484iobyxmoadg.get(i13)).f77822zoijcleaow;
            long j15 = ((q4.eablkybsjg) this.f68484iobyxmoadg.get(i13)).f77821wkgbmnqykc;
            if (j15 > j13) {
                if (j14 > j13) {
                    break;
                }
                jMax = Math.max(jMax, j14);
            } else {
                jMax = Math.max(jMax, j15);
            }
        }
        return jMax;
    }
}
