package ru.myspar.payment.impl.web.presentation;

import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.platform.ComposeView;
import czzsidtyhn.tbqsvytpvh;
import ezmngbhpjk.nufgyqmvbu;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import pm.dxjokdxxww;
import s40.gxszxtbevo;
import tg.vdvldrhtss;
import v40.gtknphoqwx;
import xj0.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {

    static final class iobyxmoadg implements vdvldrhtss {
        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(eablkybsjg eablkybsjgVar) {
            eablkybsjgVar.ppxfxbqfkf(zoijcleaow.ppxfxbqfkf.f91583iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            zoijcleaow((tbqsvytpvh) obj, (draadjrbmk) obj2, ((Number) obj3).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void zoijcleaow(tbqsvytpvh drawActionBar, draadjrbmk draadjrbmkVar, int i13) {
            zdlpuopuiu.btonecajqb(drawActionBar, "$this$drawActionBar");
            if ((i13 & 17) == 16 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(649118533, i13, -1, "ru.myspar.payment.impl.web.presentation.PaymentViewImpl.<anonymous> (PaymentViewImpl.kt:20)");
            }
            int i14 = gxszxtbevo.ic_home;
            draadjrbmkVar.sopmlzcsov(-70968946);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(eablkybsjg.this);
            final eablkybsjg eablkybsjgVar = eablkybsjg.this;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: ru.myspar.payment.impl.web.presentation.wkgbmnqykc
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return eablkybsjg.iobyxmoadg.ppxfxbqfkf(eablkybsjgVar);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            gtknphoqwx.zoijcleaow(i14, (tg.iobyxmoadg) objYadqdtsiqt, null, false, 0L, draadjrbmkVar, 0, 28);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        ComposeView cvActionBar = ((sj0.zoijcleaow) binding.invoke()).f107150zoijcleaow;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(dxjokdxxww.payment);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: xj0.vdvldrhtss
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.payment.impl.web.presentation.eablkybsjg.nufgyqmvbu(this.f122622zdlpuopuiu);
            }
        }, null, nufgyqmvbu.ppxfxbqfkf(649118533, true, new iobyxmoadg()), 45, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f91582iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(sj0.zoijcleaow binding, rgvfuqvkyq model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        if (kcexrzcfyt.zfvoamnweg(model.iobyxmoadg()) || binding.f107149wkgbmnqykc.getUrl() != null) {
            return;
        }
        binding.f107149wkgbmnqykc.loadUrl(model.iobyxmoadg());
    }
}
