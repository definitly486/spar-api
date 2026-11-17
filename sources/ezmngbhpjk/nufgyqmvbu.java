package ezmngbhpjk;

import androidx.compose.runtime.c;
import androidx.compose.runtime.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Object f32445iobyxmoadg = new Object();

    public static final zoijcleaow eablkybsjg(int i13, boolean z13, Object obj, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1573003438, i14, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:1371)");
        }
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new lqeggnwhkg(i13, z13, obj);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) objYadqdtsiqt;
        lqeggnwhkgVar.jyumaefscl(obj);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return lqeggnwhkgVar;
    }

    public static final boolean gxszxtbevo(c cVar, c cVar2) {
        if (cVar != null) {
            if ((cVar instanceof e) && (cVar2 instanceof e)) {
                e eVar = (e) cVar;
                if (!eVar.yggfygwlhe() || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cVar, cVar2) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eVar.nufgyqmvbu(), ((e) cVar2).nufgyqmvbu())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final int iobyxmoadg(int i13, int i14) {
        return i13 << (((i14 % 10) * 3) + 1);
    }

    public static final int lqeggnwhkg(int i13) {
        return iobyxmoadg(1, i13);
    }

    public static final zoijcleaow ppxfxbqfkf(int i13, boolean z13, Object obj) {
        return new lqeggnwhkg(i13, z13, obj);
    }

    public static final int wkgbmnqykc(int i13) {
        return iobyxmoadg(2, i13);
    }

    public static final zoijcleaow zoijcleaow(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13, boolean z13, Object obj) {
        lqeggnwhkg lqeggnwhkgVar;
        draadjrbmkVar.ylkuphrtab(Integer.rotateLeft(i13, 1), f32445iobyxmoadg);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            lqeggnwhkgVar = new lqeggnwhkg(i13, z13, obj);
            draadjrbmkVar.jyumaefscl(lqeggnwhkgVar);
        } else {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objYadqdtsiqt, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            lqeggnwhkgVar = (lqeggnwhkg) objYadqdtsiqt;
            lqeggnwhkgVar.jyumaefscl(obj);
        }
        draadjrbmkVar.mbcevpiqjq();
        return lqeggnwhkgVar;
    }
}
