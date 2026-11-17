package kk;

import kotlin.NoWhenBranchMatchedException;
import npi.spay.Jn;

/* JADX INFO: loaded from: classes3.dex */
public final class sb implements y60 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public boolean f58540iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public boolean f58541ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public boolean f58542zoijcleaow;

    @Override // kk.y60
    public final Object iobyxmoadg(nb0 nb0Var) {
        if ((nb0Var instanceof b6 ? (b6) nb0Var : null) == null) {
            throw new Jn(String.valueOf(nb0Var));
        }
        int iOrdinal = ((b6) nb0Var).ordinal();
        if (iOrdinal == 0) {
            return Boolean.valueOf(this.f58540iobyxmoadg && this.f58542zoijcleaow);
        }
        if (iOrdinal == 1) {
            return Boolean.valueOf(this.f58541ppxfxbqfkf);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toString() {
        return "BnplFeatureHandlerImpl(isBnplEnabledByMerch=" + this.f58540iobyxmoadg + ", isBnplEnabledByConfig=true, isBnplEnabledByBank=" + this.f58542zoijcleaow + ", isBnplEnabledByUser=" + this.f58541ppxfxbqfkf + ")";
    }

    @Override // kk.y60
    public final void zoijcleaow(ia0 ia0Var) {
        if ((ia0Var instanceof qa ? (qa) ia0Var : null) != null) {
            qa qaVar = (qa) ia0Var;
            if (qaVar instanceof e7) {
                this.f58542zoijcleaow = ((e7) qaVar).f56386iobyxmoadg;
            } else if (qaVar instanceof g8) {
                this.f58540iobyxmoadg = ((g8) qaVar).f56666iobyxmoadg;
            } else if (qaVar instanceof j9) {
                this.f58541ppxfxbqfkf = ((j9) qaVar).f57168iobyxmoadg;
            }
        }
    }
}
