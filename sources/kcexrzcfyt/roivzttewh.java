package kcexrzcfyt;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class roivzttewh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zdlpuopuiu.pmvmpeiblj f54979iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f54980ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yggfygwlhe.lqeggnwhkg f54981zoijcleaow;

    static final class iobyxmoadg {
        static lereixgezr.iwizpuwonk iobyxmoadg(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar) {
            Long l13 = (Long) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l13 != null) {
                return yggfygwlhe.wkgbmnqykc.zoijcleaow(l13.longValue());
            }
            return null;
        }
    }

    roivzttewh(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar) {
        this.f54979iobyxmoadg = pmvmpeibljVar;
        this.f54981zoijcleaow = yggfygwlhe.lqeggnwhkg.iobyxmoadg(pmvmpeibljVar);
        int[] iArr = (int[]) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z13 = false;
        if (iArr != null) {
            for (int i13 : iArr) {
                if (i13 == 18) {
                    z13 = true;
                    break;
                }
            }
        }
        this.f54980ppxfxbqfkf = z13;
    }

    private static void btonecajqb(Set set, lereixgezr.iwizpuwonk iwizpuwonkVar, yggfygwlhe.lqeggnwhkg lqeggnwhkgVar) {
        u1.nufgyqmvbu.dxjokdxxww(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set setZoijcleaow = lqeggnwhkgVar.zoijcleaow(iwizpuwonkVar);
        if (setZoijcleaow.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(set);
        set.retainAll(setZoijcleaow);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", iwizpuwonkVar, TextUtils.join("\n  ", setZoijcleaow), TextUtils.join("\n  ", hashSet)));
        }
    }

    private lereixgezr.iwizpuwonk dxjokdxxww(Set set, Set set2, Set set3, androidx.camera.core.impl.istkbnxepw istkbnxepwVar, Set set4) {
        lereixgezr.iwizpuwonk iwizpuwonkVarLmojexxdyd = istkbnxepwVar.lmojexxdyd();
        lereixgezr.iwizpuwonk iwizpuwonkVarNufgyqmvbu = nufgyqmvbu(iwizpuwonkVarLmojexxdyd, set4, set2, set3, istkbnxepwVar.stevsuqkhv());
        if (iwizpuwonkVarNufgyqmvbu == null) {
            throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", istkbnxepwVar.stevsuqkhv(), iwizpuwonkVarLmojexxdyd, TextUtils.join("\n  ", set), TextUtils.join("\n  ", set4)));
        }
        btonecajqb(set4, iwizpuwonkVarNufgyqmvbu, this.f54981zoijcleaow);
        return iwizpuwonkVarNufgyqmvbu;
    }

    private static boolean eablkybsjg(lereixgezr.iwizpuwonk iwizpuwonkVar) {
        return Objects.equals(iwizpuwonkVar, lereixgezr.iwizpuwonk.f62291ppxfxbqfkf);
    }

    private static boolean gxszxtbevo(lereixgezr.iwizpuwonk iwizpuwonkVar) {
        return iwizpuwonkVar.zoijcleaow() == 2 || (iwizpuwonkVar.zoijcleaow() != 0 && iwizpuwonkVar.iobyxmoadg() == 0) || (iwizpuwonkVar.zoijcleaow() == 0 && iwizpuwonkVar.iobyxmoadg() != 0);
    }

    private static boolean iobyxmoadg(lereixgezr.iwizpuwonk iwizpuwonkVar, lereixgezr.iwizpuwonk iwizpuwonkVar2) {
        u1.nufgyqmvbu.dxjokdxxww(iwizpuwonkVar2.eablkybsjg(), "Fully specified range is not actually fully specified.");
        if (iwizpuwonkVar.zoijcleaow() == 2 && iwizpuwonkVar2.zoijcleaow() == 1) {
            return false;
        }
        if (iwizpuwonkVar.zoijcleaow() == 2 || iwizpuwonkVar.zoijcleaow() == 0 || iwizpuwonkVar.zoijcleaow() == iwizpuwonkVar2.zoijcleaow()) {
            return iwizpuwonkVar.iobyxmoadg() == 0 || iwizpuwonkVar.iobyxmoadg() == iwizpuwonkVar2.iobyxmoadg();
        }
        return false;
    }

    private lereixgezr.iwizpuwonk nufgyqmvbu(lereixgezr.iwizpuwonk iwizpuwonkVar, Set set, Set set2, Set set3, String str) {
        lereixgezr.iwizpuwonk iwizpuwonkVarIobyxmoadg;
        if (iwizpuwonkVar.eablkybsjg()) {
            if (set.contains(iwizpuwonkVar)) {
                return iwizpuwonkVar;
            }
            return null;
        }
        int iZoijcleaow = iwizpuwonkVar.zoijcleaow();
        int iIobyxmoadg = iwizpuwonkVar.iobyxmoadg();
        if (iZoijcleaow == 1 && iIobyxmoadg == 0) {
            lereixgezr.iwizpuwonk iwizpuwonkVar2 = lereixgezr.iwizpuwonk.f62292wkgbmnqykc;
            if (set.contains(iwizpuwonkVar2)) {
                return iwizpuwonkVar2;
            }
            return null;
        }
        lereixgezr.iwizpuwonk iwizpuwonkVarPpxfxbqfkf = ppxfxbqfkf(iwizpuwonkVar, set2, set);
        if (iwizpuwonkVarPpxfxbqfkf != null) {
            lereixgezr.sopmlzcsov.iobyxmoadg("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, iwizpuwonkVar, iwizpuwonkVarPpxfxbqfkf));
            return iwizpuwonkVarPpxfxbqfkf;
        }
        lereixgezr.iwizpuwonk iwizpuwonkVarPpxfxbqfkf2 = ppxfxbqfkf(iwizpuwonkVar, set3, set);
        if (iwizpuwonkVarPpxfxbqfkf2 != null) {
            lereixgezr.sopmlzcsov.iobyxmoadg("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, iwizpuwonkVar, iwizpuwonkVarPpxfxbqfkf2));
            return iwizpuwonkVarPpxfxbqfkf2;
        }
        lereixgezr.iwizpuwonk iwizpuwonkVar3 = lereixgezr.iwizpuwonk.f62292wkgbmnqykc;
        if (zoijcleaow(iwizpuwonkVar, iwizpuwonkVar3, set)) {
            lereixgezr.sopmlzcsov.iobyxmoadg("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, iwizpuwonkVar, iwizpuwonkVar3));
            return iwizpuwonkVar3;
        }
        if (iZoijcleaow == 2 && (iIobyxmoadg == 10 || iIobyxmoadg == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                iwizpuwonkVarIobyxmoadg = iobyxmoadg.iobyxmoadg(this.f54979iobyxmoadg);
                if (iwizpuwonkVarIobyxmoadg != null) {
                    linkedHashSet.add(iwizpuwonkVarIobyxmoadg);
                }
            } else {
                iwizpuwonkVarIobyxmoadg = null;
            }
            linkedHashSet.add(lereixgezr.iwizpuwonk.f62288gxszxtbevo);
            lereixgezr.iwizpuwonk iwizpuwonkVarPpxfxbqfkf3 = ppxfxbqfkf(iwizpuwonkVar, linkedHashSet, set);
            if (iwizpuwonkVarPpxfxbqfkf3 != null) {
                lereixgezr.sopmlzcsov.iobyxmoadg("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", str, iwizpuwonkVarPpxfxbqfkf3.equals(iwizpuwonkVarIobyxmoadg) ? "recommended" : "required", iwizpuwonkVar, iwizpuwonkVarPpxfxbqfkf3));
                return iwizpuwonkVarPpxfxbqfkf3;
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            lereixgezr.iwizpuwonk iwizpuwonkVar4 = (lereixgezr.iwizpuwonk) it.next();
            u1.nufgyqmvbu.dxjokdxxww(iwizpuwonkVar4.eablkybsjg(), "Candidate dynamic range must be fully specified.");
            if (!iwizpuwonkVar4.equals(lereixgezr.iwizpuwonk.f62292wkgbmnqykc) && iobyxmoadg(iwizpuwonkVar, iwizpuwonkVar4)) {
                lereixgezr.sopmlzcsov.iobyxmoadg("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, iwizpuwonkVar, iwizpuwonkVar4));
                return iwizpuwonkVar4;
            }
        }
        return null;
    }

    private static lereixgezr.iwizpuwonk ppxfxbqfkf(lereixgezr.iwizpuwonk iwizpuwonkVar, Collection collection, Set set) {
        if (iwizpuwonkVar.zoijcleaow() == 1) {
            return null;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            lereixgezr.iwizpuwonk iwizpuwonkVar2 = (lereixgezr.iwizpuwonk) it.next();
            u1.nufgyqmvbu.lqeggnwhkg(iwizpuwonkVar2, "Fully specified DynamicRange cannot be null.");
            int iZoijcleaow = iwizpuwonkVar2.zoijcleaow();
            u1.nufgyqmvbu.dxjokdxxww(iwizpuwonkVar2.eablkybsjg(), "Fully specified DynamicRange must have fully defined encoding.");
            if (iZoijcleaow != 1 && zoijcleaow(iwizpuwonkVar, iwizpuwonkVar2, set)) {
                return iwizpuwonkVar2;
            }
        }
        return null;
    }

    private static boolean zoijcleaow(lereixgezr.iwizpuwonk iwizpuwonkVar, lereixgezr.iwizpuwonk iwizpuwonkVar2, Set set) {
        if (set.contains(iwizpuwonkVar2)) {
            return iobyxmoadg(iwizpuwonkVar, iwizpuwonkVar2);
        }
        lereixgezr.sopmlzcsov.iobyxmoadg("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", iwizpuwonkVar, iwizpuwonkVar2));
        return false;
    }

    Map lqeggnwhkg(List list, List list2, List list3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((androidx.camera.core.impl.iobyxmoadg) it.next()).ppxfxbqfkf());
        }
        Set setPpxfxbqfkf = this.f54981zoijcleaow.ppxfxbqfkf();
        HashSet hashSet = new HashSet(setPpxfxbqfkf);
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            btonecajqb(hashSet, (lereixgezr.iwizpuwonk) it2.next(), this.f54981zoijcleaow);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            androidx.camera.core.impl.istkbnxepw istkbnxepwVar = (androidx.camera.core.impl.istkbnxepw) list2.get(((Integer) it3.next()).intValue());
            lereixgezr.iwizpuwonk iwizpuwonkVarLmojexxdyd = istkbnxepwVar.lmojexxdyd();
            if (eablkybsjg(iwizpuwonkVarLmojexxdyd)) {
                arrayList3.add(istkbnxepwVar);
            } else if (gxszxtbevo(iwizpuwonkVarLmojexxdyd)) {
                arrayList2.add(istkbnxepwVar);
            } else {
                arrayList.add(istkbnxepwVar);
            }
        }
        HashMap map = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<androidx.camera.core.impl.istkbnxepw> arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (androidx.camera.core.impl.istkbnxepw istkbnxepwVar2 : arrayList4) {
            lereixgezr.iwizpuwonk iwizpuwonkVarDxjokdxxww = dxjokdxxww(setPpxfxbqfkf, linkedHashSet, linkedHashSet2, istkbnxepwVar2, hashSet);
            map.put(istkbnxepwVar2, iwizpuwonkVarDxjokdxxww);
            if (!linkedHashSet.contains(iwizpuwonkVarDxjokdxxww)) {
                linkedHashSet2.add(iwizpuwonkVarDxjokdxxww);
            }
        }
        return map;
    }

    boolean wkgbmnqykc() {
        return this.f54980ppxfxbqfkf;
    }
}
