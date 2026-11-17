package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class c1 {
    public static final SnapshotStateList eablkybsjg(Collection collection) {
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }

    public static final SnapshotStateList iobyxmoadg() {
        return new SnapshotStateList();
    }

    public static /* synthetic */ iwxlajgraz ppxfxbqfkf(Object obj, u0 u0Var, int i13, Object obj2) {
        if ((i13 & 2) != 0) {
            u0Var = v0.rgvfuqvkyq();
        }
        return v0.lqeggnwhkg(obj, u0Var);
    }

    public static final i1 wkgbmnqykc(Object obj, draadjrbmk draadjrbmkVar, int i13) {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(-1058319986, i13, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:335)");
        }
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = ppxfxbqfkf(obj, null, 2, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        iwxlajgraz iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
        iwxlajgrazVar.setValue(obj);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        return iwxlajgrazVar;
    }

    public static final iwxlajgraz zoijcleaow(Object obj, u0 u0Var) {
        return d1.iobyxmoadg(obj, u0Var);
    }
}
