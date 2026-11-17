package ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion;

import android.view.View;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import g91.nufgyqmvbu;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.eablkybsjg;
import z41.dxjokdxxww;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f96543iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ac1.ppxfxbqfkf f96544jyumaefscl;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding, ac1.ppxfxbqfkf imageUtils) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(imageUtils, "imageUtils");
        this.f96544jyumaefscl = imageUtils;
        ((dxjokdxxww) binding.invoke()).f127936ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: g91.dxjokdxxww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.wkgbmnqykc.nufgyqmvbu(this.f36710zdlpuopuiu, view);
            }
        });
    }

    private final void btonecajqb(dxjokdxxww dxjokdxxwwVar, h91.iobyxmoadg iobyxmoadgVar) {
        ShapeableImageView ivProductPicture = dxjokdxxwwVar.f127928dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(ivProductPicture, "ivProductPicture");
        eablkybsjg.zoijcleaow(ivProductPicture, iobyxmoadgVar.iobyxmoadg());
        dxjokdxxwwVar.f127925agtfadlqog.setText(iobyxmoadgVar.eablkybsjg());
        dxjokdxxwwVar.f127927draadjrbmk.setText(iobyxmoadgVar.ppxfxbqfkf());
        MaterialTextView materialTextView = dxjokdxxwwVar.f127927draadjrbmk;
        materialTextView.setPaintFlags(materialTextView.getPaintFlags() | 16);
        MaterialTextView tvProductOldPrice = dxjokdxxwwVar.f127927draadjrbmk;
        zdlpuopuiu.dxjokdxxww(tvProductOldPrice, "tvProductOldPrice");
        tvProductOldPrice.setVisibility(iobyxmoadgVar.zoijcleaow() ? 0 : 8);
        dxjokdxxwwVar.f127939wflxmlrfwp.setText(iobyxmoadgVar.wkgbmnqykc());
    }

    private final void gtknphoqwx(dxjokdxxww dxjokdxxwwVar, String str, CharSequence charSequence) {
        dxjokdxxwwVar.f127926btonecajqb.setImageBitmap(ac1.ppxfxbqfkf.zoijcleaow(this.f96544jyumaefscl, str, androidx.core.content.iobyxmoadg.getColor(wkgbmnqykc(), b31.wkgbmnqykc.spar_color_qr_pixel), androidx.core.content.iobyxmoadg.getColor(wkgbmnqykc(), b31.wkgbmnqykc.spar_color_qr_space), UserVerificationMethods.USER_VERIFY_NONE, null, 16, null));
        dxjokdxxwwVar.f127935ojitshcjhn.setText(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f96545iobyxmoadg);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(dxjokdxxww binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        btonecajqb(binding, model.iobyxmoadg());
        gtknphoqwx(binding, model.zoijcleaow(), model.ppxfxbqfkf());
    }
}
