package mk;

import gg.cqumvgiudr;
import gg.vdvldrhtss;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.yggfygwlhe;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg {
    public static final yggfygwlhe.iobyxmoadg agtfadlqog(yggfygwlhe.iobyxmoadg iobyxmoadgVar, String name, String value) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(value, "value");
        oxmwwwfdhm(name);
        kcexrzcfyt(value, name);
        iobyxmoadgVar.nufgyqmvbu(name);
        wkgbmnqykc(iobyxmoadgVar, name, value);
        return iobyxmoadgVar;
    }

    public static final Iterator btonecajqb(yggfygwlhe yggfygwlheVar) {
        zdlpuopuiu.btonecajqb(yggfygwlheVar, "<this>");
        int size = yggfygwlheVar.size();
        vdvldrhtss[] vdvldrhtssVarArr = new vdvldrhtss[size];
        for (int i13 = 0; i13 < size; i13++) {
            vdvldrhtssVarArr[i13] = cqumvgiudr.iobyxmoadg(yggfygwlheVar.wkgbmnqykc(i13), yggfygwlheVar.btonecajqb(i13));
        }
        return kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(vdvldrhtssVarArr);
    }

    public static final yggfygwlhe.iobyxmoadg draadjrbmk(yggfygwlhe yggfygwlheVar) {
        zdlpuopuiu.btonecajqb(yggfygwlheVar, "<this>");
        yggfygwlhe.iobyxmoadg iobyxmoadgVar = new yggfygwlhe.iobyxmoadg();
        jyumaefscl.cdpycssgdh(iobyxmoadgVar.lqeggnwhkg(), yggfygwlheVar.ppxfxbqfkf());
        return iobyxmoadgVar;
    }

    public static final yggfygwlhe dxjokdxxww(String... inputNamesAndValues) {
        zdlpuopuiu.btonecajqb(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr.length;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            if (strArr[i14] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i14] = kcexrzcfyt.p(inputNamesAndValues[i14]).toString();
        }
        int iZoijcleaow = og.ppxfxbqfkf.zoijcleaow(0, strArr.length - 1, 2);
        if (iZoijcleaow >= 0) {
            while (true) {
                String str = strArr[i13];
                String str2 = strArr[i13 + 1];
                oxmwwwfdhm(str);
                kcexrzcfyt(str2, str);
                if (i13 == iZoijcleaow) {
                    break;
                }
                i13 += 2;
            }
        }
        return new yggfygwlhe(strArr);
    }

    public static final yggfygwlhe eablkybsjg(yggfygwlhe.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        Object[] array = iobyxmoadgVar.lqeggnwhkg().toArray(new String[0]);
        zdlpuopuiu.nufgyqmvbu(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new yggfygwlhe((String[]) array);
    }

    public static final String gtknphoqwx(yggfygwlhe yggfygwlheVar, int i13) {
        zdlpuopuiu.btonecajqb(yggfygwlheVar, "<this>");
        String str = (String) hg.agtfadlqog.weqkydbzbr(yggfygwlheVar.ppxfxbqfkf(), i13 * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i13 + ']');
    }

    public static final boolean gxszxtbevo(yggfygwlhe yggfygwlheVar, Object obj) {
        zdlpuopuiu.btonecajqb(yggfygwlheVar, "<this>");
        return (obj instanceof yggfygwlhe) && Arrays.equals(yggfygwlheVar.ppxfxbqfkf(), ((yggfygwlhe) obj).ppxfxbqfkf());
    }

    private static final String iobyxmoadg(char c13) {
        String string = Integer.toString(c13, mj.iobyxmoadg.iobyxmoadg(16));
        zdlpuopuiu.dxjokdxxww(string, "toString(this, checkRadix(radix))");
        if (string.length() >= 2) {
            return string;
        }
        return '0' + string;
    }

    public static final void kcexrzcfyt(String value, String name) {
        zdlpuopuiu.btonecajqb(value, "value");
        zdlpuopuiu.btonecajqb(name, "name");
        int length = value.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = value.charAt(i13);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unexpected char 0x");
                sb3.append(iobyxmoadg(cCharAt));
                sb3.append(" at ");
                sb3.append(i13);
                sb3.append(" in ");
                sb3.append(name);
                sb3.append(" value");
                sb3.append(wflxmlrfwp.esjtqupxsv(name) ? "" : ": " + value);
                throw new IllegalArgumentException(sb3.toString().toString());
            }
        }
    }

    public static final int lqeggnwhkg(yggfygwlhe yggfygwlheVar) {
        zdlpuopuiu.btonecajqb(yggfygwlheVar, "<this>");
        return Arrays.hashCode(yggfygwlheVar.ppxfxbqfkf());
    }

    public static final String nufgyqmvbu(String[] namesAndValues, String name) {
        zdlpuopuiu.btonecajqb(namesAndValues, "namesAndValues");
        zdlpuopuiu.btonecajqb(name, "name");
        int length = namesAndValues.length - 2;
        int iZoijcleaow = og.ppxfxbqfkf.zoijcleaow(length, 0, -2);
        if (iZoijcleaow > length) {
            return null;
        }
        while (!kcexrzcfyt.istkbnxepw(name, namesAndValues[length], true)) {
            if (length == iZoijcleaow) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    public static final String ojitshcjhn(yggfygwlhe yggfygwlheVar) {
        zdlpuopuiu.btonecajqb(yggfygwlheVar, "<this>");
        StringBuilder sb3 = new StringBuilder();
        int size = yggfygwlheVar.size();
        for (int i13 = 0; i13 < size; i13++) {
            String strWkgbmnqykc = yggfygwlheVar.wkgbmnqykc(i13);
            String strBtonecajqb = yggfygwlheVar.btonecajqb(i13);
            sb3.append(strWkgbmnqykc);
            sb3.append(": ");
            if (wflxmlrfwp.esjtqupxsv(strWkgbmnqykc)) {
                strBtonecajqb = "██";
            }
            sb3.append(strBtonecajqb);
            sb3.append("\n");
        }
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final void oxmwwwfdhm(String name) {
        zdlpuopuiu.btonecajqb(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = name.charAt(i13);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(("Unexpected char 0x" + iobyxmoadg(cCharAt) + " at " + i13 + " in header name: " + name).toString());
            }
        }
    }

    public static final yggfygwlhe.iobyxmoadg ppxfxbqfkf(yggfygwlhe.iobyxmoadg iobyxmoadgVar, yggfygwlhe headers) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(headers, "headers");
        int size = headers.size();
        for (int i13 = 0; i13 < size; i13++) {
            wkgbmnqykc(iobyxmoadgVar, headers.wkgbmnqykc(i13), headers.btonecajqb(i13));
        }
        return iobyxmoadgVar;
    }

    public static final String rgvfuqvkyq(yggfygwlhe yggfygwlheVar, int i13) {
        zdlpuopuiu.btonecajqb(yggfygwlheVar, "<this>");
        String str = (String) hg.agtfadlqog.weqkydbzbr(yggfygwlheVar.ppxfxbqfkf(), (i13 * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i13 + ']');
    }

    public static final List vdvldrhtss(yggfygwlhe yggfygwlheVar, String name) {
        zdlpuopuiu.btonecajqb(yggfygwlheVar, "<this>");
        zdlpuopuiu.btonecajqb(name, "name");
        int size = yggfygwlheVar.size();
        ArrayList arrayList = null;
        for (int i13 = 0; i13 < size; i13++) {
            if (kcexrzcfyt.istkbnxepw(name, yggfygwlheVar.wkgbmnqykc(i13), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(yggfygwlheVar.btonecajqb(i13));
            }
        }
        List listM = arrayList != null ? jyumaefscl.m(arrayList) : null;
        return listM == null ? jyumaefscl.wflxmlrfwp() : listM;
    }

    public static final yggfygwlhe.iobyxmoadg wflxmlrfwp(yggfygwlhe.iobyxmoadg iobyxmoadgVar, String name) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(name, "name");
        int i13 = 0;
        while (i13 < iobyxmoadgVar.lqeggnwhkg().size()) {
            if (kcexrzcfyt.istkbnxepw(name, (String) iobyxmoadgVar.lqeggnwhkg().get(i13), true)) {
                iobyxmoadgVar.lqeggnwhkg().remove(i13);
                iobyxmoadgVar.lqeggnwhkg().remove(i13);
                i13 -= 2;
            }
            i13 += 2;
        }
        return iobyxmoadgVar;
    }

    public static final yggfygwlhe.iobyxmoadg wkgbmnqykc(yggfygwlhe.iobyxmoadg iobyxmoadgVar, String name, String value) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(value, "value");
        iobyxmoadgVar.lqeggnwhkg().add(name);
        iobyxmoadgVar.lqeggnwhkg().add(kcexrzcfyt.p(value).toString());
        return iobyxmoadgVar;
    }

    public static final yggfygwlhe.iobyxmoadg zoijcleaow(yggfygwlhe.iobyxmoadg iobyxmoadgVar, String name, String value) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(value, "value");
        oxmwwwfdhm(name);
        kcexrzcfyt(value, name);
        wkgbmnqykc(iobyxmoadgVar, name, value);
        return iobyxmoadgVar;
    }
}
