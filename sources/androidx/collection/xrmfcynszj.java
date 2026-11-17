package androidx.collection;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class xrmfcynszj implements Cloneable {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public /* synthetic */ int f4403iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public /* synthetic */ Object[] f4404jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ int[] f4405yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ boolean f4406zdlpuopuiu;

    public xrmfcynszj() {
        this(0, 1, null);
    }

    public Object agtfadlqog(int i13, Object obj) {
        int iLqeggnwhkg = lqeggnwhkg(i13);
        if (iLqeggnwhkg < 0) {
            return null;
        }
        Object[] objArr = this.f4404jyumaefscl;
        Object obj2 = objArr[iLqeggnwhkg];
        objArr[iLqeggnwhkg] = obj;
        return obj2;
    }

    public void draadjrbmk(int i13, Object obj) {
        int iIobyxmoadg = jlmebxxoox.iobyxmoadg.iobyxmoadg(this.f4405yggfygwlhe, this.f4403iwizpuwonk, i13);
        if (iIobyxmoadg >= 0) {
            this.f4404jyumaefscl[iIobyxmoadg] = obj;
            return;
        }
        int i14 = ~iIobyxmoadg;
        if (i14 < this.f4403iwizpuwonk && this.f4404jyumaefscl[i14] == metgxyhuhe.f4346iobyxmoadg) {
            this.f4405yggfygwlhe[i14] = i13;
            this.f4404jyumaefscl[i14] = obj;
            return;
        }
        if (this.f4406zdlpuopuiu && this.f4403iwizpuwonk >= this.f4405yggfygwlhe.length) {
            metgxyhuhe.eablkybsjg(this);
            i14 = ~jlmebxxoox.iobyxmoadg.iobyxmoadg(this.f4405yggfygwlhe, this.f4403iwizpuwonk, i13);
        }
        int i15 = this.f4403iwizpuwonk;
        if (i15 >= this.f4405yggfygwlhe.length) {
            int iEablkybsjg = jlmebxxoox.iobyxmoadg.eablkybsjg(i15 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f4405yggfygwlhe, iEablkybsjg);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iArrCopyOf, "copyOf(...)");
            this.f4405yggfygwlhe = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f4404jyumaefscl, iEablkybsjg);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
            this.f4404jyumaefscl = objArrCopyOf;
        }
        int i16 = this.f4403iwizpuwonk;
        if (i16 - i14 != 0) {
            int[] iArr = this.f4405yggfygwlhe;
            int i17 = i14 + 1;
            hg.agtfadlqog.draadjrbmk(iArr, iArr, i17, i14, i16);
            Object[] objArr = this.f4404jyumaefscl;
            hg.agtfadlqog.agtfadlqog(objArr, objArr, i17, i14, this.f4403iwizpuwonk);
        }
        this.f4405yggfygwlhe[i14] = i13;
        this.f4404jyumaefscl[i14] = obj;
        this.f4403iwizpuwonk++;
    }

    public Object eablkybsjg(int i13) {
        return metgxyhuhe.ppxfxbqfkf(this, i13);
    }

    public int gtknphoqwx(int i13) {
        if (this.f4406zdlpuopuiu) {
            metgxyhuhe.eablkybsjg(this);
        }
        return this.f4405yggfygwlhe[i13];
    }

    public Object gxszxtbevo(int i13, Object obj) {
        return metgxyhuhe.wkgbmnqykc(this, i13, obj);
    }

    public void iobyxmoadg(int i13, Object obj) {
        int i14 = this.f4403iwizpuwonk;
        if (i14 != 0 && i13 <= this.f4405yggfygwlhe[i14 - 1]) {
            draadjrbmk(i13, obj);
            return;
        }
        if (this.f4406zdlpuopuiu && i14 >= this.f4405yggfygwlhe.length) {
            metgxyhuhe.eablkybsjg(this);
        }
        int i15 = this.f4403iwizpuwonk;
        if (i15 >= this.f4405yggfygwlhe.length) {
            int iEablkybsjg = jlmebxxoox.iobyxmoadg.eablkybsjg(i15 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f4405yggfygwlhe, iEablkybsjg);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iArrCopyOf, "copyOf(...)");
            this.f4405yggfygwlhe = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f4404jyumaefscl, iEablkybsjg);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
            this.f4404jyumaefscl = objArrCopyOf;
        }
        this.f4405yggfygwlhe[i15] = i13;
        this.f4404jyumaefscl[i15] = obj;
        this.f4403iwizpuwonk = i15 + 1;
    }

    public int lqeggnwhkg(int i13) {
        if (this.f4406zdlpuopuiu) {
            metgxyhuhe.eablkybsjg(this);
        }
        return jlmebxxoox.iobyxmoadg.iobyxmoadg(this.f4405yggfygwlhe, this.f4403iwizpuwonk, i13);
    }

    public int nufgyqmvbu(Object obj) {
        if (this.f4406zdlpuopuiu) {
            metgxyhuhe.eablkybsjg(this);
        }
        int i13 = this.f4403iwizpuwonk;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f4404jyumaefscl[i14] == obj) {
                return i14;
            }
        }
        return -1;
    }

    public int ojitshcjhn() {
        if (this.f4406zdlpuopuiu) {
            metgxyhuhe.eablkybsjg(this);
        }
        return this.f4403iwizpuwonk;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public xrmfcynszj clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        xrmfcynszj xrmfcynszjVar = (xrmfcynszj) objClone;
        xrmfcynszjVar.f4405yggfygwlhe = (int[]) this.f4405yggfygwlhe.clone();
        xrmfcynszjVar.f4404jyumaefscl = (Object[]) this.f4404jyumaefscl.clone();
        return xrmfcynszjVar;
    }

    public Object rgvfuqvkyq(int i13) {
        if (this.f4406zdlpuopuiu) {
            metgxyhuhe.eablkybsjg(this);
        }
        Object[] objArr = this.f4404jyumaefscl;
        if (i13 < objArr.length) {
            return objArr[i13];
        }
        gxszxtbevo gxszxtbevoVar = gxszxtbevo.f4272iobyxmoadg;
        throw new ArrayIndexOutOfBoundsException();
    }

    public String toString() {
        if (ojitshcjhn() <= 0) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder(this.f4403iwizpuwonk * 28);
        sb3.append('{');
        int i13 = this.f4403iwizpuwonk;
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 > 0) {
                sb3.append(", ");
            }
            sb3.append(gtknphoqwx(i14));
            sb3.append('=');
            Object objRgvfuqvkyq = rgvfuqvkyq(i14);
            if (objRgvfuqvkyq != this) {
                sb3.append(objRgvfuqvkyq);
            } else {
                sb3.append("(this Map)");
            }
        }
        sb3.append('}');
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public void wflxmlrfwp(int i13) {
        if (this.f4404jyumaefscl[i13] != metgxyhuhe.f4346iobyxmoadg) {
            this.f4404jyumaefscl[i13] = metgxyhuhe.f4346iobyxmoadg;
            this.f4406zdlpuopuiu = true;
        }
    }

    public boolean wkgbmnqykc(int i13) {
        return lqeggnwhkg(i13) >= 0;
    }

    public void zoijcleaow() {
        int i13 = this.f4403iwizpuwonk;
        Object[] objArr = this.f4404jyumaefscl;
        for (int i14 = 0; i14 < i13; i14++) {
            objArr[i14] = null;
        }
        this.f4403iwizpuwonk = 0;
        this.f4406zdlpuopuiu = false;
    }

    public xrmfcynszj(int i13) {
        if (i13 == 0) {
            this.f4405yggfygwlhe = jlmebxxoox.iobyxmoadg.f51694iobyxmoadg;
            this.f4404jyumaefscl = jlmebxxoox.iobyxmoadg.f51695ppxfxbqfkf;
        } else {
            int iEablkybsjg = jlmebxxoox.iobyxmoadg.eablkybsjg(i13);
            this.f4405yggfygwlhe = new int[iEablkybsjg];
            this.f4404jyumaefscl = new Object[iEablkybsjg];
        }
    }

    public /* synthetic */ xrmfcynszj(int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 10 : i13);
    }
}
