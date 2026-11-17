package androidx.collection;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class esjtqupxsv implements Cloneable {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public /* synthetic */ int f4267iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public /* synthetic */ Object[] f4268jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ long[] f4269yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ boolean f4270zdlpuopuiu;

    public esjtqupxsv() {
        this(0, 1, null);
    }

    public Object agtfadlqog(int i13) {
        if (!(i13 >= 0 && i13 < this.f4267iwizpuwonk)) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("Expected index to be within 0..size()-1, but was " + i13);
        }
        if (this.f4270zdlpuopuiu) {
            int i14 = this.f4267iwizpuwonk;
            long[] jArr = this.f4269yggfygwlhe;
            Object[] objArr = this.f4268jyumaefscl;
            int i15 = 0;
            for (int i16 = 0; i16 < i14; i16++) {
                Object obj = objArr[i16];
                if (obj != lereixgezr.f4330iobyxmoadg) {
                    if (i16 != i15) {
                        jArr[i15] = jArr[i16];
                        objArr[i15] = obj;
                        objArr[i16] = null;
                    }
                    i15++;
                }
            }
            this.f4270zdlpuopuiu = false;
            this.f4267iwizpuwonk = i15;
        }
        return this.f4268jyumaefscl[i13];
    }

    public void draadjrbmk(int i13) {
        if (this.f4268jyumaefscl[i13] != lereixgezr.f4330iobyxmoadg) {
            this.f4268jyumaefscl[i13] = lereixgezr.f4330iobyxmoadg;
            this.f4270zdlpuopuiu = true;
        }
    }

    public int eablkybsjg(long j13) {
        if (this.f4270zdlpuopuiu) {
            int i13 = this.f4267iwizpuwonk;
            long[] jArr = this.f4269yggfygwlhe;
            Object[] objArr = this.f4268jyumaefscl;
            int i14 = 0;
            for (int i15 = 0; i15 < i13; i15++) {
                Object obj = objArr[i15];
                if (obj != lereixgezr.f4330iobyxmoadg) {
                    if (i15 != i14) {
                        jArr[i14] = jArr[i15];
                        objArr[i14] = obj;
                        objArr[i15] = null;
                    }
                    i14++;
                }
            }
            this.f4270zdlpuopuiu = false;
            this.f4267iwizpuwonk = i14;
        }
        return jlmebxxoox.iobyxmoadg.zoijcleaow(this.f4269yggfygwlhe, this.f4267iwizpuwonk, j13);
    }

    public void gtknphoqwx(long j13) {
        int iZoijcleaow = jlmebxxoox.iobyxmoadg.zoijcleaow(this.f4269yggfygwlhe, this.f4267iwizpuwonk, j13);
        if (iZoijcleaow < 0 || this.f4268jyumaefscl[iZoijcleaow] == lereixgezr.f4330iobyxmoadg) {
            return;
        }
        this.f4268jyumaefscl[iZoijcleaow] = lereixgezr.f4330iobyxmoadg;
        this.f4270zdlpuopuiu = true;
    }

    public boolean gxszxtbevo() {
        return wflxmlrfwp() == 0;
    }

    public void iobyxmoadg() {
        int i13 = this.f4267iwizpuwonk;
        Object[] objArr = this.f4268jyumaefscl;
        for (int i14 = 0; i14 < i13; i14++) {
            objArr[i14] = null;
        }
        this.f4267iwizpuwonk = 0;
        this.f4270zdlpuopuiu = false;
    }

    public long lqeggnwhkg(int i13) {
        if (!(i13 >= 0 && i13 < this.f4267iwizpuwonk)) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("Expected index to be within 0..size()-1, but was " + i13);
        }
        if (this.f4270zdlpuopuiu) {
            int i14 = this.f4267iwizpuwonk;
            long[] jArr = this.f4269yggfygwlhe;
            Object[] objArr = this.f4268jyumaefscl;
            int i15 = 0;
            for (int i16 = 0; i16 < i14; i16++) {
                Object obj = objArr[i16];
                if (obj != lereixgezr.f4330iobyxmoadg) {
                    if (i16 != i15) {
                        jArr[i15] = jArr[i16];
                        objArr[i15] = obj;
                        objArr[i16] = null;
                    }
                    i15++;
                }
            }
            this.f4270zdlpuopuiu = false;
            this.f4267iwizpuwonk = i15;
        }
        return this.f4269yggfygwlhe[i13];
    }

    public void nufgyqmvbu(long j13, Object obj) {
        int iZoijcleaow = jlmebxxoox.iobyxmoadg.zoijcleaow(this.f4269yggfygwlhe, this.f4267iwizpuwonk, j13);
        if (iZoijcleaow >= 0) {
            this.f4268jyumaefscl[iZoijcleaow] = obj;
            return;
        }
        int i13 = ~iZoijcleaow;
        if (i13 < this.f4267iwizpuwonk && this.f4268jyumaefscl[i13] == lereixgezr.f4330iobyxmoadg) {
            this.f4269yggfygwlhe[i13] = j13;
            this.f4268jyumaefscl[i13] = obj;
            return;
        }
        if (this.f4270zdlpuopuiu) {
            int i14 = this.f4267iwizpuwonk;
            long[] jArr = this.f4269yggfygwlhe;
            if (i14 >= jArr.length) {
                Object[] objArr = this.f4268jyumaefscl;
                int i15 = 0;
                for (int i16 = 0; i16 < i14; i16++) {
                    Object obj2 = objArr[i16];
                    if (obj2 != lereixgezr.f4330iobyxmoadg) {
                        if (i16 != i15) {
                            jArr[i15] = jArr[i16];
                            objArr[i15] = obj2;
                            objArr[i16] = null;
                        }
                        i15++;
                    }
                }
                this.f4270zdlpuopuiu = false;
                this.f4267iwizpuwonk = i15;
                i13 = ~jlmebxxoox.iobyxmoadg.zoijcleaow(this.f4269yggfygwlhe, i15, j13);
            }
        }
        int i17 = this.f4267iwizpuwonk;
        if (i17 >= this.f4269yggfygwlhe.length) {
            int iGxszxtbevo = jlmebxxoox.iobyxmoadg.gxszxtbevo(i17 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f4269yggfygwlhe, iGxszxtbevo);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(jArrCopyOf, "copyOf(...)");
            this.f4269yggfygwlhe = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f4268jyumaefscl, iGxszxtbevo);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
            this.f4268jyumaefscl = objArrCopyOf;
        }
        int i18 = this.f4267iwizpuwonk;
        if (i18 - i13 != 0) {
            long[] jArr2 = this.f4269yggfygwlhe;
            int i19 = i13 + 1;
            hg.agtfadlqog.wflxmlrfwp(jArr2, jArr2, i19, i13, i18);
            Object[] objArr2 = this.f4268jyumaefscl;
            hg.agtfadlqog.agtfadlqog(objArr2, objArr2, i19, i13, this.f4267iwizpuwonk);
        }
        this.f4269yggfygwlhe[i13] = j13;
        this.f4268jyumaefscl[i13] = obj;
        this.f4267iwizpuwonk++;
    }

    public boolean ppxfxbqfkf(long j13) {
        return eablkybsjg(j13) >= 0;
    }

    public String toString() {
        if (wflxmlrfwp() <= 0) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder(this.f4267iwizpuwonk * 28);
        sb3.append('{');
        int i13 = this.f4267iwizpuwonk;
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 > 0) {
                sb3.append(", ");
            }
            sb3.append(lqeggnwhkg(i14));
            sb3.append('=');
            Object objAgtfadlqog = agtfadlqog(i14);
            if (objAgtfadlqog != sb3) {
                sb3.append(objAgtfadlqog);
            } else {
                sb3.append("(this Map)");
            }
        }
        sb3.append('}');
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public int wflxmlrfwp() {
        if (this.f4270zdlpuopuiu) {
            int i13 = this.f4267iwizpuwonk;
            long[] jArr = this.f4269yggfygwlhe;
            Object[] objArr = this.f4268jyumaefscl;
            int i14 = 0;
            for (int i15 = 0; i15 < i13; i15++) {
                Object obj = objArr[i15];
                if (obj != lereixgezr.f4330iobyxmoadg) {
                    if (i15 != i14) {
                        jArr[i14] = jArr[i15];
                        objArr[i14] = obj;
                        objArr[i15] = null;
                    }
                    i14++;
                }
            }
            this.f4270zdlpuopuiu = false;
            this.f4267iwizpuwonk = i14;
        }
        return this.f4267iwizpuwonk;
    }

    public Object wkgbmnqykc(long j13) {
        int iZoijcleaow = jlmebxxoox.iobyxmoadg.zoijcleaow(this.f4269yggfygwlhe, this.f4267iwizpuwonk, j13);
        if (iZoijcleaow < 0 || this.f4268jyumaefscl[iZoijcleaow] == lereixgezr.f4330iobyxmoadg) {
            return null;
        }
        return this.f4268jyumaefscl[iZoijcleaow];
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public esjtqupxsv clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        esjtqupxsv esjtqupxsvVar = (esjtqupxsv) objClone;
        esjtqupxsvVar.f4269yggfygwlhe = (long[]) this.f4269yggfygwlhe.clone();
        esjtqupxsvVar.f4268jyumaefscl = (Object[]) this.f4268jyumaefscl.clone();
        return esjtqupxsvVar;
    }

    public esjtqupxsv(int i13) {
        if (i13 == 0) {
            this.f4269yggfygwlhe = jlmebxxoox.iobyxmoadg.f51696zoijcleaow;
            this.f4268jyumaefscl = jlmebxxoox.iobyxmoadg.f51695ppxfxbqfkf;
        } else {
            int iGxszxtbevo = jlmebxxoox.iobyxmoadg.gxszxtbevo(i13);
            this.f4269yggfygwlhe = new long[iGxszxtbevo];
            this.f4268jyumaefscl = new Object[iGxszxtbevo];
        }
    }

    public /* synthetic */ esjtqupxsv(int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 10 : i13);
    }
}
