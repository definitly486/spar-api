package t7;

import android.graphics.Rect;
import androidx.collection.xrmfcynszj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109966iobyxmoadg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static u7.ppxfxbqfkf.iobyxmoadg f109969zoijcleaow = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109967ppxfxbqfkf = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("list");

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109968wkgbmnqykc = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("cm", "tm", "dr");

    private static void eablkybsjg(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar, List list, androidx.collection.esjtqupxsv esjtqupxsvVar) {
        ppxfxbqfkfVar.wkgbmnqykc();
        int i13 = 0;
        while (ppxfxbqfkfVar.btonecajqb()) {
            r7.eablkybsjg eablkybsjgVarZoijcleaow = jyumaefscl.zoijcleaow(ppxfxbqfkfVar, btonecajqbVar);
            if (eablkybsjgVarZoijcleaow.lqeggnwhkg() == r7.eablkybsjg.iobyxmoadg.IMAGE) {
                i13++;
            }
            list.add(eablkybsjgVarZoijcleaow);
            esjtqupxsvVar.nufgyqmvbu(eablkybsjgVarZoijcleaow.eablkybsjg(), eablkybsjgVarZoijcleaow);
            if (i13 > 4) {
                v7.wkgbmnqykc.ppxfxbqfkf("You have " + i13 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        ppxfxbqfkfVar.nufgyqmvbu();
    }

    private static void gxszxtbevo(u7.ppxfxbqfkf ppxfxbqfkfVar, List list) {
        ppxfxbqfkfVar.wkgbmnqykc();
        while (ppxfxbqfkfVar.btonecajqb()) {
            ppxfxbqfkfVar.lqeggnwhkg();
            float fAgtfadlqog = 0.0f;
            String strVdvldrhtss = null;
            float fAgtfadlqog2 = 0.0f;
            while (ppxfxbqfkfVar.btonecajqb()) {
                int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109968wkgbmnqykc);
                if (iCqumvgiudr == 0) {
                    strVdvldrhtss = ppxfxbqfkfVar.vdvldrhtss();
                } else if (iCqumvgiudr == 1) {
                    fAgtfadlqog = (float) ppxfxbqfkfVar.agtfadlqog();
                } else if (iCqumvgiudr != 2) {
                    ppxfxbqfkfVar.lereixgezr();
                    ppxfxbqfkfVar.pmvmpeiblj();
                } else {
                    fAgtfadlqog2 = (float) ppxfxbqfkfVar.agtfadlqog();
                }
            }
            ppxfxbqfkfVar.dxjokdxxww();
            list.add(new o7.nufgyqmvbu(strVdvldrhtss, fAgtfadlqog, fAgtfadlqog2));
        }
        ppxfxbqfkfVar.nufgyqmvbu();
    }

    public static com.airbnb.lottie.btonecajqb iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar) {
        float fEablkybsjg = v7.btonecajqb.eablkybsjg();
        androidx.collection.esjtqupxsv esjtqupxsvVar = new androidx.collection.esjtqupxsv();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        xrmfcynszj xrmfcynszjVar = new xrmfcynszj();
        com.airbnb.lottie.btonecajqb btonecajqbVar = new com.airbnb.lottie.btonecajqb();
        ppxfxbqfkfVar.lqeggnwhkg();
        float fAgtfadlqog = 0.0f;
        float fAgtfadlqog2 = 0.0f;
        float fAgtfadlqog3 = 0.0f;
        int iOjitshcjhn = 0;
        int iOjitshcjhn2 = 0;
        while (ppxfxbqfkfVar.btonecajqb()) {
            switch (ppxfxbqfkfVar.cqumvgiudr(f109966iobyxmoadg)) {
                case 0:
                    iOjitshcjhn = ppxfxbqfkfVar.ojitshcjhn();
                    continue;
                case 1:
                    iOjitshcjhn2 = ppxfxbqfkfVar.ojitshcjhn();
                    continue;
                case 2:
                    fAgtfadlqog = (float) ppxfxbqfkfVar.agtfadlqog();
                    continue;
                case 3:
                    fAgtfadlqog2 = ((float) ppxfxbqfkfVar.agtfadlqog()) - 0.01f;
                    break;
                case 4:
                    fAgtfadlqog3 = (float) ppxfxbqfkfVar.agtfadlqog();
                    break;
                case 5:
                    String[] strArrSplit = ppxfxbqfkfVar.vdvldrhtss().split("\\.");
                    if (!v7.btonecajqb.btonecajqb(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        btonecajqbVar.iobyxmoadg("Lottie only supports bodymovin >= 4.4.0");
                        continue;
                    }
                    break;
                case 6:
                    eablkybsjg(ppxfxbqfkfVar, btonecajqbVar, arrayList, esjtqupxsvVar);
                    continue;
                case 7:
                    zoijcleaow(ppxfxbqfkfVar, btonecajqbVar, map, map2);
                    continue;
                case 8:
                    wkgbmnqykc(ppxfxbqfkfVar, map3);
                    continue;
                case 9:
                    ppxfxbqfkf(ppxfxbqfkfVar, btonecajqbVar, xrmfcynszjVar);
                    continue;
                case 10:
                    gxszxtbevo(ppxfxbqfkfVar, arrayList2);
                    continue;
                default:
                    ppxfxbqfkfVar.lereixgezr();
                    ppxfxbqfkfVar.pmvmpeiblj();
                    continue;
            }
            map3 = map3;
            arrayList2 = arrayList2;
        }
        btonecajqbVar.zdlpuopuiu(new Rect(0, 0, (int) (iOjitshcjhn * fEablkybsjg), (int) (iOjitshcjhn2 * fEablkybsjg)), fAgtfadlqog, fAgtfadlqog2, fAgtfadlqog3, arrayList, esjtqupxsvVar, map, map2, v7.btonecajqb.eablkybsjg(), xrmfcynszjVar, map3, arrayList2);
        return btonecajqbVar;
    }

    private static void ppxfxbqfkf(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar, xrmfcynszj xrmfcynszjVar) {
        ppxfxbqfkfVar.wkgbmnqykc();
        while (ppxfxbqfkfVar.btonecajqb()) {
            o7.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(ppxfxbqfkfVar, btonecajqbVar);
            xrmfcynszjVar.draadjrbmk(wkgbmnqykcVarIobyxmoadg.hashCode(), wkgbmnqykcVarIobyxmoadg);
        }
        ppxfxbqfkfVar.nufgyqmvbu();
    }

    private static void wkgbmnqykc(u7.ppxfxbqfkf ppxfxbqfkfVar, Map map) {
        ppxfxbqfkfVar.lqeggnwhkg();
        while (ppxfxbqfkfVar.btonecajqb()) {
            if (ppxfxbqfkfVar.cqumvgiudr(f109967ppxfxbqfkf) != 0) {
                ppxfxbqfkfVar.lereixgezr();
                ppxfxbqfkfVar.pmvmpeiblj();
            } else {
                ppxfxbqfkfVar.wkgbmnqykc();
                while (ppxfxbqfkfVar.btonecajqb()) {
                    o7.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = agtfadlqog.iobyxmoadg(ppxfxbqfkfVar);
                    map.put(ppxfxbqfkfVarIobyxmoadg.zoijcleaow(), ppxfxbqfkfVarIobyxmoadg);
                }
                ppxfxbqfkfVar.nufgyqmvbu();
            }
        }
        ppxfxbqfkfVar.dxjokdxxww();
    }

    private static void zoijcleaow(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar, Map map, Map map2) {
        ppxfxbqfkfVar.wkgbmnqykc();
        while (ppxfxbqfkfVar.btonecajqb()) {
            ArrayList arrayList = new ArrayList();
            androidx.collection.esjtqupxsv esjtqupxsvVar = new androidx.collection.esjtqupxsv();
            ppxfxbqfkfVar.lqeggnwhkg();
            int iOjitshcjhn = 0;
            int iOjitshcjhn2 = 0;
            String strVdvldrhtss = null;
            String strVdvldrhtss2 = null;
            String strVdvldrhtss3 = null;
            while (ppxfxbqfkfVar.btonecajqb()) {
                int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109969zoijcleaow);
                if (iCqumvgiudr == 0) {
                    strVdvldrhtss = ppxfxbqfkfVar.vdvldrhtss();
                } else if (iCqumvgiudr == 1) {
                    ppxfxbqfkfVar.wkgbmnqykc();
                    while (ppxfxbqfkfVar.btonecajqb()) {
                        r7.eablkybsjg eablkybsjgVarZoijcleaow = jyumaefscl.zoijcleaow(ppxfxbqfkfVar, btonecajqbVar);
                        esjtqupxsvVar.nufgyqmvbu(eablkybsjgVarZoijcleaow.eablkybsjg(), eablkybsjgVarZoijcleaow);
                        arrayList.add(eablkybsjgVarZoijcleaow);
                    }
                    ppxfxbqfkfVar.nufgyqmvbu();
                } else if (iCqumvgiudr == 2) {
                    iOjitshcjhn = ppxfxbqfkfVar.ojitshcjhn();
                } else if (iCqumvgiudr == 3) {
                    iOjitshcjhn2 = ppxfxbqfkfVar.ojitshcjhn();
                } else if (iCqumvgiudr == 4) {
                    strVdvldrhtss2 = ppxfxbqfkfVar.vdvldrhtss();
                } else if (iCqumvgiudr != 5) {
                    ppxfxbqfkfVar.lereixgezr();
                    ppxfxbqfkfVar.pmvmpeiblj();
                } else {
                    strVdvldrhtss3 = ppxfxbqfkfVar.vdvldrhtss();
                }
            }
            ppxfxbqfkfVar.dxjokdxxww();
            if (strVdvldrhtss2 != null) {
                com.airbnb.lottie.jpowsppfya jpowsppfyaVar = new com.airbnb.lottie.jpowsppfya(iOjitshcjhn, iOjitshcjhn2, strVdvldrhtss, strVdvldrhtss2, strVdvldrhtss3);
                map2.put(jpowsppfyaVar.eablkybsjg(), jpowsppfyaVar);
            } else {
                map.put(strVdvldrhtss, arrayList);
            }
        }
        ppxfxbqfkfVar.nufgyqmvbu();
    }
}
