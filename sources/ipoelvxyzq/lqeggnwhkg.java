package ipoelvxyzq;

import androidx.collection.dsvhmnatus;
import androidx.collection.ribwqtqdhb;
import androidx.collection.wypolnanlu;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {
    public static final void dxjokdxxww(dsvhmnatus dsvhmnatusVar, Object obj, Object obj2) {
        dsvhmnatusVar.cqumvgiudr(obj, obj2);
    }

    public static final boolean eablkybsjg(dsvhmnatus dsvhmnatusVar, Object obj) {
        return dsvhmnatusVar.ppxfxbqfkf(obj);
    }

    public static final int gxszxtbevo(dsvhmnatus dsvhmnatusVar) {
        return dsvhmnatusVar.lqeggnwhkg();
    }

    public static final void iobyxmoadg(dsvhmnatus dsvhmnatusVar, Object obj, Object obj2) {
        int iAgtfadlqog = dsvhmnatusVar.agtfadlqog(obj);
        int i13 = 0;
        int i14 = 1;
        boolean z13 = iAgtfadlqog < 0;
        gtknphoqwx gtknphoqwxVar = null;
        Object obj3 = z13 ? null : dsvhmnatusVar.f4300ppxfxbqfkf[iAgtfadlqog];
        if (obj3 != null) {
            if (obj3 instanceof wypolnanlu) {
                zdlpuopuiu.nufgyqmvbu(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                ((wypolnanlu) obj3).nufgyqmvbu(obj2);
            } else if (obj3 != obj2) {
                wypolnanlu wypolnanluVar = new wypolnanlu(i13, i14, gtknphoqwxVar);
                zdlpuopuiu.nufgyqmvbu(obj3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                wypolnanluVar.nufgyqmvbu(obj3);
                wypolnanluVar.nufgyqmvbu(obj2);
                obj2 = wypolnanluVar;
            }
            obj2 = obj3;
        }
        if (!z13) {
            dsvhmnatusVar.f4300ppxfxbqfkf[iAgtfadlqog] = obj2;
            return;
        }
        int i15 = ~iAgtfadlqog;
        dsvhmnatusVar.f4302zoijcleaow[i15] = obj;
        dsvhmnatusVar.f4300ppxfxbqfkf[i15] = obj2;
    }

    public static final boolean lqeggnwhkg(dsvhmnatus dsvhmnatusVar, Object obj, Object obj2) {
        Object objEablkybsjg = dsvhmnatusVar.eablkybsjg(obj);
        if (objEablkybsjg == null) {
            return false;
        }
        if (!(objEablkybsjg instanceof wypolnanlu)) {
            if (!zdlpuopuiu.eablkybsjg(objEablkybsjg, obj2)) {
                return false;
            }
            dsvhmnatusVar.yggfygwlhe(obj);
            return true;
        }
        wypolnanlu wypolnanluVar = (wypolnanlu) objEablkybsjg;
        boolean zEsjtqupxsv = wypolnanluVar.esjtqupxsv(obj2);
        if (zEsjtqupxsv && wypolnanluVar.wkgbmnqykc()) {
            dsvhmnatusVar.yggfygwlhe(obj);
        }
        return zEsjtqupxsv;
    }

    public static final void nufgyqmvbu(dsvhmnatus dsvhmnatusVar, Object obj) {
        boolean zWkgbmnqykc;
        long[] jArr = dsvhmnatusVar.f4299iobyxmoadg;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128) {
                        int i16 = (i13 << 3) + i15;
                        Object obj2 = dsvhmnatusVar.f4302zoijcleaow[i16];
                        Object obj3 = dsvhmnatusVar.f4300ppxfxbqfkf[i16];
                        if (obj3 instanceof wypolnanlu) {
                            zdlpuopuiu.nufgyqmvbu(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            wypolnanlu wypolnanluVar = (wypolnanlu) obj3;
                            wypolnanluVar.esjtqupxsv(obj);
                            zWkgbmnqykc = wypolnanluVar.wkgbmnqykc();
                        } else {
                            zWkgbmnqykc = obj3 == obj;
                        }
                        if (zWkgbmnqykc) {
                            dsvhmnatusVar.jyumaefscl(i16);
                        }
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    public static dsvhmnatus ppxfxbqfkf(dsvhmnatus dsvhmnatusVar) {
        return dsvhmnatusVar;
    }

    public static /* synthetic */ dsvhmnatus wkgbmnqykc(dsvhmnatus dsvhmnatusVar, int i13, gtknphoqwx gtknphoqwxVar) {
        if ((i13 & 1) != 0) {
            dsvhmnatusVar = ribwqtqdhb.zoijcleaow();
        }
        return ppxfxbqfkf(dsvhmnatusVar);
    }

    public static final void zoijcleaow(dsvhmnatus dsvhmnatusVar) {
        dsvhmnatusVar.gtknphoqwx();
    }
}
