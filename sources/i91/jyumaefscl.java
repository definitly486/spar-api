package i91;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import ru.tinkoff.decoro.MaskImpl;
import ru.tinkoff.decoro.slots.Slot;
import z41.hkdspvbjdz;

/* JADX INFO: loaded from: classes5.dex */
public final class jyumaefscl extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final iobyxmoadg f42148esjtqupxsv = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final int f42149lereixgezr = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final gg.gtknphoqwx f42150cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Slot[] f42151iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ac1.ppxfxbqfkf f42152jyumaefscl;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyumaefscl(tg.iobyxmoadg binding, ac1.ppxfxbqfkf imageUtils) {
        super(binding);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(binding, "binding");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(imageUtils, "imageUtils");
        this.f42152jyumaefscl = imageUtils;
        Slot[] slotArrIobyxmoadg = new ec2.iobyxmoadg().iobyxmoadg("____ ____ ____ ____");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(slotArrIobyxmoadg, "parseSlots(...)");
        this.f42151iwizpuwonk = slotArrIobyxmoadg;
        this.f42150cqumvgiudr = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: i91.zdlpuopuiu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return jyumaefscl.dxjokdxxww(this.f42168zdlpuopuiu);
            }
        });
        ((hkdspvbjdz) binding.invoke()).f128089zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: i91.yggfygwlhe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jyumaefscl.gtknphoqwx(this.f42167zdlpuopuiu, view);
            }
        });
    }

    private final MaskImpl btonecajqb() {
        return (MaskImpl) this.f42150cqumvgiudr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaskImpl dxjokdxxww(jyumaefscl jyumaefsclVar) {
        return MaskImpl.zoijcleaow(jyumaefsclVar.f42151iwizpuwonk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(jyumaefscl jyumaefsclVar, View view) {
        jyumaefsclVar.ppxfxbqfkf(oxmwwwfdhm.iobyxmoadg.f42164iobyxmoadg);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(hkdspvbjdz binding, kcexrzcfyt model) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(binding, "binding");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
        binding.f128078draadjrbmk.setText(model.ppxfxbqfkf());
        binding.f128081gtknphoqwx.setText(model.zoijcleaow());
        btonecajqb().f0(model.iobyxmoadg());
        binding.f128085nufgyqmvbu.setText(btonecajqb().toString());
        if (model.iobyxmoadg().length() <= 0) {
            Group groupCard = binding.f128082gxszxtbevo;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(groupCard, "groupCard");
            groupCard.setVisibility(8);
        } else {
            Group groupCard2 = binding.f128082gxszxtbevo;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(groupCard2, "groupCard");
            groupCard2.setVisibility(0);
            binding.f128084lqeggnwhkg.setImageBitmap(ac1.ppxfxbqfkf.zoijcleaow(this.f42152jyumaefscl, model.iobyxmoadg(), androidx.core.content.iobyxmoadg.getColor(wkgbmnqykc(), b31.wkgbmnqykc.spar_color_qr_pixel), androidx.core.content.iobyxmoadg.getColor(wkgbmnqykc(), b31.wkgbmnqykc.spar_color_qr_space), 0, 2, 8, null));
        }
    }
}
