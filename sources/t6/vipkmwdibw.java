package t6;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class vipkmwdibw implements s0 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private fg.iobyxmoadg f109889eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private fg.iobyxmoadg f109890gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private fg.iobyxmoadg f109891iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private fg.iobyxmoadg f109892ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private fg.iobyxmoadg f109893wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private fg.iobyxmoadg f109894zoijcleaow;

    private static final class zoijcleaow implements s0.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private kcexrzcfyt f109895iobyxmoadg;

        private zoijcleaow() {
        }

        @Override // t6.s0.iobyxmoadg
        public s0 iobyxmoadg() {
            ag.dxjokdxxww.iobyxmoadg(this.f109895iobyxmoadg, kcexrzcfyt.class);
            return new vipkmwdibw(this.f109895iobyxmoadg);
        }

        @Override // t6.s0.iobyxmoadg
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public zoijcleaow zoijcleaow(kcexrzcfyt kcexrzcfytVar) {
            this.f109895iobyxmoadg = (kcexrzcfyt) ag.dxjokdxxww.zoijcleaow(kcexrzcfytVar);
            return this;
        }
    }

    private void eablkybsjg(kcexrzcfyt kcexrzcfytVar) {
        ag.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = ag.eablkybsjg.iobyxmoadg(kcexrzcfytVar);
        this.f109891iobyxmoadg = wkgbmnqykcVarIobyxmoadg;
        this.f109894zoijcleaow = ag.ppxfxbqfkf.zoijcleaow(wkgbmnqykcVarIobyxmoadg);
        fg.iobyxmoadg iobyxmoadgVarZoijcleaow = ag.ppxfxbqfkf.zoijcleaow(this.f109891iobyxmoadg);
        this.f109892ppxfxbqfkf = iobyxmoadgVarZoijcleaow;
        this.f109893wkgbmnqykc = ag.ppxfxbqfkf.zoijcleaow(ojitshcjhn.iobyxmoadg(this.f109894zoijcleaow, iobyxmoadgVarZoijcleaow));
        ag.lqeggnwhkg lqeggnwhkgVarZoijcleaow = ag.lqeggnwhkg.zoijcleaow(1).wkgbmnqykc(Object.class, this.f109893wkgbmnqykc).zoijcleaow();
        this.f109889eablkybsjg = lqeggnwhkgVarZoijcleaow;
        this.f109890gxszxtbevo = ag.ppxfxbqfkf.zoijcleaow(ylkuphrtab.iobyxmoadg(lqeggnwhkgVarZoijcleaow));
    }

    public static s0.iobyxmoadg wkgbmnqykc() {
        return new zoijcleaow();
    }

    @Override // t6.roivzttewh
    public Context iobyxmoadg() {
        return (Context) this.f109894zoijcleaow.get();
    }

    @Override // t6.roivzttewh
    public mbcevpiqjq ppxfxbqfkf() {
        return (mbcevpiqjq) this.f109892ppxfxbqfkf.get();
    }

    @Override // t6.roivzttewh
    public jztzpxfvev zoijcleaow() {
        return (jztzpxfvev) this.f109890gxszxtbevo.get();
    }

    private vipkmwdibw(kcexrzcfyt kcexrzcfytVar) {
        eablkybsjg(kcexrzcfytVar);
    }
}
