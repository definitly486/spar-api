package ydmasvzmpa;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class sopmlzcsov {

    public static final class iobyxmoadg implements androidx.compose.foundation.lazy.layout.jhduphickx, jztzpxfvev.xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final /* synthetic */ jztzpxfvev.xrmfcynszj f124607iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ metgxyhuhe f124608zoijcleaow;

        iobyxmoadg(jztzpxfvev.xrmfcynszj xrmfcynszjVar, metgxyhuhe metgxyhuheVar) {
            this.f124608zoijcleaow = metgxyhuheVar;
            this.f124607iobyxmoadg = xrmfcynszjVar;
        }

        @Override // androidx.compose.foundation.lazy.layout.jhduphickx
        public int gxszxtbevo(int i13, int i14) {
            Integer numValueOf;
            Object obj;
            yadqdtsiqt yadqdtsiqtVarYadqdtsiqt = this.f124608zoijcleaow.yadqdtsiqt();
            int iIobyxmoadg = 0;
            if (yadqdtsiqtVarYadqdtsiqt.nufgyqmvbu().isEmpty()) {
                return 0;
            }
            int iNufgyqmvbu = nufgyqmvbu();
            if (i13 > zoijcleaow() || iNufgyqmvbu > i13) {
                int iWypolnanlu = this.f124608zoijcleaow.wypolnanlu();
                iIobyxmoadg = (iozdgvuglv.iobyxmoadg(yadqdtsiqtVarYadqdtsiqt) * (((i13 - nufgyqmvbu()) + ((iWypolnanlu - 1) * ((i13 < nufgyqmvbu() ? 1 : 0) != 0 ? -1 : 1))) / iWypolnanlu)) - lqeggnwhkg();
            } else {
                List listNufgyqmvbu = yadqdtsiqtVarYadqdtsiqt.nufgyqmvbu();
                int size = listNufgyqmvbu.size();
                int i15 = 0;
                while (true) {
                    numValueOf = null;
                    if (i15 >= size) {
                        obj = null;
                        break;
                    }
                    obj = listNufgyqmvbu.get(i15);
                    if (((rgvfuqvkyq) obj).getIndex() == i13) {
                        break;
                    }
                    i15++;
                }
                rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
                if (yadqdtsiqtVarYadqdtsiqt.getOrientation() == jztzpxfvev.jlmebxxoox.Vertical) {
                    if (rgvfuqvkyqVar != null) {
                        numValueOf = Integer.valueOf(w0.agtfadlqog.btonecajqb(rgvfuqvkyqVar.ojitshcjhn()));
                    }
                } else if (rgvfuqvkyqVar != null) {
                    numValueOf = Integer.valueOf(w0.agtfadlqog.dxjokdxxww(rgvfuqvkyqVar.ojitshcjhn()));
                }
                if (numValueOf != null) {
                    iIobyxmoadg = numValueOf.intValue();
                }
            }
            return iIobyxmoadg + i14;
        }

        @Override // androidx.compose.foundation.lazy.layout.jhduphickx
        public int iobyxmoadg() {
            return this.f124608zoijcleaow.yadqdtsiqt().gxszxtbevo();
        }

        @Override // androidx.compose.foundation.lazy.layout.jhduphickx
        public int lqeggnwhkg() {
            return this.f124608zoijcleaow.pmvmpeiblj();
        }

        @Override // androidx.compose.foundation.lazy.layout.jhduphickx
        public int nufgyqmvbu() {
            return this.f124608zoijcleaow.lereixgezr();
        }

        @Override // androidx.compose.foundation.lazy.layout.jhduphickx
        public void ppxfxbqfkf(int i13, int i14) {
            this.f124608zoijcleaow.jlmebxxoox(i13, i14, true);
        }

        @Override // jztzpxfvev.xrmfcynszj
        public float wkgbmnqykc(float f13) {
            return this.f124607iobyxmoadg.wkgbmnqykc(f13);
        }

        @Override // androidx.compose.foundation.lazy.layout.jhduphickx
        public int zoijcleaow() {
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) hg.jyumaefscl.lxfrhoxuzk(this.f124608zoijcleaow.yadqdtsiqt().nufgyqmvbu());
            if (rgvfuqvkyqVar != null) {
                return rgvfuqvkyqVar.getIndex();
            }
            return 0;
        }
    }

    public static final androidx.compose.foundation.lazy.layout.jhduphickx iobyxmoadg(metgxyhuhe metgxyhuheVar, jztzpxfvev.xrmfcynszj xrmfcynszjVar) {
        return new iobyxmoadg(xrmfcynszjVar, metgxyhuheVar);
    }
}
