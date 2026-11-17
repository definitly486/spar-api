package j0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cqumvgiudr implements iozdgvuglv {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f50143eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final eablkybsjg f50144iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gg.gtknphoqwx f50145ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gg.gtknphoqwx f50146wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f50147zoijcleaow;

    public cqumvgiudr(eablkybsjg eablkybsjgVar, n nVar, List list, w0.wkgbmnqykc wkgbmnqykcVar, n0.wflxmlrfwp.zoijcleaow zoijcleaowVar) {
        this.f50144iobyxmoadg = eablkybsjgVar;
        this.f50147zoijcleaow = list;
        gg.ojitshcjhn ojitshcjhnVar = gg.ojitshcjhn.NONE;
        this.f50145ppxfxbqfkf = gg.draadjrbmk.iobyxmoadg(ojitshcjhnVar, new tg.iobyxmoadg() { // from class: j0.jyumaefscl
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Float.valueOf(cqumvgiudr.gtknphoqwx(this.f50282zdlpuopuiu));
            }
        });
        this.f50146wkgbmnqykc = gg.draadjrbmk.iobyxmoadg(ojitshcjhnVar, new tg.iobyxmoadg() { // from class: j0.iwizpuwonk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Float.valueOf(cqumvgiudr.btonecajqb(this.f50258zdlpuopuiu));
            }
        });
        ylkuphrtab ylkuphrtabVarHkdspvbjdz = nVar.hkdspvbjdz();
        List listGtknphoqwx = lqeggnwhkg.gtknphoqwx(eablkybsjgVar, ylkuphrtabVarHkdspvbjdz);
        ArrayList arrayList = new ArrayList(listGtknphoqwx.size());
        int size = listGtknphoqwx.size();
        for (int i13 = 0; i13 < size; i13++) {
            eablkybsjg.wkgbmnqykc wkgbmnqykcVar2 = (eablkybsjg.wkgbmnqykc) listGtknphoqwx.get(i13);
            eablkybsjg eablkybsjgVarDraadjrbmk = lqeggnwhkg.draadjrbmk(eablkybsjgVar, wkgbmnqykcVar2.nufgyqmvbu(), wkgbmnqykcVar2.gxszxtbevo());
            ylkuphrtab ylkuphrtabVarDraadjrbmk = draadjrbmk((ylkuphrtab) wkgbmnqykcVar2.lqeggnwhkg(), ylkuphrtabVarHkdspvbjdz);
            String strBtonecajqb = eablkybsjgVarDraadjrbmk.btonecajqb();
            n nVarYlkuphrtab = nVar.ylkuphrtab(ylkuphrtabVarDraadjrbmk);
            List listPpxfxbqfkf = eablkybsjgVarDraadjrbmk.ppxfxbqfkf();
            if (listPpxfxbqfkf == null) {
                listPpxfxbqfkf = hg.jyumaefscl.wflxmlrfwp();
            }
            arrayList.add(new yadqdtsiqt(lmojexxdyd.iobyxmoadg(strBtonecajqb, nVarYlkuphrtab, listPpxfxbqfkf, wkgbmnqykcVar, zoijcleaowVar, esjtqupxsv.zoijcleaow(dxjokdxxww(), wkgbmnqykcVar2.nufgyqmvbu(), wkgbmnqykcVar2.gxszxtbevo())), wkgbmnqykcVar2.nufgyqmvbu(), wkgbmnqykcVar2.gxszxtbevo()));
        }
        this.f50143eablkybsjg = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float btonecajqb(cqumvgiudr cqumvgiudrVar) {
        Object obj;
        iozdgvuglv iozdgvuglvVarZoijcleaow;
        List list = cqumvgiudrVar.f50143eablkybsjg;
        if (list.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = list.get(0);
            float fIobyxmoadg = ((yadqdtsiqt) obj2).zoijcleaow().iobyxmoadg();
            int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(list);
            int i13 = 1;
            if (1 <= iOjitshcjhn) {
                while (true) {
                    Object obj3 = list.get(i13);
                    float fIobyxmoadg2 = ((yadqdtsiqt) obj3).zoijcleaow().iobyxmoadg();
                    if (Float.compare(fIobyxmoadg, fIobyxmoadg2) < 0) {
                        obj2 = obj3;
                        fIobyxmoadg = fIobyxmoadg2;
                    }
                    if (i13 == iOjitshcjhn) {
                        break;
                    }
                    i13++;
                }
            }
            obj = obj2;
        }
        yadqdtsiqt yadqdtsiqtVar = (yadqdtsiqt) obj;
        if (yadqdtsiqtVar == null || (iozdgvuglvVarZoijcleaow = yadqdtsiqtVar.zoijcleaow()) == null) {
            return 0.0f;
        }
        return iozdgvuglvVarZoijcleaow.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ylkuphrtab draadjrbmk(ylkuphrtab ylkuphrtabVar, ylkuphrtab ylkuphrtabVar2) {
        return !v0.draadjrbmk.btonecajqb(ylkuphrtabVar.dxjokdxxww(), v0.draadjrbmk.f114942zoijcleaow.gxszxtbevo()) ? ylkuphrtabVar : ylkuphrtabVar.iobyxmoadg((509 & 1) != 0 ? ylkuphrtabVar.f50332iobyxmoadg : 0, (509 & 2) != 0 ? ylkuphrtabVar.f50337zoijcleaow : ylkuphrtabVar2.dxjokdxxww(), (509 & 4) != 0 ? ylkuphrtabVar.f50335ppxfxbqfkf : 0L, (509 & 8) != 0 ? ylkuphrtabVar.f50336wkgbmnqykc : null, (509 & 16) != 0 ? ylkuphrtabVar.f50330eablkybsjg : null, (509 & 32) != 0 ? ylkuphrtabVar.f50331gxszxtbevo : null, (509 & 64) != 0 ? ylkuphrtabVar.f50333lqeggnwhkg : 0, (509 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? ylkuphrtabVar.f50334nufgyqmvbu : 0, (509 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? ylkuphrtabVar.f50329dxjokdxxww : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float gtknphoqwx(cqumvgiudr cqumvgiudrVar) {
        Object obj;
        iozdgvuglv iozdgvuglvVarZoijcleaow;
        List list = cqumvgiudrVar.f50143eablkybsjg;
        if (list.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = list.get(0);
            float fZoijcleaow = ((yadqdtsiqt) obj2).zoijcleaow().zoijcleaow();
            int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(list);
            int i13 = 1;
            if (1 <= iOjitshcjhn) {
                while (true) {
                    Object obj3 = list.get(i13);
                    float fZoijcleaow2 = ((yadqdtsiqt) obj3).zoijcleaow().zoijcleaow();
                    if (Float.compare(fZoijcleaow, fZoijcleaow2) < 0) {
                        obj2 = obj3;
                        fZoijcleaow = fZoijcleaow2;
                    }
                    if (i13 == iOjitshcjhn) {
                        break;
                    }
                    i13++;
                }
            }
            obj = obj2;
        }
        yadqdtsiqt yadqdtsiqtVar = (yadqdtsiqt) obj;
        if (yadqdtsiqtVar == null || (iozdgvuglvVarZoijcleaow = yadqdtsiqtVar.zoijcleaow()) == null) {
            return 0.0f;
        }
        return iozdgvuglvVarZoijcleaow.zoijcleaow();
    }

    public final List dxjokdxxww() {
        return this.f50147zoijcleaow;
    }

    @Override // j0.iozdgvuglv
    public float iobyxmoadg() {
        return ((Number) this.f50146wkgbmnqykc.getValue()).floatValue();
    }

    public final eablkybsjg lqeggnwhkg() {
        return this.f50144iobyxmoadg;
    }

    public final List nufgyqmvbu() {
        return this.f50143eablkybsjg;
    }

    @Override // j0.iozdgvuglv
    public boolean ppxfxbqfkf() {
        List list = this.f50143eablkybsjg;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (((yadqdtsiqt) list.get(i13)).zoijcleaow().ppxfxbqfkf()) {
                return true;
            }
        }
        return false;
    }

    @Override // j0.iozdgvuglv
    public float zoijcleaow() {
        return ((Number) this.f50145ppxfxbqfkf.getValue()).floatValue();
    }
}
