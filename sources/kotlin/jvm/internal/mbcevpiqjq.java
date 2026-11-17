package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mbcevpiqjq {
    private static Throwable agtfadlqog(Throwable th2) {
        return zdlpuopuiu.vdvldrhtss(th2, mbcevpiqjq.class.getName());
    }

    public static int btonecajqb(Object obj) {
        if (obj instanceof ojitshcjhn) {
            return ((ojitshcjhn) obj).getArity();
        }
        if (obj instanceof tg.iobyxmoadg) {
            return 0;
        }
        if (obj instanceof tg.draadjrbmk) {
            return 1;
        }
        if (obj instanceof tg.rgvfuqvkyq) {
            return 2;
        }
        if (obj instanceof tg.vdvldrhtss) {
            return 3;
        }
        if (obj instanceof tg.oxmwwwfdhm) {
            return 4;
        }
        if (obj instanceof tg.kcexrzcfyt) {
            return 5;
        }
        if (obj instanceof tg.zdlpuopuiu) {
            return 6;
        }
        if (obj instanceof tg.yggfygwlhe) {
            return 7;
        }
        if (obj instanceof tg.jyumaefscl) {
            return 8;
        }
        if (obj instanceof tg.iwizpuwonk) {
            return 9;
        }
        if (obj instanceof tg.zoijcleaow) {
            return 10;
        }
        if (obj instanceof tg.ppxfxbqfkf) {
            return 11;
        }
        if (obj instanceof tg.wkgbmnqykc) {
            return 12;
        }
        if (obj instanceof tg.eablkybsjg) {
            return 13;
        }
        if (obj instanceof tg.gxszxtbevo) {
            return 14;
        }
        if (obj instanceof tg.lqeggnwhkg) {
            return 15;
        }
        if (obj instanceof tg.nufgyqmvbu) {
            return 16;
        }
        if (obj instanceof tg.dxjokdxxww) {
            return 17;
        }
        if (obj instanceof tg.btonecajqb) {
            return 18;
        }
        if (obj instanceof tg.gtknphoqwx) {
            return 19;
        }
        if (obj instanceof tg.wflxmlrfwp) {
            return 20;
        }
        if (obj instanceof tg.agtfadlqog) {
            return 21;
        }
        return obj instanceof tg.ojitshcjhn ? 22 : -1;
    }

    public static boolean draadjrbmk(Object obj) {
        return (obj instanceof List) && (!(obj instanceof ug.iobyxmoadg) || (obj instanceof ug.wkgbmnqykc));
    }

    public static Set dxjokdxxww(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e13) {
            throw ojitshcjhn(e13);
        }
    }

    public static Object eablkybsjg(Object obj, int i13) {
        if (obj != null && !gtknphoqwx(obj, i13)) {
            rgvfuqvkyq(obj, "kotlin.jvm.functions.Function" + i13);
        }
        return obj;
    }

    public static boolean gtknphoqwx(Object obj, int i13) {
        return (obj instanceof gg.dxjokdxxww) && btonecajqb(obj) == i13;
    }

    public static Collection gxszxtbevo(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e13) {
            throw ojitshcjhn(e13);
        }
    }

    public static Collection iobyxmoadg(Object obj) {
        if ((obj instanceof ug.iobyxmoadg) && !(obj instanceof ug.zoijcleaow)) {
            rgvfuqvkyq(obj, "kotlin.collections.MutableCollection");
        }
        return gxszxtbevo(obj);
    }

    public static Iterable lqeggnwhkg(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e13) {
            throw ojitshcjhn(e13);
        }
    }

    public static Map nufgyqmvbu(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e13) {
            throw ojitshcjhn(e13);
        }
    }

    public static ClassCastException ojitshcjhn(ClassCastException classCastException) {
        throw ((ClassCastException) agtfadlqog(classCastException));
    }

    public static Map ppxfxbqfkf(Object obj) {
        if ((obj instanceof ug.iobyxmoadg) && !(obj instanceof ug.eablkybsjg)) {
            rgvfuqvkyq(obj, "kotlin.collections.MutableMap");
        }
        return nufgyqmvbu(obj);
    }

    public static void rgvfuqvkyq(Object obj, String str) {
        vdvldrhtss((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void vdvldrhtss(String str) {
        throw ojitshcjhn(new ClassCastException(str));
    }

    public static boolean wflxmlrfwp(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof ug.iobyxmoadg) || (obj instanceof ug.gxszxtbevo));
    }

    public static Set wkgbmnqykc(Object obj) {
        if ((obj instanceof ug.iobyxmoadg) && !(obj instanceof ug.gxszxtbevo)) {
            rgvfuqvkyq(obj, "kotlin.collections.MutableSet");
        }
        return dxjokdxxww(obj);
    }

    public static Iterable zoijcleaow(Object obj) {
        if ((obj instanceof ug.iobyxmoadg) && !(obj instanceof ug.ppxfxbqfkf)) {
            rgvfuqvkyq(obj, "kotlin.collections.MutableIterable");
        }
        return lqeggnwhkg(obj);
    }
}
