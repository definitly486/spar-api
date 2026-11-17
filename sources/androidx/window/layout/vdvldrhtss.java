package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final f6.gxszxtbevo.zoijcleaow f13838iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f13837zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final String f13836ppxfxbqfkf = vdvldrhtss.class.getSimpleName();

    static final class eablkybsjg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final eablkybsjg f13839zdlpuopuiu = new eablkybsjg();

        eablkybsjg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(require, "$this$require");
            return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int iobyxmoadg(SidecarDeviceState sidecarDeviceState) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    return sidecarDeviceState.posture;
                } catch (NoSuchFieldError unused) {
                    Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                    if (objInvoke != null) {
                        return ((Integer) objInvoke).intValue();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }

        public final List ppxfxbqfkf(SidecarWindowLayoutInfo info) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(info, "info");
            try {
                try {
                    List list = info.displayFeatures;
                    return list == null ? hg.jyumaefscl.wflxmlrfwp() : list;
                } catch (NoSuchFieldError unused) {
                    Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
                    if (objInvoke != null) {
                        return (List) objInvoke;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return hg.jyumaefscl.wflxmlrfwp();
            }
        }

        public final void wkgbmnqykc(SidecarDeviceState sidecarDeviceState, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i13;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i13));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public final int zoijcleaow(SidecarDeviceState sidecarDeviceState) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sidecarDeviceState, "sidecarDeviceState");
            int iIobyxmoadg = iobyxmoadg(sidecarDeviceState);
            if (iIobyxmoadg < 0 || iIobyxmoadg > 4) {
                return 0;
            }
            return iIobyxmoadg;
        }

        private iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f13840zdlpuopuiu = new ppxfxbqfkf();

        ppxfxbqfkf() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(require, "$this$require");
            return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
        }
    }

    static final class wkgbmnqykc extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final wkgbmnqykc f13841zdlpuopuiu = new wkgbmnqykc();

        wkgbmnqykc() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(require, "$this$require");
            boolean z13 = true;
            if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
                z13 = false;
            }
            return Boolean.valueOf(z13);
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f13842zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(require, "$this$require");
            boolean z13 = true;
            if (require.getType() != 1 && require.getType() != 2) {
                z13 = false;
            }
            return Boolean.valueOf(z13);
        }
    }

    public vdvldrhtss(f6.gxszxtbevo.zoijcleaow verificationMode) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(verificationMode, "verificationMode");
        this.f13838iobyxmoadg = verificationMode;
    }

    private final boolean ppxfxbqfkf(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i13 = 0;
        while (i13 < size) {
            int i14 = i13 + 1;
            if (!zoijcleaow((SidecarDisplayFeature) list.get(i13), (SidecarDisplayFeature) list2.get(i13))) {
                return false;
            }
            i13 = i14;
        }
        return true;
    }

    private final boolean zoijcleaow(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public final iwizpuwonk eablkybsjg(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new iwizpuwonk(hg.jyumaefscl.wflxmlrfwp());
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        iobyxmoadg iobyxmoadgVar = f13837zoijcleaow;
        iobyxmoadgVar.wkgbmnqykc(sidecarDeviceState, iobyxmoadgVar.zoijcleaow(state));
        return new iwizpuwonk(gxszxtbevo(iobyxmoadgVar.ppxfxbqfkf(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    public final List gxszxtbevo(List sidecarDisplayFeatures, SidecarDeviceState deviceState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            draadjrbmk draadjrbmkVarLqeggnwhkg = lqeggnwhkg((SidecarDisplayFeature) it.next(), deviceState);
            if (draadjrbmkVarLqeggnwhkg != null) {
                arrayList.add(draadjrbmkVarLqeggnwhkg);
            }
        }
        return arrayList;
    }

    public final boolean iobyxmoadg(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = f13837zoijcleaow;
        return iobyxmoadgVar.zoijcleaow(sidecarDeviceState) == iobyxmoadgVar.zoijcleaow(sidecarDeviceState2);
    }

    public final draadjrbmk lqeggnwhkg(SidecarDisplayFeature feature, SidecarDeviceState deviceState) {
        HardwareFoldingFeature.zoijcleaow zoijcleaowVarIobyxmoadg;
        FoldingFeature.ppxfxbqfkf ppxfxbqfkfVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(feature, "feature");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deviceState, "deviceState");
        f6.gxszxtbevo.iobyxmoadg iobyxmoadgVar = f6.gxszxtbevo.f32912iobyxmoadg;
        String TAG = f13836ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(TAG, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) f6.gxszxtbevo.iobyxmoadg.zoijcleaow(iobyxmoadgVar, feature, TAG, this.f13838iobyxmoadg, null, 4, null).ppxfxbqfkf("Type must be either TYPE_FOLD or TYPE_HINGE", zoijcleaow.f13842zdlpuopuiu).ppxfxbqfkf("Feature bounds must not be 0", ppxfxbqfkf.f13840zdlpuopuiu).ppxfxbqfkf("TYPE_FOLD must have 0 area", wkgbmnqykc.f13841zdlpuopuiu).ppxfxbqfkf("Feature be pinned to either left or top", eablkybsjg.f13839zdlpuopuiu).iobyxmoadg();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            zoijcleaowVarIobyxmoadg = HardwareFoldingFeature.zoijcleaow.f13794zoijcleaow.iobyxmoadg();
        } else {
            if (type != 2) {
                return null;
            }
            zoijcleaowVarIobyxmoadg = HardwareFoldingFeature.zoijcleaow.f13794zoijcleaow.zoijcleaow();
        }
        int iZoijcleaow = f13837zoijcleaow.zoijcleaow(deviceState);
        if (iZoijcleaow == 0 || iZoijcleaow == 1) {
            return null;
        }
        if (iZoijcleaow == 2) {
            ppxfxbqfkfVar = FoldingFeature.ppxfxbqfkf.f13785wkgbmnqykc;
        } else {
            if (iZoijcleaow != 3 && iZoijcleaow == 4) {
                return null;
            }
            ppxfxbqfkfVar = FoldingFeature.ppxfxbqfkf.f13784ppxfxbqfkf;
        }
        Rect rect = feature.getRect();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(rect, "feature.rect");
        return new HardwareFoldingFeature(new f6.zoijcleaow(rect), zoijcleaowVarIobyxmoadg, ppxfxbqfkfVar);
    }

    public final boolean wkgbmnqykc(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = f13837zoijcleaow;
        return ppxfxbqfkf(iobyxmoadgVar.ppxfxbqfkf(sidecarWindowLayoutInfo), iobyxmoadgVar.ppxfxbqfkf(sidecarWindowLayoutInfo2));
    }

    public /* synthetic */ vdvldrhtss(f6.gxszxtbevo.zoijcleaow zoijcleaowVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? f6.gxszxtbevo.zoijcleaow.QUIET : zoijcleaowVar);
    }
}
