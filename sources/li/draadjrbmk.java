package li;

import java.util.Comparator;
import jh.crxdokpmqz;
import jh.lereixgezr;
import jh.uwvvkdfqfp;

/* JADX INFO: loaded from: classes3.dex */
public class draadjrbmk implements Comparator {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final draadjrbmk f62591zdlpuopuiu = new draadjrbmk();

    private draadjrbmk() {
    }

    private static int ppxfxbqfkf(jh.wflxmlrfwp wflxmlrfwpVar) {
        if (dxjokdxxww.zynmafqrjb(wflxmlrfwpVar)) {
            return 8;
        }
        if (wflxmlrfwpVar instanceof jh.draadjrbmk) {
            return 7;
        }
        if (wflxmlrfwpVar instanceof crxdokpmqz) {
            return ((crxdokpmqz) wflxmlrfwpVar).hkdspvbjdz() == null ? 6 : 5;
        }
        if (wflxmlrfwpVar instanceof lereixgezr) {
            return ((lereixgezr) wflxmlrfwpVar).hkdspvbjdz() == null ? 4 : 3;
        }
        if (wflxmlrfwpVar instanceof jh.eablkybsjg) {
            return 2;
        }
        return wflxmlrfwpVar instanceof uwvvkdfqfp ? 1 : 0;
    }

    private static Integer zoijcleaow(jh.wflxmlrfwp wflxmlrfwpVar, jh.wflxmlrfwp wflxmlrfwpVar2) {
        int iPpxfxbqfkf = ppxfxbqfkf(wflxmlrfwpVar2) - ppxfxbqfkf(wflxmlrfwpVar);
        if (iPpxfxbqfkf != 0) {
            return Integer.valueOf(iPpxfxbqfkf);
        }
        if (dxjokdxxww.zynmafqrjb(wflxmlrfwpVar) && dxjokdxxww.zynmafqrjb(wflxmlrfwpVar2)) {
            return 0;
        }
        int iCompareTo = wflxmlrfwpVar.getName().compareTo(wflxmlrfwpVar2.getName());
        if (iCompareTo != 0) {
            return Integer.valueOf(iCompareTo);
        }
        return null;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public int compare(jh.wflxmlrfwp wflxmlrfwpVar, jh.wflxmlrfwp wflxmlrfwpVar2) {
        Integer numZoijcleaow = zoijcleaow(wflxmlrfwpVar, wflxmlrfwpVar2);
        if (numZoijcleaow != null) {
            return numZoijcleaow.intValue();
        }
        return 0;
    }
}
