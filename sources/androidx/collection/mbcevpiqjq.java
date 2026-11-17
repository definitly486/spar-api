package androidx.collection;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class mbcevpiqjq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public Object[] f4343iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public int f4344zoijcleaow;

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {
        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Object obj) {
            return obj == mbcevpiqjq.this ? "(this)" : String.valueOf(obj);
        }
    }

    public /* synthetic */ mbcevpiqjq(int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(i13);
    }

    public static /* synthetic */ String btonecajqb(mbcevpiqjq mbcevpiqjqVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i13, CharSequence charSequence4, tg.draadjrbmk draadjrbmkVar, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i14 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i14 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i14 & 4) == 0 ? charSequence3 : "";
        if ((i14 & 8) != 0) {
            i13 = -1;
        }
        int i15 = i13;
        if ((i14 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i14 & 32) != 0) {
            draadjrbmkVar = null;
        }
        return mbcevpiqjqVar.dxjokdxxww(charSequence, charSequence5, charSequence6, i15, charSequence7, draadjrbmkVar);
    }

    public final void draadjrbmk(int i13) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Index ");
        sb3.append(i13);
        sb3.append(" must be in 0..");
        sb3.append(this.f4344zoijcleaow - 1);
        jlmebxxoox.wkgbmnqykc.ppxfxbqfkf(sb3.toString());
    }

    public final String dxjokdxxww(CharSequence separator, CharSequence prefix, CharSequence postfix, int i13, CharSequence truncated, tg.draadjrbmk draadjrbmkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(separator, "separator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(postfix, "postfix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(truncated, "truncated");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(prefix);
        Object[] objArr = this.f4343iobyxmoadg;
        int i14 = this.f4344zoijcleaow;
        for (int i15 = 0; i15 < i14; i15++) {
            Object obj = objArr[i15];
            if (i15 == i13) {
                sb3.append(truncated);
                String string = sb3.toString();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
                return string;
            }
            if (i15 != 0) {
                sb3.append(separator);
            }
            if (draadjrbmkVar == null) {
                sb3.append(obj);
            } else {
                sb3.append((CharSequence) draadjrbmkVar.invoke(obj));
            }
        }
        sb3.append(postfix);
        String string2 = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string2, "toString(...)");
        return string2;
    }

    public final int eablkybsjg() {
        return this.f4344zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (obj instanceof mbcevpiqjq) {
            mbcevpiqjq mbcevpiqjqVar = (mbcevpiqjq) obj;
            int i13 = mbcevpiqjqVar.f4344zoijcleaow;
            int i14 = this.f4344zoijcleaow;
            if (i13 == i14) {
                Object[] objArr = this.f4343iobyxmoadg;
                Object[] objArr2 = mbcevpiqjqVar.f4343iobyxmoadg;
                zg.btonecajqb btonecajqbVarJyumaefscl = zg.gtknphoqwx.jyumaefscl(0, i14);
                int iWkgbmnqykc = btonecajqbVarJyumaefscl.wkgbmnqykc();
                int iEablkybsjg = btonecajqbVarJyumaefscl.eablkybsjg();
                if (iWkgbmnqykc > iEablkybsjg) {
                    return true;
                }
                while (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(objArr[iWkgbmnqykc], objArr2[iWkgbmnqykc])) {
                    if (iWkgbmnqykc == iEablkybsjg) {
                        return true;
                    }
                    iWkgbmnqykc++;
                }
                return false;
            }
        }
        return false;
    }

    public final int gtknphoqwx(Object obj) {
        if (obj == null) {
            Object[] objArr = this.f4343iobyxmoadg;
            for (int i13 = this.f4344zoijcleaow - 1; -1 < i13; i13--) {
                if (objArr[i13] == null) {
                    return i13;
                }
            }
        } else {
            Object[] objArr2 = this.f4343iobyxmoadg;
            for (int i14 = this.f4344zoijcleaow - 1; -1 < i14; i14--) {
                if (obj.equals(objArr2[i14])) {
                    return i14;
                }
            }
        }
        return -1;
    }

    public final int gxszxtbevo(Object obj) {
        int i13 = 0;
        if (obj == null) {
            Object[] objArr = this.f4343iobyxmoadg;
            int i14 = this.f4344zoijcleaow;
            while (i13 < i14) {
                if (objArr[i13] == null) {
                    return i13;
                }
                i13++;
            }
            return -1;
        }
        Object[] objArr2 = this.f4343iobyxmoadg;
        int i15 = this.f4344zoijcleaow;
        while (i13 < i15) {
            if (obj.equals(objArr2[i13])) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    public int hashCode() {
        Object[] objArr = this.f4343iobyxmoadg;
        int i13 = this.f4344zoijcleaow;
        int iHashCode = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            Object obj = objArr[i14];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean iobyxmoadg(Object obj) {
        return gxszxtbevo(obj) >= 0;
    }

    public final boolean lqeggnwhkg() {
        return this.f4344zoijcleaow == 0;
    }

    public final boolean nufgyqmvbu() {
        return this.f4344zoijcleaow != 0;
    }

    public final Object ppxfxbqfkf() {
        if (lqeggnwhkg()) {
            jlmebxxoox.wkgbmnqykc.wkgbmnqykc("ObjectList is empty.");
        }
        return this.f4343iobyxmoadg[0];
    }

    public String toString() {
        return btonecajqb(this, null, "[", "]", 0, null, new iobyxmoadg(), 25, null);
    }

    public final Object wkgbmnqykc(int i13) {
        if (i13 < 0 || i13 >= this.f4344zoijcleaow) {
            draadjrbmk(i13);
        }
        return this.f4343iobyxmoadg[i13];
    }

    public final boolean zoijcleaow(Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!iobyxmoadg(it.next())) {
                return false;
            }
        }
        return true;
    }

    private mbcevpiqjq(int i13) {
        this.f4343iobyxmoadg = i13 == 0 ? ntlheqmsrt.f4347iobyxmoadg : new Object[i13];
    }
}
