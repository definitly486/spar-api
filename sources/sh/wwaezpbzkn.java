package sh;

/* JADX INFO: loaded from: classes3.dex */
public final class wwaezpbzkn {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final ii.zoijcleaow f106635eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wwaezpbzkn f106636iobyxmoadg = new wwaezpbzkn();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final ii.zoijcleaow f106637ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final ii.zoijcleaow f106638wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final ii.ppxfxbqfkf f106639zoijcleaow;

    static {
        ii.ppxfxbqfkf ppxfxbqfkfVar = new ii.ppxfxbqfkf("kotlin.jvm.JvmField");
        f106639zoijcleaow = ppxfxbqfkfVar;
        ii.zoijcleaow.iobyxmoadg iobyxmoadgVar = ii.zoijcleaow.f44488wkgbmnqykc;
        f106637ppxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(ppxfxbqfkfVar);
        f106638wkgbmnqykc = iobyxmoadgVar.ppxfxbqfkf(new ii.ppxfxbqfkf("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f106635eablkybsjg = ii.zoijcleaow.iobyxmoadg.zoijcleaow(iobyxmoadgVar, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    private wwaezpbzkn() {
    }

    public static final String eablkybsjg(String propertyName) {
        String strIobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(propertyName, "propertyName");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("set");
        if (gxszxtbevo(propertyName)) {
            strIobyxmoadg = propertyName.substring(2);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strIobyxmoadg, "substring(...)");
        } else {
            strIobyxmoadg = hj.iobyxmoadg.iobyxmoadg(propertyName);
        }
        sb3.append(strIobyxmoadg);
        return sb3.toString();
    }

    public static final boolean gxszxtbevo(String name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        if (!mj.kcexrzcfyt.stevsuqkhv(name, "is", false, 2, null) || name.length() == 2) {
            return false;
        }
        char cCharAt = name.charAt(2);
        return kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(97, cCharAt) > 0 || kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(cCharAt, 122) > 0;
    }

    public static final boolean ppxfxbqfkf(String name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        return mj.kcexrzcfyt.stevsuqkhv(name, "get", false, 2, null) || mj.kcexrzcfyt.stevsuqkhv(name, "is", false, 2, null);
    }

    public static final boolean wkgbmnqykc(String name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        return mj.kcexrzcfyt.stevsuqkhv(name, "set", false, 2, null);
    }

    public static final String zoijcleaow(String propertyName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(propertyName, "propertyName");
        if (gxszxtbevo(propertyName)) {
            return propertyName;
        }
        return "get" + hj.iobyxmoadg.iobyxmoadg(propertyName);
    }

    public final ii.zoijcleaow iobyxmoadg() {
        return f106635eablkybsjg;
    }
}
