package sflfametgt;

/* JADX INFO: loaded from: classes.dex */
public abstract class draadjrbmk {

    public static final class iobyxmoadg implements androidx.compose.foundation.lazy.layout.xrmfcynszj {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ikoacuggdj f106141iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ boolean f106142zoijcleaow;

        iobyxmoadg(ikoacuggdj ikoacuggdjVar, boolean z13) {
            this.f106141iobyxmoadg = ikoacuggdjVar;
            this.f106142zoijcleaow = z13;
        }

        @Override // androidx.compose.foundation.lazy.layout.xrmfcynszj
        public int eablkybsjg() {
            return (int) (this.f106141iobyxmoadg.yadqdtsiqt().getOrientation() == jztzpxfvev.jlmebxxoox.Vertical ? this.f106141iobyxmoadg.yadqdtsiqt().iobyxmoadg() & 4294967295L : this.f106141iobyxmoadg.yadqdtsiqt().iobyxmoadg() >> 32);
        }

        @Override // androidx.compose.foundation.lazy.layout.xrmfcynszj
        public float gxszxtbevo() {
            return mbcevpiqjq.iobyxmoadg(this.f106141iobyxmoadg);
        }

        @Override // androidx.compose.foundation.lazy.layout.xrmfcynszj
        public int iobyxmoadg() {
            return this.f106141iobyxmoadg.yadqdtsiqt().wkgbmnqykc() + this.f106141iobyxmoadg.yadqdtsiqt().zoijcleaow();
        }

        @Override // androidx.compose.foundation.lazy.layout.xrmfcynszj
        public float ppxfxbqfkf() {
            return metgxyhuhe.btonecajqb(this.f106141iobyxmoadg.yadqdtsiqt(), this.f106141iobyxmoadg.pkzmftpjix());
        }

        @Override // androidx.compose.foundation.lazy.layout.xrmfcynszj
        public g0.zoijcleaow wkgbmnqykc() {
            return this.f106142zoijcleaow ? new g0.zoijcleaow(this.f106141iobyxmoadg.pkzmftpjix(), 1) : new g0.zoijcleaow(1, this.f106141iobyxmoadg.pkzmftpjix());
        }

        @Override // androidx.compose.foundation.lazy.layout.xrmfcynszj
        public Object zoijcleaow(int i13, lg.gxszxtbevo gxszxtbevoVar) {
            Object objRlfsiqarku = ikoacuggdj.rlfsiqarku(this.f106141iobyxmoadg, i13, 0.0f, gxszxtbevoVar, 2, null);
            return objRlfsiqarku == mg.zoijcleaow.gxszxtbevo() ? objRlfsiqarku : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final androidx.compose.foundation.lazy.layout.xrmfcynszj iobyxmoadg(ikoacuggdj ikoacuggdjVar, boolean z13) {
        return new iobyxmoadg(ikoacuggdjVar, z13);
    }
}
