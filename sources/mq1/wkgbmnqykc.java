package mq1;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.specialbanner.api.models.SpecialBannerPayload;
import ru.myspar.proloyalty.specialbanner.impl.presentation.SpecialBannerFragment;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements kq1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wq1.iobyxmoadg f67850iobyxmoadg;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f67851iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f67853yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f67854zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f67853yggfygwlhe = obj;
            this.f67851iwizpuwonk |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.ppxfxbqfkf(null, this);
        }
    }

    public wkgbmnqykc(wq1.iobyxmoadg bannerRepository) {
        zdlpuopuiu.btonecajqb(bannerRepository, "bannerRepository");
        this.f67850iobyxmoadg = bannerRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment zoijcleaow(SpecialBannerPayload specialBannerPayload, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return SpecialBannerFragment.INSTANCE.iobyxmoadg(specialBannerPayload);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kq1.iobyxmoadg
    public Object ppxfxbqfkf(lq1.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar2 = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar2.f67851iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar2.f67851iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar2 = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar2 = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = iobyxmoadgVar2.f67853yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar2.f67851iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            wq1.iobyxmoadg iobyxmoadgVar3 = this.f67850iobyxmoadg;
            iobyxmoadgVar2.f67854zdlpuopuiu = iobyxmoadgVar;
            iobyxmoadgVar2.f67851iwizpuwonk = 1;
            objPpxfxbqfkf = iobyxmoadgVar3.ppxfxbqfkf(iobyxmoadgVar, iobyxmoadgVar2);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (lq1.iobyxmoadg) iobyxmoadgVar2.f67854zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return new SpecialBannerPayload(((vq1.zdlpuopuiu) objPpxfxbqfkf).iobyxmoadg(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.iobyxmoadg(), true, iobyxmoadgVar.eablkybsjg());
    }

    @Override // kq1.iobyxmoadg
    public m9.wkgbmnqykc wkgbmnqykc(final SpecialBannerPayload payload) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "SPECIAL_BANNER_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: mq1.ppxfxbqfkf
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return wkgbmnqykc.zoijcleaow(payload, (jyumaefscl) obj);
            }
        }, 2, null);
    }
}
