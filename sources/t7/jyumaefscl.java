package t7;

import android.graphics.Color;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109972iobyxmoadg = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109974zoijcleaow = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("d", "a");

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109973ppxfxbqfkf = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("ty", "nm");

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f109975iobyxmoadg;

        static {
            int[] iArr = new int[r7.eablkybsjg.zoijcleaow.values().length];
            f109975iobyxmoadg = iArr;
            try {
                iArr[r7.eablkybsjg.zoijcleaow.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f109975iobyxmoadg[r7.eablkybsjg.zoijcleaow.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static r7.eablkybsjg iobyxmoadg(com.airbnb.lottie.btonecajqb btonecajqbVar) {
        Rect rectZoijcleaow = btonecajqbVar.zoijcleaow();
        return new r7.eablkybsjg(Collections.emptyList(), btonecajqbVar, "__container", -1L, r7.eablkybsjg.iobyxmoadg.PRE_COMP, -1L, null, Collections.emptyList(), new p7.draadjrbmk(), 0, 0, 0, 0.0f, 0.0f, rectZoijcleaow.width(), rectZoijcleaow.height(), null, null, Collections.emptyList(), r7.eablkybsjg.zoijcleaow.NONE, null, false, null, null, q7.nufgyqmvbu.NORMAL);
    }

    public static r7.eablkybsjg zoijcleaow(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        float f13;
        r7.eablkybsjg.zoijcleaow zoijcleaowVar = r7.eablkybsjg.zoijcleaow.NONE;
        q7.nufgyqmvbu nufgyqmvbuVar = q7.nufgyqmvbu.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ppxfxbqfkfVar.lqeggnwhkg();
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        r7.eablkybsjg.zoijcleaow zoijcleaowVar2 = zoijcleaowVar;
        q7.nufgyqmvbu nufgyqmvbuVar2 = nufgyqmvbuVar;
        r7.eablkybsjg.iobyxmoadg iobyxmoadgVar = null;
        String strVdvldrhtss = null;
        p7.btonecajqb btonecajqbVarWkgbmnqykc = null;
        p7.gtknphoqwx gtknphoqwxVarIobyxmoadg = null;
        p7.zoijcleaow zoijcleaowVarGxszxtbevo = null;
        q7.iobyxmoadg iobyxmoadgVarZoijcleaow = null;
        btonecajqb btonecajqbVarZoijcleaow = null;
        long jOjitshcjhn = 0;
        boolean z13 = false;
        int iOjitshcjhn = 0;
        int iOjitshcjhn2 = 0;
        int color = 0;
        boolean zDraadjrbmk = false;
        float fAgtfadlqog = 0.0f;
        float fAgtfadlqog2 = 0.0f;
        float fAgtfadlqog3 = 0.0f;
        float fAgtfadlqog4 = 0.0f;
        float fGxszxtbevo = 0.0f;
        long jOjitshcjhn2 = -1;
        float fAgtfadlqog5 = 1.0f;
        String strVdvldrhtss2 = "UNSET";
        String strVdvldrhtss3 = null;
        p7.draadjrbmk draadjrbmkVar = null;
        while (ppxfxbqfkfVar.btonecajqb()) {
            switch (ppxfxbqfkfVar.cqumvgiudr(f109972iobyxmoadg)) {
                case 0:
                    strVdvldrhtss2 = ppxfxbqfkfVar.vdvldrhtss();
                    break;
                case 1:
                    jOjitshcjhn = ppxfxbqfkfVar.ojitshcjhn();
                    break;
                case 2:
                    strVdvldrhtss = ppxfxbqfkfVar.vdvldrhtss();
                    break;
                case 3:
                    int iOjitshcjhn3 = ppxfxbqfkfVar.ojitshcjhn();
                    iobyxmoadgVar = r7.eablkybsjg.iobyxmoadg.UNKNOWN;
                    if (iOjitshcjhn3 < iobyxmoadgVar.ordinal()) {
                        iobyxmoadgVar = r7.eablkybsjg.iobyxmoadg.values()[iOjitshcjhn3];
                    }
                    break;
                case 4:
                    jOjitshcjhn2 = ppxfxbqfkfVar.ojitshcjhn();
                    break;
                case 5:
                    iOjitshcjhn = (int) (ppxfxbqfkfVar.ojitshcjhn() * v7.btonecajqb.eablkybsjg());
                    break;
                case 6:
                    iOjitshcjhn2 = (int) (ppxfxbqfkfVar.ojitshcjhn() * v7.btonecajqb.eablkybsjg());
                    break;
                case 7:
                    color = Color.parseColor(ppxfxbqfkfVar.vdvldrhtss());
                    break;
                case 8:
                    draadjrbmkVar = ppxfxbqfkf.lqeggnwhkg(ppxfxbqfkfVar, btonecajqbVar);
                    break;
                case 9:
                    int iOjitshcjhn4 = ppxfxbqfkfVar.ojitshcjhn();
                    if (iOjitshcjhn4 < r7.eablkybsjg.zoijcleaow.values().length) {
                        zoijcleaowVar2 = r7.eablkybsjg.zoijcleaow.values()[iOjitshcjhn4];
                        int i13 = iobyxmoadg.f109975iobyxmoadg[zoijcleaowVar2.ordinal()];
                        if (i13 == 1) {
                            btonecajqbVar.iobyxmoadg("Unsupported matte type: Luma");
                        } else if (i13 == 2) {
                            btonecajqbVar.iobyxmoadg("Unsupported matte type: Luma Inverted");
                        }
                        btonecajqbVar.kcexrzcfyt(1);
                    } else {
                        btonecajqbVar.iobyxmoadg("Unsupported matte type: " + iOjitshcjhn4);
                    }
                    break;
                case 10:
                    ppxfxbqfkfVar.wkgbmnqykc();
                    while (ppxfxbqfkfVar.btonecajqb()) {
                        arrayList.add(cqumvgiudr.iobyxmoadg(ppxfxbqfkfVar, btonecajqbVar));
                    }
                    btonecajqbVar.kcexrzcfyt(arrayList.size());
                    ppxfxbqfkfVar.nufgyqmvbu();
                    break;
                case 11:
                    ppxfxbqfkfVar.wkgbmnqykc();
                    while (ppxfxbqfkfVar.btonecajqb()) {
                        q7.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = nufgyqmvbu.iobyxmoadg(ppxfxbqfkfVar, btonecajqbVar);
                        if (ppxfxbqfkfVarIobyxmoadg != null) {
                            arrayList2.add(ppxfxbqfkfVarIobyxmoadg);
                        }
                    }
                    ppxfxbqfkfVar.nufgyqmvbu();
                    break;
                case 12:
                    ppxfxbqfkfVar.lqeggnwhkg();
                    while (ppxfxbqfkfVar.btonecajqb()) {
                        int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f109974zoijcleaow);
                        if (iCqumvgiudr == 0) {
                            btonecajqbVarWkgbmnqykc = wkgbmnqykc.wkgbmnqykc(ppxfxbqfkfVar, btonecajqbVar);
                        } else if (iCqumvgiudr != 1) {
                            ppxfxbqfkfVar.lereixgezr();
                            ppxfxbqfkfVar.pmvmpeiblj();
                        } else {
                            ppxfxbqfkfVar.wkgbmnqykc();
                            if (ppxfxbqfkfVar.btonecajqb()) {
                                gtknphoqwxVarIobyxmoadg = zoijcleaow.iobyxmoadg(ppxfxbqfkfVar, btonecajqbVar);
                            }
                            while (ppxfxbqfkfVar.btonecajqb()) {
                                ppxfxbqfkfVar.pmvmpeiblj();
                            }
                            ppxfxbqfkfVar.nufgyqmvbu();
                        }
                    }
                    ppxfxbqfkfVar.dxjokdxxww();
                    break;
                case 13:
                    ppxfxbqfkfVar.wkgbmnqykc();
                    ArrayList arrayList3 = new ArrayList();
                    while (ppxfxbqfkfVar.btonecajqb()) {
                        ppxfxbqfkfVar.lqeggnwhkg();
                        while (ppxfxbqfkfVar.btonecajqb()) {
                            int iCqumvgiudr2 = ppxfxbqfkfVar.cqumvgiudr(f109973ppxfxbqfkf);
                            if (iCqumvgiudr2 == 0) {
                                int iOjitshcjhn5 = ppxfxbqfkfVar.ojitshcjhn();
                                if (iOjitshcjhn5 == 29) {
                                    iobyxmoadgVarZoijcleaow = eablkybsjg.zoijcleaow(ppxfxbqfkfVar, btonecajqbVar);
                                } else if (iOjitshcjhn5 == 25) {
                                    btonecajqbVarZoijcleaow = new gtknphoqwx().zoijcleaow(ppxfxbqfkfVar, btonecajqbVar);
                                }
                            } else if (iCqumvgiudr2 != 1) {
                                ppxfxbqfkfVar.lereixgezr();
                                ppxfxbqfkfVar.pmvmpeiblj();
                            } else {
                                arrayList3.add(ppxfxbqfkfVar.vdvldrhtss());
                            }
                        }
                        ppxfxbqfkfVar.dxjokdxxww();
                    }
                    ppxfxbqfkfVar.nufgyqmvbu();
                    btonecajqbVar.iobyxmoadg("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    break;
                case 14:
                    fAgtfadlqog5 = (float) ppxfxbqfkfVar.agtfadlqog();
                    break;
                case 15:
                    fAgtfadlqog2 = (float) ppxfxbqfkfVar.agtfadlqog();
                    break;
                case 16:
                    fAgtfadlqog3 = (float) (ppxfxbqfkfVar.agtfadlqog() * ((double) v7.btonecajqb.eablkybsjg()));
                    break;
                case 17:
                    fAgtfadlqog4 = (float) (ppxfxbqfkfVar.agtfadlqog() * ((double) v7.btonecajqb.eablkybsjg()));
                    break;
                case 18:
                    fAgtfadlqog = (float) ppxfxbqfkfVar.agtfadlqog();
                    break;
                case 19:
                    fGxszxtbevo = (float) ppxfxbqfkfVar.agtfadlqog();
                    break;
                case 20:
                    zoijcleaowVarGxszxtbevo = wkgbmnqykc.gxszxtbevo(ppxfxbqfkfVar, btonecajqbVar, false);
                    break;
                case 21:
                    strVdvldrhtss3 = ppxfxbqfkfVar.vdvldrhtss();
                    break;
                case 22:
                    zDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
                    break;
                case 23:
                    z13 = ppxfxbqfkfVar.ojitshcjhn() == 1;
                    break;
                case 24:
                    int iOjitshcjhn6 = ppxfxbqfkfVar.ojitshcjhn();
                    if (iOjitshcjhn6 < q7.nufgyqmvbu.values().length) {
                        nufgyqmvbuVar2 = q7.nufgyqmvbu.values()[iOjitshcjhn6];
                    } else {
                        btonecajqbVar.iobyxmoadg("Unsupported Blend Mode: " + iOjitshcjhn6);
                        nufgyqmvbuVar2 = q7.nufgyqmvbu.NORMAL;
                    }
                    break;
                default:
                    ppxfxbqfkfVar.lereixgezr();
                    ppxfxbqfkfVar.pmvmpeiblj();
                    break;
            }
        }
        ppxfxbqfkfVar.dxjokdxxww();
        ArrayList arrayList4 = new ArrayList();
        if (fAgtfadlqog > 0.0f) {
            arrayList4.add(new w7.iobyxmoadg(btonecajqbVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fAgtfadlqog)));
            f13 = 0.0f;
        } else {
            f13 = 0.0f;
        }
        if (fGxszxtbevo <= f13) {
            fGxszxtbevo = btonecajqbVar.gxszxtbevo();
        }
        arrayList4.add(new w7.iobyxmoadg(btonecajqbVar, fValueOf2, fValueOf2, null, fAgtfadlqog, Float.valueOf(fGxszxtbevo)));
        arrayList4.add(new w7.iobyxmoadg(btonecajqbVar, fValueOf, fValueOf, null, fGxszxtbevo, Float.valueOf(Float.MAX_VALUE)));
        if (strVdvldrhtss2.endsWith(".ai") || "ai".equals(strVdvldrhtss3)) {
            btonecajqbVar.iobyxmoadg("Convert your Illustrator layers to shape layers.");
        }
        if (z13 != 0) {
            if (draadjrbmkVar == null) {
                draadjrbmkVar = new p7.draadjrbmk();
            }
            draadjrbmkVar.wflxmlrfwp(z13);
        }
        return new r7.eablkybsjg(arrayList2, btonecajqbVar, strVdvldrhtss2, jOjitshcjhn, iobyxmoadgVar, jOjitshcjhn2, strVdvldrhtss, arrayList, draadjrbmkVar, iOjitshcjhn, iOjitshcjhn2, color, fAgtfadlqog5, fAgtfadlqog2, fAgtfadlqog3, fAgtfadlqog4, btonecajqbVarWkgbmnqykc, gtknphoqwxVarIobyxmoadg, arrayList4, zoijcleaowVar2, zoijcleaowVarGxszxtbevo, zDraadjrbmk, iobyxmoadgVarZoijcleaow, btonecajqbVarZoijcleaow, nufgyqmvbuVar2);
    }
}
