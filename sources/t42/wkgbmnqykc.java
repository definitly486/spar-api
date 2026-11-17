package t42;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.specialbanner.api.models.SpecialBannerPayload;
import ru.myspar.specialbanner.impl.presentation.SpecialBannerFragment;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements r42.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final d52.iobyxmoadg f109699iobyxmoadg;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f109700iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f109702yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f109703zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f109702yggfygwlhe = obj;
            this.f109700iwizpuwonk |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.ppxfxbqfkf(null, this);
        }
    }

    public wkgbmnqykc(d52.iobyxmoadg bannerRepository) {
        zdlpuopuiu.btonecajqb(bannerRepository, "bannerRepository");
        this.f109699iobyxmoadg = bannerRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment wkgbmnqykc(SpecialBannerPayload specialBannerPayload, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return SpecialBannerFragment.INSTANCE.iobyxmoadg(specialBannerPayload);
    }

    @Override // r42.iobyxmoadg
    public m9.wkgbmnqykc iobyxmoadg(final SpecialBannerPayload payload) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "SPECIAL_BANNER_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: t42.ppxfxbqfkf
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return wkgbmnqykc.wkgbmnqykc(payload, (jyumaefscl) obj);
            }
        }, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // r42.iobyxmoadg
    public Object ppxfxbqfkf(s42.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar2 = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar2.f109700iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar2.f109700iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar2 = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar2 = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = iobyxmoadgVar2.f109702yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar2.f109700iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            d52.iobyxmoadg iobyxmoadgVar3 = this.f109699iobyxmoadg;
            iobyxmoadgVar2.f109703zdlpuopuiu = iobyxmoadgVar;
            iobyxmoadgVar2.f109700iwizpuwonk = 1;
            objPpxfxbqfkf = iobyxmoadgVar3.ppxfxbqfkf(iobyxmoadgVar, iobyxmoadgVar2);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (s42.iobyxmoadg) iobyxmoadgVar2.f109703zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return new SpecialBannerPayload(((c52.zdlpuopuiu) objPpxfxbqfkf).iobyxmoadg(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.iobyxmoadg(), true, iobyxmoadgVar.eablkybsjg());
    }
}
