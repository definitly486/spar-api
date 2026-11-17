package nc2;

import com.google.gson.Gson;
import com.google.gson.btonecajqb;
import com.google.gson.nufgyqmvbu;
import com.google.gson.ojitshcjhn;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import kc2.lqeggnwhkg;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {
    private static Gson btonecajqb() {
        return new com.google.gson.wkgbmnqykc().eablkybsjg(ojitshcjhn.f25188jyumaefscl).ppxfxbqfkf().zoijcleaow();
    }

    private static nufgyqmvbu draadjrbmk(nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof com.google.gson.eablkybsjg) {
            return gtknphoqwx((com.google.gson.eablkybsjg) nufgyqmvbuVar);
        }
        if (!(nufgyqmvbuVar instanceof btonecajqb)) {
            return nufgyqmvbuVar;
        }
        btonecajqb btonecajqbVar = (btonecajqb) nufgyqmvbuVar;
        btonecajqb btonecajqbVar2 = new btonecajqb();
        for (String str : new ArrayList(btonecajqbVar.oxmwwwfdhm())) {
            btonecajqbVar2.wflxmlrfwp(str, draadjrbmk(btonecajqbVar.rgvfuqvkyq(str)));
        }
        return btonecajqbVar2;
    }

    public static String dxjokdxxww(Object obj) {
        return btonecajqb().zdlpuopuiu(obj);
    }

    public static String eablkybsjg(nufgyqmvbu nufgyqmvbuVar) {
        return gxszxtbevo(new JSONObject(dxjokdxxww(nufgyqmvbuVar)));
    }

    private static com.google.gson.eablkybsjg gtknphoqwx(com.google.gson.eablkybsjg eablkybsjgVar) {
        HashMap map = new HashMap();
        Iterator it = eablkybsjgVar.iterator();
        while (it.hasNext()) {
            nufgyqmvbu nufgyqmvbuVarDraadjrbmk = draadjrbmk((nufgyqmvbu) it.next());
            map.put(new Gson().kcexrzcfyt(nufgyqmvbuVarDraadjrbmk), nufgyqmvbuVarDraadjrbmk);
        }
        LinkedList linkedList = new LinkedList(map.keySet());
        linkedList.sort(new Comparator() { // from class: nc2.wkgbmnqykc
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((String) obj).compareTo((String) obj2);
            }
        });
        com.google.gson.eablkybsjg eablkybsjgVar2 = new com.google.gson.eablkybsjg();
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            eablkybsjgVar2.wflxmlrfwp((nufgyqmvbu) map.get((String) it2.next()));
        }
        return eablkybsjgVar2;
    }

    public static String gxszxtbevo(JSONObject jSONObject) {
        return dxjokdxxww(zoijcleaow(jSONObject.toString()));
    }

    private static nufgyqmvbu iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof btonecajqb) {
            return wflxmlrfwp((btonecajqb) nufgyqmvbuVar);
        }
        if (!(nufgyqmvbuVar instanceof com.google.gson.eablkybsjg)) {
            return nufgyqmvbuVar;
        }
        com.google.gson.eablkybsjg eablkybsjgVar = new com.google.gson.eablkybsjg();
        Iterator it = ((com.google.gson.eablkybsjg) nufgyqmvbuVar).iterator();
        while (it.hasNext()) {
            eablkybsjgVar.wflxmlrfwp(iobyxmoadg((nufgyqmvbu) it.next()));
        }
        return eablkybsjgVar;
    }

    public static nufgyqmvbu lqeggnwhkg(nufgyqmvbu nufgyqmvbuVar) {
        return draadjrbmk(iobyxmoadg(nufgyqmvbuVar));
    }

    public static btonecajqb nufgyqmvbu(String str) {
        return lqeggnwhkg(zoijcleaow(str)).ppxfxbqfkf();
    }

    public static String ppxfxbqfkf(btonecajqb btonecajqbVar, String str) {
        return zoijcleaow.iobyxmoadg(eablkybsjg(btonecajqbVar).replace(" ", ""), str);
    }

    private static btonecajqb wflxmlrfwp(btonecajqb btonecajqbVar) {
        ArrayList<String> arrayList = new ArrayList(btonecajqbVar.oxmwwwfdhm());
        arrayList.sort(new Comparator() { // from class: nc2.eablkybsjg
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((String) obj).compareToIgnoreCase((String) obj2);
            }
        });
        btonecajqb btonecajqbVar2 = new btonecajqb();
        for (String str : arrayList) {
            btonecajqbVar2.wflxmlrfwp(str, iobyxmoadg(btonecajqbVar.rgvfuqvkyq(str)));
        }
        return btonecajqbVar2;
    }

    public static String wkgbmnqykc(btonecajqb btonecajqbVar, String str) {
        lqeggnwhkg lqeggnwhkgVar = lqeggnwhkg.LocationHash;
        btonecajqbVar.kcexrzcfyt(lqeggnwhkgVar.name());
        String strPpxfxbqfkf = ppxfxbqfkf(btonecajqbVar, str);
        btonecajqbVar.agtfadlqog(lqeggnwhkgVar.name(), strPpxfxbqfkf);
        return strPpxfxbqfkf;
    }

    public static nufgyqmvbu zoijcleaow(String str) {
        return (nufgyqmvbu) btonecajqb().gtknphoqwx(str, btonecajqb.class);
    }
}
