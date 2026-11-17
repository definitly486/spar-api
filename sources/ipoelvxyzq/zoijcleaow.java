package ipoelvxyzq;

import androidx.collection.dsvhmnatus;
import androidx.collection.jpowsppfya;
import androidx.collection.ntlheqmsrt;
import hg.agtfadlqog;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.mbcevpiqjq;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import zg.btonecajqb;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dsvhmnatus f49176iobyxmoadg;

    private /* synthetic */ zoijcleaow(dsvhmnatus dsvhmnatusVar) {
        this.f49176iobyxmoadg = dsvhmnatusVar;
    }

    public static String agtfadlqog(dsvhmnatus dsvhmnatusVar) {
        return "MultiValueMap(map=" + dsvhmnatusVar + ')';
    }

    public static final boolean btonecajqb(dsvhmnatus dsvhmnatusVar) {
        return dsvhmnatusVar.dxjokdxxww();
    }

    public static final Object draadjrbmk(dsvhmnatus dsvhmnatusVar, Object obj) {
        Object objEablkybsjg = dsvhmnatusVar.eablkybsjg(obj);
        if (objEablkybsjg == null) {
            return null;
        }
        if (!(objEablkybsjg instanceof jpowsppfya)) {
            dsvhmnatusVar.yggfygwlhe(obj);
            return objEablkybsjg;
        }
        jpowsppfya jpowsppfyaVar = (jpowsppfya) objEablkybsjg;
        Object objIobyxmoadg = iobyxmoadg.iobyxmoadg(jpowsppfyaVar);
        zdlpuopuiu.nufgyqmvbu(objIobyxmoadg, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (jpowsppfyaVar.lqeggnwhkg()) {
            dsvhmnatusVar.yggfygwlhe(obj);
        }
        if (jpowsppfyaVar.eablkybsjg() == 1) {
            dsvhmnatusVar.cqumvgiudr(obj, jpowsppfyaVar.ppxfxbqfkf());
        }
        return objIobyxmoadg;
    }

    public static final boolean dxjokdxxww(dsvhmnatus dsvhmnatusVar) {
        return dsvhmnatusVar.nufgyqmvbu();
    }

    public static /* synthetic */ dsvhmnatus eablkybsjg(dsvhmnatus dsvhmnatusVar, int i13, gtknphoqwx gtknphoqwxVar) {
        int i14 = 1;
        if ((i13 & 1) != 0) {
            dsvhmnatusVar = new dsvhmnatus(0, i14, null);
        }
        return wkgbmnqykc(dsvhmnatusVar);
    }

    public static final Object gtknphoqwx(dsvhmnatus dsvhmnatusVar, Object obj) {
        Object objEablkybsjg = dsvhmnatusVar.eablkybsjg(obj);
        if (objEablkybsjg == null) {
            return null;
        }
        if (!(objEablkybsjg instanceof jpowsppfya)) {
            dsvhmnatusVar.yggfygwlhe(obj);
            return objEablkybsjg;
        }
        jpowsppfya jpowsppfyaVar = (jpowsppfya) objEablkybsjg;
        Object objZynmafqrjb = jpowsppfyaVar.zynmafqrjb(0);
        if (jpowsppfyaVar.lqeggnwhkg()) {
            dsvhmnatusVar.yggfygwlhe(obj);
        }
        if (jpowsppfyaVar.eablkybsjg() == 1) {
            dsvhmnatusVar.cqumvgiudr(obj, jpowsppfyaVar.ppxfxbqfkf());
        }
        return objZynmafqrjb;
    }

    public static final boolean gxszxtbevo(dsvhmnatus dsvhmnatusVar, Object obj) {
        return dsvhmnatusVar.zoijcleaow(obj);
    }

    public static final void iobyxmoadg(dsvhmnatus dsvhmnatusVar, Object obj, Object obj2) {
        int iAgtfadlqog = dsvhmnatusVar.agtfadlqog(obj);
        boolean z13 = iAgtfadlqog < 0;
        Object obj3 = z13 ? null : dsvhmnatusVar.f4300ppxfxbqfkf[iAgtfadlqog];
        mbcevpiqjq.draadjrbmk(obj3);
        if (obj3 != null) {
            if (obj3 instanceof jpowsppfya) {
                zdlpuopuiu.nufgyqmvbu(obj3, "null cannot be cast to non-null type androidx.collection.MutableObjectList<kotlin.Any>");
                jpowsppfya jpowsppfyaVar = (jpowsppfya) obj3;
                jpowsppfyaVar.agtfadlqog(obj2);
                obj2 = jpowsppfyaVar;
            } else {
                obj2 = ntlheqmsrt.nufgyqmvbu(obj3, obj2);
            }
        }
        if (!z13) {
            dsvhmnatusVar.f4300ppxfxbqfkf[iAgtfadlqog] = obj2;
            return;
        }
        int i13 = ~iAgtfadlqog;
        dsvhmnatusVar.f4302zoijcleaow[i13] = obj;
        dsvhmnatusVar.f4300ppxfxbqfkf[i13] = obj2;
    }

    public static boolean lqeggnwhkg(dsvhmnatus dsvhmnatusVar, Object obj) {
        return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(dsvhmnatusVar, ((zoijcleaow) obj).ojitshcjhn());
    }

    public static int nufgyqmvbu(dsvhmnatus dsvhmnatusVar) {
        return dsvhmnatusVar.hashCode();
    }

    public static final void ppxfxbqfkf(dsvhmnatus dsvhmnatusVar) {
        dsvhmnatusVar.gtknphoqwx();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0066 A[LOOP:0: B:9:0x001d->B:22:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0069 A[EDGE_INSN: B:25:0x0069->B:23:0x0069 BREAK  A[LOOP:0: B:9:0x001d->B:22:0x0066], SYNTHETIC] */
    public static final androidx.collection.mbcevpiqjq rgvfuqvkyq(dsvhmnatus dsvhmnatusVar) {
        if (dsvhmnatusVar.nufgyqmvbu()) {
            return ntlheqmsrt.gxszxtbevo();
        }
        jpowsppfya jpowsppfyaVar = new jpowsppfya(0, 1, null);
        Object[] objArr = dsvhmnatusVar.f4300ppxfxbqfkf;
        long[] jArr = dsvhmnatusVar.f4299iobyxmoadg;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128) {
                            Object obj = objArr[(i13 << 3) + i15];
                            if (obj instanceof jpowsppfya) {
                                zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>");
                                jpowsppfyaVar.rgvfuqvkyq((jpowsppfya) obj);
                            } else {
                                zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                jpowsppfyaVar.agtfadlqog(obj);
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                    if (i13 != length) {
                        break;
                    }
                    i13++;
                }
            }
        }
        return jpowsppfyaVar;
    }

    public static final void wflxmlrfwp(dsvhmnatus dsvhmnatusVar, Object obj, draadjrbmk draadjrbmkVar) {
        Object objEablkybsjg = dsvhmnatusVar.eablkybsjg(obj);
        if (objEablkybsjg != null) {
            if (!(objEablkybsjg instanceof jpowsppfya)) {
                if (((Boolean) draadjrbmkVar.invoke(objEablkybsjg)).booleanValue()) {
                    dsvhmnatusVar.yggfygwlhe(obj);
                    return;
                }
                return;
            }
            jpowsppfya jpowsppfyaVar = (jpowsppfya) objEablkybsjg;
            int i13 = jpowsppfyaVar.f4344zoijcleaow;
            Object[] objArr = jpowsppfyaVar.f4343iobyxmoadg;
            int i14 = 0;
            btonecajqb btonecajqbVarJyumaefscl = zg.gtknphoqwx.jyumaefscl(0, i13);
            int iWkgbmnqykc = btonecajqbVarJyumaefscl.wkgbmnqykc();
            int iEablkybsjg = btonecajqbVarJyumaefscl.eablkybsjg();
            if (iWkgbmnqykc <= iEablkybsjg) {
                while (true) {
                    objArr[iWkgbmnqykc - i14] = objArr[iWkgbmnqykc];
                    if (((Boolean) draadjrbmkVar.invoke(objArr[iWkgbmnqykc])).booleanValue()) {
                        i14++;
                    }
                    if (iWkgbmnqykc == iEablkybsjg) {
                        break;
                    } else {
                        iWkgbmnqykc++;
                    }
                }
            }
            agtfadlqog.lereixgezr(objArr, null, i13 - i14, i13);
            jpowsppfyaVar.f4344zoijcleaow -= i14;
            if (jpowsppfyaVar.lqeggnwhkg()) {
                dsvhmnatusVar.yggfygwlhe(obj);
            }
            if (jpowsppfyaVar.eablkybsjg() == 0) {
                dsvhmnatusVar.cqumvgiudr(obj, jpowsppfyaVar.ppxfxbqfkf());
            }
        }
    }

    public static dsvhmnatus wkgbmnqykc(dsvhmnatus dsvhmnatusVar) {
        return dsvhmnatusVar;
    }

    public static final /* synthetic */ zoijcleaow zoijcleaow(dsvhmnatus dsvhmnatusVar) {
        return new zoijcleaow(dsvhmnatusVar);
    }

    public boolean equals(Object obj) {
        return lqeggnwhkg(this.f49176iobyxmoadg, obj);
    }

    public int hashCode() {
        return nufgyqmvbu(this.f49176iobyxmoadg);
    }

    public final /* synthetic */ dsvhmnatus ojitshcjhn() {
        return this.f49176iobyxmoadg;
    }

    public String toString() {
        return agtfadlqog(this.f49176iobyxmoadg);
    }
}
