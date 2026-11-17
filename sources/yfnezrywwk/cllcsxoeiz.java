package yfnezrywwk;

import androidx.compose.foundation.lazy.layout.jhduphickx;
import java.util.List;
import jztzpxfvev.xrmfcynszj;

/* JADX INFO: loaded from: classes.dex */
public abstract class cllcsxoeiz {

    public static final class iobyxmoadg implements jhduphickx, xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final /* synthetic */ xrmfcynszj f124745iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ mbcevpiqjq f124746zoijcleaow;

        iobyxmoadg(xrmfcynszj xrmfcynszjVar, mbcevpiqjq mbcevpiqjqVar) {
            this.f124746zoijcleaow = mbcevpiqjqVar;
            this.f124745iobyxmoadg = xrmfcynszjVar;
        }

        @Override // androidx.compose.foundation.lazy.layout.jhduphickx
        public int gxszxtbevo(int i13, int i14) {
            Object obj;
            cqumvgiudr cqumvgiudrVarCdpycssgdh = this.f124746zoijcleaow.cdpycssgdh();
            int iIobyxmoadg = 0;
            if (cqumvgiudrVarCdpycssgdh.nufgyqmvbu().isEmpty()) {
                return 0;
            }
            int iNufgyqmvbu = nufgyqmvbu();
            if (i13 > zoijcleaow() || iNufgyqmvbu > i13) {
                iIobyxmoadg = (esjtqupxsv.iobyxmoadg(cqumvgiudrVarCdpycssgdh) * (i13 - nufgyqmvbu())) - lqeggnwhkg();
            } else {
                List listNufgyqmvbu = cqumvgiudrVarCdpycssgdh.nufgyqmvbu();
                int size = listNufgyqmvbu.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        obj = null;
                        break;
                    }
                    obj = listNufgyqmvbu.get(i15);
                    if (((agtfadlqog) obj).getIndex() == i13) {
                        break;
                    }
                    i15++;
                }
                agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
                if (agtfadlqogVar != null) {
                    iIobyxmoadg = agtfadlqogVar.iobyxmoadg();
                }
            }
            return iIobyxmoadg + i14;
        }

        @Override // androidx.compose.foundation.lazy.layout.jhduphickx
        public int iobyxmoadg() {
            return this.f124746zoijcleaow.cdpycssgdh().gxszxtbevo();
        }

        @Override // androidx.compose.foundation.lazy.layout.jhduphickx
        public int lqeggnwhkg() {
            return this.f124746zoijcleaow.lereixgezr();
        }

        @Override // androidx.compose.foundation.lazy.layout.jhduphickx
        public int nufgyqmvbu() {
            return this.f124746zoijcleaow.esjtqupxsv();
        }

        @Override // androidx.compose.foundation.lazy.layout.jhduphickx
        public void ppxfxbqfkf(int i13, int i14) {
            this.f124746zoijcleaow.ulzqkzuiru(i13, i14, true);
        }

        @Override // jztzpxfvev.xrmfcynszj
        public float wkgbmnqykc(float f13) {
            return this.f124745iobyxmoadg.wkgbmnqykc(f13);
        }

        @Override // androidx.compose.foundation.lazy.layout.jhduphickx
        public int zoijcleaow() {
            agtfadlqog agtfadlqogVar = (agtfadlqog) hg.jyumaefscl.lxfrhoxuzk(this.f124746zoijcleaow.cdpycssgdh().nufgyqmvbu());
            if (agtfadlqogVar != null) {
                return agtfadlqogVar.getIndex();
            }
            return 0;
        }
    }

    public static final jhduphickx iobyxmoadg(mbcevpiqjq mbcevpiqjqVar, xrmfcynszj xrmfcynszjVar) {
        return new iobyxmoadg(xrmfcynszjVar, mbcevpiqjqVar);
    }
}
