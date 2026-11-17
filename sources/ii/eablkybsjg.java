package ii;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f44441iobyxmoadg;

        static {
            int[] iArr = new int[gtknphoqwx.values().length];
            try {
                iArr[gtknphoqwx.BEGINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gtknphoqwx.AFTER_DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gtknphoqwx.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44441iobyxmoadg = iArr;
        }
    }

    public static final boolean eablkybsjg(String str) {
        if (str == null) {
            return false;
        }
        gtknphoqwx gtknphoqwxVar = gtknphoqwx.BEGINNING;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            int i14 = iobyxmoadg.f44441iobyxmoadg[gtknphoqwxVar.ordinal()];
            if (i14 == 1 || i14 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                gtknphoqwxVar = gtknphoqwx.MIDDLE;
            } else {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (cCharAt == '.') {
                    gtknphoqwxVar = gtknphoqwx.AFTER_DOT;
                } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
            }
        }
        return gtknphoqwxVar != gtknphoqwx.AFTER_DOT;
    }

    public static final ppxfxbqfkf gxszxtbevo(ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (ppxfxbqfkfVar.wkgbmnqykc()) {
            return null;
        }
        return ppxfxbqfkfVar.eablkybsjg();
    }

    public static final Object iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, Map values) {
        Object next;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        zdlpuopuiu.btonecajqb(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : values.entrySet()) {
            ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) entry.getKey();
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkfVar2) || zoijcleaow(ppxfxbqfkfVar, ppxfxbqfkfVar2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = lqeggnwhkg((ppxfxbqfkf) ((Map.Entry) next).getKey(), ppxfxbqfkfVar).zoijcleaow().length();
                do {
                    Object next2 = it.next();
                    int length2 = lqeggnwhkg((ppxfxbqfkf) ((Map.Entry) next2).getKey(), ppxfxbqfkfVar).zoijcleaow().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return entry2.getValue();
        }
        return null;
    }

    public static final ppxfxbqfkf lqeggnwhkg(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf prefix) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        zdlpuopuiu.btonecajqb(prefix, "prefix");
        if (!ppxfxbqfkf(ppxfxbqfkfVar, prefix) || prefix.wkgbmnqykc()) {
            return ppxfxbqfkfVar;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, prefix)) {
            ppxfxbqfkf ROOT = ppxfxbqfkf.f44478ppxfxbqfkf;
            zdlpuopuiu.dxjokdxxww(ROOT, "ROOT");
            return ROOT;
        }
        String strZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        String strSubstring = strZoijcleaow.substring(prefix.zoijcleaow().length() + 1);
        zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return new ppxfxbqfkf(strSubstring);
    }

    public static final boolean ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf packageName) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        zdlpuopuiu.btonecajqb(packageName, "packageName");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, packageName) || packageName.wkgbmnqykc()) {
            return true;
        }
        String strZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        String strZoijcleaow2 = packageName.zoijcleaow();
        zdlpuopuiu.dxjokdxxww(strZoijcleaow2, "asString(...)");
        return wkgbmnqykc(strZoijcleaow, strZoijcleaow2);
    }

    private static final boolean wkgbmnqykc(String str, String str2) {
        return kcexrzcfyt.stevsuqkhv(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final boolean zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf packageName) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        zdlpuopuiu.btonecajqb(packageName, "packageName");
        return zdlpuopuiu.eablkybsjg(gxszxtbevo(ppxfxbqfkfVar), packageName);
    }
}
