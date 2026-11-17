package ru.myspar.legacy.presentation.dialogs.rateorder;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import fb0.lqeggnwhkg;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.rateorder.model.RateOrderDialogArgs;
import ru.myspar.legacy.presentation.view.ratingbar.RatingBarView;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final zoijcleaow f88701iwizpuwonk = new zoijcleaow(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final RateOrderDialogArgs f88702jyumaefscl;

    public static final class iobyxmoadg implements RatingBarView.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // ru.myspar.legacy.presentation.view.ratingbar.RatingBarView.zoijcleaow
        public void iobyxmoadg(RatingBarView ratingBarView, float f13) {
            wkgbmnqykc.this.ppxfxbqfkf(new ru.myspar.legacy.presentation.dialogs.rateorder.zoijcleaow.wkgbmnqykc((int) f13));
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding, RateOrderDialogArgs args) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(args, "args");
        this.f88702jyumaefscl = args;
        m60.gtknphoqwx gtknphoqwxVar = (m60.gtknphoqwx) binding.invoke();
        gtknphoqwxVar.f65534wflxmlrfwp.setOnRatingChangeListener(new iobyxmoadg());
        gtknphoqwxVar.f65536zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: fb0.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.dialogs.rateorder.wkgbmnqykc.dxjokdxxww(this.f33387zdlpuopuiu, view);
            }
        });
        gtknphoqwxVar.f65525draadjrbmk.setOnArrowClickListener(new tg.iobyxmoadg() { // from class: fb0.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.dialogs.rateorder.wkgbmnqykc.btonecajqb(this.f33379zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(new ru.myspar.legacy.presentation.dialogs.rateorder.zoijcleaow.iobyxmoadg(wkgbmnqykcVar.f88702jyumaefscl.getId()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(ru.myspar.legacy.presentation.dialogs.rateorder.zoijcleaow.ppxfxbqfkf.f88705iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(m60.gtknphoqwx binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f65525draadjrbmk.setTextDate(model.ppxfxbqfkf());
        binding.f65525draadjrbmk.setTextPlace(model.iobyxmoadg());
        binding.f65532nufgyqmvbu.setText(model.eablkybsjg());
        binding.f65531lqeggnwhkg.setText(model.wkgbmnqykc());
        binding.f65536zoijcleaow.setEnabled(model.zoijcleaow() > 0);
        ComposeView clLoading = binding.f65533ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, model.gxszxtbevo());
    }
}
