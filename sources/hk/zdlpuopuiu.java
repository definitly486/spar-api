package hk;

import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zdlpuopuiu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final agtfadlqog.iobyxmoadg f40564iobyxmoadg = new agtfadlqog.iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final agtfadlqog.iobyxmoadg f40565zoijcleaow = new agtfadlqog.iobyxmoadg();

    public static final int btonecajqb(dk.gxszxtbevo gxszxtbevoVar, gk.zoijcleaow json, String name, String suffix) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(json, "json");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(suffix, "suffix");
        int iDxjokdxxww = dxjokdxxww(gxszxtbevoVar, json, name);
        if (iDxjokdxxww != -3) {
            return iDxjokdxxww;
        }
        throw new SerializationException(gxszxtbevoVar.nufgyqmvbu() + " does not contain element with name '" + name + '\'' + suffix);
    }

    private static final int draadjrbmk(dk.gxszxtbevo gxszxtbevoVar, gk.zoijcleaow zoijcleaowVar, String str) {
        Integer num = (Integer) eablkybsjg(zoijcleaowVar, gxszxtbevoVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int dxjokdxxww(dk.gxszxtbevo gxszxtbevoVar, gk.zoijcleaow json, String name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(json, "json");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        if (wkgbmnqykc(json, gxszxtbevoVar)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lowerCase, "toLowerCase(...)");
            return draadjrbmk(gxszxtbevoVar, json, lowerCase);
        }
        wflxmlrfwp(gxszxtbevoVar, json);
        int iPpxfxbqfkf = gxszxtbevoVar.ppxfxbqfkf(name);
        return (iPpxfxbqfkf == -3 && json.eablkybsjg().ojitshcjhn()) ? draadjrbmk(gxszxtbevoVar, json, name) : iPpxfxbqfkf;
    }

    public static final Map eablkybsjg(final gk.zoijcleaow zoijcleaowVar, final dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return (Map) gk.wwaezpbzkn.iobyxmoadg(zoijcleaowVar).zoijcleaow(descriptor, f40564iobyxmoadg, new tg.iobyxmoadg() { // from class: hk.kcexrzcfyt
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return zdlpuopuiu.gxszxtbevo(descriptor, zoijcleaowVar);
            }
        });
    }

    public static /* synthetic */ int gtknphoqwx(dk.gxszxtbevo gxszxtbevoVar, gk.zoijcleaow zoijcleaowVar, String str, String str2, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str2 = "";
        }
        return btonecajqb(gxszxtbevoVar, zoijcleaowVar, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map gxszxtbevo(dk.gxszxtbevo gxszxtbevoVar, gk.zoijcleaow zoijcleaowVar) {
        return zoijcleaow(gxszxtbevoVar, zoijcleaowVar);
    }

    public static final agtfadlqog.iobyxmoadg lqeggnwhkg() {
        return f40564iobyxmoadg;
    }

    public static final String nufgyqmvbu(dk.gxszxtbevo gxszxtbevoVar, gk.zoijcleaow json, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(json, "json");
        wflxmlrfwp(gxszxtbevoVar, json);
        return gxszxtbevoVar.eablkybsjg(i13);
    }

    private static final void ppxfxbqfkf(Map map, dk.gxszxtbevo gxszxtbevoVar, String str, int i13) {
        String str2 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevoVar.getKind(), dk.agtfadlqog.zoijcleaow.f29058iobyxmoadg) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i13));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + gxszxtbevoVar.eablkybsjg(i13) + " is already one of the names for " + str2 + ' ' + gxszxtbevoVar.eablkybsjg(((Number) tzroggbefp.btonecajqb(map, str)).intValue()) + " in " + gxszxtbevoVar);
    }

    public static final gk.lereixgezr wflxmlrfwp(dk.gxszxtbevo gxszxtbevoVar, gk.zoijcleaow json) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(json, "json");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevoVar.getKind(), dk.ojitshcjhn.iobyxmoadg.f29095iobyxmoadg)) {
            return null;
        }
        json.eablkybsjg().draadjrbmk();
        return null;
    }

    private static final boolean wkgbmnqykc(gk.zoijcleaow zoijcleaowVar, dk.gxszxtbevo gxszxtbevoVar) {
        return zoijcleaowVar.eablkybsjg().nufgyqmvbu() && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevoVar.getKind(), dk.agtfadlqog.zoijcleaow.f29058iobyxmoadg);
    }

    private static final Map zoijcleaow(dk.gxszxtbevo gxszxtbevoVar, gk.zoijcleaow zoijcleaowVar) {
        String lowerCase;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zWkgbmnqykc = wkgbmnqykc(zoijcleaowVar, gxszxtbevoVar);
        wflxmlrfwp(gxszxtbevoVar, zoijcleaowVar);
        int iWkgbmnqykc = gxszxtbevoVar.wkgbmnqykc();
        for (int i13 = 0; i13 < iWkgbmnqykc; i13++) {
            List listGxszxtbevo = gxszxtbevoVar.gxszxtbevo(i13);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listGxszxtbevo) {
                if (obj instanceof gk.esjtqupxsv) {
                    arrayList.add(obj);
                }
            }
            gk.esjtqupxsv esjtqupxsvVar = (gk.esjtqupxsv) hg.jyumaefscl.krqnebusok(arrayList);
            if (esjtqupxsvVar != null && (strArrNames = esjtqupxsvVar.names()) != null) {
                for (String lowerCase2 : strArrNames) {
                    if (zWkgbmnqykc) {
                        lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lowerCase2, "toLowerCase(...)");
                    }
                    ppxfxbqfkf(linkedHashMap, gxszxtbevoVar, lowerCase2, i13);
                }
            }
            if (zWkgbmnqykc) {
                lowerCase = gxszxtbevoVar.eablkybsjg(i13).toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                ppxfxbqfkf(linkedHashMap, gxszxtbevoVar, lowerCase, i13);
            }
        }
        return linkedHashMap.isEmpty() ? tzroggbefp.dxjokdxxww() : linkedHashMap;
    }
}
