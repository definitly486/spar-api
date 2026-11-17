package opjhrmiecq;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class hszhottldk implements x.zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.iobyxmoadg f73588iobyxmoadg;

    public hszhottldk(tg.iobyxmoadg iobyxmoadgVar) {
        this.f73588iobyxmoadg = iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wkgbmnqykc(List list, hszhottldk hszhottldkVar, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        List listIstkbnxepw = pmvmpeiblj.istkbnxepw(list, hszhottldkVar.f73588iobyxmoadg);
        if (listIstkbnxepw != null) {
            int size = listIstkbnxepw.size();
            for (int i13 = 0; i13 < size; i13++) {
                gg.vdvldrhtss vdvldrhtssVar = (gg.vdvldrhtss) listIstkbnxepw.get(i13);
                androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar = (androidx.compose.ui.layout.kcexrzcfyt) vdvldrhtssVar.iobyxmoadg();
                tg.iobyxmoadg iobyxmoadgVar2 = (tg.iobyxmoadg) vdvldrhtssVar.wkgbmnqykc();
                androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.lmojexxdyd(iobyxmoadgVar, kcexrzcfytVar, iobyxmoadgVar2 != null ? ((w0.agtfadlqog) iobyxmoadgVar2.invoke()).rgvfuqvkyq() : w0.agtfadlqog.f118237zoijcleaow.zoijcleaow(), 0.0f, 2, null);
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // x.zynmafqrjb
    public x.istkbnxepw lqeggnwhkg(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, final List list, long j13) {
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, w0.zoijcleaow.draadjrbmk(j13), w0.zoijcleaow.gtknphoqwx(j13), null, new tg.draadjrbmk() { // from class: opjhrmiecq.wizcaqwiak
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return hszhottldk.wkgbmnqykc(list, this, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }
}
