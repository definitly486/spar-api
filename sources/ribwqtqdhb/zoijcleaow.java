package ribwqtqdhb;

import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.List;
import x.istkbnxepw;
import x.pmvmpeiblj;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final eablkybsjg f82848iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f82849zoijcleaow;

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f82850zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(List list) {
            super(1);
            this.f82850zdlpuopuiu = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
            List list = this.f82850zdlpuopuiu;
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cdpycssgdh(iobyxmoadgVar, (androidx.compose.ui.layout.kcexrzcfyt) list.get(i13), 0, 0, 0.0f, 4, null);
            }
        }
    }

    public zoijcleaow(eablkybsjg eablkybsjgVar) {
        this.f82848iobyxmoadg = eablkybsjgVar;
    }

    @Override // x.zynmafqrjb
    public int btonecajqb(x.wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
        if (list.isEmpty()) {
            return 0;
        }
        int iWypolnanlu = ((x.draadjrbmk) list.get(0)).wypolnanlu(i13);
        int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(list);
        int i14 = 1;
        if (1 <= iOjitshcjhn) {
            while (true) {
                int iWypolnanlu2 = ((x.draadjrbmk) list.get(i14)).wypolnanlu(i13);
                if (iWypolnanlu2 > iWypolnanlu) {
                    iWypolnanlu = iWypolnanlu2;
                }
                if (i14 == iOjitshcjhn) {
                    break;
                }
                i14++;
            }
        }
        return iWypolnanlu;
    }

    @Override // x.zynmafqrjb
    public int gxszxtbevo(x.wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
        if (list.isEmpty()) {
            return 0;
        }
        int iYggfygwlhe = ((x.draadjrbmk) list.get(0)).yggfygwlhe(i13);
        int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(list);
        int i14 = 1;
        if (1 <= iOjitshcjhn) {
            while (true) {
                int iYggfygwlhe2 = ((x.draadjrbmk) list.get(i14)).yggfygwlhe(i13);
                if (iYggfygwlhe2 > iYggfygwlhe) {
                    iYggfygwlhe = iYggfygwlhe2;
                }
                if (i14 == iOjitshcjhn) {
                    break;
                }
                i14++;
            }
        }
        return iYggfygwlhe;
    }

    @Override // x.zynmafqrjb
    public int iobyxmoadg(x.wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
        if (list.isEmpty()) {
            return 0;
        }
        int iCzzsidtyhn = ((x.draadjrbmk) list.get(0)).czzsidtyhn(i13);
        int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(list);
        int i14 = 1;
        if (1 <= iOjitshcjhn) {
            while (true) {
                int iCzzsidtyhn2 = ((x.draadjrbmk) list.get(i14)).czzsidtyhn(i13);
                if (iCzzsidtyhn2 > iCzzsidtyhn) {
                    iCzzsidtyhn = iCzzsidtyhn2;
                }
                if (i14 == iOjitshcjhn) {
                    break;
                }
                i14++;
            }
        }
        return iCzzsidtyhn;
    }

    @Override // x.zynmafqrjb
    public istkbnxepw lqeggnwhkg(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, List list, long j13) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = ((pmvmpeiblj) list.get(i13)).sflfametgt(j13);
            iMax = Math.max(iMax, kcexrzcfytVarSflfametgt.eslsurpljm());
            iMax2 = Math.max(iMax2, kcexrzcfytVarSflfametgt.ipoelvxyzq());
            arrayList.add(kcexrzcfytVarSflfametgt);
        }
        if (draadjrbmkVar.zeieaojujs()) {
            this.f82849zoijcleaow = true;
            this.f82848iobyxmoadg.iobyxmoadg().setValue(w0.oxmwwwfdhm.zoijcleaow(w0.oxmwwwfdhm.ppxfxbqfkf((4294967295L & ((long) iMax2)) | (((long) iMax) << 32))));
        } else if (!this.f82849zoijcleaow) {
            this.f82848iobyxmoadg.iobyxmoadg().setValue(w0.oxmwwwfdhm.zoijcleaow(w0.oxmwwwfdhm.ppxfxbqfkf((4294967295L & ((long) iMax2)) | (((long) iMax) << 32))));
        }
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, iMax, iMax2, null, new iobyxmoadg(arrayList), 4, null);
    }

    @Override // x.zynmafqrjb
    public int zoijcleaow(x.wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
        if (list.isEmpty()) {
            return 0;
        }
        int iYdmasvzmpa = ((x.draadjrbmk) list.get(0)).ydmasvzmpa(i13);
        int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(list);
        int i14 = 1;
        if (1 <= iOjitshcjhn) {
            while (true) {
                int iYdmasvzmpa2 = ((x.draadjrbmk) list.get(i14)).ydmasvzmpa(i13);
                if (iYdmasvzmpa2 > iYdmasvzmpa) {
                    iYdmasvzmpa = iYdmasvzmpa2;
                }
                if (i14 == iOjitshcjhn) {
                    break;
                }
                i14++;
            }
        }
        return iYdmasvzmpa;
    }
}
