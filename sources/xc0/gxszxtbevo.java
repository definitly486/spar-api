package xc0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.sflfametgt;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo extends df.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.draadjrbmk f122038iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.draadjrbmk f122039zoijcleaow;

    public final class iobyxmoadg extends RecyclerView.iozdgvuglv {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final sflfametgt f122040iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f122041zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(final gxszxtbevo gxszxtbevoVar, sflfametgt binding) {
            super(binding.getRoot());
            zdlpuopuiu.btonecajqb(binding, "binding");
            this.f122041zoijcleaow = gxszxtbevoVar;
            this.f122040iobyxmoadg = binding;
            binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: xc0.wkgbmnqykc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gxszxtbevo.iobyxmoadg.wkgbmnqykc(this.f122049zdlpuopuiu, gxszxtbevoVar, view);
                }
            });
            binding.f65971zoijcleaow.setOnRewardClickListener(new tg.iobyxmoadg() { // from class: xc0.eablkybsjg
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return gxszxtbevo.iobyxmoadg.eablkybsjg(this.f122036zdlpuopuiu, gxszxtbevoVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn eablkybsjg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
            if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
                gxszxtbevoVar.f122039zoijcleaow.invoke(Integer.valueOf(iobyxmoadgVar.getBindingAdapterPosition()));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void wkgbmnqykc(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar, View view) {
            if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
                gxszxtbevoVar.f122038iobyxmoadg.invoke(Integer.valueOf(iobyxmoadgVar.getBindingAdapterPosition()));
            }
        }

        public final void gxszxtbevo(zc0.iobyxmoadg item) {
            zdlpuopuiu.btonecajqb(item, "item");
            this.f122040iobyxmoadg.f65971zoijcleaow.setProduct(item);
        }
    }

    public gxszxtbevo(tg.draadjrbmk onProductClicked, tg.draadjrbmk onActivateClicked) {
        zdlpuopuiu.btonecajqb(onProductClicked, "onProductClicked");
        zdlpuopuiu.btonecajqb(onActivateClicked, "onActivateClicked");
        this.f122038iobyxmoadg = onProductClicked;
        this.f122039zoijcleaow = onActivateClicked;
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
        sflfametgt sflfametgtVarPpxfxbqfkf = sflfametgt.ppxfxbqfkf(LayoutInflater.from(parent.getContext()), parent, false);
        zdlpuopuiu.dxjokdxxww(sflfametgtVarPpxfxbqfkf, "inflate(...)");
        return new iobyxmoadg(this, sflfametgtVarPpxfxbqfkf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void zoijcleaow(List items, int i13, RecyclerView.iozdgvuglv holder, List payloads) {
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(holder, "holder");
        zdlpuopuiu.btonecajqb(payloads, "payloads");
        ((iobyxmoadg) holder).gxszxtbevo((zc0.iobyxmoadg) items.get(i13 % items.size()));
    }
}
