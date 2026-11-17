package androidx.compose.foundation.lazy.layout;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface jrbgnlbqoe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f5028iobyxmoadg = iobyxmoadg.f5029iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f5029iobyxmoadg = new iobyxmoadg();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final jrbgnlbqoe f5030zoijcleaow = new C0086iobyxmoadg();

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.jrbgnlbqoe$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0086iobyxmoadg implements jrbgnlbqoe {
            C0086iobyxmoadg() {
            }

            @Override // androidx.compose.foundation.lazy.layout.jrbgnlbqoe
            public int iobyxmoadg(List list, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                Object obj;
                int size = list.size();
                int i23 = 0;
                while (true) {
                    if (i23 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i23);
                    if (((cllcsxoeiz) obj).getIndex() != i13) {
                        break;
                    }
                    i23++;
                }
                cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) obj;
                int iPpxfxbqfkf = cllcsxoeizVar != null ? zfvoamnweg.ppxfxbqfkf(cllcsxoeizVar) : Integer.MIN_VALUE;
                int iMax = i15 == Integer.MIN_VALUE ? -i16 : Math.max(-i16, i15);
                return iPpxfxbqfkf != Integer.MIN_VALUE ? Math.min(iMax, iPpxfxbqfkf - i14) : iMax;
            }

            @Override // androidx.compose.foundation.lazy.layout.jrbgnlbqoe
            public androidx.collection.wflxmlrfwp zoijcleaow(int i13, int i14, androidx.collection.wflxmlrfwp wflxmlrfwpVar) {
                int i15;
                if (i14 - i13 < 0 || (i15 = wflxmlrfwpVar.f4401zoijcleaow) == 0) {
                    return androidx.collection.agtfadlqog.iobyxmoadg();
                }
                zg.btonecajqb btonecajqbVarJyumaefscl = zg.gtknphoqwx.jyumaefscl(0, i15);
                int iWkgbmnqykc = btonecajqbVarJyumaefscl.wkgbmnqykc();
                int iEablkybsjg = btonecajqbVarJyumaefscl.eablkybsjg();
                int iEablkybsjg2 = -1;
                if (iWkgbmnqykc <= iEablkybsjg) {
                    while (wflxmlrfwpVar.eablkybsjg(iWkgbmnqykc) <= i13) {
                        iEablkybsjg2 = wflxmlrfwpVar.eablkybsjg(iWkgbmnqykc);
                        if (iWkgbmnqykc == iEablkybsjg) {
                            break;
                        }
                        iWkgbmnqykc++;
                    }
                }
                return iEablkybsjg2 == -1 ? androidx.collection.agtfadlqog.iobyxmoadg() : androidx.collection.agtfadlqog.zoijcleaow(iEablkybsjg2);
            }
        }

        private iobyxmoadg() {
        }

        public final jrbgnlbqoe iobyxmoadg() {
            return f5030zoijcleaow;
        }
    }

    int iobyxmoadg(List list, int i13, int i14, int i15, int i16, int i17, int i18, int i19);

    androidx.collection.wflxmlrfwp zoijcleaow(int i13, int i14, androidx.collection.wflxmlrfwp wflxmlrfwpVar);
}
