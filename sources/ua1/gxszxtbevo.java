package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import z41.ikoacuggdj;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo extends df.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.draadjrbmk f113087iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.draadjrbmk f113088zoijcleaow;

    public final class iobyxmoadg extends RecyclerView.iozdgvuglv {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ikoacuggdj f113089iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f113090zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(final gxszxtbevo gxszxtbevoVar, ikoacuggdj binding) {
            super(binding.getRoot());
            zdlpuopuiu.btonecajqb(binding, "binding");
            this.f113090zoijcleaow = gxszxtbevoVar;
            this.f113089iobyxmoadg = binding;
            binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: ua1.wkgbmnqykc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gxszxtbevo.iobyxmoadg.wkgbmnqykc(this.f113098zdlpuopuiu, gxszxtbevoVar, view);
                }
            });
            binding.f128098zoijcleaow.setOnRewardClickListener(new tg.iobyxmoadg() { // from class: ua1.eablkybsjg
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return gxszxtbevo.iobyxmoadg.eablkybsjg(this.f113085zdlpuopuiu, gxszxtbevoVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn eablkybsjg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
            if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
                gxszxtbevoVar.f113088zoijcleaow.invoke(Integer.valueOf(iobyxmoadgVar.getBindingAdapterPosition()));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void wkgbmnqykc(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar, View view) {
            if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
                gxszxtbevoVar.f113087iobyxmoadg.invoke(Integer.valueOf(iobyxmoadgVar.getBindingAdapterPosition()));
            }
        }

        public final void gxszxtbevo(wa1.iobyxmoadg item) {
            zdlpuopuiu.btonecajqb(item, "item");
            this.f113089iobyxmoadg.f128098zoijcleaow.setProduct(item);
        }
    }

    public gxszxtbevo(tg.draadjrbmk onProductClicked, tg.draadjrbmk onActivateClicked) {
        zdlpuopuiu.btonecajqb(onProductClicked, "onProductClicked");
        zdlpuopuiu.btonecajqb(onActivateClicked, "onActivateClicked");
        this.f113087iobyxmoadg = onProductClicked;
        this.f113088zoijcleaow = onActivateClicked;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.zoijcleaow
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(List items, int i13) {
        zdlpuopuiu.btonecajqb(items, "items");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.zoijcleaow
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg ppxfxbqfkf(ViewGroup parent) {
        zdlpuopuiu.btonecajqb(parent, "parent");
        ikoacuggdj ikoacuggdjVarPpxfxbqfkf = ikoacuggdj.ppxfxbqfkf(LayoutInflater.from(parent.getContext()), parent, false);
        zdlpuopuiu.dxjokdxxww(ikoacuggdjVarPpxfxbqfkf, "inflate(...)");
        return new iobyxmoadg(this, ikoacuggdjVarPpxfxbqfkf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void zoijcleaow(List items, int i13, RecyclerView.iozdgvuglv holder, List payloads) {
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(holder, "holder");
        zdlpuopuiu.btonecajqb(payloads, "payloads");
        ((iobyxmoadg) holder).gxszxtbevo((wa1.iobyxmoadg) items.get(i13 % items.size()));
    }
}
