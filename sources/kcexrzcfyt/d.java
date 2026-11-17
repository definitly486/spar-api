package kcexrzcfyt;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f54625agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final gxszxtbevo f54626btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final iwizpuwonk.gxszxtbevo f54628draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final String f54629dxjokdxxww;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final roivzttewh f54631esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final zdlpuopuiu.pmvmpeiblj f54632gtknphoqwx;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final tbqsvytpvh f54636jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private boolean f54637kcexrzcfyt;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private boolean f54640ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private boolean f54641oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private boolean f54643rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private boolean f54644vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final int f54645wflxmlrfwp;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    istkbnxepw.bfopjjpdmp f54648zdlpuopuiu;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f54634iobyxmoadg = new ArrayList();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f54649zoijcleaow = new ArrayList();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f54642ppxfxbqfkf = new ArrayList();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f54646wkgbmnqykc = new ArrayList();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Map f54630eablkybsjg = new HashMap();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f54633gxszxtbevo = new ArrayList();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f54638lqeggnwhkg = new ArrayList();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final List f54639nufgyqmvbu = new ArrayList();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    List f54647yggfygwlhe = new ArrayList();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final iwizpuwonk.iwizpuwonk f54635iwizpuwonk = new iwizpuwonk.iwizpuwonk();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final iwizpuwonk.kcexrzcfyt f54627cqumvgiudr = new iwizpuwonk.kcexrzcfyt();

    static class iobyxmoadg {
        static Size[] iobyxmoadg(StreamConfigurationMap streamConfigurationMap, int i13) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i13);
        }
    }

    static abstract class zoijcleaow {
        zoijcleaow() {
        }

        static zoijcleaow eablkybsjg(int i13, int i14, boolean z13, boolean z14) {
            return new eablkybsjg(i13, i14, z13, z14);
        }

        abstract int iobyxmoadg();

        abstract boolean ppxfxbqfkf();

        abstract boolean wkgbmnqykc();

        abstract int zoijcleaow();
    }

    d(Context context, String str, zdlpuopuiu.cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) throws CameraUnavailableException {
        this.f54625agtfadlqog = false;
        this.f54640ojitshcjhn = false;
        this.f54643rgvfuqvkyq = false;
        this.f54644vdvldrhtss = false;
        this.f54641oxmwwwfdhm = false;
        this.f54637kcexrzcfyt = false;
        String str2 = (String) u1.nufgyqmvbu.gxszxtbevo(str);
        this.f54629dxjokdxxww = str2;
        this.f54626btonecajqb = (gxszxtbevo) u1.nufgyqmvbu.gxszxtbevo(gxszxtbevoVar);
        this.f54628draadjrbmk = new iwizpuwonk.gxszxtbevo();
        this.f54636jyumaefscl = tbqsvytpvh.ppxfxbqfkf(context);
        try {
            zdlpuopuiu.pmvmpeiblj pmvmpeibljVarPpxfxbqfkf = cllcsxoeizVar.ppxfxbqfkf(str2);
            this.f54632gtknphoqwx = pmvmpeibljVarPpxfxbqfkf;
            Integer num = (Integer) pmvmpeibljVarPpxfxbqfkf.iobyxmoadg(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f54645wflxmlrfwp = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) pmvmpeibljVarPpxfxbqfkf.iobyxmoadg(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i13 : iArr) {
                    if (i13 == 3) {
                        this.f54625agtfadlqog = true;
                    } else if (i13 == 6) {
                        this.f54640ojitshcjhn = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i13 == 16) {
                        this.f54641oxmwwwfdhm = true;
                    }
                }
            }
            roivzttewh roivzttewhVar = new roivzttewh(this.f54632gtknphoqwx);
            this.f54631esjtqupxsv = roivzttewhVar;
            gtknphoqwx();
            if (this.f54641oxmwwwfdhm) {
                agtfadlqog();
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f54643rgvfuqvkyq = zHasSystemFeature;
            if (zHasSystemFeature) {
                nufgyqmvbu();
            }
            if (roivzttewhVar.wkgbmnqykc()) {
                lqeggnwhkg();
            }
            if (pkzmftpjix()) {
                wflxmlrfwp();
            }
            boolean zNufgyqmvbu = b.nufgyqmvbu(this.f54632gtknphoqwx);
            this.f54644vdvldrhtss = zNufgyqmvbu;
            if (zNufgyqmvbu) {
                btonecajqb();
            }
            boolean zIobyxmoadg = v.iobyxmoadg(this.f54632gtknphoqwx);
            this.f54637kcexrzcfyt = zIobyxmoadg;
            if (zIobyxmoadg) {
                dxjokdxxww();
            }
            draadjrbmk();
            zoijcleaow();
        } catch (CameraAccessExceptionCompat e13) {
            throw czzsidtyhn.iobyxmoadg(e13);
        }
    }

    private void agtfadlqog() {
        this.f54649zoijcleaow.addAll(fyldjkxazc.wflxmlrfwp());
    }

    private void btonecajqb() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f54639nufgyqmvbu.addAll(fyldjkxazc.gtknphoqwx());
        }
    }

    private Range cdpycssgdh(List list, List list2, List list3) {
        Iterator it = list.iterator();
        Range rangeLmojexxdyd = null;
        while (it.hasNext()) {
            rangeLmojexxdyd = lmojexxdyd(((androidx.camera.core.impl.iobyxmoadg) it.next()).nufgyqmvbu(), rangeLmojexxdyd);
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            rangeLmojexxdyd = lmojexxdyd(((androidx.camera.core.impl.istkbnxepw) list2.get(((Integer) it2.next()).intValue())).esjtqupxsv(null), rangeLmojexxdyd);
        }
        return rangeLmojexxdyd;
    }

    private void cllcsxoeiz(Map map, int i13) {
        Size sizeOxmwwwfdhm = oxmwwwfdhm(this.f54632gtknphoqwx.ppxfxbqfkf().wkgbmnqykc(), i13, true);
        if (sizeOxmwwwfdhm != null) {
            map.put(Integer.valueOf(i13), sizeOxmwwwfdhm);
        }
    }

    private Size cqumvgiudr(int i13) {
        CamcorderProfile camcorderProfileIobyxmoadg;
        Size size = hcddaimhww.ppxfxbqfkf.f40072wkgbmnqykc;
        if (this.f54626btonecajqb.zoijcleaow(i13, 10)) {
            camcorderProfileIobyxmoadg = this.f54626btonecajqb.iobyxmoadg(i13, 10);
        } else if (this.f54626btonecajqb.zoijcleaow(i13, 8)) {
            camcorderProfileIobyxmoadg = this.f54626btonecajqb.iobyxmoadg(i13, 8);
        } else if (this.f54626btonecajqb.zoijcleaow(i13, 12)) {
            camcorderProfileIobyxmoadg = this.f54626btonecajqb.iobyxmoadg(i13, 12);
        } else if (this.f54626btonecajqb.zoijcleaow(i13, 6)) {
            camcorderProfileIobyxmoadg = this.f54626btonecajqb.iobyxmoadg(i13, 6);
        } else if (this.f54626btonecajqb.zoijcleaow(i13, 5)) {
            camcorderProfileIobyxmoadg = this.f54626btonecajqb.iobyxmoadg(i13, 5);
        } else {
            camcorderProfileIobyxmoadg = this.f54626btonecajqb.zoijcleaow(i13, 4) ? this.f54626btonecajqb.iobyxmoadg(i13, 4) : null;
        }
        return camcorderProfileIobyxmoadg != null ? new Size(camcorderProfileIobyxmoadg.videoFrameWidth, camcorderProfileIobyxmoadg.videoFrameHeight) : size;
    }

    private void draadjrbmk() {
        this.f54648zdlpuopuiu = istkbnxepw.bfopjjpdmp.iobyxmoadg(hcddaimhww.ppxfxbqfkf.f40071ppxfxbqfkf, new HashMap(), this.f54636jyumaefscl.gxszxtbevo(), new HashMap(), iwizpuwonk(), new HashMap(), new HashMap());
    }

    private void dsvhmnatus(Map map, Size size, int i13) {
        if (this.f54643rgvfuqvkyq) {
            Size sizeOxmwwwfdhm = oxmwwwfdhm(this.f54632gtknphoqwx.ppxfxbqfkf().wkgbmnqykc(), i13, false);
            Integer numValueOf = Integer.valueOf(i13);
            if (sizeOxmwwwfdhm != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeOxmwwwfdhm), new cdpycssgdh.wkgbmnqykc());
            }
            map.put(numValueOf, size);
        }
    }

    private void dxjokdxxww() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f54646wkgbmnqykc.addAll(fyldjkxazc.dxjokdxxww());
        }
    }

    private zoijcleaow eablkybsjg(int i13, Map map, boolean z13, boolean z14) {
        int iLereixgezr = lereixgezr(map);
        if (i13 != 0 && z14) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Ultra HDR is not currently supported in %s camera mode.", this.f54629dxjokdxxww, istkbnxepw.cqumvgiudr.iobyxmoadg(i13)));
        }
        if (i13 == 0 || iLereixgezr != 10) {
            return zoijcleaow.eablkybsjg(i13, iLereixgezr, z13, z14);
        }
        throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.f54629dxjokdxxww, istkbnxepw.cqumvgiudr.iobyxmoadg(i13)));
    }

    private Size esjtqupxsv() {
        Size[] outputSizes = this.f54632gtknphoqwx.ppxfxbqfkf().wkgbmnqykc().getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return hcddaimhww.ppxfxbqfkf.f40072wkgbmnqykc;
        }
        Arrays.sort(outputSizes, new cdpycssgdh.wkgbmnqykc(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = hcddaimhww.ppxfxbqfkf.f40068gxszxtbevo;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return hcddaimhww.ppxfxbqfkf.f40072wkgbmnqykc;
    }

    private void gtknphoqwx() {
        this.f54634iobyxmoadg.addAll(fyldjkxazc.iobyxmoadg(this.f54645wflxmlrfwp, this.f54625agtfadlqog, this.f54640ojitshcjhn));
        this.f54634iobyxmoadg.addAll(this.f54628draadjrbmk.iobyxmoadg(this.f54629dxjokdxxww));
    }

    private Map gxszxtbevo(Map map, zoijcleaow zoijcleaowVar, Range range) {
        HashMap map2 = new HashMap();
        for (androidx.camera.core.impl.istkbnxepw istkbnxepwVar : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap map3 = new HashMap();
            for (Size size : (List) map.get(istkbnxepwVar)) {
                int iWflxmlrfwp = istkbnxepwVar.wflxmlrfwp();
                istkbnxepw.oipsdeybqn.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = istkbnxepw.oipsdeybqn.nufgyqmvbu(zoijcleaowVar.iobyxmoadg(), iWflxmlrfwp, size, iozdgvuglv(iWflxmlrfwp)).ppxfxbqfkf();
                int iVdvldrhtss = range != null ? vdvldrhtss(this.f54632gtknphoqwx, iWflxmlrfwp, size) : Integer.MAX_VALUE;
                Set hashSet = (Set) map3.get(iobyxmoadgVarPpxfxbqfkf);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map3.put(iobyxmoadgVarPpxfxbqfkf, hashSet);
                }
                if (!hashSet.contains(Integer.valueOf(iVdvldrhtss))) {
                    arrayList.add(size);
                    hashSet.add(Integer.valueOf(iVdvldrhtss));
                }
            }
            map2.put(istkbnxepwVar, arrayList);
        }
        return map2;
    }

    private boolean hcddaimhww(zoijcleaow zoijcleaowVar, List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((androidx.camera.core.impl.iobyxmoadg) it.next()).lqeggnwhkg());
        }
        cdpycssgdh.wkgbmnqykc wkgbmnqykcVar = new cdpycssgdh.wkgbmnqykc();
        for (androidx.camera.core.impl.istkbnxepw istkbnxepwVar : map.keySet()) {
            List list2 = (List) map.get(istkbnxepwVar);
            u1.nufgyqmvbu.zoijcleaow((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + istkbnxepwVar + ".");
            Size size = (Size) Collections.min(list2, wkgbmnqykcVar);
            int iWflxmlrfwp = istkbnxepwVar.wflxmlrfwp();
            arrayList.add(istkbnxepw.oipsdeybqn.nufgyqmvbu(zoijcleaowVar.iobyxmoadg(), iWflxmlrfwp, size, iozdgvuglv(iWflxmlrfwp)));
        }
        return ppxfxbqfkf(zoijcleaowVar, arrayList);
    }

    private Pair istkbnxepw(int i13, List list, List list2, List list3, List list4, int i14, Map map, Map map2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.iobyxmoadg iobyxmoadgVar = (androidx.camera.core.impl.iobyxmoadg) it.next();
            arrayList.add(iobyxmoadgVar.lqeggnwhkg());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), iobyxmoadgVar);
            }
        }
        for (int i15 = 0; i15 < list2.size(); i15++) {
            Size size = (Size) list2.get(i15);
            androidx.camera.core.impl.istkbnxepw istkbnxepwVar = (androidx.camera.core.impl.istkbnxepw) list3.get(((Integer) list4.get(i15)).intValue());
            int iWflxmlrfwp = istkbnxepwVar.wflxmlrfwp();
            arrayList.add(istkbnxepw.oipsdeybqn.nufgyqmvbu(i13, iWflxmlrfwp, size, iozdgvuglv(iWflxmlrfwp)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), istkbnxepwVar);
            }
            i14 = yadqdtsiqt(i14, istkbnxepwVar.wflxmlrfwp(), size);
        }
        return new Pair(arrayList, Integer.valueOf(i14));
    }

    private Size iwizpuwonk() {
        try {
            int i13 = Integer.parseInt(this.f54629dxjokdxxww);
            CamcorderProfile camcorderProfileIobyxmoadg = this.f54626btonecajqb.zoijcleaow(i13, 1) ? this.f54626btonecajqb.iobyxmoadg(i13, 1) : null;
            return camcorderProfileIobyxmoadg != null ? new Size(camcorderProfileIobyxmoadg.videoFrameWidth, camcorderProfileIobyxmoadg.videoFrameHeight) : cqumvgiudr(i13);
        } catch (NumberFormatException unused) {
            return esjtqupxsv();
        }
    }

    private void jpowsppfya() {
        this.f54636jyumaefscl.lqeggnwhkg();
        if (this.f54648zdlpuopuiu == null) {
            draadjrbmk();
        } else {
            this.f54648zdlpuopuiu = istkbnxepw.bfopjjpdmp.iobyxmoadg(this.f54648zdlpuopuiu.zoijcleaow(), this.f54648zdlpuopuiu.btonecajqb(), this.f54636jyumaefscl.gxszxtbevo(), this.f54648zdlpuopuiu.nufgyqmvbu(), this.f54648zdlpuopuiu.gxszxtbevo(), this.f54648zdlpuopuiu.wkgbmnqykc(), this.f54648zdlpuopuiu.draadjrbmk());
        }
    }

    private static int jyumaefscl(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    private int kcexrzcfyt(List list) {
        Iterator it = list.iterator();
        int iYadqdtsiqt = Integer.MAX_VALUE;
        while (it.hasNext()) {
            androidx.camera.core.impl.iobyxmoadg iobyxmoadgVar = (androidx.camera.core.impl.iobyxmoadg) it.next();
            iYadqdtsiqt = yadqdtsiqt(iYadqdtsiqt, iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.gxszxtbevo());
        }
        return iYadqdtsiqt;
    }

    private static int lereixgezr(Map map) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            if (((lereixgezr.iwizpuwonk) it.next()).iobyxmoadg() == 10) {
                return 10;
            }
        }
        return 8;
    }

    private Range lmojexxdyd(Range range, Range range2) {
        if (range2 == null) {
            return range;
        }
        if (range != null) {
            try {
                return range2.intersect(range);
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    private void lqeggnwhkg() {
        this.f54633gxszxtbevo.addAll(fyldjkxazc.zoijcleaow());
    }

    private void nufgyqmvbu() {
        this.f54642ppxfxbqfkf.addAll(fyldjkxazc.wkgbmnqykc());
    }

    private List ojitshcjhn(List list) {
        Iterator it = list.iterator();
        int size = 1;
        while (it.hasNext()) {
            size *= ((List) it.next()).size();
        }
        if (size == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(new ArrayList());
        }
        int size2 = size / ((List) list.get(0)).size();
        int i14 = size;
        for (int i15 = 0; i15 < list.size(); i15++) {
            List list2 = (List) list.get(i15);
            for (int i16 = 0; i16 < size; i16++) {
                ((List) arrayList.get(i16)).add((Size) list2.get((i16 % i14) / size2));
            }
            if (i15 < list.size() - 1) {
                i14 = size2;
                size2 /= ((List) list.get(i15 + 1)).size();
            }
        }
        return arrayList;
    }

    private Size oxmwwwfdhm(StreamConfigurationMap streamConfigurationMap, int i13, boolean z13) {
        Size[] sizeArrIobyxmoadg;
        Size[] outputSizes = i13 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i13);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        cdpycssgdh.wkgbmnqykc wkgbmnqykcVar = new cdpycssgdh.wkgbmnqykc();
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), wkgbmnqykcVar);
        Size size2 = hcddaimhww.ppxfxbqfkf.f40069iobyxmoadg;
        if (z13 && (sizeArrIobyxmoadg = iobyxmoadg.iobyxmoadg(streamConfigurationMap, i13)) != null && sizeArrIobyxmoadg.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(sizeArrIobyxmoadg), wkgbmnqykcVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), wkgbmnqykcVar);
    }

    private boolean pkzmftpjix() {
        int[] iArrZoijcleaow = this.f54632gtknphoqwx.ppxfxbqfkf().zoijcleaow();
        if (iArrZoijcleaow == null) {
            return false;
        }
        for (int i13 : iArrZoijcleaow) {
            if (i13 == 4101) {
                return true;
            }
        }
        return false;
    }

    private Range rgvfuqvkyq(Range range, int i13) {
        if (range != null) {
            Range rangeWkgbmnqykc = androidx.camera.core.impl.iwizpuwonk.f3803iobyxmoadg;
            if (!range.equals(rangeWkgbmnqykc)) {
                Range[] rangeArr = (Range[]) this.f54632gtknphoqwx.iobyxmoadg(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null) {
                    return rangeWkgbmnqykc;
                }
                Range range2 = new Range(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i13)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i13)));
                int iJyumaefscl = 0;
                for (Range range3 : rangeArr) {
                    if (i13 >= ((Integer) range3.getLower()).intValue()) {
                        if (rangeWkgbmnqykc.equals(androidx.camera.core.impl.iwizpuwonk.f3803iobyxmoadg)) {
                            rangeWkgbmnqykc = range3;
                        }
                        if (range3.equals(range2)) {
                            return range3;
                        }
                        try {
                            int iJyumaefscl2 = jyumaefscl(range3.intersect(range2));
                            if (iJyumaefscl == 0) {
                                iJyumaefscl = iJyumaefscl2;
                            } else {
                                if (iJyumaefscl2 >= iJyumaefscl) {
                                    rangeWkgbmnqykc = wkgbmnqykc(range2, rangeWkgbmnqykc, range3);
                                    iJyumaefscl = jyumaefscl(range2.intersect(rangeWkgbmnqykc));
                                }
                                range3 = rangeWkgbmnqykc;
                            }
                        } catch (IllegalArgumentException unused) {
                            if (iJyumaefscl != 0 || (yggfygwlhe(range3, range2) >= yggfygwlhe(rangeWkgbmnqykc, range2) && (yggfygwlhe(range3, range2) != yggfygwlhe(rangeWkgbmnqykc, range2) || (((Integer) range3.getLower()).intValue() <= ((Integer) rangeWkgbmnqykc.getUpper()).intValue() && jyumaefscl(range3) >= jyumaefscl(rangeWkgbmnqykc))))) {
                            }
                        }
                        rangeWkgbmnqykc = range3;
                    }
                }
                return rangeWkgbmnqykc;
            }
        }
        return androidx.camera.core.impl.iwizpuwonk.f3803iobyxmoadg;
    }

    static int vdvldrhtss(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar, int i13, Size size) {
        try {
            return (int) (1.0E9d / ((StreamConfigurationMap) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i13, size));
        } catch (Exception unused) {
            return 0;
        }
    }

    private void wflxmlrfwp() {
        this.f54638lqeggnwhkg.addAll(fyldjkxazc.draadjrbmk());
    }

    private static Range wkgbmnqykc(Range range, Range range2, Range range3) {
        double dJyumaefscl = jyumaefscl(range2.intersect(range));
        double dJyumaefscl2 = jyumaefscl(range3.intersect(range));
        double dJyumaefscl3 = dJyumaefscl2 / ((double) jyumaefscl(range3));
        double dJyumaefscl4 = dJyumaefscl / ((double) jyumaefscl(range2));
        if (dJyumaefscl2 > dJyumaefscl) {
            if (dJyumaefscl3 >= 0.5d || dJyumaefscl3 >= dJyumaefscl4) {
                return range3;
            }
        } else if (dJyumaefscl2 == dJyumaefscl) {
            if (dJyumaefscl3 > dJyumaefscl4) {
                return range3;
            }
            if (dJyumaefscl3 == dJyumaefscl4 && ((Integer) range3.getLower()).intValue() > ((Integer) range2.getLower()).intValue()) {
                return range3;
            }
        } else if (dJyumaefscl4 < 0.5d && dJyumaefscl3 > dJyumaefscl4) {
            return range3;
        }
        return range2;
    }

    private static List wwaezpbzkn(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iZynmafqrjb = ((androidx.camera.core.impl.istkbnxepw) it.next()).zynmafqrjb(0);
            if (!arrayList2.contains(Integer.valueOf(iZynmafqrjb))) {
                arrayList2.add(Integer.valueOf(iZynmafqrjb));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                androidx.camera.core.impl.istkbnxepw istkbnxepwVar = (androidx.camera.core.impl.istkbnxepw) it3.next();
                if (iIntValue == istkbnxepwVar.zynmafqrjb(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(istkbnxepwVar)));
                }
            }
        }
        return arrayList;
    }

    private void wypolnanlu(Map map, int i13) {
        StreamConfigurationMap streamConfigurationMap;
        if (Build.VERSION.SDK_INT < 31 || !this.f54641oxmwwwfdhm || (streamConfigurationMap = (StreamConfigurationMap) this.f54632gtknphoqwx.iobyxmoadg(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) == null) {
            return;
        }
        map.put(Integer.valueOf(i13), oxmwwwfdhm(streamConfigurationMap, i13, true));
    }

    private int yadqdtsiqt(int i13, int i14, Size size) {
        return Math.min(i13, vdvldrhtss(this.f54632gtknphoqwx, i14, size));
    }

    private static int yggfygwlhe(Range range, Range range2) {
        u1.nufgyqmvbu.dxjokdxxww((range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) ? false : true, "Ranges must not intersect");
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    private static boolean ylkuphrtab(List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((androidx.camera.core.impl.iobyxmoadg) it.next()).wkgbmnqykc() == 4101) {
                return true;
            }
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            if (((androidx.camera.core.impl.istkbnxepw) it2.next()).wflxmlrfwp() == 4101) {
                return true;
            }
        }
        return false;
    }

    private void zoijcleaow() {
    }

    private List zynmafqrjb(zoijcleaow zoijcleaowVar) {
        if (this.f54630eablkybsjg.containsKey(zoijcleaowVar)) {
            return (List) this.f54630eablkybsjg.get(zoijcleaowVar);
        }
        List arrayList = new ArrayList();
        if (zoijcleaowVar.wkgbmnqykc()) {
            if (zoijcleaowVar.iobyxmoadg() == 0) {
                arrayList.addAll(this.f54638lqeggnwhkg);
            }
        } else if (zoijcleaowVar.zoijcleaow() == 8) {
            int iIobyxmoadg = zoijcleaowVar.iobyxmoadg();
            if (iIobyxmoadg == 1) {
                arrayList = this.f54642ppxfxbqfkf;
            } else if (iIobyxmoadg != 2) {
                arrayList.addAll(zoijcleaowVar.ppxfxbqfkf() ? this.f54646wkgbmnqykc : this.f54634iobyxmoadg);
            } else {
                arrayList.addAll(this.f54649zoijcleaow);
                arrayList.addAll(this.f54634iobyxmoadg);
            }
        } else if (zoijcleaowVar.zoijcleaow() == 10 && zoijcleaowVar.iobyxmoadg() == 0) {
            arrayList.addAll(this.f54633gxszxtbevo);
        }
        this.f54630eablkybsjg.put(zoijcleaowVar, arrayList);
        return arrayList;
    }

    istkbnxepw.oipsdeybqn hkdspvbjdz(int i13, int i14, Size size) {
        return istkbnxepw.oipsdeybqn.nufgyqmvbu(i13, i14, size, iozdgvuglv(i14));
    }

    List iobyxmoadg(List list, int i13) {
        Rational rational;
        int iIobyxmoadg = this.f54635iwizpuwonk.iobyxmoadg(this.f54629dxjokdxxww, this.f54632gtknphoqwx);
        if (iIobyxmoadg == 0) {
            rational = cdpycssgdh.iobyxmoadg.f19703iobyxmoadg;
        } else if (iIobyxmoadg == 1) {
            rational = cdpycssgdh.iobyxmoadg.f19704ppxfxbqfkf;
        } else if (iIobyxmoadg != 2) {
            rational = null;
        } else {
            Size sizePpxfxbqfkf = iozdgvuglv(UserVerificationMethods.USER_VERIFY_HANDPRINT).ppxfxbqfkf(UserVerificationMethods.USER_VERIFY_HANDPRINT);
            rational = new Rational(sizePpxfxbqfkf.getWidth(), sizePpxfxbqfkf.getHeight());
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Size size = (Size) it.next();
                if (cdpycssgdh.iobyxmoadg.iobyxmoadg(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.f54627cqumvgiudr.iobyxmoadg(istkbnxepw.oipsdeybqn.eablkybsjg(i13), list);
    }

    istkbnxepw.bfopjjpdmp iozdgvuglv(int i13) {
        if (!this.f54647yggfygwlhe.contains(Integer.valueOf(i13))) {
            dsvhmnatus(this.f54648zdlpuopuiu.btonecajqb(), hcddaimhww.ppxfxbqfkf.f40067eablkybsjg, i13);
            dsvhmnatus(this.f54648zdlpuopuiu.nufgyqmvbu(), hcddaimhww.ppxfxbqfkf.f40070lqeggnwhkg, i13);
            cllcsxoeiz(this.f54648zdlpuopuiu.wkgbmnqykc(), i13);
            wypolnanlu(this.f54648zdlpuopuiu.draadjrbmk(), i13);
            this.f54647yggfygwlhe.add(Integer.valueOf(i13));
        }
        return this.f54648zdlpuopuiu;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    Pair pmvmpeiblj(int i13, List list, Map map, boolean z13, boolean z14) {
        Map map2;
        HashMap map3;
        HashMap map4;
        Range range;
        List list2;
        Map map5;
        int i14;
        String str;
        String str2;
        Map map6;
        List list3;
        String str3;
        String str4;
        Map map7;
        Map map8;
        List list4;
        List list5;
        HashMap map9;
        int i15;
        int i16;
        int i17;
        String str5;
        jpowsppfya();
        List arrayList = new ArrayList(map.keySet());
        List listWwaezpbzkn = wwaezpbzkn(arrayList);
        Map mapLqeggnwhkg = this.f54631esjtqupxsv.lqeggnwhkg(list, arrayList, listWwaezpbzkn);
        zoijcleaow zoijcleaowVarEablkybsjg = eablkybsjg(i13, mapLqeggnwhkg, z13, ylkuphrtab(list, map));
        boolean zHcddaimhww = hcddaimhww(zoijcleaowVarEablkybsjg, list, map);
        String str6 = ".  May be attempting to bind too many use cases. Existing surfaces: ";
        String str7 = " New configs: ";
        String str8 = "No supported surface combination is found for camera device - Id : ";
        if (!zHcddaimhww) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f54629dxjokdxxww + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
        }
        Range rangeCdpycssgdh = cdpycssgdh(list, arrayList, listWwaezpbzkn);
        Map mapGxszxtbevo = gxszxtbevo(map, zoijcleaowVarEablkybsjg, rangeCdpycssgdh);
        List arrayList2 = new ArrayList();
        Iterator it = listWwaezpbzkn.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.istkbnxepw istkbnxepwVar = (androidx.camera.core.impl.istkbnxepw) arrayList.get(((Integer) it.next()).intValue());
            arrayList2.add(iobyxmoadg((List) mapGxszxtbevo.get(istkbnxepwVar), istkbnxepwVar.wflxmlrfwp()));
        }
        List listOjitshcjhn = ojitshcjhn(arrayList2);
        HashMap map10 = new HashMap();
        HashMap map11 = new HashMap();
        Map map12 = new HashMap();
        Map map13 = new HashMap();
        boolean zWkgbmnqykc = b.wkgbmnqykc(list, arrayList);
        int iKcexrzcfyt = kcexrzcfyt(list);
        Map map14 = map13;
        if (!this.f54644vdvldrhtss || zWkgbmnqykc) {
            map2 = map12;
            map3 = map11;
            map4 = map10;
            range = rangeCdpycssgdh;
            list2 = listWwaezpbzkn;
            map5 = mapLqeggnwhkg;
            i14 = iKcexrzcfyt;
            str = "No supported surface combination is found for camera device - Id : ";
            str2 = " New configs: ";
            map6 = map14;
            list3 = null;
        } else {
            Iterator it2 = listOjitshcjhn.iterator();
            List listZdlpuopuiu = null;
            while (true) {
                if (!it2.hasNext()) {
                    map3 = map11;
                    map4 = map10;
                    range = rangeCdpycssgdh;
                    list2 = listWwaezpbzkn;
                    map5 = mapLqeggnwhkg;
                    i14 = iKcexrzcfyt;
                    str = str8;
                    str2 = str7;
                    str5 = str6;
                    map6 = map14;
                    map2 = map12;
                    break;
                }
                Map map15 = map14;
                Map map16 = map12;
                map3 = map11;
                map4 = map10;
                map5 = mapLqeggnwhkg;
                Range range2 = rangeCdpycssgdh;
                List list6 = listWwaezpbzkn;
                range = range2;
                str = str8;
                int i18 = iKcexrzcfyt;
                i14 = iKcexrzcfyt;
                str2 = str7;
                list2 = listWwaezpbzkn;
                str5 = str6;
                listZdlpuopuiu = zdlpuopuiu(zoijcleaowVarEablkybsjg, (List) istkbnxepw(i13, list, (List) it2.next(), arrayList, list6, i18, map16, map15).first);
                map2 = map16;
                map6 = map15;
                if (listZdlpuopuiu != null && !b.iobyxmoadg(map2, map6, listZdlpuopuiu)) {
                    listZdlpuopuiu = null;
                }
                if (listZdlpuopuiu != null) {
                    if (b.ppxfxbqfkf(this.f54632gtknphoqwx, listZdlpuopuiu)) {
                        break;
                    }
                    listZdlpuopuiu = null;
                }
                map2.clear();
                map6.clear();
                map14 = map6;
                map12 = map2;
                str6 = str5;
                str8 = str;
                str7 = str2;
                mapLqeggnwhkg = map5;
                map11 = map3;
                map10 = map4;
                rangeCdpycssgdh = range;
                iKcexrzcfyt = i14;
                listWwaezpbzkn = list2;
            }
            if (listZdlpuopuiu == null && !zHcddaimhww) {
                throw new IllegalArgumentException(str + this.f54629dxjokdxxww + str5 + list + str2 + arrayList);
            }
            list3 = listZdlpuopuiu;
        }
        Iterator it3 = listOjitshcjhn.iterator();
        int i19 = Integer.MAX_VALUE;
        int iIntValue = Integer.MAX_VALUE;
        boolean z15 = false;
        boolean z16 = false;
        List list7 = null;
        List list8 = null;
        while (true) {
            if (!it3.hasNext()) {
                str3 = str;
                str4 = str2;
                map7 = map6;
                map8 = map2;
                list4 = list7;
                list5 = list8;
                break;
            }
            List list9 = (List) it3.next();
            int i23 = i19;
            int i24 = iIntValue;
            str4 = str2;
            map7 = map6;
            str3 = str;
            map8 = map2;
            Pair pairIstkbnxepw = istkbnxepw(i13, list, list9, arrayList, list2, i14, null, null);
            List list10 = (List) pairIstkbnxepw.first;
            iIntValue = ((Integer) pairIstkbnxepw.second).intValue();
            int i25 = i14;
            boolean z17 = range == null || i25 <= iIntValue || iIntValue >= ((Integer) range.getLower()).intValue();
            if (z15 || !ppxfxbqfkf(zoijcleaowVarEablkybsjg, list10)) {
                i15 = i24;
                i16 = Integer.MAX_VALUE;
            } else {
                i15 = i24;
                i16 = Integer.MAX_VALUE;
                if (i15 == Integer.MAX_VALUE || i15 < iIntValue) {
                    i15 = iIntValue;
                    list7 = list9;
                }
                if (z17) {
                    if (z16) {
                        list5 = list8;
                        list4 = list9;
                        i19 = i23;
                        break;
                    }
                    z15 = true;
                    i15 = iIntValue;
                    list7 = list9;
                }
            }
            if (list3 == null || z16 || zdlpuopuiu(zoijcleaowVarEablkybsjg, list10) == null) {
                i17 = i23;
            } else {
                i17 = i23;
                if (i17 == i16 || i17 < iIntValue) {
                    i17 = iIntValue;
                    list8 = list9;
                }
                if (!z17) {
                    continue;
                } else {
                    if (z15) {
                        i19 = iIntValue;
                        iIntValue = i15;
                        list4 = list7;
                        list5 = list9;
                        break;
                    }
                    z16 = true;
                    i17 = iIntValue;
                    list8 = list9;
                }
            }
            i14 = i25;
            iIntValue = i15;
            map2 = map8;
            map6 = map7;
            str = str3;
            str2 = str4;
            i19 = i17;
        }
        if (list4 == null) {
            throw new IllegalArgumentException(str3 + this.f54629dxjokdxxww + " and Hardware level: " + this.f54645wflxmlrfwp + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + str4 + arrayList);
        }
        Range rangeRgvfuqvkyq = range != null ? rgvfuqvkyq(range, iIntValue) : null;
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            androidx.camera.core.impl.istkbnxepw istkbnxepwVar2 = (androidx.camera.core.impl.istkbnxepw) it4.next();
            List list11 = list2;
            Map map17 = map5;
            Iterator it5 = it4;
            androidx.camera.core.impl.iwizpuwonk.iobyxmoadg iobyxmoadgVarGxszxtbevo = androidx.camera.core.impl.iwizpuwonk.iobyxmoadg((Size) list4.get(list11.indexOf(Integer.valueOf(arrayList.indexOf(istkbnxepwVar2))))).zoijcleaow((lereixgezr.iwizpuwonk) u1.nufgyqmvbu.gxszxtbevo((lereixgezr.iwizpuwonk) map17.get(istkbnxepwVar2))).wkgbmnqykc(b.eablkybsjg(istkbnxepwVar2)).gxszxtbevo(z14);
            if (rangeRgvfuqvkyq != null) {
                iobyxmoadgVarGxszxtbevo.ppxfxbqfkf(rangeRgvfuqvkyq);
            }
            map3.put(istkbnxepwVar2, iobyxmoadgVarGxszxtbevo.iobyxmoadg());
            it4 = it5;
            list2 = list11;
            map5 = map17;
            rangeRgvfuqvkyq = rangeRgvfuqvkyq;
        }
        HashMap map18 = map3;
        if (list3 == null || iIntValue != i19 || list4.size() != list5.size()) {
            map9 = map4;
            break;
        }
        int i26 = 0;
        while (true) {
            if (i26 >= list4.size()) {
                map9 = map4;
                if (!b.gtknphoqwx(this.f54632gtknphoqwx, list, map18, map9)) {
                    b.draadjrbmk(map18, map9, map8, map7, list3);
                    break;
                }
                break;
            }
            if (!((Size) list4.get(i26)).equals(list5.get(i26))) {
                map9 = map4;
                break;
            }
            i26++;
        }
        return new Pair(map18, map9);
    }

    boolean ppxfxbqfkf(zoijcleaow zoijcleaowVar, List list) {
        Iterator it = zynmafqrjb(zoijcleaowVar).iterator();
        boolean z13 = false;
        while (it.hasNext()) {
            z13 = ((istkbnxepw.zfvoamnweg) it.next()).wkgbmnqykc(list) != null;
            if (z13) {
                break;
            }
        }
        return z13;
    }

    List zdlpuopuiu(zoijcleaow zoijcleaowVar, List list) {
        if (!b.agtfadlqog(zoijcleaowVar)) {
            return null;
        }
        Iterator it = this.f54639nufgyqmvbu.iterator();
        while (it.hasNext()) {
            List listWkgbmnqykc = ((istkbnxepw.zfvoamnweg) it.next()).wkgbmnqykc(list);
            if (listWkgbmnqykc != null) {
                return listWkgbmnqykc;
            }
        }
        return null;
    }
}
