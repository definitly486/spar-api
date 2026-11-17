package uo1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.presentation.model.ScanGoProductUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class draadjrbmk extends df.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.draadjrbmk f114064iobyxmoadg;

    public static final class iobyxmoadg extends RecyclerView.iozdgvuglv {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final go1.wflxmlrfwp f114065iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final tg.draadjrbmk f114066zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(go1.wflxmlrfwp binding, tg.draadjrbmk draadjrbmkVar) {
            super(binding.getRoot());
            zdlpuopuiu.btonecajqb(binding, "binding");
            this.f114065iobyxmoadg = binding;
            this.f114066zoijcleaow = draadjrbmkVar;
            binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: uo1.gtknphoqwx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    draadjrbmk.iobyxmoadg.ppxfxbqfkf(this.f114070zdlpuopuiu, view);
                }
            });
        }

        private final d9.btonecajqb eablkybsjg(String str) {
            d9.btonecajqb btonecajqbVarWizcaqwiak = com.bumptech.glide.zoijcleaow.yggfygwlhe(this.f114065iobyxmoadg.getRoot()).eablkybsjg().grlcpdaxtj(str).wizcaqwiak(this.f114065iobyxmoadg.f38104ppxfxbqfkf);
            zdlpuopuiu.dxjokdxxww(btonecajqbVarWizcaqwiak, "into(...)");
            return btonecajqbVarWizcaqwiak;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, View view) {
            tg.draadjrbmk draadjrbmkVar;
            int bindingAdapterPosition = iobyxmoadgVar.getBindingAdapterPosition();
            if (bindingAdapterPosition == -1 || (draadjrbmkVar = iobyxmoadgVar.f114066zoijcleaow) == null) {
                return;
            }
            draadjrbmkVar.invoke(Integer.valueOf(bindingAdapterPosition));
        }

        public final void wkgbmnqykc(ScanGoProductUiModel product) {
            zdlpuopuiu.btonecajqb(product, "product");
            go1.wflxmlrfwp wflxmlrfwpVar = this.f114065iobyxmoadg;
            wflxmlrfwpVar.getRoot().setTag(qo1.iobyxmoadg.f80422iobyxmoadg);
            eablkybsjg(product.getPictureUrl());
            wflxmlrfwpVar.f38105wkgbmnqykc.setText(product.getName());
            wflxmlrfwpVar.f38100eablkybsjg.setText(product.getTotalPrice());
            wflxmlrfwpVar.f38101gxszxtbevo.setText(product.getPricePerUnit());
            wflxmlrfwpVar.f38103lqeggnwhkg.setText(product.getAmount());
        }
    }

    public draadjrbmk(tg.draadjrbmk draadjrbmkVar) {
        this.f114064iobyxmoadg = draadjrbmkVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.zoijcleaow
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg ppxfxbqfkf(ViewGroup parent) {
        zdlpuopuiu.btonecajqb(parent, "parent");
        go1.wflxmlrfwp wflxmlrfwpVarPpxfxbqfkf = go1.wflxmlrfwp.ppxfxbqfkf(LayoutInflater.from(parent.getContext()), parent, false);
        zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarPpxfxbqfkf, "inflate(...)");
        return new iobyxmoadg(wflxmlrfwpVarPpxfxbqfkf, this.f114064iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.zoijcleaow
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public void zoijcleaow(List items, int i13, RecyclerView.iozdgvuglv holder, List payloads) {
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(holder, "holder");
        zdlpuopuiu.btonecajqb(payloads, "payloads");
        Object obj = items.get(i13);
        zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.presentation.model.ScanGoProductUiModel");
        ((iobyxmoadg) holder).wkgbmnqykc((ScanGoProductUiModel) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.zoijcleaow
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(List items, int i13) {
        zdlpuopuiu.btonecajqb(items, "items");
        return items.get(i13) instanceof ScanGoProductUiModel;
    }
}
