package ru.myspar.legacy.presentation.dialogs.qrcode;

import android.view.View;
import c60.lqeggnwhkg;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import eb0.nufgyqmvbu;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.btonecajqb;
import ru.myspar.legacy.presentation.view.ProductPriceView;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f88670iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ee0.ppxfxbqfkf f88671jyumaefscl;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(ee0.ppxfxbqfkf imageUtils, tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(imageUtils, "imageUtils");
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f88671jyumaefscl = imageUtils;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.C2033zoijcleaow.f88673iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(btonecajqb binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f65388zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: eb0.dxjokdxxww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.dialogs.qrcode.wkgbmnqykc.dxjokdxxww(this.f31063zdlpuopuiu, view);
            }
        });
        binding.f65383ojitshcjhn.setText(model.dxjokdxxww());
        binding.f65378gtknphoqwx.setText(model.zoijcleaow());
        String strNufgyqmvbu = model.nufgyqmvbu();
        if (strNufgyqmvbu != null && strNufgyqmvbu.length() != 0) {
            try {
                binding.f65376dxjokdxxww.setImageBitmap(this.f88671jyumaefscl.iobyxmoadg(strNufgyqmvbu, androidx.core.content.iobyxmoadg.getColor(wkgbmnqykc(), s40.wkgbmnqykc.spar_color_qr_pixel), androidx.core.content.iobyxmoadg.getColor(wkgbmnqykc(), s40.wkgbmnqykc.spar_color_qr_space), UserVerificationMethods.USER_VERIFY_NONE, 0));
            } catch (Throwable th2) {
                rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
            }
        }
        ShapeableImageView ivProductPhoto = binding.f65382nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(ivProductPhoto, "ivProductPhoto");
        c60.wkgbmnqykc.zoijcleaow(ivProductPhoto, model.ppxfxbqfkf());
        binding.f65373agtfadlqog.setText(model.lqeggnwhkg());
        ProductPriceView tvProductPrice = binding.f65386wflxmlrfwp;
        zdlpuopuiu.dxjokdxxww(tvProductPrice, "tvProductPrice");
        tvProductPrice.setVisibility(model.gxszxtbevo() != null ? 0 : 8);
        Double dGxszxtbevo = model.gxszxtbevo();
        if (dGxszxtbevo != null) {
            binding.f65386wflxmlrfwp.setPrice(dGxszxtbevo.doubleValue());
            if (model.gtknphoqwx()) {
                binding.f65386wflxmlrfwp.setUnitAndEnabled(model.btonecajqb());
            } else {
                binding.f65386wflxmlrfwp.setMeasureAndEnabled(model.wkgbmnqykc());
            }
        }
        MaterialTextView tvOldPrice = binding.f65375draadjrbmk;
        zdlpuopuiu.dxjokdxxww(tvOldPrice, "tvOldPrice");
        tvOldPrice.setVisibility(model.eablkybsjg() != null ? 0 : 8);
        Double dEablkybsjg = model.eablkybsjg();
        if (dEablkybsjg != null) {
            double dDoubleValue = dEablkybsjg.doubleValue();
            MaterialTextView materialTextView = binding.f65375draadjrbmk;
            materialTextView.setPaintFlags(materialTextView.getPaintFlags() | 16);
            binding.f65375draadjrbmk.setText(String.valueOf(dDoubleValue));
        }
        MaterialTextView tvCurrencyOldPrice = binding.f65374btonecajqb;
        zdlpuopuiu.dxjokdxxww(tvCurrencyOldPrice, "tvCurrencyOldPrice");
        tvCurrencyOldPrice.setVisibility(model.eablkybsjg() != null ? 0 : 8);
        if (model.iobyxmoadg() != null) {
            binding.f65388zoijcleaow.setText(model.iobyxmoadg().getTitle());
            MaterialButton btnOpenUserQrCode = binding.f65388zoijcleaow;
            zdlpuopuiu.dxjokdxxww(btnOpenUserQrCode, "btnOpenUserQrCode");
            lqeggnwhkg.nufgyqmvbu(btnOpenUserQrCode, model.iobyxmoadg().getColorText());
            MaterialButton btnOpenUserQrCode2 = binding.f65388zoijcleaow;
            zdlpuopuiu.dxjokdxxww(btnOpenUserQrCode2, "btnOpenUserQrCode");
            lqeggnwhkg.ppxfxbqfkf(btnOpenUserQrCode2, model.iobyxmoadg().getColorButton());
        }
    }
}
