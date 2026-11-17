package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.uwvvkdfqfp;
import f3.hkdspvbjdz;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class jyumaefscl implements vdvldrhtss, vdvldrhtss.iobyxmoadg {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private lmojexxdyd f11232istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final m3.eablkybsjg f11233iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private vdvldrhtss.iobyxmoadg f11235lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private m3.iwizpuwonk f11236pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final boolean[] f11237yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final vdvldrhtss[] f11238zdlpuopuiu;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final ArrayList f11230cqumvgiudr = new ArrayList();

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final HashMap f11231esjtqupxsv = new HashMap();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final IdentityHashMap f11234jyumaefscl = new IdentityHashMap();

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private vdvldrhtss[] f11239zynmafqrjb = new vdvldrhtss[0];

    private static final class iobyxmoadg implements o3.esjtqupxsv {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final o3.esjtqupxsv f11240iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final v2.yadqdtsiqt f11241zoijcleaow;

        public iobyxmoadg(o3.esjtqupxsv esjtqupxsvVar, v2.yadqdtsiqt yadqdtsiqtVar) {
            this.f11240iobyxmoadg = esjtqupxsvVar;
            this.f11241zoijcleaow = yadqdtsiqtVar;
        }

        @Override // o3.esjtqupxsv
        public void btonecajqb() {
            this.f11240iobyxmoadg.btonecajqb();
        }

        @Override // o3.esjtqupxsv
        public androidx.media3.common.iobyxmoadg draadjrbmk() {
            return this.f11241zoijcleaow.iobyxmoadg(this.f11240iobyxmoadg.gtknphoqwx());
        }

        @Override // o3.esjtqupxsv
        public void dxjokdxxww(boolean z13) {
            this.f11240iobyxmoadg.dxjokdxxww(z13);
        }

        @Override // o3.esjtqupxsv
        public void eablkybsjg() {
            this.f11240iobyxmoadg.eablkybsjg();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f11240iobyxmoadg.equals(iobyxmoadgVar.f11240iobyxmoadg) && this.f11241zoijcleaow.equals(iobyxmoadgVar.f11241zoijcleaow);
        }

        @Override // o3.esjtqupxsv
        public int gtknphoqwx() {
            return this.f11240iobyxmoadg.gtknphoqwx();
        }

        @Override // o3.esjtqupxsv
        public void gxszxtbevo() {
            this.f11240iobyxmoadg.gxszxtbevo();
        }

        public int hashCode() {
            return ((527 + this.f11241zoijcleaow.hashCode()) * 31) + this.f11240iobyxmoadg.hashCode();
        }

        @Override // o3.zynmafqrjb
        public int length() {
            return this.f11240iobyxmoadg.length();
        }

        @Override // o3.zynmafqrjb
        public int lqeggnwhkg(int i13) {
            return this.f11240iobyxmoadg.lqeggnwhkg(i13);
        }

        @Override // o3.zynmafqrjb
        public v2.yadqdtsiqt nufgyqmvbu() {
            return this.f11241zoijcleaow;
        }

        @Override // o3.zynmafqrjb
        public int ppxfxbqfkf(int i13) {
            return this.f11240iobyxmoadg.ppxfxbqfkf(i13);
        }

        @Override // o3.esjtqupxsv
        public void wflxmlrfwp() {
            this.f11240iobyxmoadg.wflxmlrfwp();
        }

        @Override // o3.esjtqupxsv
        public void wkgbmnqykc(float f13) {
            this.f11240iobyxmoadg.wkgbmnqykc(f13);
        }

        @Override // o3.zynmafqrjb
        public androidx.media3.common.iobyxmoadg zoijcleaow(int i13) {
            return this.f11241zoijcleaow.iobyxmoadg(this.f11240iobyxmoadg.ppxfxbqfkf(i13));
        }
    }

    public jyumaefscl(m3.eablkybsjg eablkybsjgVar, long[] jArr, vdvldrhtss... vdvldrhtssVarArr) {
        this.f11233iwizpuwonk = eablkybsjgVar;
        this.f11238zdlpuopuiu = vdvldrhtssVarArr;
        this.f11232istkbnxepw = eablkybsjgVar.zoijcleaow();
        this.f11237yggfygwlhe = new boolean[vdvldrhtssVarArr.length];
        for (int i13 = 0; i13 < vdvldrhtssVarArr.length; i13++) {
            long j13 = jArr[i13];
            if (j13 != 0) {
                this.f11237yggfygwlhe[i13] = true;
                this.f11238zdlpuopuiu[i13] = new hcddaimhww(vdvldrhtssVarArr[i13], j13);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List wflxmlrfwp(vdvldrhtss vdvldrhtssVar) {
        return vdvldrhtssVar.vdvldrhtss().ppxfxbqfkf();
    }

    @Override // androidx.media3.exoplayer.source.lmojexxdyd.iobyxmoadg
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public void lqeggnwhkg(vdvldrhtss vdvldrhtssVar) {
        ((vdvldrhtss.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f11235lereixgezr)).lqeggnwhkg(this);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long btonecajqb() {
        long j13 = -9223372036854775807L;
        for (vdvldrhtss vdvldrhtssVar : this.f11239zynmafqrjb) {
            long jBtonecajqb = vdvldrhtssVar.btonecajqb();
            if (jBtonecajqb == -9223372036854775807L) {
                if (j13 != -9223372036854775807L && vdvldrhtssVar.dxjokdxxww(j13) != j13) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j13 == -9223372036854775807L) {
                for (vdvldrhtss vdvldrhtssVar2 : this.f11239zynmafqrjb) {
                    if (vdvldrhtssVar2 == vdvldrhtssVar) {
                        break;
                    }
                    if (vdvldrhtssVar2.dxjokdxxww(jBtonecajqb) != jBtonecajqb) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j13 = jBtonecajqb;
            } else if (jBtonecajqb != j13) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j13;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void draadjrbmk() {
        for (vdvldrhtss vdvldrhtssVar : this.f11238zdlpuopuiu) {
            vdvldrhtssVar.draadjrbmk();
        }
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long dxjokdxxww(long j13) {
        long jDxjokdxxww = this.f11239zynmafqrjb[0].dxjokdxxww(j13);
        int i13 = 1;
        while (true) {
            vdvldrhtss[] vdvldrhtssVarArr = this.f11239zynmafqrjb;
            if (i13 >= vdvldrhtssVarArr.length) {
                return jDxjokdxxww;
            }
            if (vdvldrhtssVarArr[i13].dxjokdxxww(jDxjokdxxww) != jDxjokdxxww) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i13++;
        }
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public void eablkybsjg(long j13) {
        this.f11232istkbnxepw.eablkybsjg(j13);
    }

    public vdvldrhtss gtknphoqwx(int i13) {
        return this.f11237yggfygwlhe[i13] ? ((hcddaimhww) this.f11238zdlpuopuiu[i13]).nufgyqmvbu() : this.f11238zdlpuopuiu[i13];
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss.iobyxmoadg
    public void gxszxtbevo(vdvldrhtss vdvldrhtssVar) {
        this.f11230cqumvgiudr.remove(vdvldrhtssVar);
        if (!this.f11230cqumvgiudr.isEmpty()) {
            return;
        }
        int i13 = 0;
        for (vdvldrhtss vdvldrhtssVar2 : this.f11238zdlpuopuiu) {
            i13 += vdvldrhtssVar2.vdvldrhtss().f65036iobyxmoadg;
        }
        v2.yadqdtsiqt[] yadqdtsiqtVarArr = new v2.yadqdtsiqt[i13];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            vdvldrhtss[] vdvldrhtssVarArr = this.f11238zdlpuopuiu;
            if (i14 >= vdvldrhtssVarArr.length) {
                this.f11236pmvmpeiblj = new m3.iwizpuwonk(yadqdtsiqtVarArr);
                ((vdvldrhtss.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f11235lereixgezr)).gxszxtbevo(this);
                return;
            }
            m3.iwizpuwonk iwizpuwonkVarVdvldrhtss = vdvldrhtssVarArr[i14].vdvldrhtss();
            int i16 = iwizpuwonkVarVdvldrhtss.f65036iobyxmoadg;
            int i17 = 0;
            while (i17 < i16) {
                v2.yadqdtsiqt yadqdtsiqtVarZoijcleaow = iwizpuwonkVarVdvldrhtss.zoijcleaow(i17);
                androidx.media3.common.iobyxmoadg[] iobyxmoadgVarArr = new androidx.media3.common.iobyxmoadg[yadqdtsiqtVarZoijcleaow.f115705iobyxmoadg];
                for (int i18 = 0; i18 < yadqdtsiqtVarZoijcleaow.f115705iobyxmoadg; i18++) {
                    androidx.media3.common.iobyxmoadg iobyxmoadgVarIobyxmoadg = yadqdtsiqtVarZoijcleaow.iobyxmoadg(i18);
                    androidx.media3.common.iobyxmoadg.zoijcleaow zoijcleaowVarZoijcleaow = iobyxmoadgVarIobyxmoadg.zoijcleaow();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i14);
                    sb3.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    String str = iobyxmoadgVarIobyxmoadg.f9758iobyxmoadg;
                    if (str == null) {
                        str = "";
                    }
                    sb3.append(str);
                    iobyxmoadgVarArr[i18] = zoijcleaowVarZoijcleaow.xrmfcynszj(sb3.toString()).cllcsxoeiz();
                }
                v2.yadqdtsiqt yadqdtsiqtVar = new v2.yadqdtsiqt(i14 + StringUtils.PROCESS_POSTFIX_DELIMITER + yadqdtsiqtVarZoijcleaow.f115708zoijcleaow, iobyxmoadgVarArr);
                this.f11231esjtqupxsv.put(yadqdtsiqtVar, yadqdtsiqtVarZoijcleaow);
                yadqdtsiqtVarArr[i15] = yadqdtsiqtVar;
                i17++;
                i15++;
            }
            i14++;
        }
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public boolean iobyxmoadg(uwvvkdfqfp uwvvkdfqfpVar) {
        if (this.f11230cqumvgiudr.isEmpty()) {
            return this.f11232istkbnxepw.iobyxmoadg(uwvvkdfqfpVar);
        }
        int size = this.f11230cqumvgiudr.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((vdvldrhtss) this.f11230cqumvgiudr.get(i13)).iobyxmoadg(uwvvkdfqfpVar);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long ojitshcjhn(o3.esjtqupxsv[] esjtqupxsvVarArr, boolean[] zArr, m3.oxmwwwfdhm[] oxmwwwfdhmVarArr, boolean[] zArr2, long j13) {
        Integer num;
        int[] iArr = new int[esjtqupxsvVarArr.length];
        int[] iArr2 = new int[esjtqupxsvVarArr.length];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            num = null;
            if (i14 >= esjtqupxsvVarArr.length) {
                break;
            }
            m3.oxmwwwfdhm oxmwwwfdhmVar = oxmwwwfdhmVarArr[i14];
            num = oxmwwwfdhmVar != null ? (Integer) this.f11234jyumaefscl.get(oxmwwwfdhmVar) : null;
            iArr[i14] = num == null ? -1 : num.intValue();
            o3.esjtqupxsv esjtqupxsvVar = esjtqupxsvVarArr[i14];
            if (esjtqupxsvVar != null) {
                String str = esjtqupxsvVar.nufgyqmvbu().f115708zoijcleaow;
                iArr2[i14] = Integer.parseInt(str.substring(0, str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER)));
            } else {
                iArr2[i14] = -1;
            }
            i14++;
        }
        this.f11234jyumaefscl.clear();
        int length = esjtqupxsvVarArr.length;
        m3.oxmwwwfdhm[] oxmwwwfdhmVarArr2 = new m3.oxmwwwfdhm[length];
        m3.oxmwwwfdhm[] oxmwwwfdhmVarArr3 = new m3.oxmwwwfdhm[esjtqupxsvVarArr.length];
        Object[] objArr = new o3.esjtqupxsv[esjtqupxsvVarArr.length];
        ArrayList arrayList = new ArrayList(this.f11238zdlpuopuiu.length);
        long j14 = j13;
        int i15 = 0;
        while (i15 < this.f11238zdlpuopuiu.length) {
            for (int i16 = i13; i16 < esjtqupxsvVarArr.length; i16++) {
                oxmwwwfdhmVarArr3[i16] = iArr[i16] == i15 ? oxmwwwfdhmVarArr[i16] : num;
                if (iArr2[i16] == i15) {
                    o3.esjtqupxsv esjtqupxsvVar2 = (o3.esjtqupxsv) y2.iobyxmoadg.eablkybsjg(esjtqupxsvVarArr[i16]);
                    objArr[i16] = new iobyxmoadg(esjtqupxsvVar2, (v2.yadqdtsiqt) y2.iobyxmoadg.eablkybsjg((v2.yadqdtsiqt) this.f11231esjtqupxsv.get(esjtqupxsvVar2.nufgyqmvbu())));
                } else {
                    objArr[i16] = num;
                }
            }
            int i17 = i15;
            ArrayList arrayList2 = arrayList;
            Object[] objArr2 = objArr;
            long jOjitshcjhn = this.f11238zdlpuopuiu[i15].ojitshcjhn(objArr, zArr, oxmwwwfdhmVarArr3, zArr2, j14);
            if (i17 == 0) {
                j14 = jOjitshcjhn;
            } else if (jOjitshcjhn != j14) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z13 = false;
            for (int i18 = 0; i18 < esjtqupxsvVarArr.length; i18++) {
                if (iArr2[i18] == i17) {
                    m3.oxmwwwfdhm oxmwwwfdhmVar2 = (m3.oxmwwwfdhm) y2.iobyxmoadg.eablkybsjg(oxmwwwfdhmVarArr3[i18]);
                    oxmwwwfdhmVarArr2[i18] = oxmwwwfdhmVarArr3[i18];
                    this.f11234jyumaefscl.put(oxmwwwfdhmVar2, Integer.valueOf(i17));
                    z13 = true;
                } else if (iArr[i18] == i17) {
                    y2.iobyxmoadg.lqeggnwhkg(oxmwwwfdhmVarArr3[i18] == 0);
                }
            }
            if (z13) {
                arrayList2.add(this.f11238zdlpuopuiu[i17]);
            }
            i15 = i17 + 1;
            arrayList = arrayList2;
            objArr = objArr2;
            i13 = 0;
            num = null;
        }
        int i19 = i13;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(oxmwwwfdhmVarArr2, i19, oxmwwwfdhmVarArr, i19, length);
        this.f11239zynmafqrjb = (vdvldrhtss[]) arrayList3.toArray(new vdvldrhtss[i19]);
        this.f11232istkbnxepw = this.f11233iwizpuwonk.iobyxmoadg(arrayList3, com.google.common.collect.lereixgezr.nufgyqmvbu(arrayList3, new xa.eablkybsjg() { // from class: androidx.media3.exoplayer.source.yggfygwlhe
            @Override // xa.eablkybsjg
            public final Object apply(Object obj) {
                return jyumaefscl.wflxmlrfwp((vdvldrhtss) obj);
            }
        }));
        return j14;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public boolean ppxfxbqfkf() {
        return this.f11232istkbnxepw.ppxfxbqfkf();
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void rgvfuqvkyq(vdvldrhtss.iobyxmoadg iobyxmoadgVar, long j13) {
        this.f11235lereixgezr = iobyxmoadgVar;
        Collections.addAll(this.f11230cqumvgiudr, this.f11238zdlpuopuiu);
        for (vdvldrhtss vdvldrhtssVar : this.f11238zdlpuopuiu) {
            vdvldrhtssVar.rgvfuqvkyq(this, j13);
        }
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public m3.iwizpuwonk vdvldrhtss() {
        return (m3.iwizpuwonk) y2.iobyxmoadg.eablkybsjg(this.f11236pmvmpeiblj);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public long wkgbmnqykc() {
        return this.f11232istkbnxepw.wkgbmnqykc();
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long yggfygwlhe(long j13, hkdspvbjdz hkdspvbjdzVar) {
        vdvldrhtss[] vdvldrhtssVarArr = this.f11239zynmafqrjb;
        return (vdvldrhtssVarArr.length > 0 ? vdvldrhtssVarArr[0] : this.f11238zdlpuopuiu[0]).yggfygwlhe(j13, hkdspvbjdzVar);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void zdlpuopuiu(long j13, boolean z13) {
        for (vdvldrhtss vdvldrhtssVar : this.f11239zynmafqrjb) {
            vdvldrhtssVar.zdlpuopuiu(j13, z13);
        }
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public long zoijcleaow() {
        return this.f11232istkbnxepw.zoijcleaow();
    }
}
