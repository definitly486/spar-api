package mk;

import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cqumvgiudr;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final mj.rgvfuqvkyq f67366iobyxmoadg = new mj.rgvfuqvkyq("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final mj.rgvfuqvkyq f67367zoijcleaow = new mj.rgvfuqvkyq(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public static final cqumvgiudr eablkybsjg(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        try {
            return wkgbmnqykc(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final String gxszxtbevo(cqumvgiudr cqumvgiudrVar) {
        zdlpuopuiu.btonecajqb(cqumvgiudrVar, "<this>");
        return cqumvgiudrVar.wkgbmnqykc();
    }

    public static final boolean iobyxmoadg(cqumvgiudr cqumvgiudrVar, Object obj) {
        zdlpuopuiu.btonecajqb(cqumvgiudrVar, "<this>");
        return (obj instanceof cqumvgiudr) && zdlpuopuiu.eablkybsjg(((cqumvgiudr) obj).wkgbmnqykc(), cqumvgiudrVar.wkgbmnqykc());
    }

    public static final String ppxfxbqfkf(cqumvgiudr cqumvgiudrVar, String name) {
        zdlpuopuiu.btonecajqb(cqumvgiudrVar, "<this>");
        zdlpuopuiu.btonecajqb(name, "name");
        int i13 = 0;
        int iZoijcleaow = og.ppxfxbqfkf.zoijcleaow(0, cqumvgiudrVar.eablkybsjg().length - 1, 2);
        if (iZoijcleaow < 0) {
            return null;
        }
        while (!kcexrzcfyt.istkbnxepw(cqumvgiudrVar.eablkybsjg()[i13], name, true)) {
            if (i13 == iZoijcleaow) {
                return null;
            }
            i13 += 2;
        }
        return cqumvgiudrVar.eablkybsjg()[i13 + 1];
    }

    public static final cqumvgiudr wkgbmnqykc(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        mj.draadjrbmk draadjrbmkVarLereixgezr = wflxmlrfwp.lereixgezr(f67366iobyxmoadg, str, 0);
        if (draadjrbmkVarLereixgezr == null) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String str2 = (String) draadjrbmkVarLereixgezr.zoijcleaow().get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        zdlpuopuiu.dxjokdxxww(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String lowerCase2 = ((String) draadjrbmkVarLereixgezr.zoijcleaow().get(2)).toLowerCase(locale);
        zdlpuopuiu.dxjokdxxww(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        ArrayList arrayList = new ArrayList();
        int iEablkybsjg = draadjrbmkVarLereixgezr.ppxfxbqfkf().eablkybsjg();
        while (true) {
            int i13 = iEablkybsjg + 1;
            if (i13 >= str.length()) {
                Object[] array = arrayList.toArray(new String[0]);
                zdlpuopuiu.nufgyqmvbu(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                return new cqumvgiudr(str, lowerCase, lowerCase2, (String[]) array);
            }
            mj.draadjrbmk draadjrbmkVarLereixgezr2 = wflxmlrfwp.lereixgezr(f67367zoijcleaow, str, i13);
            if (draadjrbmkVarLereixgezr2 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(i13);
                zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb3.append(strSubstring);
                sb3.append("\" for: \"");
                sb3.append(str);
                sb3.append('\"');
                throw new IllegalArgumentException(sb3.toString().toString());
            }
            mj.btonecajqb btonecajqbVar = draadjrbmkVarLereixgezr2.wkgbmnqykc().get(1);
            String strIobyxmoadg = btonecajqbVar != null ? btonecajqbVar.iobyxmoadg() : null;
            if (strIobyxmoadg == null) {
                iEablkybsjg = draadjrbmkVarLereixgezr2.ppxfxbqfkf().eablkybsjg();
            } else {
                mj.btonecajqb btonecajqbVar2 = draadjrbmkVarLereixgezr2.wkgbmnqykc().get(2);
                String strIobyxmoadg2 = btonecajqbVar2 != null ? btonecajqbVar2.iobyxmoadg() : null;
                if (strIobyxmoadg2 == null) {
                    mj.btonecajqb btonecajqbVar3 = draadjrbmkVarLereixgezr2.wkgbmnqykc().get(3);
                    zdlpuopuiu.lqeggnwhkg(btonecajqbVar3);
                    strIobyxmoadg2 = btonecajqbVar3.iobyxmoadg();
                } else if (kcexrzcfyt.stevsuqkhv(strIobyxmoadg2, "'", false, 2, null) && kcexrzcfyt.zynmafqrjb(strIobyxmoadg2, "'", false, 2, null) && strIobyxmoadg2.length() > 2) {
                    strIobyxmoadg2 = strIobyxmoadg2.substring(1, strIobyxmoadg2.length() - 1);
                    zdlpuopuiu.dxjokdxxww(strIobyxmoadg2, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strIobyxmoadg);
                arrayList.add(strIobyxmoadg2);
                iEablkybsjg = draadjrbmkVarLereixgezr2.ppxfxbqfkf().eablkybsjg();
            }
        }
    }

    public static final int zoijcleaow(cqumvgiudr cqumvgiudrVar) {
        zdlpuopuiu.btonecajqb(cqumvgiudrVar, "<this>");
        return cqumvgiudrVar.wkgbmnqykc().hashCode();
    }
}
