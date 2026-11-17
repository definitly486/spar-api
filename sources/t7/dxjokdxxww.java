package t7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public class dxjokdxxww implements cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final dxjokdxxww f109948iobyxmoadg = new dxjokdxxww();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final u7.ppxfxbqfkf.iobyxmoadg f109949zoijcleaow = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private dxjokdxxww() {
    }

    @Override // t7.cllcsxoeiz
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public o7.zoijcleaow iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, float f13) {
        o7.zoijcleaow.iobyxmoadg iobyxmoadgVar = o7.zoijcleaow.iobyxmoadg.CENTER;
        ppxfxbqfkfVar.lqeggnwhkg();
        o7.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar;
        String strVdvldrhtss = null;
        String strVdvldrhtss2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fAgtfadlqog = 0.0f;
        float fAgtfadlqog2 = 0.0f;
        float fAgtfadlqog3 = 0.0f;
        float fAgtfadlqog4 = 0.0f;
        int iOjitshcjhn = 0;
        int iWkgbmnqykc = 0;
        int iWkgbmnqykc2 = 0;
        boolean zDraadjrbmk = true;
        while (ppxfxbqfkfVar.btonecajqb()) {
            switch (ppxfxbqfkfVar.cqumvgiudr(f109949zoijcleaow)) {
                case 0:
                    strVdvldrhtss = ppxfxbqfkfVar.vdvldrhtss();
                    break;
                case 1:
                    strVdvldrhtss2 = ppxfxbqfkfVar.vdvldrhtss();
                    break;
                case 2:
                    fAgtfadlqog = (float) ppxfxbqfkfVar.agtfadlqog();
                    break;
                case 3:
                    int iOjitshcjhn2 = ppxfxbqfkfVar.ojitshcjhn();
                    iobyxmoadgVar2 = o7.zoijcleaow.iobyxmoadg.CENTER;
                    if (iOjitshcjhn2 <= iobyxmoadgVar2.ordinal() && iOjitshcjhn2 >= 0) {
                        iobyxmoadgVar2 = o7.zoijcleaow.iobyxmoadg.values()[iOjitshcjhn2];
                    }
                    break;
                case 4:
                    iOjitshcjhn = ppxfxbqfkfVar.ojitshcjhn();
                    break;
                case 5:
                    fAgtfadlqog2 = (float) ppxfxbqfkfVar.agtfadlqog();
                    break;
                case 6:
                    fAgtfadlqog3 = (float) ppxfxbqfkfVar.agtfadlqog();
                    break;
                case 7:
                    iWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(ppxfxbqfkfVar);
                    break;
                case 8:
                    iWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(ppxfxbqfkfVar);
                    break;
                case 9:
                    fAgtfadlqog4 = (float) ppxfxbqfkfVar.agtfadlqog();
                    break;
                case 10:
                    zDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
                    break;
                case 11:
                    ppxfxbqfkfVar.wkgbmnqykc();
                    PointF pointF3 = new PointF(((float) ppxfxbqfkfVar.agtfadlqog()) * f13, ((float) ppxfxbqfkfVar.agtfadlqog()) * f13);
                    ppxfxbqfkfVar.nufgyqmvbu();
                    pointF = pointF3;
                    break;
                case 12:
                    ppxfxbqfkfVar.wkgbmnqykc();
                    PointF pointF4 = new PointF(((float) ppxfxbqfkfVar.agtfadlqog()) * f13, ((float) ppxfxbqfkfVar.agtfadlqog()) * f13);
                    ppxfxbqfkfVar.nufgyqmvbu();
                    pointF2 = pointF4;
                    break;
                default:
                    ppxfxbqfkfVar.lereixgezr();
                    ppxfxbqfkfVar.pmvmpeiblj();
                    break;
            }
        }
        ppxfxbqfkfVar.dxjokdxxww();
        return new o7.zoijcleaow(strVdvldrhtss, strVdvldrhtss2, fAgtfadlqog, iobyxmoadgVar2, iOjitshcjhn, fAgtfadlqog2, fAgtfadlqog3, iWkgbmnqykc, iWkgbmnqykc2, fAgtfadlqog4, zDraadjrbmk, pointF, pointF2);
    }
}
