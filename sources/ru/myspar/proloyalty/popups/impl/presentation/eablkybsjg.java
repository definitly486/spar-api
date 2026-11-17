package ru.myspar.proloyalty.popups.impl.presentation;

import android.view.View;
import android.widget.TextView;
import b31.gxszxtbevo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import nh1.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg extends tr0.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        ((lh1.iobyxmoadg) binding.invoke()).f62582zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: nh1.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.popups.impl.presentation.eablkybsjg.nufgyqmvbu(this.f70086zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f99273iobyxmoadg);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(lh1.iobyxmoadg binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f62578lqeggnwhkg.setText(model.eablkybsjg());
        ShapeableImageView ivPopupImage = binding.f62580ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivPopupImage, "ivPopupImage");
        p41.eablkybsjg.ppxfxbqfkf(ivPopupImage, model.zoijcleaow(), gxszxtbevo.placeholder);
        binding.f62576gxszxtbevo.setText(model.ppxfxbqfkf());
        binding.f62581wkgbmnqykc.setText(model.wkgbmnqykc());
        binding.f62582zoijcleaow.setText(model.iobyxmoadg());
        TextView tvTitle = binding.f62578lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(tvTitle, "tvTitle");
        tvTitle.setVisibility(!kcexrzcfyt.zfvoamnweg(model.eablkybsjg()) ? 0 : 8);
        ShapeableImageView ivPopupImage2 = binding.f62580ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivPopupImage2, "ivPopupImage");
        ivPopupImage2.setVisibility(!kcexrzcfyt.zfvoamnweg(model.zoijcleaow()) ? 0 : 8);
        TextView tvPromoCode = binding.f62575eablkybsjg;
        zdlpuopuiu.dxjokdxxww(tvPromoCode, "tvPromoCode");
        tvPromoCode.setVisibility(8);
        TextView tvSubTitle = binding.f62576gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(tvSubTitle, "tvSubTitle");
        tvSubTitle.setVisibility(!kcexrzcfyt.zfvoamnweg(model.ppxfxbqfkf()) ? 0 : 8);
        TextView tvDescriptionMessage = binding.f62581wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(tvDescriptionMessage, "tvDescriptionMessage");
        tvDescriptionMessage.setVisibility(!kcexrzcfyt.zfvoamnweg(model.wkgbmnqykc()) ? 0 : 8);
        MaterialButton btnAction = binding.f62582zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnAction, "btnAction");
        btnAction.setVisibility(kcexrzcfyt.zfvoamnweg(model.iobyxmoadg()) ? 8 : 0);
    }
}
