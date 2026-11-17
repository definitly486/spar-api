package uj;

import java.util.List;
import kotlin.KotlinNothingValueException;
import pj.ageimvtcrz;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kcexrzcfyt {
    public static final ageimvtcrz eablkybsjg(vdvldrhtss vdvldrhtssVar, List list) {
        try {
            return vdvldrhtssVar.createDispatcher(list);
        } catch (Throwable th2) {
            return iobyxmoadg(th2, vdvldrhtssVar.hintOnError());
        }
    }

    private static final zdlpuopuiu iobyxmoadg(Throwable th2, String str) throws Throwable {
        if (th2 != null) {
            throw th2;
        }
        wkgbmnqykc();
        throw new KotlinNothingValueException();
    }

    public static final boolean ppxfxbqfkf(ageimvtcrz ageimvtcrzVar) {
        return ageimvtcrzVar.xrmfcynszj() instanceof zdlpuopuiu;
    }

    public static final Void wkgbmnqykc() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    static /* synthetic */ zdlpuopuiu zoijcleaow(Throwable th2, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            th2 = null;
        }
        if ((i13 & 2) != 0) {
            str = null;
        }
        return iobyxmoadg(th2, str);
    }
}
