package ru.myspar.legacy.presentation.dialogs.specificpromotion;

import android.view.View;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import hb0.dxjokdxxww;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f88758iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ee0.ppxfxbqfkf f88759jyumaefscl;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding, ee0.ppxfxbqfkf imageUtils) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(imageUtils, "imageUtils");
        this.f88759jyumaefscl = imageUtils;
        ((draadjrbmk) binding.invoke()).f65442ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: hb0.btonecajqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.dialogs.specificpromotion.wkgbmnqykc.nufgyqmvbu(this.f40002zdlpuopuiu, view);
            }
        });
    }

    private final void btonecajqb(draadjrbmk draadjrbmkVar, ib0.iobyxmoadg iobyxmoadgVar) {
        ShapeableImageView ivProductPicture = draadjrbmkVar.f65434dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(ivProductPicture, "ivProductPicture");
        c60.wkgbmnqykc.zoijcleaow(ivProductPicture, iobyxmoadgVar.iobyxmoadg());
        draadjrbmkVar.f65431agtfadlqog.setText(iobyxmoadgVar.eablkybsjg());
        draadjrbmkVar.f65433draadjrbmk.setText(iobyxmoadgVar.ppxfxbqfkf());
        MaterialTextView materialTextView = draadjrbmkVar.f65433draadjrbmk;
        materialTextView.setPaintFlags(materialTextView.getPaintFlags() | 16);
        MaterialTextView tvProductOldPrice = draadjrbmkVar.f65433draadjrbmk;
        zdlpuopuiu.dxjokdxxww(tvProductOldPrice, "tvProductOldPrice");
        tvProductOldPrice.setVisibility(iobyxmoadgVar.zoijcleaow() ? 0 : 8);
        draadjrbmkVar.f65445wflxmlrfwp.setText(iobyxmoadgVar.wkgbmnqykc());
    }

    private final void gtknphoqwx(draadjrbmk draadjrbmkVar, String str, CharSequence charSequence) {
        draadjrbmkVar.f65432btonecajqb.setImageBitmap(ee0.ppxfxbqfkf.zoijcleaow(this.f88759jyumaefscl, str, androidx.core.content.iobyxmoadg.getColor(wkgbmnqykc(), s40.wkgbmnqykc.spar_color_qr_pixel), androidx.core.content.iobyxmoadg.getColor(wkgbmnqykc(), s40.wkgbmnqykc.spar_color_qr_space), UserVerificationMethods.USER_VERIFY_NONE, null, 16, null));
        draadjrbmkVar.f65441ojitshcjhn.setText(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f88760iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(draadjrbmk binding, dxjokdxxww model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        btonecajqb(binding, model.iobyxmoadg());
        gtknphoqwx(binding, model.zoijcleaow(), model.ppxfxbqfkf());
    }
}
