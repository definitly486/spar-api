package jb0;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import m60.ntlheqmsrt;
import ru.tinkoff.decoro.MaskImpl;
import ru.tinkoff.decoro.slots.Slot;

/* JADX INFO: loaded from: classes4.dex */
public final class jyumaefscl extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final iobyxmoadg f51030esjtqupxsv = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final int f51031lereixgezr = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final gg.gtknphoqwx f51032cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Slot[] f51033iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ee0.ppxfxbqfkf f51034jyumaefscl;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyumaefscl(tg.iobyxmoadg binding, ee0.ppxfxbqfkf imageUtils) {
        super(binding);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(binding, "binding");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(imageUtils, "imageUtils");
        this.f51034jyumaefscl = imageUtils;
        Slot[] slotArrIobyxmoadg = new ec2.iobyxmoadg().iobyxmoadg("____ ____ ____ ____");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(slotArrIobyxmoadg, "parseSlots(...)");
        this.f51033iwizpuwonk = slotArrIobyxmoadg;
        this.f51032cqumvgiudr = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: jb0.zdlpuopuiu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return jyumaefscl.dxjokdxxww(this.f51049zdlpuopuiu);
            }
        });
        ((ntlheqmsrt) binding.invoke()).f65817zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: jb0.yggfygwlhe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jyumaefscl.gtknphoqwx(this.f51048zdlpuopuiu, view);
            }
        });
    }

    private final MaskImpl btonecajqb() {
        return (MaskImpl) this.f51032cqumvgiudr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaskImpl dxjokdxxww(jyumaefscl jyumaefsclVar) {
        return MaskImpl.zoijcleaow(jyumaefsclVar.f51033iwizpuwonk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(jyumaefscl jyumaefsclVar, View view) {
        jyumaefsclVar.ppxfxbqfkf(oxmwwwfdhm.iobyxmoadg.f51045iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(ntlheqmsrt binding, kcexrzcfyt model) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(binding, "binding");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
        binding.f65806draadjrbmk.setText(model.ppxfxbqfkf());
        binding.f65809gtknphoqwx.setText(model.zoijcleaow());
        btonecajqb().f0(model.iobyxmoadg());
        binding.f65813nufgyqmvbu.setText(btonecajqb().toString());
        if (model.iobyxmoadg().length() <= 0) {
            Group groupCard = binding.f65810gxszxtbevo;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(groupCard, "groupCard");
            groupCard.setVisibility(8);
        } else {
            Group groupCard2 = binding.f65810gxszxtbevo;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(groupCard2, "groupCard");
            groupCard2.setVisibility(0);
            binding.f65812lqeggnwhkg.setImageBitmap(ee0.ppxfxbqfkf.zoijcleaow(this.f51034jyumaefscl, model.iobyxmoadg(), androidx.core.content.iobyxmoadg.getColor(wkgbmnqykc(), s40.wkgbmnqykc.spar_color_qr_pixel), androidx.core.content.iobyxmoadg.getColor(wkgbmnqykc(), s40.wkgbmnqykc.spar_color_qr_space), 0, 2, 8, null));
        }
    }
}
