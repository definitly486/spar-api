package q4;

import com.google.common.collect.iwizpuwonk;
import com.google.common.collect.pkzmftpjix;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg implements gtknphoqwx {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final pkzmftpjix f77827jyumaefscl = pkzmftpjix.lqeggnwhkg().nufgyqmvbu(new xa.eablkybsjg() { // from class: q4.gxszxtbevo
        @Override // xa.eablkybsjg
        public final Object apply(Object obj) {
            return lqeggnwhkg.lqeggnwhkg((eablkybsjg) obj);
        }
    });

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final long[] f77828yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final com.google.common.collect.zdlpuopuiu f77829zdlpuopuiu;

    /* JADX WARN: Code duplicated, block: B:23:0x00b4  */
    public lqeggnwhkg(List list) {
        if (list.size() == 1) {
            eablkybsjg eablkybsjgVar = (eablkybsjg) iwizpuwonk.gxszxtbevo(list);
            long jNufgyqmvbu = nufgyqmvbu(eablkybsjgVar.f77822zoijcleaow);
            if (eablkybsjgVar.f77820ppxfxbqfkf == -9223372036854775807L) {
                this.f77829zdlpuopuiu = com.google.common.collect.zdlpuopuiu.istkbnxepw(eablkybsjgVar.f77819iobyxmoadg);
                this.f77828yggfygwlhe = new long[]{jNufgyqmvbu};
                return;
            } else {
                this.f77829zdlpuopuiu = com.google.common.collect.zdlpuopuiu.cdpycssgdh(eablkybsjgVar.f77819iobyxmoadg, com.google.common.collect.zdlpuopuiu.zynmafqrjb());
                this.f77828yggfygwlhe = new long[]{jNufgyqmvbu, eablkybsjgVar.f77820ppxfxbqfkf + jNufgyqmvbu};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f77828yggfygwlhe = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        com.google.common.collect.zdlpuopuiu zdlpuopuiuVarYlkuphrtab = com.google.common.collect.zdlpuopuiu.ylkuphrtab(f77827jyumaefscl, list);
        int i13 = 0;
        for (int i14 = 0; i14 < zdlpuopuiuVarYlkuphrtab.size(); i14++) {
            eablkybsjg eablkybsjgVar2 = (eablkybsjg) zdlpuopuiuVarYlkuphrtab.get(i14);
            long jNufgyqmvbu2 = nufgyqmvbu(eablkybsjgVar2.f77822zoijcleaow);
            long j13 = eablkybsjgVar2.f77820ppxfxbqfkf + jNufgyqmvbu2;
            if (i13 != 0) {
                int i15 = i13 - 1;
                long j14 = this.f77828yggfygwlhe[i15];
                if (j14 < jNufgyqmvbu2) {
                    this.f77828yggfygwlhe[i13] = jNufgyqmvbu2;
                    arrayList.add(eablkybsjgVar2.f77819iobyxmoadg);
                    i13++;
                } else if (j14 == jNufgyqmvbu2 && ((com.google.common.collect.zdlpuopuiu) arrayList.get(i15)).isEmpty()) {
                    arrayList.set(i15, eablkybsjgVar2.f77819iobyxmoadg);
                } else {
                    y2.kcexrzcfyt.nufgyqmvbu("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.f77828yggfygwlhe[i15] = jNufgyqmvbu2;
                    arrayList.set(i15, eablkybsjgVar2.f77819iobyxmoadg);
                }
            } else {
                this.f77828yggfygwlhe[i13] = jNufgyqmvbu2;
                arrayList.add(eablkybsjgVar2.f77819iobyxmoadg);
                i13++;
            }
            if (eablkybsjgVar2.f77820ppxfxbqfkf != -9223372036854775807L) {
                this.f77828yggfygwlhe[i13] = j13;
                arrayList.add(com.google.common.collect.zdlpuopuiu.zynmafqrjb());
                i13++;
            }
        }
        this.f77829zdlpuopuiu = com.google.common.collect.zdlpuopuiu.jyumaefscl(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Comparable lqeggnwhkg(eablkybsjg eablkybsjgVar) {
        return Long.valueOf(nufgyqmvbu(eablkybsjgVar.f77822zoijcleaow));
    }

    private static long nufgyqmvbu(long j13) {
        if (j13 == -9223372036854775807L) {
            return 0L;
        }
        return j13;
    }

    @Override // q4.gtknphoqwx
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public com.google.common.collect.zdlpuopuiu zoijcleaow(long j13) {
        int iLqeggnwhkg = stevsuqkhv.lqeggnwhkg(this.f77828yggfygwlhe, j13, true, false);
        return iLqeggnwhkg == -1 ? com.google.common.collect.zdlpuopuiu.zynmafqrjb() : (com.google.common.collect.zdlpuopuiu) this.f77829zdlpuopuiu.get(iLqeggnwhkg);
    }

    @Override // q4.gtknphoqwx
    public int iobyxmoadg(long j13) {
        int iWkgbmnqykc = stevsuqkhv.wkgbmnqykc(this.f77828yggfygwlhe, j13, false, false);
        if (iWkgbmnqykc < this.f77829zdlpuopuiu.size()) {
            return iWkgbmnqykc;
        }
        return -1;
    }

    @Override // q4.gtknphoqwx
    public long ppxfxbqfkf(int i13) {
        y2.iobyxmoadg.iobyxmoadg(i13 < this.f77829zdlpuopuiu.size());
        return this.f77828yggfygwlhe[i13];
    }

    @Override // q4.gtknphoqwx
    public int wkgbmnqykc() {
        return this.f77829zdlpuopuiu.size();
    }
}
