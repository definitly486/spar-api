package ru.myspar.loymaxpopup.impl.presentation;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import kf0.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import s40.gxszxtbevo;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        ((ff0.iobyxmoadg) binding.invoke()).f33552zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: kf0.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.loymaxpopup.impl.presentation.eablkybsjg.nufgyqmvbu(this.f55370zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f90144iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(ff0.iobyxmoadg binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f33548lqeggnwhkg.setText(model.eablkybsjg());
        ShapeableImageView ivPopupImage = binding.f33550ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivPopupImage, "ivPopupImage");
        c60.wkgbmnqykc.ppxfxbqfkf(ivPopupImage, model.zoijcleaow(), gxszxtbevo.placeholder);
        binding.f33546gxszxtbevo.setText(model.ppxfxbqfkf());
        binding.f33551wkgbmnqykc.setText(model.wkgbmnqykc());
        binding.f33552zoijcleaow.setText(model.iobyxmoadg());
        TextView tvTitle = binding.f33548lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(tvTitle, "tvTitle");
        tvTitle.setVisibility(!kcexrzcfyt.zfvoamnweg(model.eablkybsjg()) ? 0 : 8);
        ShapeableImageView ivPopupImage2 = binding.f33550ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivPopupImage2, "ivPopupImage");
        ivPopupImage2.setVisibility(!kcexrzcfyt.zfvoamnweg(model.zoijcleaow()) ? 0 : 8);
        TextView tvPromoCode = binding.f33545eablkybsjg;
        zdlpuopuiu.dxjokdxxww(tvPromoCode, "tvPromoCode");
        tvPromoCode.setVisibility(8);
        TextView tvSubTitle = binding.f33546gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(tvSubTitle, "tvSubTitle");
        tvSubTitle.setVisibility(!kcexrzcfyt.zfvoamnweg(model.ppxfxbqfkf()) ? 0 : 8);
        TextView tvDescriptionMessage = binding.f33551wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(tvDescriptionMessage, "tvDescriptionMessage");
        tvDescriptionMessage.setVisibility(!kcexrzcfyt.zfvoamnweg(model.wkgbmnqykc()) ? 0 : 8);
        MaterialButton btnAction = binding.f33552zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnAction, "btnAction");
        btnAction.setVisibility(kcexrzcfyt.zfvoamnweg(model.iobyxmoadg()) ? 8 : 0);
    }
}
