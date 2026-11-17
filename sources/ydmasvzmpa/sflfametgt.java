package ydmasvzmpa;

/* JADX INFO: loaded from: classes.dex */
public abstract class sflfametgt {

    public static final class iobyxmoadg implements androidx.compose.foundation.lazy.layout.xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ metgxyhuhe f124606iobyxmoadg;

        iobyxmoadg(metgxyhuhe metgxyhuheVar) {
            this.f124606iobyxmoadg = metgxyhuheVar;
        }

        @Override // androidx.compose.foundation.lazy.layout.xrmfcynszj
        public int eablkybsjg() {
            return (int) (this.f124606iobyxmoadg.yadqdtsiqt().getOrientation() == jztzpxfvev.jlmebxxoox.Vertical ? this.f124606iobyxmoadg.yadqdtsiqt().iobyxmoadg() & 4294967295L : this.f124606iobyxmoadg.yadqdtsiqt().iobyxmoadg() >> 32);
        }

        @Override // androidx.compose.foundation.lazy.layout.xrmfcynszj
        public float gxszxtbevo() {
            return androidx.compose.foundation.lazy.layout.metgxyhuhe.zoijcleaow(this.f124606iobyxmoadg.lereixgezr(), this.f124606iobyxmoadg.pmvmpeiblj());
        }

        @Override // androidx.compose.foundation.lazy.layout.xrmfcynszj
        public int iobyxmoadg() {
            return this.f124606iobyxmoadg.yadqdtsiqt().wkgbmnqykc() + this.f124606iobyxmoadg.yadqdtsiqt().zoijcleaow();
        }

        @Override // androidx.compose.foundation.lazy.layout.xrmfcynszj
        public float ppxfxbqfkf() {
            return androidx.compose.foundation.lazy.layout.metgxyhuhe.iobyxmoadg(this.f124606iobyxmoadg.lereixgezr(), this.f124606iobyxmoadg.pmvmpeiblj(), this.f124606iobyxmoadg.eablkybsjg());
        }

        @Override // androidx.compose.foundation.lazy.layout.xrmfcynszj
        public g0.zoijcleaow wkgbmnqykc() {
            return new g0.zoijcleaow(-1, -1);
        }

        @Override // androidx.compose.foundation.lazy.layout.xrmfcynszj
        public Object zoijcleaow(int i13, lg.gxszxtbevo gxszxtbevoVar) {
            Object objNtlheqmsrt = metgxyhuhe.ntlheqmsrt(this.f124606iobyxmoadg, i13, 0, gxszxtbevoVar, 2, null);
            return objNtlheqmsrt == mg.zoijcleaow.gxszxtbevo() ? objNtlheqmsrt : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final androidx.compose.foundation.lazy.layout.xrmfcynszj iobyxmoadg(metgxyhuhe metgxyhuheVar, boolean z13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1247008005, i13, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:31)");
        }
        boolean z14 = ((((i13 & 14) ^ 6) > 4 && draadjrbmkVar.ulzqkzuiru(metgxyhuheVar)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) > 32 && draadjrbmkVar.iobyxmoadg(z13)) || (i13 & 48) == 32);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (z14 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new iobyxmoadg(metgxyhuheVar);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) objYadqdtsiqt;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return iobyxmoadgVar;
    }
}
