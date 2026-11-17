package yfnezrywwk;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
final class vdvldrhtss implements ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final mbcevpiqjq f124902iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gxszxtbevo f124903ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.yadqdtsiqt f124904wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wflxmlrfwp f124905zoijcleaow;

    static final class iobyxmoadg implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f124906yggfygwlhe;

        iobyxmoadg(int i13) {
            this.f124906yggfygwlhe = i13;
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-824725566, i13, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:78)");
            }
            wflxmlrfwp wflxmlrfwpVar = vdvldrhtss.this.f124905zoijcleaow;
            int i14 = this.f124906yggfygwlhe;
            vdvldrhtss vdvldrhtssVar = vdvldrhtss.this;
            androidx.compose.foundation.lazy.layout.gxszxtbevo.iobyxmoadg iobyxmoadgVar = wflxmlrfwpVar.gtknphoqwx().get(i14);
            ((btonecajqb) iobyxmoadgVar.ppxfxbqfkf()).iobyxmoadg().invoke(vdvldrhtssVar.lqeggnwhkg(), Integer.valueOf(i14 - iobyxmoadgVar.zoijcleaow()), draadjrbmkVar, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public vdvldrhtss(mbcevpiqjq mbcevpiqjqVar, wflxmlrfwp wflxmlrfwpVar, gxszxtbevo gxszxtbevoVar, androidx.compose.foundation.lazy.layout.yadqdtsiqt yadqdtsiqtVar) {
        this.f124902iobyxmoadg = mbcevpiqjqVar;
        this.f124905zoijcleaow = wflxmlrfwpVar;
        this.f124903ppxfxbqfkf = gxszxtbevoVar;
        this.f124904wkgbmnqykc = yadqdtsiqtVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx(vdvldrhtss vdvldrhtssVar, int i13, Object obj, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        vdvldrhtssVar.nufgyqmvbu(i13, obj, draadjrbmkVar, f.iobyxmoadg(i14 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // yfnezrywwk.ojitshcjhn
    public androidx.collection.wflxmlrfwp eablkybsjg() {
        return this.f124905zoijcleaow.rgvfuqvkyq();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vdvldrhtss) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f124905zoijcleaow, ((vdvldrhtss) obj).f124905zoijcleaow);
        }
        return false;
    }

    @Override // androidx.compose.foundation.lazy.layout.zynmafqrjb
    public Object gxszxtbevo(int i13) {
        return this.f124905zoijcleaow.btonecajqb(i13);
    }

    public int hashCode() {
        return this.f124905zoijcleaow.hashCode();
    }

    @Override // androidx.compose.foundation.lazy.layout.zynmafqrjb
    public int iobyxmoadg() {
        return this.f124905zoijcleaow.draadjrbmk();
    }

    @Override // yfnezrywwk.ojitshcjhn
    public gxszxtbevo lqeggnwhkg() {
        return this.f124903ppxfxbqfkf;
    }

    @Override // androidx.compose.foundation.lazy.layout.zynmafqrjb
    public void nufgyqmvbu(final int i13, final Object obj, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i14) {
        int i15;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-462424778);
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-462424778, i15, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:76)");
            }
            androidx.compose.foundation.lazy.layout.ulzqkzuiru.ppxfxbqfkf(obj, i13, this.f124902iobyxmoadg.lmojexxdyd(), ezmngbhpjk.nufgyqmvbu.eablkybsjg(-824725566, true, new iobyxmoadg(i13), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 3072 | ((i15 << 3) & 112));
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: yfnezrywwk.rgvfuqvkyq
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj2, Object obj3) {
                    return vdvldrhtss.gtknphoqwx(this.f124893zdlpuopuiu, i13, obj, i14, (androidx.compose.runtime.draadjrbmk) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.zynmafqrjb
    public int ppxfxbqfkf(Object obj) {
        return zoijcleaow().ppxfxbqfkf(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.zynmafqrjb
    public Object wkgbmnqykc(int i13) {
        Object objWkgbmnqykc = zoijcleaow().wkgbmnqykc(i13);
        return objWkgbmnqykc == null ? this.f124905zoijcleaow.wflxmlrfwp(i13) : objWkgbmnqykc;
    }

    @Override // yfnezrywwk.ojitshcjhn
    public androidx.compose.foundation.lazy.layout.yadqdtsiqt zoijcleaow() {
        return this.f124904wkgbmnqykc;
    }
}
