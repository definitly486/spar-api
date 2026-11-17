package n0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class esjtqupxsv {
    public final List iobyxmoadg(List list, yadqdtsiqt yadqdtsiqtVar, int i13) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            Object obj = list.get(i15);
            draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVar.zoijcleaow(), yadqdtsiqtVar) && lereixgezr.gxszxtbevo(draadjrbmkVar.ppxfxbqfkf(), i13)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i16 = 0; i16 < size2; i16++) {
            Object obj2 = list.get(i16);
            if (lereixgezr.gxszxtbevo(((draadjrbmk) obj2).ppxfxbqfkf(), i13)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        yadqdtsiqt.iobyxmoadg iobyxmoadgVar = yadqdtsiqt.f68367yggfygwlhe;
        yadqdtsiqt yadqdtsiqtVar2 = null;
        if (yadqdtsiqtVar.compareTo(iobyxmoadgVar.eablkybsjg()) < 0) {
            int size3 = list.size();
            yadqdtsiqt yadqdtsiqtVar3 = null;
            for (int i17 = 0; i17 < size3; i17++) {
                yadqdtsiqt yadqdtsiqtVarZoijcleaow = ((draadjrbmk) list.get(i17)).zoijcleaow();
                if (yadqdtsiqtVarZoijcleaow.compareTo(yadqdtsiqtVar) >= 0) {
                    if (yadqdtsiqtVarZoijcleaow.compareTo(yadqdtsiqtVar) <= 0) {
                        yadqdtsiqtVar3 = yadqdtsiqtVarZoijcleaow;
                        yadqdtsiqtVar2 = yadqdtsiqtVar3;
                        break;
                    }
                    if (yadqdtsiqtVar3 == null || yadqdtsiqtVarZoijcleaow.compareTo(yadqdtsiqtVar3) < 0) {
                        yadqdtsiqtVar3 = yadqdtsiqtVarZoijcleaow;
                    }
                } else if (yadqdtsiqtVar2 == null || yadqdtsiqtVarZoijcleaow.compareTo(yadqdtsiqtVar2) > 0) {
                    yadqdtsiqtVar2 = yadqdtsiqtVarZoijcleaow;
                }
            }
            if (yadqdtsiqtVar2 != null) {
                yadqdtsiqtVar3 = yadqdtsiqtVar2;
            }
            ArrayList arrayList3 = new ArrayList(list.size());
            int size4 = list.size();
            while (i14 < size4) {
                Object obj3 = list.get(i14);
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((draadjrbmk) obj3).zoijcleaow(), yadqdtsiqtVar3)) {
                    arrayList3.add(obj3);
                }
                i14++;
            }
            return arrayList3;
        }
        if (yadqdtsiqtVar.compareTo(iobyxmoadgVar.gxszxtbevo()) > 0) {
            int size5 = list.size();
            yadqdtsiqt yadqdtsiqtVar4 = null;
            for (int i18 = 0; i18 < size5; i18++) {
                yadqdtsiqt yadqdtsiqtVarZoijcleaow2 = ((draadjrbmk) list.get(i18)).zoijcleaow();
                if (yadqdtsiqtVarZoijcleaow2.compareTo(yadqdtsiqtVar) >= 0) {
                    if (yadqdtsiqtVarZoijcleaow2.compareTo(yadqdtsiqtVar) <= 0) {
                        yadqdtsiqtVar4 = yadqdtsiqtVarZoijcleaow2;
                        yadqdtsiqtVar2 = yadqdtsiqtVar4;
                        break;
                    }
                    if (yadqdtsiqtVar4 == null || yadqdtsiqtVarZoijcleaow2.compareTo(yadqdtsiqtVar4) < 0) {
                        yadqdtsiqtVar4 = yadqdtsiqtVarZoijcleaow2;
                    }
                } else if (yadqdtsiqtVar2 == null || yadqdtsiqtVarZoijcleaow2.compareTo(yadqdtsiqtVar2) > 0) {
                    yadqdtsiqtVar2 = yadqdtsiqtVarZoijcleaow2;
                }
            }
            if (yadqdtsiqtVar4 == null) {
                yadqdtsiqtVar4 = yadqdtsiqtVar2;
            }
            ArrayList arrayList4 = new ArrayList(list.size());
            int size6 = list.size();
            while (i14 < size6) {
                Object obj4 = list.get(i14);
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((draadjrbmk) obj4).zoijcleaow(), yadqdtsiqtVar4)) {
                    arrayList4.add(obj4);
                }
                i14++;
            }
            return arrayList4;
        }
        yadqdtsiqt yadqdtsiqtVarGxszxtbevo = iobyxmoadgVar.gxszxtbevo();
        int size7 = list.size();
        yadqdtsiqt yadqdtsiqtVar5 = null;
        yadqdtsiqt yadqdtsiqtVar6 = null;
        for (int i19 = 0; i19 < size7; i19++) {
            yadqdtsiqt yadqdtsiqtVarZoijcleaow3 = ((draadjrbmk) list.get(i19)).zoijcleaow();
            if (yadqdtsiqtVarGxszxtbevo == null || yadqdtsiqtVarZoijcleaow3.compareTo(yadqdtsiqtVarGxszxtbevo) <= 0) {
                if (yadqdtsiqtVarZoijcleaow3.compareTo(yadqdtsiqtVar) >= 0) {
                    if (yadqdtsiqtVarZoijcleaow3.compareTo(yadqdtsiqtVar) <= 0) {
                        yadqdtsiqtVar5 = yadqdtsiqtVarZoijcleaow3;
                        yadqdtsiqtVar6 = yadqdtsiqtVar5;
                        break;
                    }
                    if (yadqdtsiqtVar6 == null || yadqdtsiqtVarZoijcleaow3.compareTo(yadqdtsiqtVar6) < 0) {
                        yadqdtsiqtVar6 = yadqdtsiqtVarZoijcleaow3;
                    }
                } else if (yadqdtsiqtVar5 == null || yadqdtsiqtVarZoijcleaow3.compareTo(yadqdtsiqtVar5) > 0) {
                    yadqdtsiqtVar5 = yadqdtsiqtVarZoijcleaow3;
                }
            }
        }
        if (yadqdtsiqtVar6 != null) {
            yadqdtsiqtVar5 = yadqdtsiqtVar6;
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        int size8 = list.size();
        for (int i23 = 0; i23 < size8; i23++) {
            Object obj5 = list.get(i23);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((draadjrbmk) obj5).zoijcleaow(), yadqdtsiqtVar5)) {
                arrayList5.add(obj5);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        yadqdtsiqt yadqdtsiqtVarGxszxtbevo2 = yadqdtsiqt.f68367yggfygwlhe.gxszxtbevo();
        int size9 = list.size();
        yadqdtsiqt yadqdtsiqtVar7 = null;
        for (int i24 = 0; i24 < size9; i24++) {
            yadqdtsiqt yadqdtsiqtVarZoijcleaow4 = ((draadjrbmk) list.get(i24)).zoijcleaow();
            if (yadqdtsiqtVarGxszxtbevo2 == null || yadqdtsiqtVarZoijcleaow4.compareTo(yadqdtsiqtVarGxszxtbevo2) >= 0) {
                if (yadqdtsiqtVarZoijcleaow4.compareTo(yadqdtsiqtVar) >= 0) {
                    if (yadqdtsiqtVarZoijcleaow4.compareTo(yadqdtsiqtVar) <= 0) {
                        yadqdtsiqtVar2 = yadqdtsiqtVarZoijcleaow4;
                        yadqdtsiqtVar7 = yadqdtsiqtVar2;
                        break;
                    }
                    if (yadqdtsiqtVar7 == null || yadqdtsiqtVarZoijcleaow4.compareTo(yadqdtsiqtVar7) < 0) {
                        yadqdtsiqtVar7 = yadqdtsiqtVarZoijcleaow4;
                    }
                } else if (yadqdtsiqtVar2 == null || yadqdtsiqtVarZoijcleaow4.compareTo(yadqdtsiqtVar2) > 0) {
                    yadqdtsiqtVar2 = yadqdtsiqtVarZoijcleaow4;
                }
            }
        }
        if (yadqdtsiqtVar7 != null) {
            yadqdtsiqtVar2 = yadqdtsiqtVar7;
        }
        ArrayList arrayList6 = new ArrayList(list.size());
        int size10 = list.size();
        while (i14 < size10) {
            Object obj6 = list.get(i14);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((draadjrbmk) obj6).zoijcleaow(), yadqdtsiqtVar2)) {
                arrayList6.add(obj6);
            }
            i14++;
        }
        return arrayList6;
    }
}
