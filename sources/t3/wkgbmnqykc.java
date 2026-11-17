package t3;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final int f109548btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final String f109549draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final int f109550dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final int f109551eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final float f109552gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final int f109553gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final List f109554iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final int f109555lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final int f109556nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f109557ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final int f109558wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f109559zoijcleaow;

    private wkgbmnqykc(List list, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23, int i24, float f13, String str) {
        this.f109554iobyxmoadg = list;
        this.f109559zoijcleaow = i13;
        this.f109557ppxfxbqfkf = i14;
        this.f109558wkgbmnqykc = i15;
        this.f109551eablkybsjg = i16;
        this.f109553gxszxtbevo = i17;
        this.f109555lqeggnwhkg = i18;
        this.f109556nufgyqmvbu = i19;
        this.f109550dxjokdxxww = i23;
        this.f109548btonecajqb = i24;
        this.f109552gtknphoqwx = f13;
        this.f109549draadjrbmk = str;
    }

    private static byte[] iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) {
        int iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        yadqdtsiqtVar.crxdokpmqz(iWypolnanlu);
        return y2.btonecajqb.lqeggnwhkg(yadqdtsiqtVar.eablkybsjg(), iGxszxtbevo, iWypolnanlu);
    }

    public static wkgbmnqykc zoijcleaow(y2.yadqdtsiqt yadqdtsiqtVar) throws ParserException {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f13;
        String strWkgbmnqykc;
        int i23;
        try {
            yadqdtsiqtVar.crxdokpmqz(4);
            int iWwaezpbzkn = (yadqdtsiqtVar.wwaezpbzkn() & 3) + 1;
            if (iWwaezpbzkn == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn() & 31;
            for (int i24 = 0; i24 < iWwaezpbzkn2; i24++) {
                arrayList.add(iobyxmoadg(yadqdtsiqtVar));
            }
            int iWwaezpbzkn3 = yadqdtsiqtVar.wwaezpbzkn();
            for (int i25 = 0; i25 < iWwaezpbzkn3; i25++) {
                arrayList.add(iobyxmoadg(yadqdtsiqtVar));
            }
            if (iWwaezpbzkn2 > 0) {
                z2.gxszxtbevo.wflxmlrfwp wflxmlrfwpVarIstkbnxepw = z2.gxszxtbevo.istkbnxepw((byte[]) arrayList.get(0), z2.gxszxtbevo.f127610iobyxmoadg.length, ((byte[]) arrayList.get(0)).length);
                int i26 = wflxmlrfwpVarIstkbnxepw.f127671gxszxtbevo;
                int i27 = wflxmlrfwpVarIstkbnxepw.f127674lqeggnwhkg;
                int i28 = wflxmlrfwpVarIstkbnxepw.f127668dxjokdxxww + 8;
                int i29 = wflxmlrfwpVarIstkbnxepw.f127666btonecajqb + 8;
                int i33 = wflxmlrfwpVarIstkbnxepw.f127680vdvldrhtss;
                int i34 = wflxmlrfwpVarIstkbnxepw.f127677oxmwwwfdhm;
                int i35 = wflxmlrfwpVarIstkbnxepw.f127673kcexrzcfyt;
                int i36 = wflxmlrfwpVarIstkbnxepw.f127683zdlpuopuiu;
                float f14 = wflxmlrfwpVarIstkbnxepw.f127675nufgyqmvbu;
                strWkgbmnqykc = y2.btonecajqb.wkgbmnqykc(wflxmlrfwpVarIstkbnxepw.f127672iobyxmoadg, wflxmlrfwpVarIstkbnxepw.f127684zoijcleaow, wflxmlrfwpVarIstkbnxepw.f127678ppxfxbqfkf);
                i19 = i35;
                i23 = i36;
                f13 = f14;
                i16 = i29;
                i17 = i33;
                i18 = i34;
                i13 = i26;
                i14 = i27;
                i15 = i28;
            } else {
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = -1;
                i17 = -1;
                i18 = -1;
                i19 = -1;
                f13 = 1.0f;
                strWkgbmnqykc = null;
                i23 = 16;
            }
            return new wkgbmnqykc(arrayList, iWwaezpbzkn, i13, i14, i15, i16, i17, i18, i19, i23, f13, strWkgbmnqykc);
        } catch (ArrayIndexOutOfBoundsException e13) {
            throw ParserException.iobyxmoadg("Error parsing AVC config", e13);
        }
    }
}
