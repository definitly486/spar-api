package nc0;

import android.content.Context;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class btonecajqb extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final zoijcleaow f69643eablkybsjg = new zoijcleaow(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final int f69644gxszxtbevo = 8;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo f69645lqeggnwhkg = new iobyxmoadg();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Context f69646ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gg.gtknphoqwx f69647wkgbmnqykc;

    public static final class iobyxmoadg extends androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(pc0.iobyxmoadg oldItem, pc0.iobyxmoadg newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return oldItem.ppxfxbqfkf() == newItem.ppxfxbqfkf();
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(pc0.iobyxmoadg oldItem, pc0.iobyxmoadg newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem, newItem);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btonecajqb(Context context, tg.draadjrbmk clickListener) {
        super(f69645lqeggnwhkg);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(clickListener, "clickListener");
        this.f69646ppxfxbqfkf = context;
        this.f69647wkgbmnqykc = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: nc0.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return btonecajqb.dxjokdxxww(this.f69649zdlpuopuiu);
            }
        });
        this.f27903iobyxmoadg.ppxfxbqfkf(agtfadlqog.wkgbmnqykc(clickListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List dxjokdxxww(btonecajqb btonecajqbVar) {
        return jyumaefscl.rgvfuqvkyq(btonecajqbVar.f69646ppxfxbqfkf.getString(pm.dxjokdxxww.action_promos), btonecajqbVar.f69646ppxfxbqfkf.getString(pm.dxjokdxxww.action_orders));
    }

    private final List lqeggnwhkg() {
        return (List) this.f69647wkgbmnqykc.getValue();
    }

    public final String nufgyqmvbu(int i13) {
        return (i13 < 0 || i13 >= lqeggnwhkg().size()) ? "" : (String) lqeggnwhkg().get(i13);
    }
}
