package t7;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
abstract class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109976iobyxmoadg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("x", "y");

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f109977iobyxmoadg;

        static {
            int[] iArr = new int[u7.ppxfxbqfkf.zoijcleaow.values().length];
            f109977iobyxmoadg = iArr;
            try {
                iArr[u7.ppxfxbqfkf.zoijcleaow.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f109977iobyxmoadg[u7.ppxfxbqfkf.zoijcleaow.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f109977iobyxmoadg[u7.ppxfxbqfkf.zoijcleaow.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static PointF eablkybsjg(u7.ppxfxbqfkf ppxfxbqfkfVar, float f13) {
        int i13 = iobyxmoadg.f109977iobyxmoadg[ppxfxbqfkfVar.zdlpuopuiu().ordinal()];
        if (i13 == 1) {
            return zoijcleaow(ppxfxbqfkfVar, f13);
        }
        if (i13 == 2) {
            return iobyxmoadg(ppxfxbqfkfVar, f13);
        }
        if (i13 == 3) {
            return ppxfxbqfkf(ppxfxbqfkfVar, f13);
        }
        throw new IllegalArgumentException("Unknown point starts with " + ppxfxbqfkfVar.zdlpuopuiu());
    }

    static List gxszxtbevo(u7.ppxfxbqfkf ppxfxbqfkfVar, float f13) {
        ArrayList arrayList = new ArrayList();
        ppxfxbqfkfVar.wkgbmnqykc();
        while (ppxfxbqfkfVar.zdlpuopuiu() == u7.ppxfxbqfkf.zoijcleaow.BEGIN_ARRAY) {
            ppxfxbqfkfVar.wkgbmnqykc();
            arrayList.add(eablkybsjg(ppxfxbqfkfVar, f13));
            ppxfxbqfkfVar.nufgyqmvbu();
        }
        ppxfxbqfkfVar.nufgyqmvbu();
        return arrayList;
    }

    private static PointF iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, float f13) {
        ppxfxbqfkfVar.wkgbmnqykc();
        float fAgtfadlqog = (float) ppxfxbqfkfVar.agtfadlqog();
        float fAgtfadlqog2 = (float) ppxfxbqfkfVar.agtfadlqog();
        while (ppxfxbqfkfVar.zdlpuopuiu() != u7.ppxfxbqfkf.zoijcleaow.END_ARRAY) {
            ppxfxbqfkfVar.pmvmpeiblj();
        }
        ppxfxbqfkfVar.nufgyqmvbu();
        return new PointF(fAgtfadlqog * f13, fAgtfadlqog2 * f13);
    }

    static float lqeggnwhkg(u7.ppxfxbqfkf ppxfxbqfkfVar) {
        u7.ppxfxbqfkf.zoijcleaow zoijcleaowVarZdlpuopuiu = ppxfxbqfkfVar.zdlpuopuiu();
        int i13 = iobyxmoadg.f109977iobyxmoadg[zoijcleaowVarZdlpuopuiu.ordinal()];
        if (i13 == 1) {
            return (float) ppxfxbqfkfVar.agtfadlqog();
        }
        if (i13 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + zoijcleaowVarZdlpuopuiu);
        }
        ppxfxbqfkfVar.wkgbmnqykc();
        float fAgtfadlqog = (float) ppxfxbqfkfVar.agtfadlqog();
        while (ppxfxbqfkfVar.btonecajqb()) {
            ppxfxbqfkfVar.pmvmpeiblj();
        }
        ppxfxbqfkfVar.nufgyqmvbu();
        return fAgtfadlqog;
    }

    private static PointF ppxfxbqfkf(u7.ppxfxbqfkf ppxfxbqfkfVar, float f13) {
        ppxfxbqfkfVar.lqeggnwhkg();
        float fLqeggnwhkg = 0.0f;
        float fLqeggnwhkg2 = 0.0f;
        while (ppxfxbqfkfVar.btonecajqb()) {
            int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109976iobyxmoadg);
            if (iCqumvgiudr == 0) {
                fLqeggnwhkg = lqeggnwhkg(ppxfxbqfkfVar);
            } else if (iCqumvgiudr != 1) {
                ppxfxbqfkfVar.lereixgezr();
                ppxfxbqfkfVar.pmvmpeiblj();
            } else {
                fLqeggnwhkg2 = lqeggnwhkg(ppxfxbqfkfVar);
            }
        }
        ppxfxbqfkfVar.dxjokdxxww();
        return new PointF(fLqeggnwhkg * f13, fLqeggnwhkg2 * f13);
    }

    static int wkgbmnqykc(u7.ppxfxbqfkf ppxfxbqfkfVar) {
        ppxfxbqfkfVar.wkgbmnqykc();
        int iAgtfadlqog = (int) (ppxfxbqfkfVar.agtfadlqog() * 255.0d);
        int iAgtfadlqog2 = (int) (ppxfxbqfkfVar.agtfadlqog() * 255.0d);
        int iAgtfadlqog3 = (int) (ppxfxbqfkfVar.agtfadlqog() * 255.0d);
        while (ppxfxbqfkfVar.btonecajqb()) {
            ppxfxbqfkfVar.pmvmpeiblj();
        }
        ppxfxbqfkfVar.nufgyqmvbu();
        return Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, iAgtfadlqog, iAgtfadlqog2, iAgtfadlqog3);
    }

    private static PointF zoijcleaow(u7.ppxfxbqfkf ppxfxbqfkfVar, float f13) {
        float fAgtfadlqog = (float) ppxfxbqfkfVar.agtfadlqog();
        float fAgtfadlqog2 = (float) ppxfxbqfkfVar.agtfadlqog();
        while (ppxfxbqfkfVar.btonecajqb()) {
            ppxfxbqfkfVar.pmvmpeiblj();
        }
        return new PointF(fAgtfadlqog * f13, fAgtfadlqog2 * f13);
    }
}
