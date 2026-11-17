package androidx.camera.core.impl;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface rgvfuqvkyq extends yggfygwlhe {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public static final btonecajqb.iobyxmoadg f3849agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final btonecajqb.iobyxmoadg f3850btonecajqb = btonecajqb.iobyxmoadg.iobyxmoadg("camerax.core.imageOutput.targetAspectRatio", lereixgezr.iobyxmoadg.class);

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public static final btonecajqb.iobyxmoadg f3851draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final btonecajqb.iobyxmoadg f3852gtknphoqwx;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public static final btonecajqb.iobyxmoadg f3853kcexrzcfyt;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final btonecajqb.iobyxmoadg f3854ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public static final btonecajqb.iobyxmoadg f3855oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public static final btonecajqb.iobyxmoadg f3856rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public static final btonecajqb.iobyxmoadg f3857vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public static final btonecajqb.iobyxmoadg f3858wflxmlrfwp;

    public interface iobyxmoadg {
        Object ppxfxbqfkf(Size size);

        Object zoijcleaow(int i13);
    }

    static {
        Class cls = Integer.TYPE;
        f3852gtknphoqwx = btonecajqb.iobyxmoadg.iobyxmoadg("camerax.core.imageOutput.targetRotation", cls);
        f3851draadjrbmk = btonecajqb.iobyxmoadg.iobyxmoadg("camerax.core.imageOutput.appTargetRotation", cls);
        f3858wflxmlrfwp = btonecajqb.iobyxmoadg.iobyxmoadg("camerax.core.imageOutput.mirrorMode", cls);
        f3849agtfadlqog = btonecajqb.iobyxmoadg.iobyxmoadg("camerax.core.imageOutput.targetResolution", Size.class);
        f3854ojitshcjhn = btonecajqb.iobyxmoadg.iobyxmoadg("camerax.core.imageOutput.defaultResolution", Size.class);
        f3856rgvfuqvkyq = btonecajqb.iobyxmoadg.iobyxmoadg("camerax.core.imageOutput.maxResolution", Size.class);
        f3857vdvldrhtss = btonecajqb.iobyxmoadg.iobyxmoadg("camerax.core.imageOutput.supportedResolutions", List.class);
        f3855oxmwwwfdhm = btonecajqb.iobyxmoadg.iobyxmoadg("camerax.core.imageOutput.resolutionSelector", dsvhmnatus.ppxfxbqfkf.class);
        f3853kcexrzcfyt = btonecajqb.iobyxmoadg.iobyxmoadg("camerax.core.imageOutput.customOrderedResolutions", List.class);
    }

    static void iwizpuwonk(rgvfuqvkyq rgvfuqvkyqVar) {
        boolean zLereixgezr = rgvfuqvkyqVar.lereixgezr();
        boolean z13 = rgvfuqvkyqVar.cllcsxoeiz(null) != null;
        if (zLereixgezr && z13) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (rgvfuqvkyqVar.ylkuphrtab(null) != null) {
            if (zLereixgezr || z13) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default Size cllcsxoeiz(Size size) {
        return (Size) lqeggnwhkg(f3849agtfadlqog, size);
    }

    default dsvhmnatus.ppxfxbqfkf draadjrbmk() {
        return (dsvhmnatus.ppxfxbqfkf) iobyxmoadg(f3855oxmwwwfdhm);
    }

    default Size dxjokdxxww(Size size) {
        return (Size) lqeggnwhkg(f3856rgvfuqvkyq, size);
    }

    default List gtknphoqwx(List list) {
        return (List) lqeggnwhkg(f3857vdvldrhtss, list);
    }

    default int istkbnxepw() {
        return ((Integer) iobyxmoadg(f3850btonecajqb)).intValue();
    }

    default int kcexrzcfyt(int i13) {
        return ((Integer) lqeggnwhkg(f3851draadjrbmk, Integer.valueOf(i13))).intValue();
    }

    default boolean lereixgezr() {
        return zoijcleaow(f3850btonecajqb);
    }

    default Size pkzmftpjix(Size size) {
        return (Size) lqeggnwhkg(f3854ojitshcjhn, size);
    }

    default int sopmlzcsov(int i13) {
        return ((Integer) lqeggnwhkg(f3858wflxmlrfwp, Integer.valueOf(i13))).intValue();
    }

    default List wwaezpbzkn(List list) {
        List list2 = (List) lqeggnwhkg(f3853kcexrzcfyt, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    default int yadqdtsiqt(int i13) {
        return ((Integer) lqeggnwhkg(f3852gtknphoqwx, Integer.valueOf(i13))).intValue();
    }

    default dsvhmnatus.ppxfxbqfkf ylkuphrtab(dsvhmnatus.ppxfxbqfkf ppxfxbqfkfVar) {
        return (dsvhmnatus.ppxfxbqfkf) lqeggnwhkg(f3855oxmwwwfdhm, ppxfxbqfkfVar);
    }
}
