package yfnezrywwk;

import androidx.compose.foundation.lazy.layout.metgxyhuhe;
import androidx.compose.foundation.lazy.layout.xrmfcynszj;
import jztzpxfvev.jlmebxxoox;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {

    public static final class iobyxmoadg implements xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ mbcevpiqjq f124829iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ boolean f124830zoijcleaow;

        iobyxmoadg(mbcevpiqjq mbcevpiqjqVar, boolean z13) {
            this.f124829iobyxmoadg = mbcevpiqjqVar;
            this.f124830zoijcleaow = z13;
        }

        @Override // androidx.compose.foundation.lazy.layout.xrmfcynszj
        public int eablkybsjg() {
            return (int) (this.f124829iobyxmoadg.cdpycssgdh().getOrientation() == jlmebxxoox.Vertical ? this.f124829iobyxmoadg.cdpycssgdh().iobyxmoadg() & 4294967295L : this.f124829iobyxmoadg.cdpycssgdh().iobyxmoadg() >> 32);
        }

        @Override // androidx.compose.foundation.lazy.layout.xrmfcynszj
        public float gxszxtbevo() {
            return metgxyhuhe.zoijcleaow(this.f124829iobyxmoadg.esjtqupxsv(), this.f124829iobyxmoadg.lereixgezr());
        }

        @Override // androidx.compose.foundation.lazy.layout.xrmfcynszj
        public int iobyxmoadg() {
            return this.f124829iobyxmoadg.cdpycssgdh().wkgbmnqykc() + this.f124829iobyxmoadg.cdpycssgdh().zoijcleaow();
        }

        @Override // androidx.compose.foundation.lazy.layout.xrmfcynszj
        public float ppxfxbqfkf() {
            return metgxyhuhe.iobyxmoadg(this.f124829iobyxmoadg.esjtqupxsv(), this.f124829iobyxmoadg.lereixgezr(), this.f124829iobyxmoadg.eablkybsjg());
        }

        @Override // androidx.compose.foundation.lazy.layout.xrmfcynszj
        public g0.zoijcleaow wkgbmnqykc() {
            return this.f124830zoijcleaow ? new g0.zoijcleaow(this.f124829iobyxmoadg.cdpycssgdh().gxszxtbevo(), 1) : new g0.zoijcleaow(1, this.f124829iobyxmoadg.cdpycssgdh().gxszxtbevo());
        }

        @Override // androidx.compose.foundation.lazy.layout.xrmfcynszj
        public Object zoijcleaow(int i13, lg.gxszxtbevo gxszxtbevoVar) {
            Object objKegysxyocb = mbcevpiqjq.kegysxyocb(this.f124829iobyxmoadg, i13, 0, gxszxtbevoVar, 2, null);
            return objKegysxyocb == mg.zoijcleaow.gxszxtbevo() ? objKegysxyocb : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final xrmfcynszj iobyxmoadg(mbcevpiqjq mbcevpiqjqVar, boolean z13) {
        return new iobyxmoadg(mbcevpiqjqVar, z13);
    }
}
