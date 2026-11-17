package kcexrzcfyt;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final androidx.camera.core.impl.btonecajqb.iobyxmoadg f54608iobyxmoadg = androidx.camera.core.impl.btonecajqb.iobyxmoadg.iobyxmoadg("camera2.streamSpec.streamUseCase", Long.TYPE);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Map f54609ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Map f54610zoijcleaow;

    static {
        HashMap map = new HashMap();
        f54610zoijcleaow = map;
        HashMap map2 = new HashMap();
        f54609ppxfxbqfkf = map2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            androidx.camera.core.impl.cdpycssgdh.zoijcleaow zoijcleaowVar = androidx.camera.core.impl.cdpycssgdh.zoijcleaow.PREVIEW;
            hashSet.add(zoijcleaowVar);
            androidx.camera.core.impl.cdpycssgdh.zoijcleaow zoijcleaowVar2 = androidx.camera.core.impl.cdpycssgdh.zoijcleaow.METERING_REPEATING;
            hashSet.add(zoijcleaowVar2);
            map.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(zoijcleaowVar);
            hashSet2.add(zoijcleaowVar2);
            hashSet2.add(androidx.camera.core.impl.cdpycssgdh.zoijcleaow.IMAGE_ANALYSIS);
            map.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            androidx.camera.core.impl.cdpycssgdh.zoijcleaow zoijcleaowVar3 = androidx.camera.core.impl.cdpycssgdh.zoijcleaow.IMAGE_CAPTURE;
            hashSet3.add(zoijcleaowVar3);
            map.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            androidx.camera.core.impl.cdpycssgdh.zoijcleaow zoijcleaowVar4 = androidx.camera.core.impl.cdpycssgdh.zoijcleaow.VIDEO_CAPTURE;
            hashSet4.add(zoijcleaowVar4);
            map.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(zoijcleaowVar);
            hashSet5.add(zoijcleaowVar3);
            hashSet5.add(zoijcleaowVar4);
            map2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(zoijcleaowVar);
            hashSet6.add(zoijcleaowVar4);
            map2.put(3L, hashSet6);
        }
    }

    public static boolean agtfadlqog(d.zoijcleaow zoijcleaowVar) {
        return zoijcleaowVar.iobyxmoadg() == 0 && zoijcleaowVar.zoijcleaow() == 8;
    }

    private static boolean btonecajqb(androidx.camera.core.impl.btonecajqb btonecajqbVar, androidx.camera.core.impl.cdpycssgdh.zoijcleaow zoijcleaowVar) {
        if (((Boolean) btonecajqbVar.lqeggnwhkg(androidx.camera.core.impl.istkbnxepw.f3798lereixgezr, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar = androidx.camera.core.impl.agtfadlqog.f3734pkzmftpjix;
        return btonecajqbVar.zoijcleaow(iobyxmoadgVar) && q.zoijcleaow(zoijcleaowVar, ((Integer) btonecajqbVar.iobyxmoadg(iobyxmoadgVar)).intValue()) == 5;
    }

    public static void draadjrbmk(Map map, Map map2, Map map3, Map map4, List list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            long jGxszxtbevo = ((istkbnxepw.oipsdeybqn) list.get(i13)).gxszxtbevo();
            if (map3.containsKey(Integer.valueOf(i13))) {
                androidx.camera.core.impl.iobyxmoadg iobyxmoadgVar = (androidx.camera.core.impl.iobyxmoadg) map3.get(Integer.valueOf(i13));
                androidx.camera.core.impl.btonecajqb btonecajqbVarGxszxtbevo = gxszxtbevo(iobyxmoadgVar.eablkybsjg(), jGxszxtbevo);
                if (btonecajqbVarGxszxtbevo != null) {
                    map2.put(iobyxmoadgVar, iobyxmoadgVar.dxjokdxxww(btonecajqbVarGxszxtbevo));
                }
            } else {
                if (!map4.containsKey(Integer.valueOf(i13))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                androidx.camera.core.impl.istkbnxepw istkbnxepwVar = (androidx.camera.core.impl.istkbnxepw) map4.get(Integer.valueOf(i13));
                androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar = (androidx.camera.core.impl.iwizpuwonk) map.get(istkbnxepwVar);
                androidx.camera.core.impl.btonecajqb btonecajqbVarGxszxtbevo2 = gxszxtbevo(iwizpuwonkVar.wkgbmnqykc(), jGxszxtbevo);
                if (btonecajqbVarGxszxtbevo2 != null) {
                    map.put(istkbnxepwVar, iwizpuwonkVar.lqeggnwhkg().wkgbmnqykc(btonecajqbVarGxszxtbevo2).iobyxmoadg());
                }
            }
        }
    }

    private static boolean dxjokdxxww(List list, List list2, Set set) {
        boolean z13;
        boolean z14;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            androidx.camera.core.impl.iobyxmoadg iobyxmoadgVar = (androidx.camera.core.impl.iobyxmoadg) it.next();
            androidx.camera.core.impl.btonecajqb btonecajqbVarEablkybsjg = iobyxmoadgVar.eablkybsjg();
            androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar2 = oxmwwwfdhm.iobyxmoadg.f75073hcddaimhww;
            if (btonecajqbVarEablkybsjg.zoijcleaow(iobyxmoadgVar2) && ((Long) iobyxmoadgVar.eablkybsjg().iobyxmoadg(iobyxmoadgVar2)).longValue() != 0) {
                z13 = true;
                z14 = false;
            } else {
                z14 = true;
                z13 = false;
            }
        } else {
            z13 = false;
            z14 = false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            androidx.camera.core.impl.istkbnxepw istkbnxepwVar = (androidx.camera.core.impl.istkbnxepw) it2.next();
            androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar3 = oxmwwwfdhm.iobyxmoadg.f75073hcddaimhww;
            if (istkbnxepwVar.zoijcleaow(iobyxmoadgVar3)) {
                Long l13 = (Long) istkbnxepwVar.iobyxmoadg(iobyxmoadgVar3);
                if (l13.longValue() != 0) {
                    if (z14) {
                        ojitshcjhn();
                    }
                    hashSet.add(l13);
                    z13 = true;
                } else if (z13) {
                    ojitshcjhn();
                }
            } else if (z13) {
                ojitshcjhn();
            }
            z14 = true;
        }
        return !z14 && zoijcleaow(set, hashSet);
    }

    public static oxmwwwfdhm.iobyxmoadg eablkybsjg(androidx.camera.core.impl.istkbnxepw istkbnxepwVar) {
        androidx.camera.core.impl.oxmwwwfdhm oxmwwwfdhmVarJhduphickx = androidx.camera.core.impl.oxmwwwfdhm.jhduphickx();
        androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar = oxmwwwfdhm.iobyxmoadg.f75073hcddaimhww;
        if (istkbnxepwVar.zoijcleaow(iobyxmoadgVar)) {
            oxmwwwfdhmVarJhduphickx.vdvldrhtss(iobyxmoadgVar, (Long) istkbnxepwVar.iobyxmoadg(iobyxmoadgVar));
        }
        androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar2 = androidx.camera.core.impl.istkbnxepw.f3798lereixgezr;
        if (istkbnxepwVar.zoijcleaow(iobyxmoadgVar2)) {
            oxmwwwfdhmVarJhduphickx.vdvldrhtss(iobyxmoadgVar2, (Boolean) istkbnxepwVar.iobyxmoadg(iobyxmoadgVar2));
        }
        androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar3 = androidx.camera.core.impl.agtfadlqog.f3734pkzmftpjix;
        if (istkbnxepwVar.zoijcleaow(iobyxmoadgVar3)) {
            oxmwwwfdhmVarJhduphickx.vdvldrhtss(iobyxmoadgVar3, (Integer) istkbnxepwVar.iobyxmoadg(iobyxmoadgVar3));
        }
        androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar4 = androidx.camera.core.impl.ojitshcjhn.f3844nufgyqmvbu;
        if (istkbnxepwVar.zoijcleaow(iobyxmoadgVar4)) {
            oxmwwwfdhmVarJhduphickx.vdvldrhtss(iobyxmoadgVar4, (Integer) istkbnxepwVar.iobyxmoadg(iobyxmoadgVar4));
        }
        return new oxmwwwfdhm.iobyxmoadg(oxmwwwfdhmVarJhduphickx);
    }

    public static boolean gtknphoqwx(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar, List list, Map map, Map map2) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList<androidx.camera.core.impl.istkbnxepw> arrayList = new ArrayList(map.keySet());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u1.nufgyqmvbu.gxszxtbevo(((androidx.camera.core.impl.iobyxmoadg) it.next()).eablkybsjg());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            u1.nufgyqmvbu.gxszxtbevo(((androidx.camera.core.impl.iwizpuwonk) u1.nufgyqmvbu.gxszxtbevo((androidx.camera.core.impl.iwizpuwonk) map.get((androidx.camera.core.impl.istkbnxepw) it2.next()))).wkgbmnqykc());
        }
        long[] jArr = (long[]) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        if (jArr != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j13 : jArr) {
                hashSet.add(Long.valueOf(j13));
            }
            if (dxjokdxxww(list, arrayList, hashSet)) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    androidx.camera.core.impl.iobyxmoadg iobyxmoadgVar = (androidx.camera.core.impl.iobyxmoadg) it3.next();
                    androidx.camera.core.impl.btonecajqb btonecajqbVarEablkybsjg = iobyxmoadgVar.eablkybsjg();
                    androidx.camera.core.impl.btonecajqb btonecajqbVarGxszxtbevo = gxszxtbevo(btonecajqbVarEablkybsjg, ((Long) btonecajqbVarEablkybsjg.iobyxmoadg(oxmwwwfdhm.iobyxmoadg.f75073hcddaimhww)).longValue());
                    if (btonecajqbVarGxszxtbevo != null) {
                        map2.put(iobyxmoadgVar, iobyxmoadgVar.dxjokdxxww(btonecajqbVarGxszxtbevo));
                    }
                }
                for (androidx.camera.core.impl.istkbnxepw istkbnxepwVar : arrayList) {
                    androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar = (androidx.camera.core.impl.iwizpuwonk) map.get(istkbnxepwVar);
                    androidx.camera.core.impl.btonecajqb btonecajqbVarWkgbmnqykc = iwizpuwonkVar.wkgbmnqykc();
                    androidx.camera.core.impl.btonecajqb btonecajqbVarGxszxtbevo2 = gxszxtbevo(btonecajqbVarWkgbmnqykc, ((Long) btonecajqbVarWkgbmnqykc.iobyxmoadg(oxmwwwfdhm.iobyxmoadg.f75073hcddaimhww)).longValue());
                    if (btonecajqbVarGxszxtbevo2 != null) {
                        map.put(istkbnxepwVar, iwizpuwonkVar.lqeggnwhkg().wkgbmnqykc(btonecajqbVarGxszxtbevo2).iobyxmoadg());
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static androidx.camera.core.impl.btonecajqb gxszxtbevo(androidx.camera.core.impl.btonecajqb btonecajqbVar, long j13) {
        androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar = f54608iobyxmoadg;
        if (btonecajqbVar.zoijcleaow(iobyxmoadgVar) && ((Long) btonecajqbVar.iobyxmoadg(iobyxmoadgVar)).longValue() == j13) {
            return null;
        }
        androidx.camera.core.impl.oxmwwwfdhm oxmwwwfdhmVarIkoacuggdj = androidx.camera.core.impl.oxmwwwfdhm.ikoacuggdj(btonecajqbVar);
        oxmwwwfdhmVarIkoacuggdj.vdvldrhtss(iobyxmoadgVar, Long.valueOf(j13));
        return new oxmwwwfdhm.iobyxmoadg(oxmwwwfdhmVarIkoacuggdj);
    }

    public static boolean iobyxmoadg(Map map, Map map2, List list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            long jGxszxtbevo = ((istkbnxepw.oipsdeybqn) list.get(i13)).gxszxtbevo();
            if (map.containsKey(Integer.valueOf(i13))) {
                androidx.camera.core.impl.iobyxmoadg iobyxmoadgVar = (androidx.camera.core.impl.iobyxmoadg) map.get(Integer.valueOf(i13));
                if (!lqeggnwhkg(iobyxmoadgVar.zoijcleaow().size() == 1 ? (androidx.camera.core.impl.cdpycssgdh.zoijcleaow) iobyxmoadgVar.zoijcleaow().get(0) : androidx.camera.core.impl.cdpycssgdh.zoijcleaow.STREAM_SHARING, jGxszxtbevo, iobyxmoadgVar.zoijcleaow())) {
                    return false;
                }
            } else {
                if (!map2.containsKey(Integer.valueOf(i13))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                androidx.camera.core.impl.istkbnxepw istkbnxepwVar = (androidx.camera.core.impl.istkbnxepw) map2.get(Integer.valueOf(i13));
                if (!lqeggnwhkg(istkbnxepwVar.dsvhmnatus(), jGxszxtbevo, istkbnxepwVar.dsvhmnatus() == androidx.camera.core.impl.cdpycssgdh.zoijcleaow.STREAM_SHARING ? ((wypolnanlu.btonecajqb) istkbnxepwVar).crxdokpmqz() : Collections.emptyList())) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean lqeggnwhkg(androidx.camera.core.impl.cdpycssgdh.zoijcleaow zoijcleaowVar, long j13, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (zoijcleaowVar != androidx.camera.core.impl.cdpycssgdh.zoijcleaow.STREAM_SHARING) {
            Map map = f54610zoijcleaow;
            return map.containsKey(Long.valueOf(j13)) && ((Set) map.get(Long.valueOf(j13))).contains(zoijcleaowVar);
        }
        Map map2 = f54609ppxfxbqfkf;
        if (!map2.containsKey(Long.valueOf(j13))) {
            return false;
        }
        Set set = (Set) map2.get(Long.valueOf(j13));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((androidx.camera.core.impl.cdpycssgdh.zoijcleaow) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean nufgyqmvbu(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar) {
        long[] jArr;
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    private static void ojitshcjhn() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }

    public static boolean ppxfxbqfkf(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar, List list) {
        long[] jArr;
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (long j13 : jArr) {
            hashSet.add(Long.valueOf(j13));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(Long.valueOf(((istkbnxepw.oipsdeybqn) it.next()).gxszxtbevo()))) {
                return false;
            }
        }
        return true;
    }

    public static void wflxmlrfwp(Collection collection, Collection collection2, Map map) {
        ArrayList arrayList = new ArrayList(collection2);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.jyumaefscl jyumaefsclVar = (androidx.camera.core.impl.jyumaefscl) it.next();
            androidx.camera.core.impl.btonecajqb btonecajqbVarGxszxtbevo = jyumaefsclVar.gxszxtbevo();
            androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar = f54608iobyxmoadg;
            if (btonecajqbVarGxszxtbevo.zoijcleaow(iobyxmoadgVar) && jyumaefsclVar.ojitshcjhn().size() != 1) {
                lereixgezr.sopmlzcsov.ppxfxbqfkf("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(jyumaefsclVar.ojitshcjhn().size())));
                return;
            }
            if (jyumaefsclVar.gxszxtbevo().zoijcleaow(iobyxmoadgVar)) {
                Iterator it2 = collection.iterator();
                int i13 = 0;
                while (it2.hasNext()) {
                    androidx.camera.core.impl.jyumaefscl jyumaefsclVar2 = (androidx.camera.core.impl.jyumaefscl) it2.next();
                    if (((androidx.camera.core.impl.istkbnxepw) arrayList.get(i13)).dsvhmnatus() == androidx.camera.core.impl.cdpycssgdh.zoijcleaow.METERING_REPEATING) {
                        u1.nufgyqmvbu.dxjokdxxww(!jyumaefsclVar2.ojitshcjhn().isEmpty(), "MeteringRepeating should contain a surface");
                        map.put((DeferrableSurface) jyumaefsclVar2.ojitshcjhn().get(0), 1L);
                    } else {
                        androidx.camera.core.impl.btonecajqb btonecajqbVarGxszxtbevo2 = jyumaefsclVar2.gxszxtbevo();
                        androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar2 = f54608iobyxmoadg;
                        if (btonecajqbVarGxszxtbevo2.zoijcleaow(iobyxmoadgVar2) && !jyumaefsclVar2.ojitshcjhn().isEmpty()) {
                            map.put((DeferrableSurface) jyumaefsclVar2.ojitshcjhn().get(0), (Long) jyumaefsclVar2.gxszxtbevo().iobyxmoadg(iobyxmoadgVar2));
                        }
                    }
                    i13++;
                }
                return;
            }
        }
    }

    public static boolean wkgbmnqykc(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.iobyxmoadg iobyxmoadgVar = (androidx.camera.core.impl.iobyxmoadg) it.next();
            if (btonecajqb(iobyxmoadgVar.eablkybsjg(), (androidx.camera.core.impl.cdpycssgdh.zoijcleaow) iobyxmoadgVar.zoijcleaow().get(0))) {
                return true;
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            androidx.camera.core.impl.istkbnxepw istkbnxepwVar = (androidx.camera.core.impl.istkbnxepw) it2.next();
            if (btonecajqb(istkbnxepwVar, istkbnxepwVar.dsvhmnatus())) {
                return true;
            }
        }
        return false;
    }

    private static boolean zoijcleaow(Set set, Set set2) {
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (!set.contains((Long) it.next())) {
                return false;
            }
        }
        return true;
    }
}
