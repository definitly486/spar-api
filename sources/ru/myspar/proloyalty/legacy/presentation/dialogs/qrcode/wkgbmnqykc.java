package ru.myspar.proloyalty.legacy.presentation.dialogs.qrcode;

import android.view.View;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import d91.nufgyqmvbu;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.eablkybsjg;
import ru.myspar.proloyalty.legacy.presentation.view.ProductPriceView;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import z41.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f96454iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ac1.ppxfxbqfkf f96455jyumaefscl;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(ac1.ppxfxbqfkf imageUtils, tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(imageUtils, "imageUtils");
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f96455jyumaefscl = imageUtils;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.C2278zoijcleaow.f96457iobyxmoadg);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(lqeggnwhkg binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f128252zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: d91.dxjokdxxww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.dialogs.qrcode.wkgbmnqykc.dxjokdxxww(this.f27227zdlpuopuiu, view);
            }
        });
        binding.f128247ojitshcjhn.setText(model.dxjokdxxww());
        binding.f128242gtknphoqwx.setText(model.zoijcleaow());
        String strNufgyqmvbu = model.nufgyqmvbu();
        if (strNufgyqmvbu != null && strNufgyqmvbu.length() != 0) {
            try {
                binding.f128240dxjokdxxww.setImageBitmap(this.f96455jyumaefscl.iobyxmoadg(strNufgyqmvbu, androidx.core.content.iobyxmoadg.getColor(wkgbmnqykc(), b31.wkgbmnqykc.spar_color_qr_pixel), androidx.core.content.iobyxmoadg.getColor(wkgbmnqykc(), b31.wkgbmnqykc.spar_color_qr_space), UserVerificationMethods.USER_VERIFY_NONE, 0));
            } catch (Throwable th2) {
                kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
            }
        }
        ShapeableImageView ivProductPhoto = binding.f128246nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(ivProductPhoto, "ivProductPhoto");
        eablkybsjg.zoijcleaow(ivProductPhoto, model.ppxfxbqfkf());
        binding.f128237agtfadlqog.setText(model.lqeggnwhkg());
        ProductPriceView tvProductPrice = binding.f128250wflxmlrfwp;
        zdlpuopuiu.dxjokdxxww(tvProductPrice, "tvProductPrice");
        tvProductPrice.setVisibility(model.gxszxtbevo() != null ? 0 : 8);
        Double dGxszxtbevo = model.gxszxtbevo();
        if (dGxszxtbevo != null) {
            binding.f128250wflxmlrfwp.setPrice(dGxszxtbevo.doubleValue());
            if (model.gtknphoqwx()) {
                binding.f128250wflxmlrfwp.setUnitAndEnabled(model.btonecajqb());
            } else {
                binding.f128250wflxmlrfwp.setMeasureAndEnabled(model.wkgbmnqykc());
            }
        }
        MaterialTextView tvOldPrice = binding.f128239draadjrbmk;
        zdlpuopuiu.dxjokdxxww(tvOldPrice, "tvOldPrice");
        tvOldPrice.setVisibility(model.eablkybsjg() != null ? 0 : 8);
        Double dEablkybsjg = model.eablkybsjg();
        if (dEablkybsjg != null) {
            double dDoubleValue = dEablkybsjg.doubleValue();
            MaterialTextView materialTextView = binding.f128239draadjrbmk;
            materialTextView.setPaintFlags(materialTextView.getPaintFlags() | 16);
            binding.f128239draadjrbmk.setText(String.valueOf(dDoubleValue));
        }
        MaterialTextView tvCurrencyOldPrice = binding.f128238btonecajqb;
        zdlpuopuiu.dxjokdxxww(tvCurrencyOldPrice, "tvCurrencyOldPrice");
        tvCurrencyOldPrice.setVisibility(model.eablkybsjg() != null ? 0 : 8);
        if (model.iobyxmoadg() != null) {
            binding.f128252zoijcleaow.setText(model.iobyxmoadg().getTitle());
            MaterialButton btnOpenUserQrCode = binding.f128252zoijcleaow;
            zdlpuopuiu.dxjokdxxww(btnOpenUserQrCode, "btnOpenUserQrCode");
            p41.nufgyqmvbu.nufgyqmvbu(btnOpenUserQrCode, model.iobyxmoadg().getColorText());
            MaterialButton btnOpenUserQrCode2 = binding.f128252zoijcleaow;
            zdlpuopuiu.dxjokdxxww(btnOpenUserQrCode2, "btnOpenUserQrCode");
            p41.nufgyqmvbu.ppxfxbqfkf(btnOpenUserQrCode2, model.iobyxmoadg().getColorButton());
        }
    }
}
