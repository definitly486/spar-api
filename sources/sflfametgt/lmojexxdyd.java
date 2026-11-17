package sflfametgt;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public final class lmojexxdyd implements androidx.compose.foundation.lazy.layout.zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ikoacuggdj f106277iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.yadqdtsiqt f106278ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final kegysxyocb f106279wkgbmnqykc = kegysxyocb.f106274iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.rgvfuqvkyq f106280zoijcleaow;

    static final class iobyxmoadg implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f106281yggfygwlhe;

        iobyxmoadg(int i13) {
            this.f106281yggfygwlhe = i13;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if (!draadjrbmkVar.vdvldrhtss((i13 & 3) != 2, i13 & 1)) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1142237095, i13, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:211)");
            }
            androidx.compose.foundation.lazy.layout.rgvfuqvkyq rgvfuqvkyqVar = lmojexxdyd.this.f106280zoijcleaow;
            int i14 = this.f106281yggfygwlhe;
            lmojexxdyd lmojexxdydVar = lmojexxdyd.this;
            androidx.compose.foundation.lazy.layout.gxszxtbevo.iobyxmoadg iobyxmoadgVar = rgvfuqvkyqVar.gtknphoqwx().get(i14);
            ((yggfygwlhe) iobyxmoadgVar.ppxfxbqfkf()).iobyxmoadg().invoke(lmojexxdydVar.f106279wkgbmnqykc, Integer.valueOf(i14 - iobyxmoadgVar.zoijcleaow()), draadjrbmkVar, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public lmojexxdyd(ikoacuggdj ikoacuggdjVar, androidx.compose.foundation.lazy.layout.rgvfuqvkyq rgvfuqvkyqVar, androidx.compose.foundation.lazy.layout.yadqdtsiqt yadqdtsiqtVar) {
        this.f106277iobyxmoadg = ikoacuggdjVar;
        this.f106280zoijcleaow = rgvfuqvkyqVar;
        this.f106278ppxfxbqfkf = yadqdtsiqtVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx(lmojexxdyd lmojexxdydVar, int i13, Object obj, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        lmojexxdydVar.nufgyqmvbu(i13, obj, draadjrbmkVar, f.iobyxmoadg(i14 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lmojexxdyd) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f106280zoijcleaow, ((lmojexxdyd) obj).f106280zoijcleaow);
        }
        return false;
    }

    public int hashCode() {
        return this.f106280zoijcleaow.hashCode();
    }

    @Override // androidx.compose.foundation.lazy.layout.zynmafqrjb
    public int iobyxmoadg() {
        return this.f106280zoijcleaow.draadjrbmk();
    }

    @Override // androidx.compose.foundation.lazy.layout.zynmafqrjb
    public void nufgyqmvbu(final int i13, final Object obj, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i14) {
        int i15;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1201380429);
        if ((i14 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(obj) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(this) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i15 & 147) != 146, i15 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1201380429, i15, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:209)");
            }
            androidx.compose.foundation.lazy.layout.ulzqkzuiru.ppxfxbqfkf(obj, i13, this.f106277iobyxmoadg.cllcsxoeiz(), ezmngbhpjk.nufgyqmvbu.eablkybsjg(1142237095, true, new iobyxmoadg(i13), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 3072 | ((i15 << 3) & 112));
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: sflfametgt.iozdgvuglv
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj2, Object obj3) {
                    return lmojexxdyd.gtknphoqwx(this.f106243zdlpuopuiu, i13, obj, i14, (androidx.compose.runtime.draadjrbmk) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.zynmafqrjb
    public int ppxfxbqfkf(Object obj) {
        return this.f106278ppxfxbqfkf.ppxfxbqfkf(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.zynmafqrjb
    public Object wkgbmnqykc(int i13) {
        Object objWkgbmnqykc = this.f106278ppxfxbqfkf.wkgbmnqykc(i13);
        return objWkgbmnqykc == null ? this.f106280zoijcleaow.wflxmlrfwp(i13) : objWkgbmnqykc;
    }
}
