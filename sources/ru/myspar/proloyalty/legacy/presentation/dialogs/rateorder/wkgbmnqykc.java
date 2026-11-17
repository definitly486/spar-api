package ru.myspar.proloyalty.legacy.presentation.dialogs.rateorder;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import e91.lqeggnwhkg;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.rateorder.model.RateOrderDialogArgs;
import ru.myspar.proloyalty.legacy.presentation.view.ratingbar.RatingBarView;
import z41.nufgyqmvbu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final zoijcleaow f96485iwizpuwonk = new zoijcleaow(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final RateOrderDialogArgs f96486jyumaefscl;

    public static final class iobyxmoadg implements RatingBarView.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // ru.myspar.proloyalty.legacy.presentation.view.ratingbar.RatingBarView.zoijcleaow
        public void iobyxmoadg(RatingBarView ratingBarView, float f13) {
            wkgbmnqykc.this.ppxfxbqfkf(new ru.myspar.proloyalty.legacy.presentation.dialogs.rateorder.zoijcleaow.wkgbmnqykc((int) f13));
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
        this.f96486jyumaefscl = args;
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) binding.invoke();
        nufgyqmvbuVar.f128281wflxmlrfwp.setOnRatingChangeListener(new iobyxmoadg());
        nufgyqmvbuVar.f128283zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: e91.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.dialogs.rateorder.wkgbmnqykc.dxjokdxxww(this.f30987zdlpuopuiu, view);
            }
        });
        nufgyqmvbuVar.f128272draadjrbmk.setOnArrowClickListener(new tg.iobyxmoadg() { // from class: e91.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.dialogs.rateorder.wkgbmnqykc.btonecajqb(this.f30979zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(new ru.myspar.proloyalty.legacy.presentation.dialogs.rateorder.zoijcleaow.iobyxmoadg(wkgbmnqykcVar.f96486jyumaefscl.getId()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(ru.myspar.proloyalty.legacy.presentation.dialogs.rateorder.zoijcleaow.ppxfxbqfkf.f96489iobyxmoadg);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(nufgyqmvbu binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f128272draadjrbmk.setTextDate(model.ppxfxbqfkf());
        binding.f128272draadjrbmk.setTextPlace(model.iobyxmoadg());
        binding.f128279nufgyqmvbu.setText(model.eablkybsjg());
        binding.f128278lqeggnwhkg.setText(model.wkgbmnqykc());
        binding.f128283zoijcleaow.setEnabled(model.zoijcleaow() > 0);
        ComposeView clLoading = binding.f128280ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        o31.wkgbmnqykc.nufgyqmvbu(clLoading, model.gxszxtbevo());
    }
}
