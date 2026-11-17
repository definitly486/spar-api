package opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
public final class nuxfzjnpeb implements tbqsvytpvh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.compose.ui.platform.m f73843iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public f.nufgyqmvbu f73844ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public roivzttewh f73845zoijcleaow;

    public nuxfzjnpeb(androidx.compose.ui.platform.m mVar) {
        this.f73843iobyxmoadg = mVar;
    }

    private final boolean iobyxmoadg(int i13) {
        androidx.compose.ui.platform.m mVar;
        p0.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = p0.kcexrzcfyt.f75246zoijcleaow;
        if (p0.kcexrzcfyt.wflxmlrfwp(i13, iobyxmoadgVar.wkgbmnqykc())) {
            zoijcleaow().eablkybsjg(androidx.compose.ui.focus.wkgbmnqykc.f6266zoijcleaow.eablkybsjg());
            return true;
        }
        if (p0.kcexrzcfyt.wflxmlrfwp(i13, iobyxmoadgVar.gxszxtbevo())) {
            zoijcleaow().eablkybsjg(androidx.compose.ui.focus.wkgbmnqykc.f6266zoijcleaow.gxszxtbevo());
            return true;
        }
        if (!p0.kcexrzcfyt.wflxmlrfwp(i13, iobyxmoadgVar.zoijcleaow()) || (mVar = this.f73843iobyxmoadg) == null) {
            return false;
        }
        mVar.zoijcleaow();
        return true;
    }

    public final void eablkybsjg(f.nufgyqmvbu nufgyqmvbuVar) {
        this.f73844ppxfxbqfkf = nufgyqmvbuVar;
    }

    public final void gxszxtbevo(roivzttewh roivzttewhVar) {
        this.f73845zoijcleaow = roivzttewhVar;
    }

    public final roivzttewh ppxfxbqfkf() {
        roivzttewh roivzttewhVar = this.f73845zoijcleaow;
        if (roivzttewhVar != null) {
            return roivzttewhVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("keyboardActions");
        return null;
    }

    public final boolean wkgbmnqykc(int i13) {
        tg.draadjrbmk draadjrbmkVarLqeggnwhkg;
        p0.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = p0.kcexrzcfyt.f75246zoijcleaow;
        if (p0.kcexrzcfyt.wflxmlrfwp(i13, iobyxmoadgVar.zoijcleaow())) {
            draadjrbmkVarLqeggnwhkg = ppxfxbqfkf().zoijcleaow();
        } else if (p0.kcexrzcfyt.wflxmlrfwp(i13, iobyxmoadgVar.ppxfxbqfkf())) {
            draadjrbmkVarLqeggnwhkg = ppxfxbqfkf().ppxfxbqfkf();
        } else if (p0.kcexrzcfyt.wflxmlrfwp(i13, iobyxmoadgVar.wkgbmnqykc())) {
            draadjrbmkVarLqeggnwhkg = ppxfxbqfkf().wkgbmnqykc();
        } else if (p0.kcexrzcfyt.wflxmlrfwp(i13, iobyxmoadgVar.gxszxtbevo())) {
            draadjrbmkVarLqeggnwhkg = ppxfxbqfkf().eablkybsjg();
        } else if (p0.kcexrzcfyt.wflxmlrfwp(i13, iobyxmoadgVar.lqeggnwhkg())) {
            draadjrbmkVarLqeggnwhkg = ppxfxbqfkf().gxszxtbevo();
        } else if (p0.kcexrzcfyt.wflxmlrfwp(i13, iobyxmoadgVar.nufgyqmvbu())) {
            draadjrbmkVarLqeggnwhkg = ppxfxbqfkf().lqeggnwhkg();
        } else {
            if (!p0.kcexrzcfyt.wflxmlrfwp(i13, iobyxmoadgVar.iobyxmoadg()) && !p0.kcexrzcfyt.wflxmlrfwp(i13, iobyxmoadgVar.eablkybsjg())) {
                throw new IllegalStateException("invalid ImeAction");
            }
            draadjrbmkVarLqeggnwhkg = null;
        }
        if (draadjrbmkVarLqeggnwhkg == null) {
            return iobyxmoadg(i13);
        }
        draadjrbmkVarLqeggnwhkg.invoke(this);
        return true;
    }

    public final f.nufgyqmvbu zoijcleaow() {
        f.nufgyqmvbu nufgyqmvbuVar = this.f73844ppxfxbqfkf;
        if (nufgyqmvbuVar != null) {
            return nufgyqmvbuVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("focusManager");
        return null;
    }
}
